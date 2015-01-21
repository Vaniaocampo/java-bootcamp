package Exercise1;

/**
 * @author vania
 */
public class TestMyPolynomial {
    
    public static void main(String[] args) {
        System.out.println("Test Program...");
        System.out.println("Declare and allocate an instance of class MyPolynomial called p1");
       
        MyPolynomial p1 = new MyPolynomial (3, 2);
        System.out.println(p1.toString()); 
        System.out.println("Declare and allocate an instance of class MyPolynomial called p1");
        MyPolynomial p2 = new MyPolynomial (4, 3);
        System.out.println(p2.toString()); 
        
       double[] coeffs = {1.2, 3.4, 5.6, 7.8}; // creamos y declaramos un array en una línea 
        
       MyPolynomial p3 = new MyPolynomial(coeffs); // invoke the constructor with an array
       
       System.out.println("Method add() and multiply()");
       System.out.println(p2.toString()); 
       System.out.println("p1 plus p2 "+ p1.add(p2).toString());
       System.out.println("p1 * p2 "+ p1.multiply(p2).toString());
       
       /**
        * Do you need to keep the degree of the polynomial as an instance variable in the 
        * MyPolynomial class in Java? How about C/C++? Why?
        * 
        * no, I don´t need to keep the degree as an instance variable
        * because the method getDegree() return that information.
        * The method getDegree() use lenght() of array coeffs to calculate 
        * the degree of the polynomial. 
        */
         
    
    }
    
}
