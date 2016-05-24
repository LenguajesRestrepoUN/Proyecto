import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class Visitor extends ClojureBaseVisitor<Data>{

    public static GlobalScope globals;
    public static Scope currentScope;
    public static LinkedList<FunctionSymbol> currentCall = new LinkedList<>();
    public static LinkedList<FormReclaimer> reclaimers = new LinkedList<>();
    public static FormReclaimer currentReclaimer;
    FunctionSymbol currentFunction;
    public JFrame frame;
    public JTextArea intel;
    public JTabbedPane scopesTabs;
    Boolean next;

    public  Visitor(){
        frame = new JFrame("Console");
        intel = new JTextArea(15, 40);

        JTabbedPane consoleTabs = new JTabbedPane();
        intel.setLineWrap(true);
        intel.setWrapStyleWord(true);
        intel.setEditable(false);
        JScrollPane scroller = new JScrollPane(intel);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        JPanel panel = new JPanel();
        panel.add(scroller);
        consoleTabs.addTab("Cosonle", panel);

        scopesTabs =new JTabbedPane();





        JButton nextB = new JButton("Next");
        nextB.addActionListener(new NextListener());
        frame.add(BorderLayout.SOUTH, nextB);


        frame.setVisible(true);
        next = false;
    }

    class NextListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            next = true;
        }
    }

    public void block(){
        next = false;
        while(!next){
            System.out.print("");
        }
    }

    public void updateFrames(){
        currentScope.updateFrame();
        for(FormReclaimer r : reclaimers)
            r.updateFrame();
    }

    @Override
    public Data visitFile(ClojureParser.FileContext ctx) {
        visitChildren(ctx);
        intel.append("End of simulation");
        System.out.println("End of simulation");
        return null;
    }

    @Override public Data visitAuxform(ClojureParser.AuxformContext ctx) {
        Data r = visit(ctx.form());
        intel.append("--> " + r.getData() + "\n");
        System.out.println(r.getData());
        updateFrames();
        block();
        return r;
    }

    //mainForm: auxform mainForm
    @Override public Data visitMainForms(ClojureParser.MainFormsContext ctx) {
        return visit(ctx.auxform());
    }

    //mainForms: form
    @Override public Data visitMainFormForm(ClojureParser.MainFormFormContext ctx) {
        Data r = visit(ctx.form());
        intel.append("--> " + r.getData() + "\n");
        System.out.println(r.getData());
        updateFrames();
        block();
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
        block();
        currentScope.updateFrame();
        currentFunction.setCurrentArgument(currentFunction.getCurrentArgument() + 1);
        visit(ctx.form());
        return null;
    }

    //callFunction: '(' SYMBOL optargs ')'
    @Override public Data visitCallFunction(ClojureParser.CallFunctionContext ctx) {
        updateFrames();
        block();
        String name = ctx.symbol().getText();
        Symbol symbol = currentScope.resolve(name);
        currentFunction = ((FunctionSymbol) symbol);
        currentCall.addLast(currentFunction);
        currentScope = ((FunctionSymbol) symbol);

        FormReclaimer reclaimer = new FormReclaimer(name);
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

        updateFrames();
        block();

        currentFunction.setCurrentArgument(0);
        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        updateFrames();
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

    //conj: '(' CONJ form form ')'
    @Override public Data visitConj(ClojureParser.ConjContext ctx) {
        updateFrames();
        block();
        FormReclaimer reclaimer = new FormReclaimer("la funcion conj");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;
        Data r = visit(ctx.form(1));
        VLS c =  (VLS)(visit(ctx.form(0)));
        c.addData(r);

        updateFrames();
        block();
        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        updateFrames();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;
        return c;
    }

    //list: '\'(' forms ')'
    @Override public Data visitList(ClojureParser.ListContext ctx) {
        updateFrames();
        block();

        FormReclaimer reclaimer = new FormReclaimer("estructura lista");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;
        visitChildren(ctx);

        Lista lista = new Lista();

        for(Data a: currentReclaimer.getArguments())
            lista.addData(a);

        updateFrames();
        block();

        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        updateFrames();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        if(currentReclaimer != null)
            currentReclaimer.addArgument(lista);

        return lista;
    }

    //set: '#{' forms '}' ;
    @Override public Data visitSet(ClojureParser.SetContext ctx) {
        updateFrames();
        block();
        FormReclaimer reclaimer = new FormReclaimer("estructura set");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;
        visitChildren(ctx);
        block();
        Conjunto set = new Conjunto();

        for(Data a: currentReclaimer.getArguments()){
            set.addData(a);
        }

        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        updateFrames();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        if(currentReclaimer != null){
            currentReclaimer.addArgument(set);
        }
        return set;
    }

    //println: '(' PRINTLN forms ')';
    @Override public Data visitPrintln(ClojureParser.PrintlnContext ctx) {
        updateFrames();
        block();
        FormReclaimer reclaimer = new FormReclaimer("println");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;
        visit(ctx.forms());
        for(Data a: currentReclaimer.getArguments()){
            System.out.println(a);
            intel.append("--> " + a + "\n");
        }

        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        updateFrames();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        Nil nil = new Nil();
        if(currentReclaimer != null){
            currentReclaimer.addArgument(nil);
        }
        return nil;
    }

    //sum: '(' SUM forms ')'
    @Override public Data visitSum(ClojureParser.SumContext ctx) {
        updateFrames();
        block();
        FormReclaimer reclaimer = new FormReclaimer("la funcion sumar");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;
        visit(ctx.forms());
        double sum = 0;
        for(Data a: currentReclaimer.getArguments()){
            sum += ((Double) a.getData());
        }
        updateFrames();
        block();
        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        updateFrames();
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
        updateFrames();
        block();
        FormReclaimer reclaimer = new FormReclaimer("la funcion multiplicar");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;
        visitChildren(ctx);
        double mult = 1;
        for(Data a: currentReclaimer.getArguments()){
            mult *= ((Double) a.getData());
        }
        updateFrames();
        block();
        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        updateFrames();
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
        updateFrames();
        block();
        FormReclaimer reclaimer = new FormReclaimer("la funcion dividir");
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
        updateFrames();
        block();
        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        updateFrames();
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
        updateFrames();
        block();
        FormReclaimer reclaimer = new FormReclaimer("la funcion resta");
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
        updateFrames();
        block();

        currentReclaimer.destroyReclaimer();
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
        updateFrames();
        block();
        return cadena;
    }

    //number: LONG
    @Override public Data visitNumberLong(ClojureParser.NumberLongContext ctx) {
        Numero numero = new Numero(Double.parseDouble(ctx.LONG().getText()));
        if(currentReclaimer != null){
            currentReclaimer.addArgument(numero);
        }
        updateFrames();
        block();
        return numero;
    }

    //number: FLOAT
    @Override public Data visitNumberFloat(ClojureParser.NumberFloatContext ctx) {
        Numero numero = new Numero(Double.parseDouble(ctx.FLOAT().getText()));
        if(currentReclaimer != null){
            currentReclaimer.addArgument(numero);
        }
        updateFrames();
        block();
        return numero;
    }

    //defn: '(' DEFN symbol optDescription  arity+ ')'
    @Override public Data visitDefnArity(ClojureParser.DefnArityContext ctx) {
        return new Cadena(((FunctionSymbol) (currentScope.resolve(ctx.symbol().getText()))).toString2() );
    }

    //defn: '(' DEFN symbol optDescription '[' optparams ']' auxforms ')
    @Override public Data visitSingleDefn(ClojureParser.SingleDefnContext ctx) {
        return new Cadena(((FunctionSymbol) (currentScope.resolve(ctx.symbol().getText()))).toString2());
    }

    //def: '(' DEF symbol form')'
    @Override public Data visitDefSymbolForm(ClojureParser.DefSymbolFormContext ctx) {
        String name = ctx.symbol().getText();
        Symbol s = currentScope.resolve(name);
        s.value = visit(ctx.form());
        updateFrames();
        block();
        return new Cadena("Variable " + name);
    }

    //literal: symbol
    @Override public Data visitLiteralSymbol(ClojureParser.LiteralSymbolContext ctx) {
        String name = ctx.symbol().getText();
        if(currentReclaimer != null){
            currentReclaimer.addArgument(currentScope.resolve(name).value);
        }
        updateFrames();
        block();
        return currentScope.resolve(name).value;
    }
}
