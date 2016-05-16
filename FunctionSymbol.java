import java.util.HashMap;

public class FunctionSymbol extends Symbol {

    public HashMap<Integer, Arity> arity = new HashMap<>();
    Integer currentArityNumber = 0;
    Arity currentArity;
    Boolean hasRecur = false;
    Boolean inDeclaration = true;

    public FunctionSymbol(String name) {
        super(name);
    }

    public Integer getAritySize(){
        return arity.size();
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
    }

    public void addParameter(String name){ currentArity.parameters.put(currentArity.getCurrentParameter(),name); }

    public Integer getCurrentParameter() { return currentArity.getCurrentParameter(); }

    public void setCurrentParameter(Integer currentParameter) { currentArity.currentParameter = currentParameter; }

    public String toString() {
        return "function"+super.toString() + ":" + arity.size();
    }

    public Boolean getHasRecur() {
        return hasRecur;
    }

    public void setHasRecur(Boolean hasRecur) {
        this.hasRecur = hasRecur;
    }

    public Boolean getInDeclaration() {
        return inDeclaration;
    }

    public void setInDeclaration(Boolean inDeclaration) {
        this.inDeclaration = inDeclaration;
    }
}
