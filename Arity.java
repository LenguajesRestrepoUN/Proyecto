import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Arity {

    public HashMap<Integer, String> parameters;
    public Map<String, Symbol> arguments;
    public Integer currentParameter;
    public Integer currentArgument;

    public Arity(){
        parameters = new HashMap<>();
        arguments = new LinkedHashMap<>();
        currentParameter = 0;
        currentArgument = 0;
    }

    public Integer getParametersNumber(){ return parameters.size(); }

    public Integer getCurrentArgument() {
        return currentArgument;
    }

    public void setCurrentArgument(Integer currentArgument) {
        this.currentArgument = currentArgument;
    }

    public void addParameter(String name){ parameters.put(currentParameter,name); }

    public Integer getCurrentParameter() { return currentParameter; }

    public void setCurrentParameter(Integer currentParameter) { this.currentParameter = currentParameter; }
}
