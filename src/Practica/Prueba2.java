package Practica;

import java.util.Scanner;

public class Prueba2 {

	public static void main(String[] args) {
		
		int x, suma, valor;
		
		x = 1;
		valor =0;
		suma = valor;
		
		
		while(x<=5) {
			Scanner teclado = new Scanner(System.in);
			System.out.print("Igrese el valor del número: ");
			valor = teclado.nextInt();
			suma = suma + valor;
			x = x+1;
						
		}
		 System.out.print("LA Suma de los numetos es: " + suma);
		
	}

}
