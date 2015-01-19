package Exercise1;

/**
 * @author vania
 */
public class EstCreditCardPayment extends IEstDiscountCalculation{

  
    public double calculateDiscount(double totalPrice) {
        double descuento;
        descuento = (double) (totalPrice*30)/100;
        return totalPrice - descuento;
    }
    
}
