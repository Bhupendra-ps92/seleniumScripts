package data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToFetchDataFromExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// converting the actual/physical representation of excel to java representation
		FileInputStream fis = new FileInputStream("./testData/sheet1.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);// loading the excel sheet
		Sheet sheet = workbook.getSheet("Sheet1");// accessing the sheet
		Row row = sheet.getRow(1);// accessing the row
		Cell cell = row.getCell(0);// accessing cell

		// converting cell type of object to string type of object
		String url = cell.getStringCellValue();
		String username = row.getCell(1).getStringCellValue();
		String password = row.getCell(2).toString();

		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
	}

}
