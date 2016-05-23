import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;

public class FunctionSymbol extends Symbol implements Scope {

    public HashMap<Integer, Arity> arity = new HashMap<>();
    Integer currentArityNumber = 0;
    Arity currentArity;
    Boolean inDeclaration = true;
    Scope enclosingScope;
    ClojureParser.AuxformsContext ctx;
    Integer currentArgument = 0;
    JFrame frame;
    JTextArea intel;

    public FunctionSymbol(String name, Scope enclosingScope) {
        super(name);
        this.enclosingScope = enclosingScope;
        this.enclosingScope = enclosingScope;
        frame = new JFrame("Global scope");
        intel = new JTextArea(15, 40);
        intel.setLineWrap(true);
        intel.setWrapStyleWord(true);
        intel.setEditable(false);
        JScrollPane scroller = new JScrollPane(intel);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        JPanel panel = new JPanel();
        panel.add(scroller);
        frame.add(panel);
        frame.setSize(600, 350);
        frame.setVisible(false);
    }

    public Integer getParametersNumber(){ return currentArity.getParametersNumber(); }

    public void setArity(Arity a){
        currentArity = a;
    }

    public String getParameter(Integer i){
        return currentArity.parameters.get(i);
    }

    public void addArgument(String name, Symbol s){
        currentArity.arguments.put(name, s);
    }

    public Integer getCurrentArityNumber() {
        return currentArityNumber;
    }

    public void setCurrentArityNumber(Integer currentArityNumber) {
        this.currentArityNumber = currentArityNumber;
    }

    public void establishCurrentArity(){
        currentArity = arity.get(currentArityNumber);
    }

    public Integer getCurrentArgument() {
        return currentArity.getCurrentArgument();
    }

    public void setCurrentArgument(Integer currentArgument) {
        for(Arity a : arity.values())
            a.currentArgument = currentArgument;
        this.currentArgument = currentArgument;
    }

    public void addParameter(String name){ currentArity.parameters.put(currentArity.getCurrentParameter(),name); }

    public void setHasRest(Boolean hasRest) { currentArity.setHasRest(hasRest); }

    public Integer getCurrentParameter() { return currentArity.getCurrentParameter(); }

    public Integer getDestructors() {
        return currentArity.getDestructors();
    }

    public void setDestructors(Integer destructors) {
        currentArity.setDestructors(destructors);
    }

    public void setCurrentParameter(Integer currentParameter) { currentArity.currentParameter = currentParameter; }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Scope: " + "function " +  name + " con Arity de " + arity.size());
        if(enclosingScope != null)
            builder.append("Enclosing scope: " + enclosingScope.getScopeName() + "\n");

        builder.append("Variables en memoria:\n");

        return builder.toString();
    }

    public Boolean getHasRecur() {
        return currentArity.getHasRecur();
    }

    public void setHasRecur(Boolean hasRecur) {
        currentArity.setHasRecur(hasRecur);
    }

    public Boolean getInDeclaration() {
        return inDeclaration;
    }

    public void setInDeclaration(Boolean inDeclaration) {
        this.inDeclaration = inDeclaration;
    }

    public Symbol resolve(String name) {
        Symbol s = currentArity.arguments.get(name);
        if ( s!=null )
            return s;

        if ( getEnclosingScope() != null ) {
            return getEnclosingScope().resolve(name);
        }
        return null;
    }

    public void define(Symbol sym) {
        currentArity.arguments.put(sym.name, sym);
        sym.scope = this;
    }

    public Scope getEnclosingScope() {
        return enclosingScope;
    }

    public String getScopeName() {
        return name;
    }

    public ClojureParser.AuxformsContext getCtx() {
        return ctx;
    }

    public void setCtx(ClojureParser.AuxformsContext ctx) {
        this.ctx = ctx;
    }

    public ClojureParser.ArityContext getArityCtx() {
        return currentArity.getArityCtx();
    }

    public void setArityCtx(ClojureParser.ArityContext arityCtx) {
        currentArity.setArityCtx(arityCtx);
    }

    public void updateFrame(){
        intel.setText(toString());
        frame.setVisible(true);
        if(enclosingScope != null)
            enclosingScope.updateFrame();
    }
}
