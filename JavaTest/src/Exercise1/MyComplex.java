
package Exercise1;

/**
 * @author vania
 */
public class MyComplex {
    
    private double real;
    private double imag;
    
    public MyComplex(double real, double imag){
        
        this.real = real;
        this.imag = imag;
    }
    
    public double getReal(){
        return real;
    }
    
    public void setReal (double real){
        this.real = real;
    }
    
    public double getImag(){
        return imag;
    }
    
    public void setValue (double real, double imag){
        this.real = real;
        this.imag = imag;
    }
    
    @Override
    public String toString(){
        String aux="";
        return aux;
    }
    
    public boolean isReal(){
        return true;
    }
    
    public boolean isImaginary(){
        return false;
    }
    
    public boolean equals(double real, double imag){
        return false;
    }
    
    public boolean equals (MyComplex another){
        return false;
    }
    
    public double magnitude(){
        return 0.0;
    }
    
    public double argumentInRadians(){
        return 0.0;
    }
    
    public int argumentInDegrees(){
        return 1;
    }
    
    public MyComplex conjugate(){
        return null;
    }
    
    public MyComplex add(MyComplex another){
        return null;
    } 
    
    public MyComplex subtract(MyComplex another){
        return null;
    }
    
    public MyComplex multiplyWith(MyComplex another){
        return null;
    }
    
    public MyComplex divideBy(MyComplex another){
        return null; 
    }
    
}
