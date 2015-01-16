package Exercise1;
import java.util.Date;
/**
 * @author vania
 */
public class TestSingleton {
  
    
    public static void main (String[] args) {

        //Método que se implementa para generar el número de pago usando el patrón Singleton
        System.out.println("Generando nueva Factura....."); 
        int numeroFactura;
        Date fechaGeneracion;
        Factura factura;
        numeroFactura = NumeroFactura.getInstancia().mostrarUltimoNumeroFactura();
        fechaGeneracion = new Date();
        factura = new Factura(numeroFactura, fechaGeneracion);
        NumeroFactura.getInstancia().tomarUltimoNumeroFactura(numeroFactura+1);// incrementa en uno el numero de Factura y actualiza en el Singleton el ultimo numero de Factura
        System.out.println(factura.toString()); 
        
        System.out.println("Generando segunda Factura....."); 
        int numero;
        Date fecha;
        Factura factura2;
        numero = NumeroFactura.getInstancia().mostrarUltimoNumeroFactura();
        fecha = new Date();
        factura2 = new Factura(numero, fecha);
        NumeroFactura.getInstancia().tomarUltimoNumeroFactura(numeroFactura+1);// incrementa en uno el numero de Factura y actualiza en el Singleton el ultimo numero de Factura
        System.out.println(factura2.toString()); 
    }
    
}

