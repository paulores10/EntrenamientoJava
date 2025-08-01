package Practica;

import java.util.Scanner;

public class Prueba2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int numero;

		System.out.print("Ingrese el primer número: ");
		numero = teclado.nextInt();
	

		if (numero > 1) {
			System.out.print("El numero es positivo:  " + numero);
		} else {
			if (numero == 0) {
				System.out.print("El número es nulo:  " + numero);
			} else {
				System.out.print("El número es negativo:  " + numero);
			}

		}

	}

}
