import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApachePOI {

	public static void main(String[] args) {

		// Napisati program koji racuna sumu brojeva koji se nalaze prvom worksheet-u Excel tabele 
		// koji se zove Brojevi. U tabeli se svi brojevi nalaze u prvoj koloni. 
		// Program treba da cita red po red iz tabele i upisane brojeve dodaje na sumu. 
		// Krajnju sumu nakon toga treba da ispise u konzoli. 
		// Potrebno je omoguciti da program radi i ukoliko se u datu tabelu doda jos brojeva (isprobati!)
	
		HSSFWorkbook wb;
		FileInputStream fi;
		
		try {
			fi = new FileInputStream("Data (DOM).xls");
			wb = new HSSFWorkbook(fi);
			
			Double suma = 0d;
			
			for (int i = 0; i < 13; i++) {
				Sheet sheet = wb.getSheetAt(0);
				Row row = sheet.getRow(i);
				Cell cell = row.getCell(0);
				
				String cells = cell.toString();
				Double a = Double.valueOf(cells);
				suma = suma + a;
				
			}
			
			System.out.println(suma);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
