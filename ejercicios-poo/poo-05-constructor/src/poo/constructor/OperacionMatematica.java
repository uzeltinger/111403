/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.constructor;

import javax.swing.JOptionPane;

/**
 *
 * @author nosotros
 */
public class OperacionMatematica {
    //Atributos, propiedades o características
    int numeroUno, numeroDos;
    int resultadoSuma;
    int resultadoResta;
    int resultadoMultiplicacion;
    float resultadoDivision;
    
    //Constructor por el cual se inicializan los atributos del objeto

    public OperacionMatematica(int n1, int n2) {
        this.numeroUno = n1;
        this.numeroDos = n2;
    }
    
    
    /* Método: Acción o comportamiento de un Objeto.
    * Modificador de acceso | Valor de retorno | Nombre | ( Argumentos )    
    * Modificador de acceso: public, protected, private.
    * Valor de retorno: void, int, boolean, String ....
    * Nombre: define el nombre del método, descriptivo
    */
    
    //Método para sumar 2 números
    public void sumarNumeros(){
        resultadoSuma = numeroUno+numeroDos;
    }
    public void sumarNumerosParametros(int n1, int n2){
        numeroUno = n1;
        numeroDos = n2;
        resultadoSuma = n1+n2;
    }
    
    //Método para sumar 2 números
    public void restarNumeros(){
        resultadoResta = numeroUno-numeroDos;
    }
    
    //Método para sumar 2 números
    public void multiplicarNumeros(){
        resultadoMultiplicacion = numeroUno*numeroDos;
    }
    
    //Método para sumar 2 números
    public void dividirNumeros(){
        //convertimo el atributo numeroUno en float, para que el resultado sea float y no un entero, por si el resultado contiene decimales
        resultadoDivision = (float)numeroUno/numeroDos;
    }
    
    public void imprimirSumados(){
        sumarNumeros();
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultadoSuma);
                
    }
}
