package poo.modelos;

public class Moto extends Vehiculo{
    private int cilindros;

    public Moto( String patente, String marca, String modelo, int anio, int cilindros) {
        super(patente, marca, modelo, anio);
        this.cilindros = cilindros;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    @Override
    public String toString() {
        return "Moto{" + "cilindros=" + cilindros + '}';
    }

       
    
}
