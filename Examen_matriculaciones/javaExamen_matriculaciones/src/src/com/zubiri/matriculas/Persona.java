//Especificamos en qué paquete se encuentra la clase
package src.com.zubiri.matriculas;
//Importamos la clase Scanner
import java.util.Scanner;
//Declaramos que la clase es abstracta
public abstract class Persona {
	//Atributos
	String dni;
	String nombre;
	String apellido;

	
	//contructor1
	public Persona(String dni, String nombre, String apellido){
		this.dni=dni;
		this.nombre=nombre;
		this.apellido=apellido;
	}
	
	//contructor2, este lo usaremos para obtener los datos de la clase
	public Persona(Scanner sc){
		System.out.println("Añada el dni de la persona, por favor: ");
		this.setDni(sc.next());
		System.out.println("\nAñadido con éxito");
		System.out.println("\nIntroduzca el nombre de la persona: ");
		this.setNombre(sc.next());
		System.out.println("\nLa persona es: " + this.getNombre());
		System.out.println("\nAhora introduzca el apellido de: " + this.getNombre());
		this.setApellido(sc.next());
		System.out.println("\nla persona llamada " + this.getNombre() + " " + this.getApellido() + " ha sido añadida con éxito.");
	}
	
	
	//Métodos getter y setter
	public String getDni() {
		
		return dni;
	}
	
	public void setDni(String dni) {
		
		this.dni = dni;
	}
	
	public String getNombre() {
		
		return nombre;
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}
	
	public String getApellido() {
		
		return apellido;
	}
	
	public void setApellido(String apellido) {
		
		this.apellido = apellido;
	}
	
	/**
	 * Método que retorna un String con los valores de las propiedades
	 * formateados del siguiente modo:
	 *  <NOMBRE_PROPIEDAD1> : <VALOR_PROPIEDAD1>\n
	 *  <NOMBRE_PROPIEDAD2> : <VALOR_PROPIEDAD2>\n 
	 *  .....
	 * @return String
	 */
	
	public String formatted() {
		
		String showPersona =
				"Datos de la persona: \n"
				+"\tDni de la persona: " + getDni() + "\n"
				+"\tNombre de la persona: " + getNombre() + "\n"
				+"Apellido de la persona: " + getApellido() + "\n";
		
		return showPersona;
	}
	
	/**
	 * Método que obtiene valores de una persona a partir de un String y 
	 * un caracter separador.
	 */
	public void split(String personaStr, char separator) {
		
		try{
		for(int a = 0; 0 < personaStr.length(); a++){
			if(separator == '/' || separator == ';' || separator == '#'){
				System.out.println(personaStr + "\n");
			}
			
		}
	}catch(Exception ioa){
		System.out.println("error "+ ioa);
	}
	}
}
