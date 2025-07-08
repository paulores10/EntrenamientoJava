package arreglo;

import java.util.Iterator;

public class PasarArregloAmetodo {
	//Pasar Areglo a método
	
	public static void Encontrar (int arregloTres[]) {
		int min = arregloTres[0];
		for (int i=0; i<arregloTres.length;i++) {
			if(min>arregloTres[i])
			{
				min=arregloTres[i];
			}			
		}
		System.out.println("El elemento menos es: " + min);
	} 
	
	public static int[] getArreglo() {
		return new int [] {2,4,6,1,10,12,14,16};
	}
	public static void main(String[] args ) {
		PasarArregloAmetodo objarr = new PasarArregloAmetodo();
		int arrgloPrueba[]= {3,12,1,5,80};
		objarr.Encontrar(arrgloPrueba);
		
		//-----------------------------------------
		int arregloCuarto[] = objarr.getArreglo();
		System.out.println(arregloCuarto[2]);
	}

}
