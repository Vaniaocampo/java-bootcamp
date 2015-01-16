package Exercise1;

/**
 * @author vania
 */
public final class NumeroFactura {
    
    private static NumeroFactura unicaInstancia=null;
    private static int ultimoNumeroPago=1;
    
    private NumeroFactura(){
    }
    
    public static NumeroFactura getInstancia(){
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
