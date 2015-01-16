package Exercise1;

/**
 * @author vania
 */
public class Producto { //Save as Producto.java 
    private int codigo;
    private String nombre;
    private double precio;
    
    public Producto(){ 
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
        aux+= "\nNombre de producto: "+nombre;
        aux+= "\nCódigo de productor:" + codigo;
        aux+= "\nPrecio unitario: "+ precio;
        return aux;
    }
    
}
