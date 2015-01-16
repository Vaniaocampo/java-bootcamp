package Exercise1;

/**
 * @author vania
 */
public class Author {
    private String name;
    private String email;
    private char gender;
    
    public Author (String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    
    public String getName(){
        return name;
    }
    
    public String getEmail(){
        return email;
    }
    
   public void setEmail (String correo){
       email = correo;
   }
   
  public char getGender(){
      return gender;
  }
  
  public String toString(){
      String aux="";
      aux+= name+" ("+gender+") at "+email;
      return aux;
  }
}