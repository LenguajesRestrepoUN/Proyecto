import java.util.LinkedList;

public class Visitor extends ClojureBaseVisitor<String>{

    public static GlobalScope globals;
    public static Scope currentScope;
    public static LinkedList<FunctionSymbol> currentCall = new LinkedList<>();
    public static LinkedList<FormReclaimer> reclaimers = new LinkedList<>();
    public static FormReclaimer currentReclaimer;
    FunctionSymbol currentFunction;

    @Override public String visitAuxform(ClojureParser.AuxformContext ctx) {
        String r = visit(ctx.form());
        System.out.println(r);
        return r;
    }

    //mainForm: auxform mainForm
    @Override public String visitMainForms(ClojureParser.MainFormsContext ctx) {
        String r = visit(ctx.auxform());
        //System.out.println(r);
        //visit(ctx.mainForm());
        return r;
    }
    //mainForms: form
    @Override public String visitMainFormForm(ClojureParser.MainFormFormContext ctx) {
        String r = visit(ctx.form());
        System.out.println(r);
        return r;
    }

    //priorForm: form priorForm
    @Override public String visitPriorForms(ClojureParser.PriorFormsContext ctx) {
        visit(ctx.form());
        return visit(ctx.priorForm());
    }
    //priorForm: form
    @Override public String visitPriorFormForm(ClojureParser.PriorFormFormContext ctx) {
        return visit(ctx.form());
    }

    //forms: priorForm
    @Override public String visitFormsForm(ClojureParser.FormsFormContext ctx) {
        return visit(ctx.priorForm());
    }

    //args : form args
    @Override public String visitArgsSymbolArgs(ClojureParser.ArgsSymbolArgsContext ctx) {
        currentFunction.setCurrentArgument(currentFunction.getCurrentArgument() + 1);
        visitChildren(ctx.form());
        visitChildren(ctx.args());
        return null;
    }

    //args : form
    @Override public String visitArgsSymbol(ClojureParser.ArgsSymbolContext ctx) {
        currentFunction.setCurrentArgument(currentFunction.getCurrentArgument() + 1);
        visit(ctx.form());
        return null;
    }

    //callFunction: '(' SYMBOL optargs ')'
    @Override public String visitCallFunction(ClojureParser.CallFunctionContext ctx) {
        String name = ctx.symbol().getText();
        Symbol symbol = currentScope.resolve(name);
        currentFunction = ((FunctionSymbol) symbol);
        currentCall.addLast(currentFunction);
        currentScope = ((FunctionSymbol) symbol);

        FormReclaimer reclaimer = new FormReclaimer();
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;

        visit(ctx.optargs());

        String r = null;
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
    @Override public String visitArity(ClojureParser.ArityContext ctx) {
        return visit(ctx.forms());
    }

    //println: '(' PRINTLN form ')';
    @Override public String visitPrintln(ClojureParser.PrintlnContext ctx) {
        System.out.println(visit(ctx.form()));
        return null;
    }

    //sum: '(' SUM forms ')'
    @Override public String visitSum(ClojureParser.SumContext ctx) {
        FormReclaimer reclaimer = new FormReclaimer();
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;
        visit(ctx.forms());
        double sum = 0;
        for(String a: currentReclaimer.getArguments()){
            sum += Double.parseDouble(a);
        }
        reclaimers.removeLast();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        String tmp = Double.toString(sum);
        if(currentReclaimer != null){
            currentReclaimer.addArgument(tmp);
        }
        return tmp;
    }

    //mult: '(' MULT forms ')'
    @Override public String visitMult(ClojureParser.MultContext ctx) {
        FormReclaimer reclaimer = new FormReclaimer();
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;
        visitChildren(ctx);
        double mult = 1;
        for(String a: currentReclaimer.getArguments()){
            mult *= Double.parseDouble(a);
        }
        reclaimers.removeLast();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;
        return Double.toString(mult);
    }

    //div: '(' DIV forms ')';
    @Override public String visitDiv(ClojureParser.DivContext ctx) {
        FormReclaimer reclaimer = new FormReclaimer();
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;
        visitChildren(ctx);
        if(currentReclaimer.getArguments().size() < 2){
            Interpreter.error(ctx.getStart(), "Se necesitan al menos dos argumentos para dividir");
        }
        double div = Double.parseDouble(currentReclaimer.getArgument(1));
        for(int i = 2; i <= currentReclaimer.getArguments().size(); i++){
            div = div / Double.parseDouble(currentReclaimer.getArgument(i));
        }

        reclaimers.removeLast();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;
        return Double.toString(div);
    }

    //minus: '(' MINUS forms ')';
    @Override public String visitMinus(ClojureParser.MinusContext ctx) {
        FormReclaimer reclaimer = new FormReclaimer();
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;
        visitChildren(ctx);
        if(currentReclaimer.getArguments().size() < 2){
            Interpreter.error(ctx.getStart(), "Se necesitan al menos dos argumentos para restar");
        }
        double sum = Double.parseDouble(currentReclaimer.getArgument(1));
        for(int i = 2; i <= currentReclaimer.getArguments().size(); i++){
            sum = sum - Double.parseDouble(currentReclaimer.getArgument(i));
        }
        reclaimers.removeLast();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        String tmp = Double.toString(sum);
        if(currentReclaimer != null){
            currentReclaimer.addArgument(tmp);
        }
        return tmp;
    }

    //literal: STRING
    @Override public String visitLiteralString(ClojureParser.LiteralStringContext ctx) {
        if(currentReclaimer != null){
            currentReclaimer.addArgument(ctx.STRING().getText());
        }
        return ctx.STRING().getText();
    }

    //number: LONG
    @Override public String visitNumberLong(ClojureParser.NumberLongContext ctx) {
        if(currentReclaimer != null){
            currentReclaimer.addArgument(ctx.LONG().getText());
        }
        return ctx.LONG().getText();
    }

    //number: FLOAT
    @Override public String visitNumberFloat(ClojureParser.NumberFloatContext ctx) {
        if(currentReclaimer != null){
            currentReclaimer.addArgument(ctx.FLOAT().getText());
        }
        return ctx.FLOAT().getText();
    }

    //defn: '(' DEFN symbol optDescription  arity+ ')'
    @Override public String visitDefnArity(ClojureParser.DefnArityContext ctx) {
        return currentScope.resolve(ctx.symbol().getText()).toString();
    }

    //defn: '(' DEFN symbol optDescription '[' optparams ']' auxforms ')
    @Override public String visitSingleDefn(ClojureParser.SingleDefnContext ctx) {
        return currentScope.resolve(ctx.symbol().getText()).toString();
    }

    //def: '(' DEF symbol ')'
    @Override public String visitDefSymbol(ClojureParser.DefSymbolContext ctx) {
        String name = ctx.symbol().getText();
        return "Variable " + name;
    }

    //def: '(' DEF symbol form')'
    @Override public String visitDefSymbolForm(ClojureParser.DefSymbolFormContext ctx) {
        String name = ctx.symbol().getText();
        Symbol s = currentScope.resolve(name);
        s.value = visit(ctx.form());
        return "Variable " + name;
    }
    //literal: symbol
    @Override public String visitLiteralSymbol(ClojureParser.LiteralSymbolContext ctx) {
        String name = ctx.symbol().getText();
        if(currentReclaimer != null){
            currentReclaimer.addArgument(currentScope.resolve(name).value);
        }
        return currentScope.resolve(name).value;
    }
}
