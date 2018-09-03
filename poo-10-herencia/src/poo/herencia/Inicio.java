/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.herencia;

import java.time.LocalDate;
import java.time.Month;
import poo.modelos.Alumno;

/**
 *
 * @author nosotros
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Alumno alumno = new Alumno("Juan", "Rojas", "26456148", LocalDate.of(2000, Month.DECEMBER, 1),8);
        System.out.println( alumno.toString() );
    }
    
}
