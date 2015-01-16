package Exercise1;
/**
 * @author vania
 */
public class TestCircle { // save as "TestCircle.java"
   
    public static void main(String[] args) {
      // Declare and allocate an instance of class Circle called c1
      //  with default radius and color
      Circle c1 = new Circle();
      
      // Use the dot operator to invoke methods of instance c1.
      System.out.println("The circle has radius of " 
         + c1.getRadius() + "color of "+c1.getColor()+" and area of " + c1.getArea());
      
      System.out.println(c1.toString()); // 21. explicit call method toString 
   
      // Declare and allocate an instance of class circle called c2
      //  with the given radius and default color
      Circle c2 = new Circle(2.0);
      
      //2.Declare and allocate an instance of class circle called c4
      // with the given radius and color
      Circle c4 = new Circle(3.0,"amarillo");
      
      // Use the dot operator to invoke methods of instance c2.
      System.out.println("The circle has radius of " 
         + c2.getRadius() +" color of"+c2.getColor()+ " and area of " + c2.getArea());
      
      //4. Use the dot operator to invoke methods of instance c2
      System.out.println("The colour of the circle 2 is: "+c2.getColor());
      
      /**
       * 5. El mensaje de error dice que la variable tiene un acceso privado
       * y no puede ser accedida directamente desde el exterior de la clase
       */

      Circle c3 = new Circle(); // construct an instance of Circle
      c3.setRadius(5.0); // change radius
      c3.setColor("red"); // change color
   }
}