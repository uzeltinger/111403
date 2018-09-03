package poo.sobrecarga;

public class Alumno {
    //Atributos
    String dni;
    String nombre;
    String apellido;
    int edad;
    int nota;
    
    //Métodos
    //Constructor que recibe dni, nombre, apellido y edad
    public Alumno(String d, String n, String a, int e){
        this.dni = d;
        this.nombre = n;
        this.apellido = a;
        this.edad = e;
    }
    //Constructor que recibe la nota
    public Alumno(String dni, int n){
        this.dni = dni;
        this.nota = n;
    }
    
    public void mostrarAlumno(){
        System.out.println("Nuevo Alumno: ");
        System.out.println("dni: " + dni);
        System.out.println("nombre: " + nombre);
        System.out.println("apellido: " + this.apellido);        
    }
    
    public void agregarNota(){
        System.out.println("nota del alumno por dni: ");
        System.out.println("dni: " + dni);
        System.out.println("nota: " + nota);
    }
    
    public void agregarNota(int nota){
        System.out.println("nota del alumno: ");
        System.out.println("nota anterior: " + this.nota);
        System.out.println("nota nueva: " + nota);
        
    }
    
}
