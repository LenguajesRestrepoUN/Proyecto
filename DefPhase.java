import java.util.LinkedList;

public class DefPhase extends ClojureBaseListener {

    public static GlobalScope globals;
    public static Scope currentScope;
    public static LinkedList<FunctionSymbol> currentCall;
    FunctionSymbol currentFunction;

    @Override public void enterFile(ClojureParser.FileContext ctx) {
        globals = new GlobalScope(null);
        currentScope = globals;
        currentCall = new LinkedList<>();
    }

    //def: '(' DEF symbol ')'
    @Override public void enterDefSymbol(ClojureParser.DefSymbolContext ctx) {
        String name = ctx.symbol().getText();
        defineVar(null, name);
    }

    //def: '(' DEF symbol form')'
    @Override public void enterDefSymbolForm(ClojureParser.DefSymbolFormContext ctx) {
        String name = ctx.symbol().getText();
        defineVar(null, name);
    }

    //params : symbol params
    @Override public void enterParamsSymbolParams(ClojureParser.ParamsSymbolParamsContext ctx) {
        String name = ctx.symbol().getText();
        defineVar(null, name);
        currentFunction.setCurrentParameter(currentFunction.getCurrentParameter() + 1);
        currentFunction.addParameter(name);
    }

    //params :  symbol
    @Override public void enterParamsSymbol(ClojureParser.ParamsSymbolContext ctx) {
        String name = ctx.symbol().getText();
        defineVar(null, name);
        currentFunction.setCurrentParameter(currentFunction.getCurrentParameter() + 1);
        currentFunction.addParameter(name);
    }

    //defn: '(' DEFN symbol optDescription '[' optargs ']' forms ')'
    @Override public void enterSingleDefn(ClojureParser.SingleDefnContext ctx) {
        String name = ctx.symbol().getText();
        FunctionSymbol var = new FunctionSymbol(name);
        currentScope.define(var);
        currentFunction = var;
        currentFunction.setCurrentArityNumber(currentFunction.getCurrentArityNumber() + 1);
        currentFunction.arity.put(currentFunction.getCurrentArityNumber(), new Arity());
        currentFunction.establishCurrentArity();
        currentCall.addLast(currentFunction);
    }

    @Override public void exitSingleDefn(ClojureParser.SingleDefnContext ctx) {
        currentCall.removeLast();
        if(currentCall.size() > 0)
            currentFunction = currentCall.getLast();
        else
            currentFunction = null;
    }

    //defn: '(' DEFN symbol optDescription  arity+ ')'
    @Override public void enterDefnArity(ClojureParser.DefnArityContext ctx) {
        String name = ctx.symbol().getText();
        FunctionSymbol var = new FunctionSymbol(name);
        currentScope.define(var);
        currentFunction = var;
        currentCall.addLast(currentFunction);
    }

    @Override public void exitDefnArity(ClojureParser.DefnArityContext ctx) {
        currentCall.removeLast();
        if(currentCall.size() > 0)
            currentFunction = currentCall.getLast();
        else
            currentFunction = null;
    }

    //arity: '(' '[' optparams ']' forms ')';
    @Override public void enterArity(ClojureParser.ArityContext ctx) {
        currentFunction.setCurrentArityNumber(currentFunction.getCurrentArityNumber() + 1);
        currentFunction.arity.put(currentFunction.getCurrentArityNumber(), new Arity());
        currentFunction.establishCurrentArity();
    }

    //args : literal args
    @Override public void enterArgsSymbolArgs(ClojureParser.ArgsSymbolArgsContext ctx) {
        Boolean flag = false;
        currentFunction.setCurrentArgument(currentFunction.getCurrentArgument() + 1);
        for(Arity a : currentFunction.arity.values()){
            if(a.getCurrentArgument() < a.getParametersNumber()) {
                flag = true;
                break;
            }
        }
        if(!flag){
            Interpreter.error(ctx.start, "el numero de argumentos en el llamado a la funcion \"" +
                    currentFunction.name + "\" es mayor a la declaracion.");
            return;
        }
    }

    //args : literal
    @Override public void enterArgsSymbol(ClojureParser.ArgsSymbolContext ctx) {
        currentFunction.setCurrentArgument(currentFunction.getCurrentArgument() + 1);

        Boolean flag = false;
        for(Arity a : currentFunction.arity.values()){
            if(a.getCurrentArgument() == a.getParametersNumber()) {
                flag = true;
                break;
            }
        }
        if(!flag){
            Interpreter.error(ctx.start, "el numero de argumentos en el llamado a la funcion \"" +
                    currentFunction.name + "\" no coincide con la declaracion.");
            return;
        }
        currentFunction.setCurrentArgument(0);
    }

    //args:
    @Override public void enterOptargsEpsilon(ClojureParser.OptargsEpsilonContext ctx) {
        Boolean flag = false;
        for(Arity a : currentFunction.arity.values()){
            if(a.getCurrentArgument() == a.getParametersNumber()) {
                flag = true;
                break;
            }
        }
        if(!flag){
            Interpreter.error(ctx.start, "el numero de argumentos en el llamado a la funcion \"" +
                    currentFunction.name + "\" no coincide con la declaracion.");
            return;
        }
    }

    //callFunction: '(' SYMBOL optargs ')'
    @Override public void enterCallFunction(ClojureParser.CallFunctionContext ctx) {
        String name = ctx.symbol().getText();
        Symbol symbol = currentScope.resolve(name);
        if(symbol == null){
            Interpreter.error(ctx.symbol().getStart(), "la funcion con nombre \"" + name + "\" no ha sido declarada");
            return;
        }
        if(!(symbol instanceof FunctionSymbol)){
            Interpreter.error(ctx.symbol().getStart(), "la variable con nombre \"" + name + "\" no es una funcion");
            return;
        }
        currentFunction = ((FunctionSymbol) symbol);
        currentCall.addLast(currentFunction);
    }

    @Override public void exitCallFunction(ClojureParser.CallFunctionContext ctx) {
        currentCall.removeLast();
        if(currentCall.size() > 0)
            currentFunction = currentCall.getLast();
        else
            currentFunction = null;
    }

    //literal: symbol
    @Override public void enterLiteralSymbol(ClojureParser.LiteralSymbolContext ctx) {
        String name = ctx.symbol().getText();
        if(currentScope.resolve(name) == null){
            Interpreter.error(ctx.symbol().getStart(), "la variable con nombre \"" + name + "\" no ha sido declarada");
            return;
        }
    }

    private void defineVar(Symbol.Type type, String nameToken) {
        VariableSymbol var = new VariableSymbol(nameToken, type);
        currentScope.define(var);
    }
}
