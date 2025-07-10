package strings;

public class StringMethods {

	public static void main(String[] args) {
		String saludo= "Hola Mundo";
		System.out.println(saludo.charAt(3));
		System.out.println("Longitud: " + saludo.length());
		System.out.println("En mayusculas: " + saludo.toUpperCase());
		System.out.println("¿Contiene 'Mun' " + saludo.contains("Mun"));
		System.out.println("Reemplazo " + saludo.replace("Mundo", "Paulo"));
		System.out.println(saludo.concat(" bello"));
		System.out.println("Termina en 'Hola' " + saludo.endsWith("mundo"));

	}

}
