package src.com.zubiri.matriculas;

import java.util.Scanner;
import java.util.ArrayList;



public class Matriculas {

	//Atributos
	private static ArrayList<Matricula> matriculas = new ArrayList<Matricula>();
	
	
	//contructor
	public Matriculas(ArrayList<Matricula> matriculas){
		this.matriculas=matriculas;
	}
	
	//método para crear el ArrayList
	public static ArrayList<Matricula> crearMatriculas(Scanner sc){
		
		//Tratamiento de excepciones
		try{
			
			int cantidad;
			System.out.println("¿Cuántas matriculas desea introducir?");
			cantidad = sc.nextInt();
			for(int i = 0; i < cantidad; i++){
				//Llamamos al contructor de parametro Scanner en la clase Matricula y aparte de crear el objeto, lo guardamos en un ArrayList
				matriculas.add(new Matricula(sc));
			}
			
		}catch(Exception io){
			
			System.out.println("error " + io);
		}
		
		return matriculas;
		
	}
	
	//Este metodo busca matriculas segun el año de matriculación
	public static ArrayList<Matricula> buscarMatriculas(){
		ArrayList<Matricula> matriculasSegunAño = new ArrayList<Matricula>();
		
		try{
			if (matriculas == null) {
				
				System.out.println("No hay matrículas");
			}
			else {
				
				for (int a = 0; a < matriculas.size(); a++) {
					
					matriculasSegunAño.add(matriculas.get(a));
				}
			}
		}catch(Exception ios){
			
			System.out.println("error "+ ios);
		}
		return matriculasSegunAño;
		
	}
	//Método para añadir matrículas
	public static void anadirArtista(Matricula matricula){
		
		matriculas.add(matricula);
	}
	
	//Método para borrar matrículas
	public static void borrarArtista(Matricula matricula){
		
		matriculas.remove(matricula);
	}
	
	//Método para formatear al ArrayList de matriculas
		public static String formattedMatriculas(ArrayList<Matricula> matriculas2){
			
			String matriculasFormateadas = "";
			
			for (int v = 0; v < matriculas2.size(); v++) {
				
				matriculasFormateadas += matriculas2.get(v).formatted();
			}
			
			return matriculasFormateadas;	
		}
		
		//getters y setters
	public static ArrayList<Matricula> getMatriculas() {
		
		return matriculas;
	}

	public static void setMatriculas(ArrayList<Matricula> matriculas) {
		
		Matriculas.matriculas = matriculas;
	}
	}
