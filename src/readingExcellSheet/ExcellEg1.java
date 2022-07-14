package readingExcellSheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcellEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		//need to create object of file class
		File myFile =new File("G:\\Software\\Selenium\\Read Excell Sheet\\Excell Sheet1.xlsx");
		
		// using WorkbookFactory class call create method and pass details
		// to read String type value
		String City = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(3).getCell(1).getStringCellValue();
		System.out.println(City);
		
		//To read boolean value
		boolean Value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(2).getCell(1).getBooleanCellValue();	
		System.out.println(Value);
// OR=====
		Sheet Value1 = WorkbookFactory.create(myFile).getSheet("Sheet1");
	    Object abc = Value1.getRow(2).getCell(1).getBooleanCellValue();
	    System.out.println(abc);
	
	 // to read numeric value
	    double Num = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
	    System.out.println(Num);
	    
	 // how to read char value
	   String CharValue = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
	    System.out.println(CharValue);
	    
	    
	}

}
