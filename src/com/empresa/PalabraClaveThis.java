package com.empresa;

public class PalabraClaveThis {
	int numeromatricula;
	String nombre;
	String grado;
	
	public PalabraClaveThis(int i, String n, String s) {
		
		numeromatricula =i;
		nombre=n;
		grado= s;
	}
	 public void display() {
		System.out.println("Numero matricula: " + numeromatricula + " Nombre es: " + nombre + " Clase: " + grado);
	}
	
	
	public static void main(String[] args) {
		
		PalabraClaveThis obj = new PalabraClaveThis(10, "Samuel", "Octavo");
		obj.display();
		
	}

}
