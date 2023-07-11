package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	static FileInputStream fis = null;
	public FileInputStream getFileInputStream() throws FileNotFoundException 
	{
		String filePath = System.getProperty("user.dir")+"/src/test/java/data/UserData.xlsx";
		File srcFile = new File(filePath);
		fis = new FileInputStream(srcFile);
        		
	    return fis;
		
	}
	
	public Object [][] getExcelData() throws IOException
	{
		
		fis = getFileInputStream();
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		int TotalNumOfRows = sheet.getPhysicalNumberOfRows();
		int TotalNumOfColums = sheet.getRow(0).getLastCellNum();
		
		String [][] arrayExcelData = new String [TotalNumOfRows-1][TotalNumOfColums]; 
		
		for (int i = 1; i <TotalNumOfRows ; i++) {
			
			for (int j = 0; j <TotalNumOfColums ; j++) {
				
				XSSFRow row = sheet.getRow(i);
				arrayExcelData[i-1][j] = row.getCell(j).toString();
				
			}
			
		}
		
		wb.close();
		return arrayExcelData;
		
		
		
	}
	
	
	
	
	
	

}
