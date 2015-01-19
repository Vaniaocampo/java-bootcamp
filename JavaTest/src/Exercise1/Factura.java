package Exercise1;
import java.util.Date;
/**
 * @author vania 
 */
public class Factura {
    
    private int numero;
    private TipoPago tipoPago;
    private Date fechaGeneracion;
   
    
    public Factura(){}
    
    public Factura( int nroFactura, Date fechaGeneracion){
        
        numero=nroFactura;
        this.fechaGeneracion=fechaGeneracion;
    }
    
    public int obtenerUltimoNumeroFactura(){
        return this.numero;
    }
    
    public boolean esFactura(Integer num){
        return numero==num;
    }
    @Override
    public String toString(){
        
        String aux ="";
        aux+= "\nNúmero de Factura: "+numero;
        aux+= "\nFecha de Generación: "+ fechaGeneracion;
        aux+= "\nDatos del cliente";
        aux+= "\nNombre: ";
        aux+= "\nApellido:";
        aux+= "\nTeléfono:";
        aux+= "\nMail: ";
        aux+= "\n";
        return aux;
    }
}
