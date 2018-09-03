package poo.constructor;

import javax.swing.JOptionPane;

public class Inicio {

    public static void main(String[] args) {
        int nUno = Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer número"));
        int nDos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer número"));
        //Instanciación de la clase, creación de objeto
        // uso de constructor de la clase para inisializar el objeto con atributos definidos
        OperacionMatematica operacion = new OperacionMatematica(nUno, nDos);
        operacion.imprimirSumados();
    }
    
}
