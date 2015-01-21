package Exercise1;

/**
 * @author vania
 */

public class TestMyComplex {
    
    public static void main(String[] args) {
      
      // Declare and allocate an instance of class MyComplex called complex1  
        System.out.println("Creating a instance of class MyComplex called complex1...");
        MyComplex complex1 = new MyComplex(2,5);
        System.out.println(complex1);
        System.out.println("This number is real?...");
        System.out.println(complex1.isReal());
        System.out.println("This number is imaginary?...");
        System.out.println(complex1.isImaginary());
        System.out.println("We set the imaginary part to 0...");
        complex1.setImag(0);
        System.out.println("This number is real?...");
        System.out.println(complex1.isReal());
        System.out.println("Creating another instance of class MyComplex called complex2...");
        MyComplex complex2 = new MyComplex(7,3);
        System.out.println(complex2);
        System.out.println("complex1 and complex2 are equal?..");
        System.out.println(complex1.equals(complex2));
        System.out.println("Magnitude of complex number 1: "+complex1.magnitude());
        System.out.println("Magnitude of complex number 2: "+complex2.magnitude());
        System.out.println("Argument in radians of complex number 1: "+complex1.argumentInRadians());
        System.out.println("Argument in degrees of complex number 2: "+complex2.argumentInDegrees());
        System.out.println("The complex conjugate of complex number 2: "+complex2.toString()+" is: "+complex2.conjugate().toString());
        System.out.println("Some operations...");
        System.out.println("complex1 plus complex2 "+complex1.add(complex2));
        System.out.println("complex1 minus complex2 "+complex1.subtract(complex2));
        System.out.println("complex1 multiply with complex2 "+complex1.multiplyWith(complex2));
        System.out.println("complex1 divideBy complex2 "+complex1.divideBy(complex2));
    }
}
