import org.antlr.v4.runtime.tree.ParseTree;

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
    @Override public void enterDefn(ClojureParser.DefnContext ctx) {
        String name = ctx.symbol().getText();
        FunctionSymbol var = new FunctionSymbol(name);
        currentScope.define(var);
        currentFunction = var;
    }

    //args : literal args
    @Override public void enterArgsSymbolArgs(ClojureParser.ArgsSymbolArgsContext ctx) {

        currentFunction.setCurrentArgument(currentFunction.getCurrentArgument() + 1);

        if(currentFunction.getCurrentArgument() > currentFunction.getCurrentParameter()){
            Interpreter.error(ctx.start, "el numero de argumentos en el llamado a la funcion \"" +
                    currentFunction.name + "\" no coincide con la declaracion.");
            return;
        }
    }

    //args : literal
    @Override public void enterArgsSymbol(ClojureParser.ArgsSymbolContext ctx) {
        currentFunction.setCurrentArgument(currentFunction.getCurrentArgument() + 1);

        if(currentFunction.getCurrentArgument() > currentFunction.getCurrentParameter()){
            Interpreter.error(ctx.start, "el numero de argumentos en el llamado a la funcion \"" +
                    currentFunction.name + "\" no coincide con la declaracion.");
            return;
        }

        currentFunction.setCurrentArgument(0);
    }

    //args:
    @Override public void enterOptargsEpsilon(ClojureParser.OptargsEpsilonContext ctx) {
        if(currentFunction.getCurrentArgument() < currentFunction.getCurrentParameter()){
            Interpreter.error(ctx.start, "el numero de argumentos en el llamado a la funcion \"" +
                    currentFunction.name + "\" es menor a los parametros.");
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
