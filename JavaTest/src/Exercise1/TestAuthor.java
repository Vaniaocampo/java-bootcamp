package Exercise1;

/**
 * @author vania
 */

public class TestAuthor {
     
    public static void main(String[] args) {
      // Declare and allocate an instance of class Author called a1
        
      Author a1 = new Author("Stephen King","stephenking@gmail.com",'m');
      
      System.out.println(a1); //call toString()
      a1.setEmail("kingStephen@gmail.com");
      System.out.println(a1);  
   
    }
    
}
