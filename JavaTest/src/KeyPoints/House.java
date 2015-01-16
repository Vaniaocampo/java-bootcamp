package KeyPoints;

// Point 2. Design a building like a house and provide a builder to build it.
/**
 * @author vania
 */
public class House { // save as "House.java"

// private instance variable, not accessible from outside this class
    private String propietario;
    private String domicilio;
    private double superficieEdificada; 
    private String caracteristicas;
	
        // 1st constructor empty
        public House() 
        {}
	// 2nd constructor with given dimension
	public House(double dimension)
	{
		this.superficieEdificada=dimension;
	}
	
	// 3rd constructor with given propietario 
	public House(String propietario)
	{
		this.propietario=propietario;
	}
	
	public double getDimension()
	{
		return superficieEdificada;
	}
	// A public method for retrieving the domicilio 
	public String getDomicilio()
	{
		return domicilio;
	}
	
	public String toString()
	{
		String aux="";
		aux+= "\nPropietario: "+propietario;
		aux+= "\nSuperficie edificada: "+superficieEdificada;
		aux+= "\nDomicilio: "+ domicilio;
		aux+= "\nCaracterísticas: "+caracteristicas;
		return aux;
	}
}

