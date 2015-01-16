package Exercise1;

/**
 * @author vania
 */
public class Circle {           // save as "Circle.java"
   // private instance variable, not accessible from outside this class
   private double radius;
   private String color;
   
   // 1st constructor, which sets both radius and color to default
   public Circle() {
      this.radius = 1.0;
      this.color = "red";
   }
   
   // 2nd constructor with given radius, but color default
   public Circle(double radius) {
      this.radius = radius;
      this.color = "red";
   }

   // 3rd Constructor to construct a new instance of Circle with the given radius and color
   public Circle(double radius, String color){
       this.radius = radius;
       this.color = color;
   }
   
   // A public method for retrieving the radius
   public double getRadius() {
     return radius; 
   }

   // 6. Setter for instance variable radius
   public void setRadius(double radius){
       this.radius=radius; //13. "this.radius" refers to the instance variable
       // "radius" refers to the method´s argument 
   }
   
   //3. Getter for instance variable color
   public String getColor(){
       return color;
   }
   
   //6. Setter for instance variable color
   public void setColor(String color){
       this.color = color;
   }
   
   // A public method for computing the area of circle
   public double getArea() {
      return radius*radius*Math.PI;
   }
   //21. method toString
   @Override
   public String toString(){
       return "Circle: radius=" + radius + "color =" + color;
   }
}
