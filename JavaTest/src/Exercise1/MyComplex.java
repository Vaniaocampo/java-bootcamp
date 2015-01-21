
package Exercise1;

/**
 * @author vania
 */
public class MyComplex { //Save as MyComplex.java
    
    private double real; //stores the real part of the complex number
    private double imag; //stores the imaginary part of the complex number
    
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
    
    public void setImag(double imag){
        this.imag = imag;
    }
    
    public void setValue (double real, double imag){
        this.real = real;
        this.imag = imag;
    }
    
    @Override
    public String toString(){
        String aux="";
        aux+= "( "+real+" + "+imag+"i )";
        return aux;
    }
    
    public boolean isReal(){
        return (imag == 0);
    }
    
    public boolean isImaginary(){
        return (real == 0);
    }
    
    public boolean equals(double real, double imag){
        
        return (this.real == real && this.imag == imag);
    }
    
    public boolean equals (MyComplex another){
        return (this.real == another.getReal() && this.imag == another.getImag());
    }
    
    public double magnitude(){
        return Math.sqrt(real*real + imag*imag);
    }
    
    public double argumentInRadians(){
        return Math.atan2(real, imag);
    }
    
    public int argumentInDegrees(){
        
        double argumentInRadians = this.argumentInRadians();
        return (int) Math.toDegrees(argumentInRadians);
    }
    
    public MyComplex conjugate(){
        return new MyComplex(real, -imag);
    }
    
    public MyComplex add(MyComplex another){
        double newReal = this.real + another.getReal();
        double newImag = this.imag + another.getImag();
        return new MyComplex(newReal, newImag);
    } 
    
    public MyComplex subtract(MyComplex another){
        double newReal = this.real - another.getReal();
        double newImag = this.imag - another.getImag();
        return new MyComplex(newReal, newImag);
    }
    
    public MyComplex multiplyWith(MyComplex another){
        double newReal = this.real * another.getReal() - this.imag * another.getImag();
        double newImag = this.real * another.getImag() + this.getImag() * another.getReal();
        return new MyComplex(newReal, newImag);
    }
    
    public MyComplex divideBy(MyComplex another){
        
        MyComplex conjugate = another.conjugate();
        MyComplex aux = this.multiplyWith(conjugate);
        double divisor = another.getReal()*another.getReal()+ another.getImag()*another.getImag();
        this.setReal(aux.getReal()/divisor);
        this.setImag(aux.getImag()/divisor);
        return this;
    }
    
}
