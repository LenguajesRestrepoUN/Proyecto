import java.util.LinkedList;

public class Visitor extends ClojureBaseVisitor<Data>{

    public static GlobalScope globals;
    public static Scope currentScope;
    public static LinkedList<FunctionSymbol> currentCall = new LinkedList<>();
    public static LinkedList<FormReclaimer> reclaimers = new LinkedList<>();
    public static FormReclaimer currentReclaimer;
    FunctionSymbol currentFunction;

    @Override public Data visitAuxform(ClojureParser.AuxformContext ctx) {
        Data r = visit(ctx.form());
        System.out.println(r.getData());
        return r;
    }

    //mainForm: auxform mainForm
    @Override public Data visitMainForms(ClojureParser.MainFormsContext ctx) {
        return visit(ctx.auxform());
    }

    //mainForms: form
    @Override public Data visitMainFormForm(ClojureParser.MainFormFormContext ctx) {
        Data r = visit(ctx.form());
        System.out.println(r.getData());
        return r;
    }

    //priorForm: form priorForm
    @Override public Data visitPriorForms(ClojureParser.PriorFormsContext ctx) {
        visit(ctx.form());
        return visit(ctx.priorForm());
    }
    //priorForm: form
    @Override public Data visitPriorFormForm(ClojureParser.PriorFormFormContext ctx) {
        return visit(ctx.form());
    }

    //forms: priorForm
    @Override public Data visitFormsForm(ClojureParser.FormsFormContext ctx) {
        return visit(ctx.priorForm());
    }

    //args : form args
    @Override public Data visitArgsSymbolArgs(ClojureParser.ArgsSymbolArgsContext ctx) {
        currentFunction.setCurrentArgument(currentFunction.getCurrentArgument() + 1);
        visitChildren(ctx.form());
        visitChildren(ctx.args());
        return null;
    }

    //args : form
    @Override public Data visitArgsSymbol(ClojureParser.ArgsSymbolContext ctx) {
        currentFunction.setCurrentArgument(currentFunction.getCurrentArgument() + 1);
        visit(ctx.form());
        return null;
    }

    //callFunction: '(' SYMBOL optargs ')'
    @Override public Data visitCallFunction(ClojureParser.CallFunctionContext ctx) {
        String name = ctx.symbol().getText();
        Symbol symbol = currentScope.resolve(name);
        currentFunction = ((FunctionSymbol) symbol);
        currentCall.addLast(currentFunction);
        currentScope = ((FunctionSymbol) symbol);

        FormReclaimer reclaimer = new FormReclaimer();
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;

        visit(ctx.optargs());

        Data r = null;
        if(currentFunction.getCtx() != null) {
            for(int i = 1; i <= currentFunction.getParametersNumber(); i++){
                Symbol s = currentFunction.resolve(currentFunction.getParameter(i));
                s.value = currentReclaimer.getArgument(i);
                currentFunction.addArgument(s.name, s);
            }
            r = visit(currentFunction.ctx);
        }
        else{
            for(Arity a : currentFunction.arity.values()){
                if(currentReclaimer.arguments.size() == a.getParametersNumber()) {
                    currentFunction.setArity(a);
                    for(int i = 1; i <= currentFunction.getParametersNumber(); i++) {
                        Symbol s = currentFunction.resolve(currentFunction.getParameter(i));
                        s.value = currentReclaimer.getArgument(i);
                        currentFunction.addArgument(s.name, s);

                    }
                    r = visit(currentFunction.getArityCtx());
                    break;
                }
            }
        }

        currentFunction.setCurrentArgument(0);
        reclaimers.removeLast();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        currentCall.removeLast();
        if(currentCall.size() > 0)
            currentFunction = currentCall.getLast();
        else
            currentFunction = null;

        currentScope = currentScope.getEnclosingScope();
        return r;
    }

    //arity: '(' '[' optparams ']' forms ')';
    @Override public Data visitArity(ClojureParser.ArityContext ctx) {
        return visit(ctx.forms());
    }

    //println: '(' PRINTLN form ')';
    @Override public Data visitPrintln(ClojureParser.PrintlnContext ctx) {
        System.out.println(visit(ctx.form()));
        return new Cadena("nil");
    }

    //sum: '(' SUM forms ')'
    @Override public Data visitSum(ClojureParser.SumContext ctx) {
        FormReclaimer reclaimer = new FormReclaimer();
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;
        visit(ctx.forms());
        double sum = 0;
        for(Data a: currentReclaimer.getArguments()){
            sum += ((Double) a.getData());
        }
        reclaimers.removeLast();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        Numero numero = new Numero(sum);
        if(currentReclaimer != null){
            currentReclaimer.addArgument(numero);
        }
        return numero;
    }

