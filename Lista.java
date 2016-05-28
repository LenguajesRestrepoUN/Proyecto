import java.util.LinkedList;

public class Lista implements Data, VLS, VL{

    public LinkedList<Data> lista;

    public Lista() {
        lista = new LinkedList<>();
    }

    public void addData(Data data){
        lista.addLast(data);
    }
    public void addDataLista(Data data){
        lista.addFirst(data);
    }

    @Override
    public Boolean contains(Data element) {
        return null;
    }

    public Object getData(){      return lista;    }

    public void setData(Object l) {
        lista = ((LinkedList<Data>) (l));
    }

    @Override
    public String toString() {
        return lista.toString();
    }

    @Override
    public Data getDataWithNTH(Integer n) {
        if(lista.size() < n)
            return null;
        return lista.get(n);
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Lista))
            return false;
        boolean flag = true;
        Lista aux = ((Lista) o);
        for(Data i : aux.lista){
            if(!aux.lista.contains(i)){
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return lista.hashCode();
    }
}
