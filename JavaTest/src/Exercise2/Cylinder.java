package Exercise2;

/**
 * @author vania
 */
public class Cylinder extends Circle {  //save as "Cylinder.java"
   private double height;  // private variable
   
   // Constructor with default color, radius and height
   public Cylinder() {
      super();        // call superclass no-arg constructor Circle()
      height = 1.0; 
   }
   // Constructor with default radius, color but given height
   public Cylinder(double height) {
      super();        // call superclass no-arg constructor Circle()
      this.height = height;
   }
   // Constructor with default color, but given radius, height
   public Cylinder(double radius, double height) {
      super(radius);  // call superclass constructor Circle(r)
      this.height = height;
   }
   
   // A public method for retrieving the height
   public double getHeight() {
      return height; 
   }
  
   // A public method for computing the volume of cylinder
   //  use superclass method getArea() to get the base area
   public double getVolume() {
      return super.getArea()*height; //method getVolume() fixed
   }
    // A public method for computing the area of Cylinder
   public double getArea(){
       double area=0.0;
       double perimetroCirculo=2*Math.PI*super.getRadius()*height;
       double aux=2+super.getArea();
       area=perimetroCirculo+aux;
       return area;
   }
   @Override
   public String toString(){
   return "Cylinder: subclass of " + super.toString() +" height="+height;
   }
  
}