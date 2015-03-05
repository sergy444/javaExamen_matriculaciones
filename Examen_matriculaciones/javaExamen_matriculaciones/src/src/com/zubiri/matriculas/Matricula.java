package src.com.zubiri.matriculas;

import java.util.Scanner;

public class Matricula extends Asignatura {
	
	//Atributos
	int a�oMatriculacion;
    double precio;
    
    
    //constructor
    public Matricula(int a�oMatriculacion, double precio, String nombre, int creditos, Profesor profesor){
    	super(nombre, creditos, profesor);
    	this.a�oMatriculacion=a�oMatriculacion;
    	this.precio=precio;
    	
    }
    
  

	//constructor de obtenci�n de datos
    public Matricula(Scanner sc){
    	super(sc);
    	System.out.println("Introduzca el a�o de matriculaci�n: ");
    	this.setA�oMatriculacion(sc.nextInt());
    	System.out.println("�Cu�l es el precio de la asignatura? ");
    	this.setPrecio(sc.nextDouble());
    }
    
    
	
	public int getA�oMatriculacion() {
		return a�oMatriculacion;
	}
	
	public void setA�oMatriculacion(int a�oMatriculacion) {
		this.a�oMatriculacion = a�oMatriculacion;
	}
	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
    @Override
	public String formatted() {
    	
		String showMatricula =
				"Datos de la matr�cula: \n"
				+"\tA�o de matriculaci�n: " + getA�oMatriculacion() + "\n"
				+"\tPrecio de la matr�cula: " + getPrecio() + "\n";
		
		return showMatricula;
	}
	
	/**
	 * M�todo que calcula un descuento basado en porcentaje sobre el precio original
	 * de la matr�cula.
	 * @return
	 */
	public double descuentoFamiliaNumerosa(int porcentaje) {
		double descuento;
		descuento= this.getPrecio()*(porcentaje/100);
		return descuento;
	}
	
}
