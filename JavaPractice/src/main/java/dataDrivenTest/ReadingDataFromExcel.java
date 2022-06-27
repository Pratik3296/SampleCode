package dataDrivenTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		FileInputStream file = new FileInputStream("C:\\Users\\Prati\\Desktop\\LearnJava.xlsx)");
		 XSSFWorkbook workbook = new XSSFWorkbook(); 
		 XSSFSheet sheet = workbook.getSheet("Sheet1");
		 int rowcount=sheet.getLastRowNum();
		 int coloumcount = sheet.getRow(0).getLastCellNum();
		 
		 
		 //InComplete Code
	
	
	}

}
