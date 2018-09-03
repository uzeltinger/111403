/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.modelos;

/**
 *
 * @author nosotros
 */
public class Camioneta extends Vehiculo {
    private int carga;

    public Camioneta(String patente, String marca, String modelo, int anio, int carga) {
        super(patente, marca, modelo, anio);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Camioneta{" + "carga=" + carga + '}';
    }
    
    
}
