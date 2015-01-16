package Exercise1;

/**
 * @author vania
 */

public class TipoPago {
    private String nombre;
    private String descripcion;
    
    public TipoPago(){
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        String aux="";
        aux+= "Tipo de pago: "+nombre+"\nDescripcion: "+descripcion;
        return aux;
    }
    
}

