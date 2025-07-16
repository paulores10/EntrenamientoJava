package ManejoExcepciones;

import java.io.*;

public class EjemploMultiCatch {

	public static void main(String[] args) {
		try {
			int resultado = 10/0; // Esto lanza AritmethicException
			FileReader file = new FileReader("archivo.txt");
			
		} catch (ArithmeticException | IOException e) {
			System.out.println("!Ocurrio una excepción");
			System.out.println(e.getClass().getSimpleName());
		}
	}
}
