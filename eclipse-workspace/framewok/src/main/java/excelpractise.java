import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelpractise {

	public static void main(String[] args) throws IOException {
		FileInputStream  fis= new FileInputStream("C:\\Users\\KARTIK\\Desktop\\Fruits.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		int price=0;
		DataFormatter formatter= new DataFormatter();
		XSSFSheet sheet=wb.getSheetAt(0);
		XSSFRow row= sheet.getRow(0);
		int fruitcol=0;
		int coloumncunt=row.getLastCellNum();
        for(int i=0;i<coloumncunt;i++) {
        	XSSFCell cell=row.getCell(i);
        	String temp=formatter.formatCellValue(cell);
        	if(temp.equalsIgnoreCase("Fruit")) {
        		fruitcol= i;
        		break;
        	}
        	
        }
        
       int rowcount=sheet.getPhysicalNumberOfRows();
       
       for(int j=1;j<rowcount;j++) {
    	   row=sheet.getRow(j);
    	   XSSFCell cell2=row.getCell(fruitcol);
    	   String temp2=formatter.formatCellValue(cell2);
    	   if(temp2.equalsIgnoreCase("Banana")) {
    		   XSSFCell cell3= row.getCell(2);
    		   String tem3=formatter.formatCellValue(cell3);
    		   System.out.println(tem3);
    		   price= Integer.parseInt(tem3);
    	   }
    			  
       }
       System.out.println(price);
	}

}
