package Exercise1;
import java.util.Date;
import java.util.ArrayList;
/**
 * @author vania
 */

public class DemoStrategy{
    public static void main (String[] args){

//Creamos algunos productos
        Product product1= new Product(0123,"All the Light We Cannot See by Anthony Doerr",20.45);
        Product product2= new Product(0234,"Gray Mountain by John Grisham",20.10);
        Product product3= new Product(0345,"The Empty Throne by Bernard Cornwell",19.43);
        Product product4= new Product(0456,"Insatiable Appetites by Stuart Woods",21.22);
        
        ArrayList<Product> productos= new ArrayList();
        productos.add(product1);
        productos.add(product2);
        productos.add(product3);
        productos.add(product4);
        
// Creamos los detalles de pedido correspondientes a los productos recien creados 
        ArrayList<OrderDetail> nuevosDetalles = new ArrayList();
        nuevosDetalles.add(new OrderDetail(product1,20));
        nuevosDetalles.add(new OrderDetail(product2,15));
        nuevosDetalles.add(new OrderDetail(product3,4));
        nuevosDetalles.add(new OrderDetail(product4,3));

// Registramos el nuevo Pedido con los detalles recien creados
        
        System.out.println("*******************Registrando un nuevo Pedido.....***********************"); 
        Order ord1;
        Date fechaCreacion;
        fechaCreacion = new Date();

// Se crea la estrategia según lo que elije el cliente por ejemplo pago con tarjeta de crédito
        
        System.out.println("\nEl cliente elige pago con tarjeta de crédito....."); 
        IEstDiscountCalculation strategy = new EstCreditCardPayment(); 
        ord1 = new Order(fechaCreacion, 001, strategy, nuevosDetalles);
        System.out.println("\nDatos del Pedido generado....."); 
        System.out.println(ord1); 

//Se calcula el total con la estrategia EstCrediCardPayment
        double totalPrice = ord1.calcularTotalPedidoSinDescuento();
        System.out.println("\nEl Precio total a abonar sin el descuento es de: $"+totalPrice); 
        System.out.println("\nEl descuento por pago con Tarjeta de crédito es de: $"+ord1.calculateDiscount()); 
        System.out.println("\nEl Precio total a abonar incluyendo el descuento es de: $"+ord1.calcularTotalPedidoConDescuento()); 
    } 
}
