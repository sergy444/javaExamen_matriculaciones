package src.com.zubiri.matriculas;
//importamos las clases necesarias del paquete java.util
import java.util.ArrayList;
import java.util.Scanner;
//Esta clase es una subclase de la clase persona, al igual que profesor
public class Alumno extends Persona {
	
	//A�o en el que se inscribi� por primera vez en alguna asignatura
	int a�oInscripcion = -1;
	//Ciclo que cursa el alumno
	String ciclo = null;
	
	double media;
	
	//Matr�culas realizadas a lo largo de los a�os en las distintas asignaturas
	ArrayList<Matricula> matriculas = null;
	
	public Alumno(int a�oInscripcion, String ciclo, String dni, String nombre, String apellido, double media){
		super(dni, nombre, apellido);
		this.a�oInscripcion=a�oInscripcion;
		this.ciclo=ciclo;
		this.media=media;
	}
	
	public Alumno(Scanner sc){
		super(sc);
		System.out.println("Introduzca el a�o de inscrpci�n: ");
		this.setA�oInscripcion(sc.nextInt());
		System.out.println("Introduzca el nombre del ciclo: ");
		this.setCiclo(sc.next());
		System.out.println("Introduzca la media dela alumno");
		this.setMedia(sc.nextDouble());
	}
	
	
	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public int getA�oInscripcion() {
		return a�oInscripcion;
	}
	
	public void setA�oInscripcion(int a�oInscripcion) {
		this.a�oInscripcion = a�oInscripcion;
	}
	
	public ArrayList<Matricula> getMatriculas() {
		return matriculas;
	}
	
	public void setMatriculas(ArrayList<Matricula> matriculas) {
		this.matriculas = matriculas;
	}
	
	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}
	@Override
	public String formatted() {
		String showAlumno =
				super.formatted()
				+"Datos del alumno: \n"
				+"\tA�o en le que se ha inscrito: " + getA�oInscripcion() + "\n"
				+"\tCiclo que est� cursando: " + getCiclo() + "\n";
				
		return showAlumno;
	}

	//M�todo que muestra si el alumno a aprobado el ciclo o no segun la media que tenga
	public void valoracion (int media){
		
		if(this.getMedia() < 5){
			System.out.println("Tiene el ciclo suspendido");
		}
		else {
			System.out.println("Tiene el ciclo aprobado");
		}
		
	}
	
}
