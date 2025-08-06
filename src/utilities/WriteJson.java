package utilities;

import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
//IMPOR LAS CLASES NECESRIAS PARA MANEJO JSON
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteJson {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		//-------- Estudiante 1 --------
		JSONObject estudiante1 = new JSONObject();
		estudiante1.put("nombreEstudiante", "Diana");
		estudiante1.put("grado", "sexto");
		estudiante1.put("ubicación", "Manizales");
		
		//-------- Estudiante 2 --------
		JSONObject estudiante2 = new JSONObject();
		estudiante2.put("nombreEstudiante", "Natalia");
		estudiante2.put("grado", "septimo");
		estudiante2.put("ubicación", "Cali");
		
		//-------- Estudiante 3 --------
		JSONObject estudiante3 = new JSONObject();
		estudiante3.put("nombreEstudiante", "Samuel");
		estudiante3.put("grado", "Octabo");
		estudiante3.put("ubicación", "Medellín");
		
		//Arreglo de estudiantes
		JSONArray detallesEstudiantes = new JSONArray();
		detallesEstudiantes.add(estudiante1);
		detallesEstudiantes.add(estudiante2);
		detallesEstudiantes.add(estudiante3);
		
		//Objeto contenedor principal
		JSONObject datos = new JSONObject();
		datos.put("detallesEstudiantes", detallesEstudiantes);
		
		System.out.println(datos.toJSONString());
		
		try (FileWriter archivo = new FileWriter("Estudiantes.json")) {
			archivo.write(datos.toJSONString()); //Escrbe el contenido Json como texto
			archivo.flush();//Fuerza la escritura inmediata de los datos en el disco
			System.out.println("Archivo JSON guardado como Estudiante.json");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}