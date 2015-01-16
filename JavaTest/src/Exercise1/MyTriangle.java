package Exercise1;

/**
 * @author vania
 */
public class MyTriangle {
    
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
    
    public MyTriangle (int x1, int y1, int x2, int y2, int x3, int y3){
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }
    
    public MyTriangle (MyPoint v1, MyPoint v2, MyPoint v3){
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    public double getPerimeter(){
        double distance1, distance2, distance3;
        distance1 = v2.distance(v1);
        distance2 = v3.distance(v2);
        distance3 = v3.distance(v1);
        return distance1+distance2+distance3;
        
    }
    
    public void printType(){
        
        String type="";
        double lado1, lado2, lado3;
        lado1 = v2.distance(v1);
        lado2 = v3.distance(v2);
        lado3 = v3.distance(v1);
        
        if (lado1 == lado2){
            if (lado2 == lado3) type = "equilateral";
            type = "isosceles";
        }
        else{
            if(lado3 == lado1 || lado3 == lado2) type ="isosceles";
            else {type = "scalene";}
        }
        
         System.out.println("Type of triangle: " + type);
    }
    
    @Override
    public String toString(){
        String aux = "";
        aux+= "Triangle @ ("+v1.getX()+" , "+v1.getY()+")";
        aux+= ","+" ("+v2.getX()+" , "+v2.getY()+")";
        aux+= ","+" ("+v3.getX()+" , "+v3.getY()+")";
        return aux;
    }
    
}

