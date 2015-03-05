package src.com.zubiri.matriculas;

import java.util.Scanner;
//Esta clase es una subclase de la clase persona, al igual que alumno
public class Profesor extends Persona {
	//Atributos
	String titulacion;
	String departamento;
	
	//Contructor
	public Profesor(String titulacion, String departamento, String dni, String nombre, String apellido){
		super(dni, nombre, apellido);//Heredamos los atributos de la superclase
		this.titulacion=titulacion;
		this.departamento=departamento;
	}
	//contructor2
	public Profesor(Scanner sc){
		super(sc);
		System.out.println("�Cu�l es la titulaci�n del profesor? ");
		this.setTitulacion(sc.next());
		System.out.println("�En qu� departamento est� trabajando? ");
		this.setDepartamento(sc.next());
		System.out.println("\nProfesor a�adido con �xito");
	}
	
	//getters y setters
	public String getTitulacion() {
		
		return titulacion;
	}
	
	public void setTitulacion(String titulacion) {
		
		this.titulacion = titulacion;
	}
	
	public String getDepartamento() {
		
		return departamento;
	}
	
	public void setDepartamento(String departamento) {
		
		this.departamento = departamento;
	}
	
	//M�todo para mostrar los datos del profesor formateados
	@Override
	public String formatted() {
		
		String showProfesor =
				super.formatted()
				+"Datos del profesor: \n"
				+"\tTitulaci�n del profesor: " + getTitulacion() + "\n"
				+"\tDepartamento dodne trabaja: " + getDepartamento();
				
		return showProfesor;
	}
}
