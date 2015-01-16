package Exercise1;
/**
 * @author vania
 */
public class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;
    
    public Book(String name, Author author, double price){
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public Book(String name, Author author, double price, int qtyInStock){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }
    
    public String getName(){
        return name;
    }
    
    public Author getAuthor(){
        return author;
    }
    
    // 2.Introduce new methods called getAuthorName(). getAuthorEmail(), getAuthorGender() in the Book class
    public String getAuthorName(){
        return author.getName();
    }
     public String getAuthorEmail(){
        return author.getEmail();
    }
      public char getAuthorGender(){
        return author.getGender();
    }
    public double getPrice(){
        return price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public int getQtyInStock(){
        return qtyInStock;
    }
    
    public void setQtyInStock(int qtyInStock){
        this.qtyInStock = qtyInStock;
    }
    
    public String toString(){
        String aux="";
        aux+= "book-name: "+name+" by "+author.toString();
        return aux;
    
    }
}
