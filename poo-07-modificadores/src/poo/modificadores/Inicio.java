package poo.modificadores;

import poo.modelos.Modelo;

public class Inicio {

    public static void main(String[] args) {
        Prueba pruebaUno = new Prueba();
        pruebaUno.atributoUno = 10;
        System.out.println("atributoUno: " + pruebaUno.atributoUno);
        
        pruebaUno.atributoProtejido = "lo veo";
        
        
        Modelo modeloUno = new Modelo();
        modeloUno.atributoTres = 33;
        System.out.println("atributoTres: " + modeloUno.atributoTres);
        
        
    }
    
}
