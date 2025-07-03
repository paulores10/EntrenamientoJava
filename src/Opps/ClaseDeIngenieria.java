package Opps;

public class ClaseDeIngenieria implements Estudiante{
	
	public void mostrarNombre() {
	System.out.println("Hola, somos estudiantes de ingenieria");		
	}

	public void obtenerNumeroEstudiantes() {
		System.out.println("Somos 50 estudiantes");		
		
	}

	public void obtenerGrado() {
	System.out.println("Somos del 5 semestre");		
		
	}
	
	public void obtenerUniversidad() {
	System.out.println("La universidad es : " + universidad);		
	}	

	public static void main(String[] args) {
	
		ClaseDeIngenieria ing = new ClaseDeIngenieria();
		ClaseDeMedicina med = new ClaseDeMedicina();
		
		ing.mostrarNombre();
		ing.obtenerNumeroEstudiantes();
		ing.obtenerGrado();
		ing.obtenerUniversidad();
		System.out.println("********************");
		
		med.mostrarNombre();
		med.obtenerNumeroEstudiantes();
		med.obtenerGrado();
		med.obtenerUniversidad();
	}
	public void OntenerNombreInterface() {
		
	}	
}
