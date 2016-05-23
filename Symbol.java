
public class Symbol {

    public static enum Type {tINVALID, tENTERO, tREAL, tCADENA, tBOOLEANO}

    String name;
    Type type;
    Scope scope;
    Data value = null;

    public Symbol(String name) {
        this.name = name;
    }

    public Symbol(String name, Type type) {
        this(name);
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Data getValue(){
        return value;
    }

    public void setValue(Data v){
        value = v;
    }

    public String toString() {
        return "Variable \"" + name + "\", tipo : " +  value.getClass().getName() + ", valor: " + value;
    }
}
