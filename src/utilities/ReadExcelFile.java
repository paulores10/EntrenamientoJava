package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.streaming.SXSSFRow.CellIterator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadExcelFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Crea un flujo de entrada para leer el erchivo excel desde el disco 
		FileInputStream readFile = new FileInputStream("HolaEjemplo.xlsx");
		
		//Se abre el archivo excel usando un try-with-resource
		
		try (XSSFWorkbook workbook = new XSSFWorkbook(readFile)){
			
			//Obtener la hoja del libro con el nombre "HolaEjemplo.xlsx"
			XSSFSheet sheet = workbook.getSheet("HolaEjemplo");
			
			//Declara variable para recorrer filas y celdas
			Row row;
			Cell cell;
			
			//Obtiene un iterrador para recorrec todas las filas de la hoja
			Iterator<Row> rowIterator = sheet.iterator();
			
			//Comienza el recorrido de las filas
			
			while (rowIterator.hasNext()){
				row = rowIterator.next(); //Optiene la siguiente fila
				
				//Crea un iterador para recorrer todas las celdas de esa Fila
				Iterator<Cell> celiterator = row.cellIterator();
				
				//Recorre todas las celdas de la fila actual
				while(celiterator.hasNext()) {
					cell = celiterator.next(); //Obtiene la siguientecelda
					
					//Usa el formateador para obtener el valor como tecto
					//Sin impor si es número, texto formulas
					DataFormatter formatter = new DataFormatter();
					String text = formatter.formatCellValue(cell);
					
					//Imprima el valor de la celda sn consola
					System.out.println(text);
				}
			}
		
	} catch(IOException e) {
		System.out.println("Ojo con el error");//Mensaje personalizado
		e.printStackTrace();
	}
	}

}
