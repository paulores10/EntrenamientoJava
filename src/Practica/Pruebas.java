package Practica;

import java.util.Scanner;

public class Pruebas {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int numero1, numero2;

		System.out.print("Ingrese el valor del número 1: ");
		numero1 = teclado.nextInt();
		System.out.print("Ingrese el valor del número 2: ");
		numero2 = teclado.nextInt();

		if (numero1 == numero2) {
			System.out.println("Los numeros con iguales");
		}

		else if (numero1 > numero2) {
			System.out.println("El numero mayor es número 1: " + numero1 + "<" + numero2);
		} else {
			System.out.println("El numero mayor es número 2: " + numero2 + "<" + numero1);

		}

	}

}
