import javax.swing.*;
import java.util.ArrayList;

public class FormReclaimer {
    ArrayList<Data> arguments = new ArrayList<>();
    public String name;
    public static Integer queuesNum = 0;
    JFrame frame;
    JTextArea intel;
    public String funcion;

    public FormReclaimer(String f) {
        funcion = f;
        queuesNum++;
        name = "Cola " + queuesNum;
        frame = new JFrame(name);
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
        intel.append("------------------- " + name + "--------------------------\n");
        intel.append("Parametros para " + funcion + ":\n\n");
        frame.setVisible(true);
    }

    public void updateFrame(){
        StringBuilder builder = new StringBuilder();
        builder.append("------------------- " + name + "--------------------------\n");
        builder.append("Parametros en cola para " + funcion + ":\n\n");
        for(Data a : arguments)
            builder.append(a.toString() + "\n");
        intel.setText(builder.toString());
    }

    public ArrayList<Data> getArguments() {
        return arguments;
    }

    public void addArgument(Data argument) {
        arguments.add(argument);
    }

    public Data getArgument(int i) {
        return arguments.get(i - 1);
    }

    public void destroyReclaimer(){
        queuesNum--;
        frame.dispose();
    }

}
