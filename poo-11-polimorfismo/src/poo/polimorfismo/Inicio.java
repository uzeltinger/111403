package poo.polimorfismo;
import java.util.Iterator;
import poo.modelos.Auto;
import poo.modelos.Camioneta;
import poo.modelos.Moto;
import poo.modelos.Vehiculo;
public class Inicio {

    public static void main(String[] args) {
        
        Vehiculo vehiculos[] = new Vehiculo[4];
        
        vehiculos[0] = new Vehiculo("AAA123", "Ford", "Mustang",2000);
        vehiculos[1] = new Moto("abc321","Honda","Tornado",2000,2);
        vehiculos[2] = new Auto("ZZZ345","Chevrolet","Clasic",2002,4);
        vehiculos[3] = new Camioneta("WWW222","Fiat","Toro",2017,1000);
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.toString());
        }
    }
    
}
