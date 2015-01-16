package Exercise1;

/**
 * @author vania
 */

public class TestBook {
    public static void main(String[] args) {
      // Declare and allocate an instance of class Author called a1
        
      Author a1 = new Author("Stephen King","stephenking@gmail.com",'m');
      
      Book book=new Book("Carrie", a1, 100.00, 500); // Use an anonymous instance of Author
      Book secondBook=new Book ("Carrie2", new Author("Stephen King","stephenking@gmail.com",'m'),150.00, 500);
      System.out.println(secondBook); //call toString()
      
      // 1.Printing the name and email of the author from a Book instance.
      System.out.println(secondBook.getAuthor().getName());
      System.out.println(secondBook.getAuthor().getEmail());

    }
}
