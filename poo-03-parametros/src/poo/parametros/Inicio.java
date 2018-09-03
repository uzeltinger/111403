package poo.parametros;

import javax.swing.JOptionPane;

public class Inicio {

    public static void main(String[] args) {
                int nUno = Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer número"));
        int nDos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer número"));
        //Instanciación de la clase, creación de objeto
        OperacionMatematica operacion = new OperacionMatematica();        
        operacion.numeroUno = nUno;
        operacion.numeroDos = nDos;
        operacion.sumarNumeros();
        
        //Mostrar el contenido de un atributo del objeto
        System.out.println("numero Uno = " + operacion.numeroUno);
        System.out.println("numero Dos = " + operacion.numeroDos);
        System.out.println("resultado Suma = " + operacion.resultadoSuma);
        
        operacion.sumarNumerosParametros(50, 20);
        //Mostrar el contenido de un atributo del objeto
        System.out.println("numero Uno = " + operacion.numeroUno);
        System.out.println("numero Dos = " + operacion.numeroDos);
        System.out.println("resultado Suma = " + operacion.resultadoSuma);
        
        //Invocar un método
    }
    
}
