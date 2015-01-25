package Exercise4;
/**
 * @author vania
 */

public class Rectangle extends Shape{
    private double width;
    private double lenght;
    
    public Rectangle(){}
    public Rectangle(double width, double lenght){
        this.width=width;
        this.lenght=lenght;
    }
    public Rectangle(double width, double lenght, String color, boolean filled){
        super(color,filled);
        this.width=width;
        this.lenght=lenght;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getLength(){
        return lenght;
    }
    public void setLenght(double lenght){
        this.lenght=lenght;
    }
   
    @Override
    public double getArea() {
        return lenght*width;
    }

    @Override
    public double getPerimeter() {
        return 2*(lenght+width); 
    }
    @Override
    public String toString() {
        return super.toString().concat(" Lenght: "+lenght+" Width: "+width);
    }
}
