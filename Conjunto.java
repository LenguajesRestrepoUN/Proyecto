import java.util.HashSet;

public class Conjunto implements Data, VLS{

    public HashSet<Data> set;

    public Conjunto() {
        set = new HashSet<>();
    }

    public void addData(Data data){
        set.add(data);
    }

    public void addDataLista(Data data){
        set.add(data);
    }

    public Object getData(){
        return set;
    }

    public void setData(Object l) {
        set = ((HashSet<Data>) (l));
    }

    @Override
    public Data functionget(Data element, Data defecto) {
        int n=0;
        if (defecto!=null)
            return defecto;
        if (set.size()>Double.parseDouble(element.toString()))

            for(Data x:set) {
                n++;
                if (n == (int)Double.parseDouble(element.toString())) {
                    return x;
                }
            }
        return new Nil();
    }

    @Override
    public String toString() {
        return set.toString();
    }

    public Boolean contains( Data element){

        for (Data x:set){
            if(x.equals(element))
                return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Conjunto))
            return false;
        boolean flag = true;
        Conjunto aux = ((Conjunto) o);
        for(Data i : aux.set){
            if(!aux.set.contains(i)){
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return set.hashCode();
    }

}
