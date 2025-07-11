package ManejoExcepciones;

public class FinallyBlock {

	public static void main(String[] args) {
		Integer resultado = null;
		
		try {
			System.out.println("Intentando dividir...");
			resultado = 10 /0;			
			System.out.println("Resultado: " + resultado);
			
			//Guardar resultado
			System.out.println("Guardando resultado en la base de datos...");
			
		} catch (ArithmeticException e) {
			
			System.out.println("Error: División por cero resultado en la base de datos...");			
		} finally {
			// Solo limpieza aqií
			System.out.println("Cerrando conexión a la base de datos");
		}

	}

}
