package framewok.TestResuableMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class excelreader {
	
	public static void execelreadertoarray() throws IOException {
		
		FileInputStream fis= new FileInputStream("C:\\Users\\KARTIK\\Documents\\selenium input.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		DataFormatter formatter= new DataFormatter();
		XSSFSheet sheet=wb.getSheetAt(0);
		int rowcount=sheet.getPhysicalNumberOfRows();
		XSSFRow row=sheet.getRow(0);
		int coloumcount=row.getLastCellNum();
		Object[][] array= new Object[rowcount-1][coloumcount];
		for(int i=0;i<rowcount-1;i++) {
			row=sheet.getRow(i+1);
			for(int j=0;j<coloumcount;j++) {
				XSSFCell cell=row.getCell(j);
			array[i][j]=formatter.formatCellValue(cell);
				
			}
		}
		
		
		
	}  
	@Test
public static void execelreadertoHashmap() throws IOException {
	HashMap<String, String> map= new HashMap<String,String>();
	map.put("email","gfu@gmail.com");
	map.put("pass","Kartikk@15");
	map.put("productre", "ZARA COAT 3");	
		
		FileInputStream fis= new FileInputStream("C:\\Users\\KARTIK\\Documents\\selenium input.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		DataFormatter formatter= new DataFormatter();
		XSSFSheet sheet=wb.getSheetAt(0);
		int rowcount=sheet.getPhysicalNumberOfRows();
		XSSFRow row=sheet.getRow(0);
		int coloumcount=row.getLastCellNum();
		ArrayList<HashMap<String,String>> data= new ArrayList<HashMap<String,String>>();
		for(int i=0;i<rowcount-1;i++) {
			HashMap<String, String> map2= new HashMap<String,String>();
			row=sheet.getRow(i+1);
			XSSFRow rowheader=sheet.getRow(0);
			for(int j=0;j<coloumcount;j++) {
				XSSFCell cell=row.getCell(j);
			String temp=formatter.formatCellValue(cell);
			XSSFCell cell2=rowheader.getCell(j);
			String temp2=formatter.formatCellValue(cell2);
			map2.put(temp2, temp);
			
			
				
			}
			data.add(map2);
		}
		System.out.println(data.get(1).get("productre"));
		
		
		
	}  

}
