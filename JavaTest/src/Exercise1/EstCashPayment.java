package Exercise1;
import java.util.ArrayList;
/**
 * @author vania
 */

public class EstCashPayment implements IEstDiscountCalculation{

    public EstCashPayment(){}
    
    @Override
    public double calculateDiscount(ArrayList<OrderDetail> orderDetails) { //Discount by cash: 90% of the most expensive item is free 
        
        double descuento;
        OrderDetail mayor=null; // Order detail with the most expensive item
        
        int i= 0, j; 
        for(j=i+1; j<orderDetails.size(); j++){
            if(i==0){
                
                mayor=orderDetails.get(i);
                if(mayor.obtenerPrecioUnitario()<orderDetails.get(j).obtenerPrecioUnitario()){
                    mayor=orderDetails.get(j);
                }
            }
            else{
                if(mayor.obtenerPrecioUnitario()<orderDetails.get(j).obtenerPrecioUnitario()){
                mayor=orderDetails.get(j);
            }
            }
        } 
        descuento = (double) (mayor.getPrecio()*90)/100;
        return descuento;
    }
}
