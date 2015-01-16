package Exercise1;

/**
 * @author vania
 */
public class TestMyTriangle {
    public static void main(String[] args) {
      
      // Declare and allocate an instance of class MyTriangle called triangle1  
      MyTriangle triangle1 = new MyTriangle(0,0,5,5,0,5); // isosceles triangle
      System.out.println(triangle1); //call toString()
      MyPoint v1, v2, v3;
      v1 = new MyPoint (0,0);
      v2 = new MyPoint (0,10);
      v3 = new MyPoint (10,2);
      MyTriangle triangle2 = new MyTriangle(v1,v2,v3); // another triangle
      System.out.println(triangle2); //call toString()
      
      // printing the type of the triangles
      System.out.println("\nType of circle 1 and 2 :");
      triangle1.printType();
      triangle2.printType();     
}
}

