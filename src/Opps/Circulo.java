package Opps;

public class Circulo extends Formas {

	public static void main(String[] args) {
		
		Formas objcirculo = new Circulo();
		Formas objtriangulo = new Triangulo();
		Formas objrectangulo = new Rectangulo();
		
		objcirculo.mostrarForma();
		objtriangulo.mostrarForma();
		objrectangulo.mostrarForma();

	}
	@Override
	public void mostrarForma() {
	System.out.println("La forma es una circunferencia");
	
		
	}

}
