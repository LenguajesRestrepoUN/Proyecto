import java.util.*;

public class Mapa implements Data, VLS, VL{
    public Map<Data,Data> map;

    public Mapa() {
        map = new HashMap<Data,Data>();
    }

    public void addDataMap(Data key,Data data){ map.put(key,data); }

    @Override
    public void addData(Data a) {
    }

    public void addDataLista(Data data){    }

    @Override
    public Boolean contains(Data element) {
        for (Data x:map.keySet()){
            if(x.equals(element))
                return true;
        }
        return false;
    }

    public Object getData(){      return map;    }

    public void setData(Object l) {
        map = ((Map<Data,Data>) (l));
    }

    @Override
    public String toString() {
        return map.toString();
    }

    public Data getDataWithget(Data n) {
        for (Data x:map.keySet()){
            if(x.equals(n))
                return null;
        }
        return map.get(n);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;

        if (!(o instanceof Map))
            return false;
        Map<Data,Data> m = (Map<Data,Data>) o;
        if(m.equals(map))
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        return map.hashCode();
    }

    @Override
    public Data getDataWithNTH(Integer n) {
        return null;
    }
}
