package Exercise4;
/**
 * @author vania
 */

public class Square extends Rectangle{
    
    public Square(){}
    
    public Square(double side){
        super(side,side);
    }
    public Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }
    public double getSide(){
        return super.getLength();
    }
    public void setSide(double side){
        super.setLenght(side);
        super.setWidth(side);
    }
    public void setWidth(double side){
        super.setWidth(side);
    }
    public void setLength(double side){
        super.setLenght(side);
    }
}
