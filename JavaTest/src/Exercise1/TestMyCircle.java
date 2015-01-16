package Exercise1;

/**
 * @author vania
 */
public class TestMyCircle {
     public static void main(String[] args) {
      
      // Declare and allocate an instance of class MyCircle called circle1  
      MyCircle circle1 = new MyCircle(0,0,5);
      
      MyPoint center = new MyPoint(2,2);
      
      // Declare and allocate an instance of class MyCircle called circle2
      MyCircle circle2 = new MyCircle (center,8);
      
      System.out.println(circle1); //call toString()
      System.out.println(circle2.toString()); //call toString()
      
      System.out.println("Change center and radius of circle1");
      circle1.setCenterXY(1, 1);
      circle1.setRadius(10);
      System.out.println(circle1.toString());
      
      
      // 1.Printing the area of circle2 and circle 1
      System.out.println("Area of circle 2: " + circle2.getArea());
      System.out.println("Area of Circle 1: " + circle1.getArea());
      

    }
}
