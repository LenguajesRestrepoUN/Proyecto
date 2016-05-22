import java.util.LinkedList;

public class Lista implements Data, VLS{

    public LinkedList<Data> lista;

    public Lista() {
        lista = new LinkedList<>();
    }

    public void addData(Data data){
        lista.addFirst(data);
    }

    public Object getData(){
        return lista;
    }

    public void setData(Object l) {
        lista = ((LinkedList<Data>) (l));
    }

    @Override
    public String toString() {
        return "lista: " + lista.toString();
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
