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
public class Vehiculo {
    String patente;
    String marca;
    String modelo;
    int anio;

    public Vehiculo(String patente, String marca, String modelo, int anio) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }
    
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + '}';
    }
    
    
}
