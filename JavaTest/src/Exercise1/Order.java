package Exercise1;
import java.util.Date;
import java.util.ArrayList;
/**
 * @author vania
 */

public class Order {
    
    private Date fechaCreacion;
    private int orderNumber;
    private Date fechaEnvio;
    private Date fechaEntrega;
    private ArrayList<OrderDetail> details;
    private IEstDiscountCalculation discountCalculation;
    
    public Order(){}
    
    public Order(Date fechaCreacion, int orderNumber,IEstDiscountCalculation discountCalculation, ArrayList<OrderDetail> details){
        this.fechaCreacion = fechaCreacion;
        this.orderNumber = orderNumber;
        this.discountCalculation = discountCalculation;
        this.details = details;
    }
    
    public Order(Date fechaCreacion){
        this.fechaCreacion = fechaCreacion;
    }
    
    public ArrayList<OrderDetail> getOrderDetails(){
        return new ArrayList(details);
    }
    
    // Method to add an order detail to the collection 
    public boolean addOrderDetail(OrderDetail detail){
        return details.add(detail);
    }
    
    //Method to obtain the number of order details in the collection 
    public int cantidadDetallesPedido(){
        return details.size();
    }
    
    public double calcularTotalPedidoConDescuento(){
        double totPrice,totalConDescuento;
        double suma=0;
        
        for(OrderDetail or: details) // for each
        {
            suma+=or.calcularTotalDetalle();
        }
       totPrice=suma;
        

        double descuento = calculateDiscount();
        totalConDescuento = totPrice - descuento;
        return totalConDescuento;
    }

// Strategy pattern 
    
    public double calculateDiscount(){
        return discountCalculation.calculateDiscount(details); //discountCalculation is an instance of a concrete Strategy (EstCreditCardPayment)that makes the discount calculation 
    }
    
    public double calcularTotalPedidoSinDescuento(){
        double totPriceSinDescuento;
        double suma=0;
        
        for(OrderDetail or: details) // for each
        {
            suma+=or.calcularTotalDetalle();
        }
        totPriceSinDescuento=suma;
        return totPriceSinDescuento;
    }
    
    @Override
    public String toString(){
        String aux="";
        aux+="\nFecha de Creación: "+fechaCreacion+"\n\nNumero de pedido: "+orderNumber;
        aux+="\n\nDetalles del Pedido: ";
        for(OrderDetail or: details){
            aux+=or.toString();
        }
        return aux;
    }  
}
