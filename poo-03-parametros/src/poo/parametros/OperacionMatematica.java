package poo.parametros;

public class OperacionMatematica {
    //Atributos, propiedades o características
    int numeroUno, numeroDos;
    int resultadoSuma;
    int resultadoResta;
    int resultadoMultiplicacion;
    float resultadoDivision;
    
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
}
