package poo.encapsulamiento;

import poo.modelos.Alumno;

public class Inicio {

    public static void main(String[] args) {
        // TODO code application logic here
        Alumno fabio = new Alumno("46016305","Yago","",22,10);
        fabio.setApellido("Moreno");
        fabio.setDni("41315500");
        
        fabio.imprimirAlumno();
    }
    
}
