package Exercise1;
import java.util.Scanner; // import code of Scanner class from Java library 

public class KeyboardInput { // save as KeyboardInput.java 
    private String entradaTeclado; //private instance variable
    private int pos;
    
    public KeyboardInput(){ // constructor, which sets entradaTeclado to default 
        
        this.pos = 0;
        entradaTeclado="";
        pedirEntrada(); // call to an internal method
    }
    
    public void pedirEntrada(){ // A public method
        
        Scanner entradaEscaner = new Scanner(System.in);
        entradaTeclado = entradaEscaner.nextLine();
    }
    
    public String getEntrada() {return entradaTeclado;}
    
    public String getPrimeraPalabra(){
        
        for (int i = 0; i<entradaTeclado.length()-1;i++){
            if(entradaTeclado.substring(i, i+1).equals(" ")){
                 pos = i+1;
                 return entradaTeclado.substring(0, i);  
            }
        }
        return entradaTeclado; // if there isn´t any space return everything
    }
    
    public String getSiguientePalabra(){
        
        for (int i = pos; i<entradaTeclado.length()-1;i++){
            if(entradaTeclado.substring(i, i+1).equals(" ")){
                pos = i+1;
                return entradaTeclado.substring(0, i);}
            }
        return entradaTeclado.substring(pos, entradaTeclado.length()); // if there isn´t another space return the rest of the line 
        }
    
    public int getLongitud(){ // a public method
        return entradaTeclado.length();
    }
}

    
    

