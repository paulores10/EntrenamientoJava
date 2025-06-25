package Opps;

public class HijaDeSuma extends Suma {

	public static void main(String[] args) {
		Suma objSuma = new Suma();
		objSuma.Sumar(2, 3);
		objSuma.Sumar(10, 20, 30);
		
		double d = objSuma.Sumar(2.5, 1.5, 2.4);
		System.out.println("Suma de d: " + d);
		
	}

}
