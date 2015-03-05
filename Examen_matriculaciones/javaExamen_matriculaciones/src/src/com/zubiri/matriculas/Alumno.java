package src.com.zubiri.matriculas;
//importamos las clases necesarias del paquete java.util
import java.util.ArrayList;
import java.util.Scanner;
//Esta clase es una subclase de la clase persona, al igual que profesor
public class Alumno extends Persona {
	
	//Año en el que se inscribió por primera vez en alguna asignatura
	int añoInscripcion = -1;
	//Ciclo que cursa el alumno
	String ciclo = null;
	
	double media;
	
	//Matrículas realizadas a lo largo de los años en las distintas asignaturas
	ArrayList<Matricula> matriculas = null;
	
	public Alumno(int añoInscripcion, String ciclo, String dni, String nombre, String apellido, double media){
		super(dni, nombre, apellido);
		this.añoInscripcion=añoInscripcion;
		this.ciclo=ciclo;
		this.media=media;
	}
	
	public Alumno(Scanner sc){
		super(sc);
		System.out.println("Introduzca el año de inscrpción: ");
		this.setAñoInscripcion(sc.nextInt());
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

	public int getAñoInscripcion() {
		return añoInscripcion;
	}
	
	public void setAñoInscripcion(int añoInscripcion) {
		this.añoInscripcion = añoInscripcion;
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
				+"\tAño en le que se ha inscrito: " + getAñoInscripcion() + "\n"
				+"\tCiclo que está cursando: " + getCiclo() + "\n";
				
		return showAlumno;
	}

	//Método que muestra si el alumno a aprobado el ciclo o no segun la media que tenga
	public void valoracion (int media){
		
		if(this.getMedia() < 5){
			System.out.println("Tiene el ciclo suspendido");
		}
		else {
			System.out.println("Tiene el ciclo aprobado");
		}
		
	}
	
}
