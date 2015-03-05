package src.com.zubiri.matriculas;

import java.util.Scanner;

public class Asignatura {
	
	//Atributos
	String nombre;
	int creditos;
	Profesor profesor;
	
	//Contructor
	public Asignatura(String nombre, int creditos, Profesor profesor){
		this.nombre=nombre;
		this.creditos=creditos;
		this.profesor=profesor;
	}
	
	//contructor de creación de objeto
	public Asignatura(Scanner sc){
		System.out.println("¿Cuál es el nombre de la asignatura? ");
		this.setNombre(sc.next());
		System.out.println("¿Cuantos creditos tiene " + this.getNombre() + "? ");
		this.setCreditos(sc.nextInt());
		System.out.println("¿Quién es el profesor?");
		this.setProfesor(new Profesor(sc));//Con esto llamamos al constructor de la clase profesor que es capaz de obtener datos por teclado
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCreditos() {
		return creditos;
	}
	
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	
	public Profesor getProfesor() {
		return profesor;
	}
	
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	
	/**
	 * Método que retorna un String con los valores de las propiedades
	 * formateados del siguiente modo:
	 *  <NOMBRE_PROPIEDAD1> : <VALOR_PROPIEDAD1>\n
	 *  <NOMBRE_PROPIEDAD2> : <VALOR_PROPIEDAD2>\n 
	 *  .....
	 * @return String
	 */
	//Método para motrar la asignatura formateada
	public String formatted() {
		
		String showAsignatura =
				"Datos de la asignatura: \n"
				+"\tNombre de la asignatura: " + getNombre() + "\n"
				+"\tCreditos de la asignatura: " + getCreditos() + "\n"
				+"Profesor de la asignatura: " + getProfesor() + "\n";
		
		return showAsignatura;
	}
	
	/**
	 * Método que obtiene valores de una asignatura a partir de un String y 
	 * un caracter separador.
	 */
	public void split(String personaStr, char separator) {

		try{
		for(int a = 0; 0 < personaStr.length(); a++){
			if(separator == '/' || separator == ';' || separator == '#'){
				System.out.println(personaStr + "\n");
			}
			
		}
		}
		catch(Exception ioa){
		System.out.println("error "+ ioa);
		}
		
	}
	
	
}


