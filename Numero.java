
public class Numero implements Data{

    public double numero;

    public Numero(double numero) {
        this.numero = numero;
    }

    public Object getData(){
        return numero;
    }

    public void setData(Object data){
        numero = ((double)(data));
    }

    @Override
    public String toString() {
        return Double.toString(numero);
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Numero))
            return false;
        if(((Numero) o).numero != numero)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(numero);
    }
}
