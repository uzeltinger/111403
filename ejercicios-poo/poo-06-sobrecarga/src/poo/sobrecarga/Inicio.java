package poo.sobrecarga;

public class Inicio {

    public static void main(String[] args) {
        Alumno alumno = new Alumno("46016305", "Yago", "Uzeltinger", 40);
        alumno.mostrarAlumno();
        
        Alumno alumnoDos = new Alumno("413015500", 10);
        alumnoDos.agregarNota();
        
        alumnoDos.agregarNota(8);
        
        
    }
    
}
