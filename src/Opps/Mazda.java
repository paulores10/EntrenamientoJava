package Opps;

public class Mazda extends Carro {
	
	//static String nombre = "Mazda";
	
	String nombre = "Mazda";
	
	public void getNombre() {
		System.out.println(nombre);
		System.out.println(super.nombre);
	}
	
	public void run() {
		System.out.println("El mazda esta transitando");
		super.run();
	}
	Mazda(){
		//super();
		System.out.println("Llamando al construtor de mazda");
		
	}
	
		
	public static void main(String[]args ) {		
		//Carro objcarro = new Carro();
		//System.out.println(nombre);
		//objcarro.run();
		
		//Primer uso
		Mazda objmazda = new Mazda();
		objmazda.getNombre();
		
		//Segundo uso
		objmazda.run();
	}
	
}
