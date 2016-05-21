import java.util.ArrayList;

public class FormReclaimer {
    ArrayList<Data> arguments = new ArrayList<>();

    public ArrayList<Data> getArguments() {
        return arguments;
    }

    public void addArgument(Data argument){
        arguments.add(argument);
    }

    public Data getArgument(int i){
        return arguments.get(i-1);
    }
}
