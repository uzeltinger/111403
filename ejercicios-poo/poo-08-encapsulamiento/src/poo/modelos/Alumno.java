package poo.modelos;

public class Alumno {
    private String dni;
    private String nombre;
    private String apellido;
    private int edad;
    private final int nota;

    
    public Alumno(String dni, String nombre, String apellido, int edad, int nota) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno{" + "dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", nota=" + nota + '}';
    }

    public int getNota() {
        return nota;
    }
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void imprimirAlumno(){
        System.out.println("Datos del Alumno: ");
        System.out.println("nombre: " + nombre);
        System.out.println("apellido: " + apellido);
        System.out.println("dni: " + dni);
        System.out.println("edad: " + edad);
    }
    
}
