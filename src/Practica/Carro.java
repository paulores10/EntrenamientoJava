package Practica;

public class Carro extends Vehiculo{
	int puertas;
	
	public Carro(String marca, int puertas, String color) {
		super(marca, color);// Llama al constructor de la clase padre
		this.puertas = puertas;
	
	}
	
	public void mostrarDetalle() {
		System.out.println("Marca:  " + marca);
		System.out.println("Número de puertes:  " + puertas );
		System.out.println("El color es:  " + color);
	}
	
	
	public static void main(String[] args) {
		Carro miCarro = new Carro("Nissan", 4, "Rojo");
		miCarro.Encender();
		miCarro.mostrarDetalle();
	

	}

}
