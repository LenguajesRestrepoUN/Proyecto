import java.util.*;

public class Mapa implements Data, VLS, VL{
    public Map<Data,Data> map;

    public Mapa() {
        map = new HashMap<Data,Data>();
    }
    public int size(){return map.size();}
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

    public Data getDataWithget(Data element) {
        for (Data x:map.keySet()){
            if(x.equals(element))
                return map.get(element);
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Mapa))
            return false;

        Mapa aux = (Mapa) o;

        if(aux.size()!=map.size())
            return false;
        for (Data x:map.keySet()) {
            if (!aux.contains(x))
                return false;
            if (!aux.getDataWithget(x).equals(map.get(x)))
                return false;
        }
        return true;
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
