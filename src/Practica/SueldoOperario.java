package Practica;

import java.util.Scanner;

public class SueldoOperario {

	public static void main(String[] args) {
	
		Scanner teclado= new Scanner(System.in);
		
		int horastrabajadas;
		float costohora;
		float sueldo;
		
		System.out.print("Por favor ingrese las horas trabajadas: ");
		horastrabajadas=teclado.nextInt();
		System.out.print("Por favor ingrese el valor de costo de la hora: ");
		costohora=teclado.nextFloat();
		
		sueldo = horastrabajadas*costohora;
		System.out.print("El valor total del sueldo es: " + sueldo);
		
		

	}

}
