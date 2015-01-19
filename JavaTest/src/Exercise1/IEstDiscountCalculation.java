package Exercise1;
/**
 * Create a ShoppingCart where a user can buy different items and then decide
 * how pay them:
 * by Credit Card: where a Name and a Credit Number is required 
 * by Paypal: where an email and a password is needed.
 * Cash: no information is required.
 * Design Pattern: Strategy pattern
 * Reason: We found an action (calculate discount according to the type of
 * payment) that can be done in different ways.
 * 
 * @author vania
 */

public class IEstDiscountCalculation {
    
    public IEstDiscountCalculation(){}
    public double calculateDiscount(){
        return 0.0;
    }
    
}
