package Exercise1;
/**
 * @author vania
 */

public final class NumeroFactura { //Save as NumeroFactura.java, Singleton that is instantiated only once
    
    private static NumeroFactura unicaInstancia=null; // a static field that represents the class 
    private static int ultimoNumeroPago=1;
    
    private NumeroFactura(){ // a private constructor to prevent the singleton class from being instantiated by outside classes.
    }
    
    public static NumeroFactura getInstance(){ // a static method to obtain the one and only instance. If this instance doesn´t already exist, the method creates it. 
        if(unicaInstancia ==null){
            unicaInstancia=new NumeroFactura();
        }
        return unicaInstancia;
    }
    
    public int mostrarUltimoNumeroFactura(){
        return ultimoNumeroPago;
    }
    
    public void tomarUltimoNumeroFactura (int numero){
        ultimoNumeroPago=numero;
    }
}
