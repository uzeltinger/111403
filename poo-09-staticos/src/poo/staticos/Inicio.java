/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.staticos;

import poo.modelos.Alumno;
import poo.modelos.Suma;

/**
 *
 * @author nosotros
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno alumnoPrimero = new Alumno();
        alumnoPrimero.atributo = "primer atributo";
        System.out.println("alumnoPrimero.atributo: " + alumnoPrimero.atributo);
        
        Alumno alumnoSegundo = new Alumno();
        alumnoSegundo.atributo = "cambio atributo";
        System.out.println("alumnoPrimero.atributo: " + alumnoPrimero.atributo);
        System.out.println("alumnoSegundo.atributo: " + alumnoSegundo.atributo);
        
        Alumno alumnoTercero = new Alumno();
        alumnoTercero.atributo = "cambio 3º atributo";
        System.out.println("alumnoPrimero.atributo: " + alumnoPrimero.atributo);
        System.out.println("alumnoSegundo.atributo: " + alumnoSegundo.atributo);
        System.out.println("alumnoTercero.atributo: " + alumnoTercero.atributo);
        
        
        alumnoPrimero.atributoEstatico = "jaja";
        alumnoSegundo.atributoEstatico = "jeje";
        alumnoTercero.atributoEstatico = "jojo";
        System.out.println("alumnoPrimero.atributoEstatico: " + alumnoPrimero.atributoEstatico);
        System.out.println("alumnoSegundo.atributoEstatico: " + alumnoSegundo.atributoEstatico);
        System.out.println("alumnoTercero.atributoEstatico: " + alumnoTercero.atributoEstatico);
        
        
        alumnoTercero.atributoEstatico = "último ejemplo";
        System.out.println("alumnoPrimero.atributoEstatico: " + alumnoPrimero.atributoEstatico);
        System.out.println("alumnoSegundo.atributoEstatico: " + alumnoSegundo.atributoEstatico);
        System.out.println("alumnoTercero.atributoEstatico: " + alumnoTercero.atributoEstatico);
        
        System.out.println("la suma es: " + Suma.Sumar(5, 3));
        
    }
    
}
