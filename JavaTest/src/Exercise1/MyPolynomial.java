package Exercise1;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

/**
 * @author vania
 */

public class MyPolynomial { // save as MyPolynomail.java
    
    private double[] coeffs;
    
    public MyPolynomial(double... coeffs){ // varargs
        this.coeffs = coeffs; // varargs is treated as array
    }
    
    public MyPolynomial (String filename){
        Scanner in = null;
        try{
            in = new Scanner(new File(filename)); //open file
        
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        
        int degree = in.nextInt(); //read the degree
        
        coeffs = new double[degree+1]; //allocate the array
        
        for (int i=0; i<coeffs.length; i++){
            coeffs[i] = in.nextDouble();
        }
    }
    
    public double[] getCoeffs(){
        return coeffs;
    }
    
    public void setCoeffs(double... coeffs){
        this.coeffs = coeffs;
    }
    
    public int getDegree(){ // returns the degree of this polynomial 
        int degree = coeffs.length-1;
        return degree;
    }
    
    public double evaluate(double x){
        double acum = 0;
        int i;
        
        for (i =0; i<coeffs.length; i++){
           
            if(i == 0) {
                acum+= coeffs[i];
            }
            else {acum+=coeffs[i]*Math.pow(x, i);}
        }
        return acum;
    }
    
    public MyPolynomial add(MyPolynomial another){
        
        int i;
        double[] newCoeffs;
        MyPolynomial newPolynomial;
        double[] anotherCoeffs = another.getCoeffs();
        if(this.getDegree()>another.getDegree()){
        newCoeffs= new double[coeffs.length];
        for (i =0; i<another.getDegree()+1; i++){
            newCoeffs[i] = this.coeffs[i]+anotherCoeffs[i];
        }
        for (int j =i; j<this.getDegree()+1; j++){
            newCoeffs[j] = anotherCoeffs[j];
        }
        
        }
        else {
            newCoeffs = new double[another.getCoeffs().length];
            for (i =0; i<coeffs.length; i++){
            newCoeffs[i] = this.coeffs[i]+anotherCoeffs[i];
        }
            for (int j =i; j<another.getDegree()+1; j++){
            newCoeffs[j] = anotherCoeffs[j];
        }
        }
        newPolynomial = new MyPolynomial(newCoeffs);
        return newPolynomial;
    }
    
     public MyPolynomial multiply (MyPolynomial another){
         
         ArrayList<MyPolynomial> polinomiosParaSumar= new ArrayList();
         
         int thisDegree = this.getDegree();
         int anotherDegree = another.getDegree();
         int newDegree = thisDegree + anotherDegree;
         
         MyPolynomial newPolynomial;
         double[] newCoeffs= new double[newDegree+1];
         
         double[] anotherCoeffs = another.getCoeffs();
         int i;
         
         for (i =0; i<coeffs.length; i++){
             MyPolynomial aux;
             double[] auxCoeffs = new double[another.getDegree()+(i+1)];
             
             for(int m=0; m<auxCoeffs.length; m++){
                 auxCoeffs[m]= 0;
             }
             
             for(int j=0; j<anotherCoeffs.length; j++){
                 auxCoeffs[i+j]= coeffs[i]*anotherCoeffs[j];
             }
             aux = new MyPolynomial(auxCoeffs);
             polinomiosParaSumar.add(aux); 
        }
         MyPolynomial aux2= new MyPolynomial();
         for (i =0; i<polinomiosParaSumar.size()-1; i++){
             
             int j= i+1;
             
             if(i==0){
             aux2 = polinomiosParaSumar.get(i).add(polinomiosParaSumar.get(j));
             }
             else {aux2 = aux2.add(polinomiosParaSumar.get(j));
             }
        }
        newPolynomial = aux2;
        return newPolynomial;
    
    }
    
    @Override
    public String toString(){
        String aux="";
        int i;
        
        for (i = coeffs.length-1; i >= 0; i--){
           
            if(i == 0) {
                aux+= coeffs[i];
            }
            else {aux+= coeffs[i]+"x^"+i+" + ";}
        }
        return aux;
    } 
    
}
