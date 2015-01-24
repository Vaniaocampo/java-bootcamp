package Exercise1;
/**
 * @author vania
 */
public class OrderDetail {
    
    private int cantidad;
    private double precio;
    private Product producto;
    
    public OrderDetail(){
    }
    public OrderDetail(Product producto, int cantidad){
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio= calcularTotalDetalle();
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    
    public double getPrecio(){
        return this.precio;
    }
    public void setPrecio(double precio){
        this.precio=precio;
    }
    
    public void tomarProducto(Product producto){
        this.producto = producto;
    }
    public Product obtenerProducto(){
        return this.producto;
    }
    
    public double calcularTotalDetalle(){
        this.precio = producto.getPrecio()*cantidad;
        return precio;
    }
    
    public double obtenerPrecioUnitario(){
        return producto.getPrecio();
    }
    
    @Override
    public String toString(){
        String aux="\n"+producto.toString()+" Cantidad: "+cantidad+" Precio: "+precio;
        return aux;
    }
}
