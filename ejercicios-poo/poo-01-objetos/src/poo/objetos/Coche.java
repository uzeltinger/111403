package poo.objetos;

public class Coche {
    //Atributos, propiedades o características
    String color;
    String marca;
    String modelo;
    int anio;
    
    //Métodos
    public void mostrarCoche(){
        System.out.print("Marca: " + marca + " - ");
        System.out.print("Modelo: " + modelo + " - ");
        System.out.print("Color: " + color + " - ");
        System.out.print("Año: " + anio + ".");
    }
}
