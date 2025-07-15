package javacollaction;

import java.util.*;

public class ColeccionesJava {

	public static void main(String[] args) {
		//---------LIST--------------------
		System.out.println("===========LIST================");
		
		//ArrayList: Lista dinámica basada en array
		List<String> arrayList = new ArrayList<>();
		arrayList.add("Uno");
		arrayList.add("Dos");
		arrayList.add("Tres");
		arrayList.remove("Tres");
		arrayList.set(1, "Cuatro");		
		System.out.println("ArrayList: " + arrayList);
		
		//linkedList. Lista doblemete enlazada
		List<String> linkedList = new LinkedList<>();
		linkedList.add("Uno");
		linkedList.add("Dos");
		linkedList.add("Tres");
		linkedList.remove(1);
		linkedList.remove("Uno");	
		System.out.println("LinkedList: " + linkedList);
		
		//---------SET--------------------
		System.out.println("===========SET================");
		
		//No mantiene el orden. no permite duplicado // Calcula su hashSet
		//Usa ese hash, lo usa para determinar en que casilla coloca el elemento
		Set<String> hashSet = new HashSet<>();
		hashSet.add("Manzana");
		hashSet.add("Banano");
		hashSet.add("Pera");
		hashSet.add("Nuez");
		hashSet.add("Manzana");	
		System.out.println("HashSet: " + hashSet);
		
		//TreeSet Mantiene orden natural // Árbol bibario balanceado. Ordena según un comparador
		Set<String> treeSet = new TreeSet<>();
		treeSet.add("Manzana");
		treeSet.add("Banano");
		treeSet.add("Naranja");
		treeSet.add("Aguacate");
		treeSet.add("Uva");
		treeSet.remove("Naranja");
		System.out.println("TreeSet: " + treeSet);
		
		//LinKedHasSet. Matiene orden de inserción. Lista diblemete enlazada
		Set<String> linKedHasSet = new LinkedHashSet<>();
		linKedHasSet.add("Loro");
		linKedHasSet.add("Aguila");
		linKedHasSet.add("Pez");
		linKedHasSet.add("Perro");
		System.out.println("LinkedHashSet: " + linKedHasSet);
		
		System.out.println("===========QUEUE================");
		
		//PriorityQueue.Orden Natural. Ordena por elemento mínimo por defecto
		Queue<Integer> prorityQueue = new PriorityQueue<>();
		prorityQueue.add(30);
		prorityQueue.add(28);
		prorityQueue.add(2);
		prorityQueue.add(50);
		prorityQueue.add(8);
		prorityQueue.add(7);
		System.out.println("ProrityQueue: " + prorityQueue);
		
		//
		Deque<String> arrayDeque = new ArrayDeque<>();
		arrayDeque.add("Frente");
		arrayDeque.addLast("Final");
		arrayDeque.addFirst("Inicio");
		System.out.println("ArrayDeque: " + arrayDeque);
		
		System.out.println("===========MAP================");
		
		//HashMap. Sin orden garantizado
		Map<Integer, String>hasMap = new HashMap<>();
		hasMap.put(3, "Tres");
		hasMap.put(1, "Uno");
		hasMap.put(2, "Dos");
		hasMap.put(4, "Cuatro");
		System.out.println("HashMap: " + hasMap);
		
		//TreeMap. Orden por clave
		Map<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(3, "Tres");
		treeMap.put(1, "Uno");
		treeMap.put(4, "Cuatro");
		treeMap.put(2, "Dos");
		treeMap.put(6, "Seis");
		System.out.println("TreeMap: " + treeMap);
		
		//LinkedHashMap. Mantiene orden de insesión
		Map<Integer, String> linkedHasMap = new LinkedHashMap<>();
		linkedHasMap.put(3, "Tres");
		linkedHasMap.put(1, "Uno");
		linkedHasMap.put(4, "Cuatro");
		linkedHasMap.put(2, "Dos");
		linkedHasMap.put(6, "Seis");
		System.out.println("LinkedHashMap: " + linkedHasMap);
		
		
		
	
		

		
		
		
		

	}

}
