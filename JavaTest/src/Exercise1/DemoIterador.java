package Exercise1;
import java.util.ArrayList;
import java.util.Date;
/**
 * @author vania
 * Add functionality to display information about the list of items. The item should be displayed as:
 * Item Name ..... $price 
 */

public class DemoIterador {
    /** Demo class. It creates ten products and adds them to the product Catalog
     *  Next, it delegates the sequential access over the items in the Catalog, to the ProductCatalog class  
     *  Finally print the information received 
     */
    public static void main (String[] args){
        
        // Declare and allocate ten instances of class Product 
        Product product1= new Product(0123,"All the Light We Cannot See by Anthony Doerr",20.45);
        Product product2= new Product(0234,"Gray Mountain by John Grisham",20.10);
        Product product3= new Product(0345,"The Empty Throne by Bernard Cornwell",19.43);
        Product product4= new Product(0456,"Insatiable Appetites by Stuart Woods",21.22);
        Product product5= new Product(0111,"Miramont´s Ghost by Elizabeth Hall",10.99);
        Product product6= new Product(0222,"Everything Burns by Vincent Zandri",11.48);
        Product product7= new Product(0333,"Flirting with Felicity by Gerri Russell",9.56);
        Product product8= new Product(0444,"See How Small by Scott Blackwood",15.0);
        Product product9= new Product(0777,"West of Sunset by Stewart O´Nan",20.93);
        Product product10= new Product(0666,"Lord of the flies by William Golding",25.26);
        
        ArrayList<Product> productos= new ArrayList();
        //Add the instances in the ArrayList of products 
        productos.add(product1);
        productos.add(product2);
        productos.add(product3);
        productos.add(product4);
        productos.add(product5);
        productos.add(product6);
        productos.add(product7);
        productos.add(product8);
        productos.add(product9);
        productos.add(product10);
        
        Date fechaCreacion=new Date();
        
        //Send the instances to the constructor method in the ProductCatalog class 
        ProductCatalog catalog = new ProductCatalog(fechaCreacion,productos);
        
        //Print all the information 
        ArrayList<String> information= catalog.mostrarCatalogo();
        System.out.println("**************************** PRODUCTS ****************************************");
        System.out.println(catalog.mostrarCatalogo());
    
    }
}
