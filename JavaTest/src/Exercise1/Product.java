package Exercise1;
/**
 * @author vania
 */

public class Product { //Save as Product.java 
    private long codigo;
    private String nombre;
    private double precio;
    
    public Product(){ 
    }
    public Product(long codigo, String nombre, double precio){
        
        this.codigo=codigo;
        this.nombre=nombre;
        this.precio=precio;
    }
    
    public long getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio = precio; 
    }
    
    @Override
    public String toString(){
        String aux ="";
        aux+= "\nNombre: "+nombre+" Precio: $"+precio;
        return aux;
    }
}
