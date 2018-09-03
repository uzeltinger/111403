package poo.objetos;

public class Inicio {
    public static void main(String[] args) {
        Coche auto = new Coche();
        auto.anio = 2015;
        auto.marca = "Ford";
        auto.modelo = "Focus";
        auto.color = "Azul";
        System.out.println("***Primer auto***");
        
        auto.mostrarCoche();
        
        Coche fiatUno = new Coche();        
        fiatUno.anio = 2017;
        fiatUno.marca = "Fiat";
        fiatUno.modelo = "Uno";
        fiatUno.color = "Verde";
        System.out.println("\n" + "***Segundo auto***");
        auto.mostrarCoche();
        System.out.println("\n");
    }
}
