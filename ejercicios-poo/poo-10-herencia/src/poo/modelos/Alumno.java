/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.modelos;

import java.time.LocalDate;

public class Alumno extends Persona {
    private float notaFinal;

    public Alumno(String nombre, String apellido, String dni, LocalDate fechaNacimiento, float notaFinal) {
        super(nombre, apellido, dni, fechaNacimiento);
        this.notaFinal = notaFinal;
    }

    @Override
    public String toString() {
        return "Alumno:" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + getDni() + ", fechaNacimiento=" + getFechaNacimiento() + ", notaFinal=" + notaFinal + '.';
    }    
        
}
