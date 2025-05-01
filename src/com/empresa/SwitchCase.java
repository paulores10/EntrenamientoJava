package com.empresa;

public class SwitchCase {

	public static void main(String[] args) {
		
		String  modulo="Contabilidad";
		
		switch (modulo) {
		case "Contabilidad":
			System.out.println("Ingreso al módulo de Contabilidad");
			break;
			
		case "Presupuesto":
			System.out.println("Ingreso al módulo de Presupuesto");
			break;
			
		case "Tesoreria":
			System.out.println("Ingreso al módulo de Tesoreria");
			break;
			
		case "Nomina":
			System.out.println("Ingreso al módulo de Nomina");
			break;
				
		case "Inventarios":
			System.out.println("Ingreso al módulo de Inventarios");
			break;
			
		case "Indycom":
			System.out.println("Ingreso al módulo de Indycom");
			break;
			
		case "Predian":
			System.out.println("Ingreso al módulo de Predian");
			break;
									
		default:
			System.out.println("Regresar y seleccionar un módulo");
		}
	
	}

}
