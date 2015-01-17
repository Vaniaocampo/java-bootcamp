package Exercise1;
import java.util.Date;
/**
 * @author vania
 */
public class TestSingleton { // Demo Singleton
  
    
    public static void main (String[] args) {

        //Método que se implementa para generar el número de pago usando el patrón Singleton
        System.out.println("Generando nueva Factura....."); 
        int numeroFactura;
        Date fechaGeneracion;
        Factura factura;
        numeroFactura = NumeroFactura.getInstance().mostrarUltimoNumeroFactura();
        fechaGeneracion = new Date();
        factura = new Factura(numeroFactura, fechaGeneracion);
        NumeroFactura.getInstance().tomarUltimoNumeroFactura(numeroFactura+1);// incrementa en uno el numero de Factura y actualiza en el Singleton el ultimo numero de Factura
        System.out.println(factura.toString()); 
        
        System.out.println("Generando segunda Factura....."); 
        int numero;
        Date fecha;
        Factura factura2;
        numero = NumeroFactura.getInstance().mostrarUltimoNumeroFactura();
        fecha = new Date();
        factura2 = new Factura(numero, fecha);
        NumeroFactura.getInstance().tomarUltimoNumeroFactura(numeroFactura+1);// incrementa en uno el numero de Factura y actualiza en el Singleton el ultimo numero de Factura
        System.out.println(factura2.toString()); 
    }
    
}

