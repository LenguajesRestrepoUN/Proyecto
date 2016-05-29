import java.util.ArrayList;
import java.util.LinkedList;

public class Vector implements Data, VLS, VL {

    public LinkedList<Data> vector;
    public int size(){return vector.size();}
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

    public Boolean contains( Data element){

        for (Data x:vector){
            if(x.equals(element))
                return true;
        }
        return false;
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
        if(o instanceof Vector)  {
            Vector aux = (Vector) o;
            if(aux.size()!=vector.size())
                return false;
            if (!aux.toString().equals(vector.toString()))
                return false;
            /*for (Data x:vector)
            if (!aux.contains(x))
                return false;*/
            return true;
        }
        if(o instanceof Lista)  {
            Lista aux = (Lista) o;
            if(aux.size()!=vector.size())
                return false;
            if (!aux.toString().equals(vector.toString()))
                return false;
            /*for (Data x:vector)
                if (!aux.contains(x))
                    return false;*/
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return vector.hashCode();
    }

}
