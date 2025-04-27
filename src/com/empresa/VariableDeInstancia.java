package com.empresa;

import java.time.temporal.ValueRange;

public class VariableDeInstancia {
	String nombre;
	void mostrarNombre()
	{
		System.out.println("Nombre: " + nombre);
	}
	
	public static void main(String[] args) {
		VariableDeInstancia obj = new VariableDeInstancia();
		obj.nombre = "Paulo Andrés";
		obj.mostrarNombre();
		
		

	}

}
