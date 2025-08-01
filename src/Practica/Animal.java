package Practica;

public class Animal {
	
	String nombre; 
	
	public void hacerSonido() {
		System.out.println("El animal hace un sonido");		
	}

	public static void main(String[] args) {
		
		Perro miperro = new Perro();
		Gato migato = new Gato();
		
		miperro.nombre = "Maia";
		migato.nombre = "Manchitas";
		
		System.out.println("El nombre del perro es: " + miperro.nombre);
		miperro.hacerSonido();
		System.out.println("El nombre del gato es: " + migato.nombre);
		migato.hacerSonido();

		
		
		
	}

}
