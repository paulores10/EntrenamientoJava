package Practica;

public class Vehiculo {
	String marca;
	String color;
	
	public Vehiculo (String marca, String color) {
		this.marca = marca;	
		this.color = color;
	}
	
	public void Encender() {
		System.out.println("El veiculo esta encendido"); 
	}

}
