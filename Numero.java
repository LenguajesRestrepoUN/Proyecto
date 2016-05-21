
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
}
