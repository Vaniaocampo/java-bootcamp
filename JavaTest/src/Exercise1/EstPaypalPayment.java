package Exercise1;
import java.util.ArrayList;
/**
 * @author vania
 */

public class EstPaypalPayment implements IEstDiscountCalculation{ //Discount by Paypal: the chepeast item is for free.
    
    public EstPaypalPayment(){
    }

    @Override
    public double calculateDiscount(ArrayList<OrderDetail> orderDetails) {
        double descuento;
        OrderDetail menor=null; // order detail with the cheapest item 
        int i= 0, j;
        
        for(j=i+1; j<orderDetails.size(); j++){
            if(i==0){
                menor=orderDetails.get(i);
                if(menor.obtenerPrecioUnitario()>orderDetails.get(j).obtenerPrecioUnitario()){
                    menor=orderDetails.get(j);
                }
            }
            else{
                if(menor.obtenerPrecioUnitario()>orderDetails.get(j).obtenerPrecioUnitario()){
                menor=orderDetails.get(j);
                }
            }
        }
        descuento = menor.getPrecio();
        return descuento;
    }
}
