package poo.metodos;

import javax.swing.JOptionPane;

public class Inicio {
    
    public static void main(String[] args) {
        int nUno = Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer número"));
        int nDos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer número"));
        OperacionMatematica operacion = new OperacionMatematica();
        
        //Asignar un valor a un atributo del objeto
        operacion.numeroUno = nUno;
        operacion.numeroDos = nDos;
        
        //llamar un método para que ejecute su contenido
        operacion.sumarNumeros();
        operacion.restarNumeros();
        operacion.multiplicarNumeros();
        operacion.dividirNumeros();
        
        //Mostrar el contenido de un atributo del objeto
        System.out.println("numero Uno = " + operacion.numeroUno);
        System.out.println("numero Dos = " + operacion.numeroDos);
        System.out.println("resultado Suma = " + operacion.resultadoSuma);
        System.out.println("resultado Resta = " + operacion.resultadoResta);
        System.out.println("resultado Multiplicación = " + operacion.resultadoMultiplicacion);
        System.out.println("resultado División = " + operacion.resultadoDivision);
    }
    
}
