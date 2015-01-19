package Exercise1;
import java.util.Date;

/**
 * @author vania
 */
public class Order {
    
    private Date fechaCreacion;
    private int orderNumber;
    private Date fechaEnvio;
    private Date fechaEntrega;
    private IEstDiscountCalculation discountCalculation;
    private double descuento;
    
    public Order(){}
    public Order(Date fechaCreacion, int orderNumber,IEstDiscountCalculation discountCalculation){
        this.fechaCreacion = fechaCreacion;
        this.orderNumber = orderNumber;
        this.discountCalculation = discountCalculation;
    }
    
    public Order(Date fechaCreacion){
        this.fechaCreacion = fechaCreacion;
 
    }
    
    public double calcularTotalPedido(){
        double totPrice = 100;
        double descuento = discountCalculation.calculateDiscount();
        return totPrice - descuento;
    }
    
    
}
