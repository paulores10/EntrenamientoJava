package Practica;

import java.util.Scanner;


public class juego {

	
		    public static void main(String[] args) {
		        Scanner teclado = new Scanner(System.in);

		        System.out.println("🎲 Escribe un número para dividir 100 entre él:");
		        int numero = teclado.nextInt();

		        try {
		            int resultado = 100 / numero;
		            System.out.println("✅ El resultado es: " + resultado);
		        } catch (ArithmeticException e) {
		            System.out.println("⚠️ ¡Uy! No puedes dividir por cero. 😅");
		        }

		        System.out.println("🏁 El juego terminó. ¡Gracias por jugar!");
		    }
	
}
