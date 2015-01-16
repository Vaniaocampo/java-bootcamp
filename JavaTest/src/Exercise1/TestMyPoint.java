package Exercise1;
/**
 * @author vania
 */
public class TestMyPoint {
    public static void main(String[] args) {
        
        //test program
        MyPoint p1 = new MyPoint (3,0);
        MyPoint p2 = new MyPoint (0,4);
        System.out.println(p1); 
        System.out.println(p2);
        
        // Testing the overloaded method distance() 
        System.out.println("Distancia entre p1 y p2: ");
        System.out.println("With the method that takes a MyPoint instance as argument");
        System.out.println(p1.distance(p2)); // this version takes a MyPoint instance as argument
        System.out.println("With the method that takes two ints as argument");
        System.out.println(p1.distance(5, 6)); // this version takes two ints as arguments
        
        // Testing the array that allocates 10 points initialized in (1,1), (2,2),..(10,10)
        MyPoint[] points = new MyPoint[10]; //Declare and allocate an array of MyPoint
        
        for( int i=0; i<points.length;i++){
            int aux=i+1;
            points[i] = new MyPoint(aux,aux); //Allocate each of MyPoint instances
        }
    }
}
