package Exercise1;

/**
 * @author vania
 */
public class MyCircle {
    
    // two private instance variables center and radius
    private MyPoint center;
    private int radius;
    
  
    // first constructor that constructs a circle given a MyPoint instance as center, and radius
    public MyCircle(MyPoint center, int radius){
        this.center = center;
        this.radius = radius;
    }
      // second constructor that constructs a circle with the given center´s coordinates and radius
    public MyCircle(int x, int y, int radius){
        center = new MyPoint(x,y);
        this.radius = radius;
    }

   
    
    public int getRadius(){
        return radius;
    }
    
    public void setRadius (int radius){
        this.radius = radius;
    }
    
    public MyPoint getCenter(){
        return center;
    }
    
    public void setCenter(MyPoint center){
        this.center = center;
    }
    
    public int getCenterX(){
        return center.getX();
    }
    
    public int getCenterY(){
        return center.getY();
    }
    
    public void setCenterXY (int x, int y){
        center.setX(x);
        center.setY(y);
    }
    // Public method toString that returns a string description of the instance in a specific format
    @Override
    public String toString(){
        String aux = "";
        aux+= "Circle @ ("+ center.getX()+" , "+center.getY()+") radius= "+radius;
        return aux;
    }
    // A public method that returns the area of the circle in double 
    public double getArea(){
        return radius*radius*Math.PI;
    }
    
}

