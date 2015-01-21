package Exercise1;

/**
 * @author vania
 */
public class MyComplexApp {
    
    public static void main(String[] args){
        
        System.out.println("Starting MyComplexApp.....");
        System.out.println("Enter complex number 1 (real and imaginary part):");
        KeyboardInput input1 = new KeyboardInput();
        System.out.println("Enter complex number 2 (real and imaginary part):");
        KeyboardInput input2 = new KeyboardInput();
        MyComplex number1;
        MyComplex number2;
        double real1, real2;
        double imag1, imag2;
        
        real1 = Double.parseDouble(input1.getPrimeraPalabra());
        imag1 = Double.parseDouble(input1.getSiguientePalabra());
        
        number1 = new MyComplex(real1, imag1);
        System.out.println("\nNumber 1 is:"+number1.toString());
        
        if (number1.isImaginary()){
            System.out.println(number1.toString()+" is a PURE imaginary number");
        }
        else{
            System.out.println(number1.toString()+ " is NOT a pure imaginary number");
            if (number1.isReal()){System.out.println(number1.toString()+" is a PURE real number");}
            else{
                System.out.println(number1.toString()+" is NOT a pure real number");
            }
        }
        
        real2 = Double.parseDouble(input2.getPrimeraPalabra());
        imag2 = Double.parseDouble(input2.getSiguientePalabra());
        number2 = new MyComplex(real2, imag2);
        System.out.println("\nNumber 2 is:"+number2.toString());
        
        if (number2.isImaginary()){
            System.out.println(number2.toString()+" is a PURE imaginary number");
        }
        else{
            System.out.println(number2.toString()+ " is NOT a pure imaginary number");
            if (number2.isReal()){System.out.println(number2.toString()+" is a PURE real number");}
            else{
                System.out.println(number2.toString()+" is NOT a pure real number");
            }
        }
        
        if(number1.equals(number2)){
            System.out.println("\n"+number1.toString()+" is equal to "+number2.toString());
        }
        else{
            System.out.println("\n"+number1.toString()+" is NOT equal to "+number2.toString());
        }
        System.out.println("\n"+number1.toString()+" + "+number2.toString()+" = "+number1.add(number2).toString());
        System.out.println(number1.toString()+" - "+number2.toString()+" = "+number1.subtract(number2).toString());
 }    
}
