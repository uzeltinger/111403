
package poo.modelos;

public class Auto extends Vehiculo{
    int puertas;

    public Auto(String patente, String marca, String modelo, int anio, int puertas) {
        super(patente, marca, modelo, anio);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Auto{" + "puertas=" + puertas + '}';
    }
        
}
