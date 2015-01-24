package Exercise1;
import java.util.ArrayList;
/**
 * @author vania
 */

public class EstCreditCardPayment implements IEstDiscountCalculation{
    
    public EstCreditCardPayment() {
    }

    @Override
    public double calculateDiscount(ArrayList<OrderDetail> orderDetails) { //Discount by Credit Card: 10% 
        double descuento;
        double suma=0;
        
        for(OrderDetail or: orderDetails) // for each
        {
            suma+=or.calcularTotalDetalle();
        }
        descuento = (double) (suma*10)/100;
        return descuento;
    }   
}
