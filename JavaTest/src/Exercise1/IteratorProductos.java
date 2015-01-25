package Exercise1;
import java.util.ArrayList;
/**
 * @author vania
 */

public class IteratorProductos implements Iterator{ //saved as IteratorProductos.java 
    //inner class of ProductCatalog that implements the Iterator interface for Product objects. It contains basic implementations of the abstract methods in the interface.
    
    private ArrayList<Product> products;
    private int posicion;
      

    public IteratorProductos(ArrayList<Product> productos){ //Set the ArrayList of products 
        products=productos;
        posicion=0;
    }
    
    @Override
    public void primero() {
        posicion=0;
    }

    @Override
    public void siguiente() {
        posicion = posicion +1;
    }

    @Override
    public boolean haTerminado() {
        
        int ultimaPos=products.size()-1;
        return  posicion>ultimaPos;
    }

    @Override
    public Object elementoActual() {
        return products.get(posicion);
    }
    
    public void setProductos(ArrayList<Product> products){
        this.products=products;
    }
    
    public void setPosicion(int posicion){
        this.posicion=posicion;
    }
}
