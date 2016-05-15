import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FunctionSymbol extends Symbol {

    HashMap<Integer, String> parameters = new HashMap<>();
    Map<String, Symbol> arguments = new LinkedHashMap<String, Symbol>();
    public Integer currentParameter;
    public Integer currentArgument;
    ClojureParser.DefnContext ctx;

    public FunctionSymbol(String name) {
        super(name);
        currentParameter = 0;
        currentArgument = 0;
    }

    public Integer getCurrentArgument() {
        return currentArgument;
    }

    public void setCurrentArgument(Integer currentArgument) {
        this.currentArgument = currentArgument;
    }

    public void addParameter(String name){ parameters.put(currentParameter,name); }

    public Integer getCurrentParameter() { return currentParameter; }

    public void setCurrentParameter(Integer currentParameter) { this.currentParameter = currentParameter; }

    public String toString() {
        return "function"+super.toString() + ":" + parameters.values();
    }
}
