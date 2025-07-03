package Opps;

public class NuPrestamo extends BancoPrestamo{

	public static void main(String[] args) {
		
		NuPrestamo prestamo = new NuPrestamo();
		
		prestamo.setNombre("Andres");
		prestamo.setEdad(20);
		prestamo.setCantidad(45000);
		
		System.out.println("El nombre es: " + prestamo.getNombre());
		System.out.println("La edad es: " + prestamo.getEdad());
		System.out.println("LA cantidad es: " + prestamo.getCantidad());

	}

}
