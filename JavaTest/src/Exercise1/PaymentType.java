package Exercise1;

public class PaymentType {
    
    private String nombre;
    private String descripcion;
   
    public void PaymentType(){
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
   
    public String toString(){
        String aux="";
        aux+= "Forma de pago: "+nombre+"\nDescripción: "+descripcion;
        return aux;
    }
}

