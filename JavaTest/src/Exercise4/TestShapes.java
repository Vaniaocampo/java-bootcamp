package Exercise4;
/**
 * @author vania
 */

public class TestShapes {
    
    public static void main (String[] args){
        System.out.println("************************************ TEST SHAPES ***********************************************");    
        Shape s1 = new Circle(5.5, "RED", false);  // Upcast Circle to Shape
        System.out.println(s1);                    // toString() of Circle class because Circle has another implementation of this method. implicit call
        System.out.println(s1.getArea());          // getArea() of Circle class because getArea() is an abstract method in Shape class
        System.out.println(s1.getPerimeter());     // getPerimeter() of Circle class because getPerimeter() is an abstract method in Shape class
        System.out.println(s1.getColor());         // getColor() of Shape class because this method is a concrete method in Shape
        System.out.println(s1.isFilled());         // isFilled() of Shape class because this method is a concrete method in Shape
        
        //System.out.println(s1.getRadius()); compilation error because s1 are UpCast to Shape and method getRadius() doesn´t exists in class Shape
        
        Circle c1 = (Circle)s1;                   // Downcast back to Circle
        System.out.println("\n"+c1);                   // toString() of Circle class. explicit call 
        System.out.println(c1.getArea());         // getArea() of Circle class
        System.out.println(c1.getPerimeter());    // getPerimeter() of Circle class
        System.out.println(c1.getColor());        // getColor() of Shape class. Inherited method
        System.out.println(c1.isFilled());        // isFilled() of Shape class. Inherited method
        System.out.println(c1.getRadius());       // getRadius() of Circle class. Explicit call 
        
        // Shape s2 = new Shape(); compilation error because Shape is an abstract class and it cannot be instantiated 
        
        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);   // Upcast Rectangle to Shape
        System.out.println("\n"+s3);                        // toString() of Rectangle class because this class redefines this method 
        System.out.println(s3.getArea());                   // getArea() of Rectangle class because getArea() in Shape is abstract 
        System.out.println(s3.getPerimeter());              // getPerimeter() of Rectangle class because getPerimeter() is an abstract method in Shape class 
        System.out.println(s3.getColor());                  // getColor() of Shape class because this is a concrete method
        // System.out.println(s3.getLength()); compilation error because s3 are UpCast to Shape and method getLenght() doesn´t exist in Shape class
        
        Rectangle r1 = (Rectangle)s3;   // downcast back to Rectangle
        System.out.println("\n"+r1);         // toString() of Rectangle class
        System.out.println(r1.getArea()); //getArea() of Rectangle class 
        System.out.println(r1.getColor()); //getColor of Shape class
        // System.out.println(r1.getLength()); compilation error because r1 is an instance of Shape class and getLenght() doesn´t exist in Shape class
        
        Shape s4 = new Square(6.6);     // Upcast Square to Shape
        System.out.println("\n"+s4); //toString() of Rectangle class because Square doesn´t redefines this method 
        System.out.println(s4.getArea()); //getArea() of Rectangle class
        System.out.println(s4.getColor()); //getColor of Rectangle class
        //System.out.println(s4.getSide()); compilation error because getSide() doesn´t exist in Rectangle class 
  
        //  Take note that we downcast Shape s4 to Rectangle, 
        //  which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle)s4;
        System.out.println("\n"+r2); //toString() of Rectangle class
        System.out.println(r2.getArea()); //getArea() of Rectangle class
        System.out.println(r2.getColor()); //getColor() of Rectangle class
        //System.out.println(r2.getSide()); compilation error because getSide() doesn´t exist in Rectangle class  
        System.out.println(r2.getLength()); //getLenght() of Rectangle class
   
        // Downcast Rectangle r2 to Square
        Square sq1 = (Square)r2;
        System.out.println("\n"+sq1); //toString() of Rectangle class 
        System.out.println(sq1.getArea()); //getArea() of Rectangle superclass. Inherited method
        System.out.println(sq1.getColor()); //getColor() of Rectangle superclass. Inherited method
        System.out.println(sq1.getSide()); //getSide() of Square class
        System.out.println(sq1.getLength());//getLength() of Rectangle superclass. Inherited method 
   }   
}
