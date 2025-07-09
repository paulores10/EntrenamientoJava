package strings;

public class IntroduccionString {

	public static void main(String[] args) {
		
		String nombre1 = "Juan Perez";
		String nombre2 = "Juan Perez";
		String nombre3 = "juan perez";
		
		String pais1 = new String ("Colombia");
		String pais2 = new String ("Colombia");
		
		System.out.println(nombre1.equals(nombre2));
		System.out.println(nombre1.equals(nombre3));
		System.out.println(nombre1.equalsIgnoreCase(nombre3));
		System.out.println(pais1.equals(pais2));
		
		System.out.println("----------------------------");
		System.out.println(nombre1==nombre2);
		System.out.println(pais1==pais2);
		
		//CONCATENACIÓN
		String primerString = nombre1+nombre2+nombre3;
		System.out.println(primerString);
		
		String segundoString = nombre1.concat(nombre2).concat(nombre2);
		System.out.println(segundoString);
		

		
		


	}

}
