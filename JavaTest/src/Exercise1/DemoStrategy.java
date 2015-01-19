package Exercise1;
import java.util.Date;

/**
 * @author vania
 */
public class DemoStrategy{
    public static void main (String[] args) {

        //
        System.out.println("Generando un nuevo Pedido....."); 
        Date fechaCreacion;
        EstCreditCardPayment strategy;
        Order ord1;
        fechaCreacion = new Date();
        strategy = new EstCreditCardPayment(); 
        System.out.println("El cliente elige pago con tarjeta de crédito....."); 
        ord1 = new Order(fechaCreacion, 1, strategy);
        double totalPrice = ord1.calcularTotalPedido();
     
        System.out.println("El Precio total mas el descuento por el tipo de pago es:"+totalPrice); 
    } 
}
