package Exercise1;
import java.math.BigInteger;

/**
 * @author vania
 */
public class TestBigInteger {
    
    public static void main(String[] args){

        // Declare and allocate two instances of class BigInteger called i1 and i2
        BigInteger i1 = new BigInteger("111111111111111111111111111111111111111111111111111111111111");
        BigInteger i2 = new BigInteger("22222222222222222222222222222222222222222222222222");
        
        
        System.out.println("BigInteger one: "+i1);
        System.out.println("BigInteger two: "+i2);
        System.out.println("BigInteger one plus BigInteger:" + i1.add(i2));
        System.out.println("BigInteger one * BigInteger two:"+ i1.multiply(i2));
    }
}

