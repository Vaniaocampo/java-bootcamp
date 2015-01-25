package Exercise1;
import java.util.Date;
import java.util.ArrayList;
/**
 * @author vania
 */

public class ProductCatalog implements Agregado{
    private Date fechaCreacion;
    private Date fechaVencimiento;
    private Date fechaPublicacion;
    private ArrayList<Product> productos;
    
    public ProductCatalog(){}
    public ProductCatalog(Date fechaCreacion, ArrayList<Product> productos){
        this.fechaCreacion=fechaCreacion;
        this.productos= productos;
    }
    public Date getFechaCreacion(){
        return fechaCreacion;
    }
    public void setFechaCreacion(Date fechaCreacion){
        this.fechaCreacion = fechaCreacion;
    }
    public Date getFechaVencimiento(){
        return fechaVencimiento;
    }
    public void setFechaVencimiento(Date fechaVencimiento){
        this.fechaVencimiento = fechaVencimiento;
    }
    public Date getFechaPublicacion(){
        return fechaPublicacion;
    }
    public void setFechaPublicacion(Date fechaPublicacion){
        this.fechaPublicacion=fechaPublicacion;
    }
    public ArrayList<String> mostrarCatalogo()    
    {
        ArrayList<String> info= new ArrayList();
        Product p=null;
        Iterator iter=crearIterador();
        iter.primero(); //The first element of the list  
        
        while(iter.haTerminado()==false){
            //Acces 
            p=(Product)iter.elementoActual(); //cast 
            //We save the data required: name and price
            info.add("\n*"+p.getNombre()+" .............. $"+p.getPrecio()); 
            if(iter.haTerminado())break;
            else{iter.siguiente();} //Next element of the List 
        }
        return info;
    }
    
    @Override
    public Iterator crearIterador() { // returns an interator of products catalog
        Iterator iter= new IteratorProductos(productos);
        return iter;    
    }   
    @Override
    public String toString(){
        String aux="";
        return aux;
    }
}
