
public class Cadena implements Data{

    public String cadena;

    public Cadena(String cadena) {
        this.cadena = cadena;
    }

    public Object getData(){
        return cadena;
    }

    public void setData(Object data){
        cadena = ((String)(data));
    }

    @Override
    public String toString() {
        return cadena;
    }
}