    //mult: '(' MULT forms ')'
    @Override public Data visitMult(ClojureParser.MultContext ctx) {
        FormReclaimer reclaimer = new FormReclaimer();
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;
        visitChildren(ctx);
        double mult = 1;
        for(Data a: currentReclaimer.getArguments()){
            mult *= ((Double) a.getData());
        }
        reclaimers.removeLast();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        Numero numero = new Numero(mult);
        if(currentReclaimer != null){
            currentReclaimer.addArgument(numero);
        }
        return numero;
    }

    //div: '(' DIV forms ')';
    @Override public Data visitDiv(ClojureParser.DivContext ctx) {
        FormReclaimer reclaimer = new FormReclaimer();
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;
        visitChildren(ctx);
        if(currentReclaimer.getArguments().size() < 2){
            Interpreter.error(ctx.getStart(), "Se necesitan al menos dos argumentos para dividir");
        }
        double div = ((Double) (currentReclaimer.getArgument(1).getData()));
        for(int i = 2; i <= currentReclaimer.getArguments().size(); i++){
            div = div / ((Double) (currentReclaimer.getArgument(i).getData()));
        }

        reclaimers.removeLast();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        Numero numero = new Numero(div);
        if(currentReclaimer != null){
            currentReclaimer.addArgument(numero);
        }
        return numero;
    }

    //minus: '(' MINUS forms ')';
    @Override public Data visitMinus(ClojureParser.MinusContext ctx) {
        FormReclaimer reclaimer = new FormReclaimer();
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;
        visitChildren(ctx);
        if(currentReclaimer.getArguments().size() < 2){
            Interpreter.error(ctx.getStart(), "Se necesitan al menos dos argumentos para restar");
        }
        double sum = ((Double) (currentReclaimer.getArgument(1).getData()));
        for(int i = 2; i <= currentReclaimer.getArguments().size(); i++){
            sum = sum - ((Double) (currentReclaimer.getArgument(i).getData()));
        }
        reclaimers.removeLast();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        Numero numero = new Numero(sum);
        if(currentReclaimer != null){
            currentReclaimer.addArgument(numero);
        }
        return numero;
    }

    //literal: STRING
    @Override public Data visitLiteralString(ClojureParser.LiteralStringContext ctx) {
        Cadena cadena = new Cadena(ctx.STRING().getText());
        if(currentReclaimer != null){
            currentReclaimer.addArgument(cadena);
        }
        return cadena;
    }

    //number: LONG
    @Override public Data visitNumberLong(ClojureParser.NumberLongContext ctx) {
        Numero numero = new Numero(Double.parseDouble(ctx.LONG().getText()));
        if(currentReclaimer != null){
            currentReclaimer.addArgument(numero);
        }
        return numero;
    }

    //number: FLOAT
    @Override public Data visitNumberFloat(ClojureParser.NumberFloatContext ctx) {
        Numero numero = new Numero(Double.parseDouble(ctx.FLOAT().getText()));
        if(currentReclaimer != null){
            currentReclaimer.addArgument(numero);
        }
        return numero;
    }

    //defn: '(' DEFN symbol optDescription  arity+ ')'
    @Override public Data visitDefnArity(ClojureParser.DefnArityContext ctx) {
        return new Cadena(currentScope.resolve(ctx.symbol().getText()).toString());
    }

    //defn: '(' DEFN symbol optDescription '[' optparams ']' auxforms ')
    @Override public Data visitSingleDefn(ClojureParser.SingleDefnContext ctx) {
        return new Cadena(currentScope.resolve(ctx.symbol().getText()).toString());
    }

    //def: '(' DEF symbol ')'
    @Override public Data visitDefSymbol(ClojureParser.DefSymbolContext ctx) {
        String name = ctx.symbol().getText();
        return new Cadena("Variable " + name);
    }

    //def: '(' DEF symbol form')'
    @Override public Data visitDefSymbolForm(ClojureParser.DefSymbolFormContext ctx) {
        String name = ctx.symbol().getText();
        Symbol s = currentScope.resolve(name);
        s.value = visit(ctx.form());
        return new Cadena("Variable " + name);
    }

    //literal: symbol
    @Override public Data visitLiteralSymbol(ClojureParser.LiteralSymbolContext ctx) {
        String name = ctx.symbol().getText();
        if(currentReclaimer != null){
            currentReclaimer.addArgument(currentScope.resolve(name).value);
        }
        return currentScope.resolve(name).value;
    }
}
