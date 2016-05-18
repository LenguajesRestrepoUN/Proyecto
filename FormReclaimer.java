import java.util.ArrayList;

public class FormReclaimer {
    ArrayList<String> arguments = new ArrayList<>();

    public ArrayList<String> getArguments() {
        return arguments;
    }

    public void addArgument(String argument){
        arguments.add(argument);
    }

    public String getArgument(int i){
        return arguments.get(i-1);
    }
}
