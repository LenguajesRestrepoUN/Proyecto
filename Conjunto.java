import java.util.HashSet;

public class Conjunto implements Data, VLS{

    public HashSet<Data> set;

    public Conjunto() {
        set = new HashSet<>();
    }

    public void addData(Data data){
        set.add(data);
    }

    public Object getData(){
        return set;
    }

    public void setData(Object l) {
        set = ((HashSet<Data>) (l));
    }

    @Override
    public String toString() {
        return "set: " + set.toString();
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