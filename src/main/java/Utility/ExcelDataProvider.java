package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	XSSFWorkbook wb;
	
	public ExcelDataProvider() throws Exception {
		String path="C:\\Users\\swapn\\eclipse-workspace\\HybridTest\\ExcelTestData\\data.xlsx";
		File src=new File(path);
		FileInputStream file=new FileInputStream(src);
		 wb=new XSSFWorkbook(file);
		
	}
	
	
	public String getStringdata(String sheetname, int row, int cell) {
	return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	}
}
