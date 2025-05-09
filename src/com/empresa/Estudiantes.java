package com.empresa;

public class Estudiantes {
	
	public Estudiantes() {
		System.out.println("Hola, soy el metodo constructor");
	}
	
	int numero;
	String nombre;
	
	public Estudiantes(int num, String nom) {
		numero=num;
		nombre=nom;		
	}
	
	public void desplegar() {
		System.out.println("Numero es: " + numero + " Y nombre es: " + nombre);
		
	}

	public static void main(String[] args) {
		
		Estudiantes estudi1 = new Estudiantes();
		Estudiantes estudi2 = new Estudiantes(10, "Andres");
		Estudiantes estudi3 = new Estudiantes(10, "Diana");
		estudi2.desplegar();
		estudi3.desplegar();
		


	}

}
