import java.util.LinkedList;

public class Vector implements Data, VLS, VL {

    public LinkedList<Data> vector;

    public Vector() {
        vector = new LinkedList<>();
    }

    public void addData(Data data){
        vector.addLast(data);
    }
    public void addDataLista(Data data){
        vector.addFirst(data);
    }

    public Object getData(){
        return vector;
    }

    public void setData(Object l) {
        vector = ((LinkedList<Data>) (l));
    }

    @Override
    public String toString() {
        return vector.toString();
    }

    @Override
    public Data getDataWithNTH(Integer n) {
        if(vector.size() < n)
            return null;
        return vector.get(n);
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Vector))
            return false;
        boolean flag = true;
        Vector aux = ((Vector) o);
        for(Data i : aux.vector){
            if(!aux.vector.contains(i)){
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return vector.hashCode();
    }

}
