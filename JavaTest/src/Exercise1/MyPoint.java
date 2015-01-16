package Exercise1;

/**
 * @author vania
 */
public class MyPoint { // save as "MyPoint.java
    // private instance variable, not accesible from outside this class
    private int x;
    private int y;
    
    //first constructor, which sets both coordinates to 0
    public MyPoint(){
        x = 0;
        y = 0;
    }
    
    //second constructor with given x and y coordinates
    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    //A public method for retrieving the x coordinate
    public int getX(){
        return x;
    }
    //Setter for instance variable x
    public void setX(int x){
        this.x = x;
    }
    //A public method for retrieving the y coordinate
    public int getY(){
        return y;
    }
    //Setter for instance variable y
    public void setY(int y){
        this.y = y;
    }
    
    //A public method to set both coordinates x and y
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public double distance(int x, int y){
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt( xDiff*xDiff + yDiff*yDiff);
    }
    
    public double distance(MyPoint another){
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
         return Math.sqrt( xDiff*xDiff + yDiff*yDiff);
    }
    
    @Override
    public String toString(){
        return "Point: "+ "("+x+" , "+y+")";
    }
    
}
