import javax.swing.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class GlobalScope implements Scope{

    Scope enclosingScope; // null if global (outermost) scope
    Map<String, Symbol> symbols = new LinkedHashMap<String, Symbol>();
    JFrame frame;
    JTextArea intel;
    
    public GlobalScope(Scope enclosingScope) {
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

    public Symbol resolve(String name) {
        Symbol s = symbols.get(name);

        if ( s!=null )
            return s;

        if ( enclosingScope != null )
            return enclosingScope.resolve(name);

        return null;
    }

    public void define(Symbol sym) {
        symbols.put(sym.name, sym);
        sym.scope = this; // track the scope in each symbol
    }

    public Scope getEnclosingScope() {
        return enclosingScope;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Scope: " + "Globals\n");
        if(enclosingScope != null)
            builder.append("Enclosing scope: " + enclosingScope.getScopeName() + "\n");

        builder.append("Variables en memoria:\n");
        for(Symbol s : symbols.values())
            builder.append(s.toString() + "\n");
        return builder.toString();
    }

    public String getScopeName() {
        return "globals";
    }

    public void updateFrame(){
        intel.setText(toString());
        frame.setVisible(true);
        if(enclosingScope != null)
            enclosingScope.updateFrame();
    }

}
