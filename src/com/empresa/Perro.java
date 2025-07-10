package com.empresa;

public class Perro {
	String nombre="Maia";
	String raza="Husky";
	int altura=4;
	
	public void ladrar()
	{
		System.out.println(nombre + " " + "Esta ladrando");
	}

	public static void main(String[] args) {
	
		Perro objperro = new Perro();
		System.out.println(objperro.altura);
		objperro.ladrar();
		
	}

}
