package utilities;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.formula.functions.Value;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelFile {

	public static void main(String[] args) {

		try (XSSFWorkbook workbook = new XSSFWorkbook()) {
			XSSFSheet samplesheet = workbook.createSheet("HolaEjemplo"); // Crear hoja de excel
			// Define un conjunto de datos usando TreeMap
			Map<String, Object[]> dataSet = new TreeMap<String, Object[]>();
			// Se agregan los datos al mapa(Cada fila es un arreglo de objetos)

			dataSet.put("1", new Object[] { "ID", "NOMBRE", "CUIDAD" });
			dataSet.put("2", new Object[] { "1", "Mateo", "Manizales" });
			dataSet.put("3", new Object[] { "2", "Marcos", "Bogota" });
			dataSet.put("4", new Object[] { "3", "Lucas", "Cali" });
			dataSet.put("5", new Object[] { "4", "Juan", "Medellín" });
			dataSet.put("6", new Object[] { "5", "Pedro", "Barranquilla" });
			dataSet.put("7", new Object[] { "6", "Paulo", "Bucaramanga" });

			// Se optiene el conjunto de claves de mapa
			Set<String> set = dataSet.keySet();
			int rownum = 0;

			// Se itera sobre cada fila de datos
			for (String key : set) {

				// Se crea una nueva fila en la hoja
				Row row = samplesheet.createRow(rownum++);

				// Se obtiene los datos correspondietes a esa fila
				Object[] data = dataSet.get(key);
				int cellNum = 0; // Contador de celdas

				// Se itera sobre los valores de la fila para crear celdas
				for (Object value : data) {
					// Se crea una nueva celda
					Cell cell = row.createCell(cellNum++);

					// Se verifica el tipo de dato y asigna el valor de la celda
					if (value instanceof String)
						cell.setCellValue((String) value);
					else if (value instanceof Integer) {
						cell.setCellValue((Integer) value);

					}
				}

				// Se escribe el archivo excel en el disco duro
				try {
					// Define la ruta y nombre del archivo de salida
					FileOutputStream writeFile = new FileOutputStream("HolaEjemplo.xlsx");

					// Escribe el contenido de workbook en el archivo
					workbook.write(writeFile);

					// Cierra el flujo del archivo
					writeFile.close();

					// Mensaje de exito en consola
					System.out.println("El archivo se creo exitosamente");

				} catch (FileNotFoundException e) {
					// MAnejo de error si el archivo no se puede crear o encontrar
					e.printStackTrace();
				} catch (IOException e) {
					// Manejo de error de entrada salida general
					e.printStackTrace();
				}
			}
		}

		catch (IOException e) {
			// Manejo del error si el workbook no puede ser creado o cerrado
			e.printStackTrace();
		}
	}
}
