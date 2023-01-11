package genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	public String fetchStringDataFromExcelSheet(String sheetName, int rowNo, int cellNo) throws IOException {
	
	
	
	//Fetching data from Excel Sheet
	FileInputStream fisExcel=new FileInputStream("./TestData/excelData.xlsx");
	
	Workbook workbook = WorkbookFactory.create(fisExcel);
	return workbook.getSheet(sheetName).getRow(rowNo).getCell(cellNo).toString();
	
			
	}
}