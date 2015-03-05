package src.com.zubiri.matriculas;

import java.util.Scanner;

public class Matricula extends Asignatura {
	
	//Atributos
	int añoMatriculacion;
    double precio;
    
    
    //constructor
    public Matricula(int añoMatriculacion, double precio, String nombre, int creditos, Profesor profesor){
    	super(nombre, creditos, profesor);
    	this.añoMatriculacion=añoMatriculacion;
    	this.precio=precio;
    	
    }
    
  

	//constructor de obtención de datos
    public Matricula(Scanner sc){
    	super(sc);
    	System.out.println("Introduzca el año de matriculación: ");
    	this.setAñoMatriculacion(sc.nextInt());
    	System.out.println("¿Cuál es el precio de la asignatura? ");
    	this.setPrecio(sc.nextDouble());
    }
    
    
	
	public int getAñoMatriculacion() {
		return añoMatriculacion;
	}
	
	public void setAñoMatriculacion(int añoMatriculacion) {
		this.añoMatriculacion = añoMatriculacion;
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
				"Datos de la matrícula: \n"
				+"\tAño de matriculación: " + getAñoMatriculacion() + "\n"
				+"\tPrecio de la matrícula: " + getPrecio() + "\n";
		
		return showMatricula;
	}
	
	/**
	 * Método que calcula un descuento basado en porcentaje sobre el precio original
	 * de la matrícula.
	 * @return
	 */
	public double descuentoFamiliaNumerosa(int porcentaje) {
		double descuento;
		descuento= this.getPrecio()*(porcentaje/100);
		return descuento;
	}
	
}
