package poo.retornodevalores;

import javax.swing.JOptionPane;

public class Inicio {

    public static void main(String[] args) {
                int nUno = Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer número"));
        int nDos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer número"));
        //Instanciación de la clase, creación de objeto
        OperacionMatematica operacion = new OperacionMatematica();        
        operacion.numeroUno = nUno;
        operacion.numeroDos = nDos;
        //Invocar un método
        operacion.sumarNumeros();
        
        //Mostrar el contenido de un atributo del objeto
        System.out.println("numero Uno = " + operacion.numeroUno);
        System.out.println("numero Dos = " + operacion.numeroDos);
        System.out.println("resultado Suma = " + operacion.resultadoSuma);
        
        //Invocar un método
        operacion.sumarNumerosParametros(50, 20);
        //Mostrar el contenido de un atributo del objeto
        System.out.println("numero Uno = " + operacion.numeroUno);
        System.out.println("numero Dos = " + operacion.numeroDos);
        System.out.println("resultado Suma = " + operacion.resultadoSuma);
        
        //Invocar un método
        int resultadoDeLaSuma = operacion.dameEstosNumerosSumados(nUno,nDos);
        System.out.println("resultadoDeLaSuma = " + resultadoDeLaSuma);
    }
    
}
