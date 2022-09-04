package smarttech;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	
		public void getExcel(int rowIndex, int columnIndex) throws IOException {
			//excel location or path
			File file= new File("./src/main/resources/TestDataExcel.xlsx");
			//convert date to stream
			FileInputStream fis = new FileInputStream(file);// check exception = FilNotfoundExpection
			//apache POI to method to read excel
			//new or old = new .XLSX= POI XSSF
			// 1st stepts= read whole excel as a book = it's call workbook.
			XSSFWorkbook  wb = new XSSFWorkbook(fis);//Check exception=IOException
			XSSFSheet sht = wb.getSheet("TestCase");
			//loop all row
			for(int i =0;i<sht.getPhysicalNumberOfRows();i++) {
				Row row=sht.getRow(i);
				
				if(i==rowIndex) {
				// colum number 
				for(int j = 0; j< row.getLastCellNum();j++) {
					if(j==columnIndex) {
					Cell cell= row.getCell(j);
					System.out.println(cell.getStringCellValue());
				}
				}
				}
			}
			
		}
	public static void main(String[] args) throws IOException {
		ReadExcel obj = new ReadExcel();
		
		obj.getExcel(1, 2);
		
	}
	
	
		
	}


