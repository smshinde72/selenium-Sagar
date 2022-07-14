package readingExcellSheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcellSheetEg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File MyFile=new File("G:\\Software\\Selenium\\Read Excell Sheet\\Excell Sheet1.xlsx");
		
		Workbook  MyWorkbook= WorkbookFactory.create(MyFile);
		Sheet MySheet = MyWorkbook.getSheet("Sheet2");
		Row MyRow = MySheet.getRow(1);
		Cell MyCell =  MyRow.getCell(0);
		CellType CellInfo = MyCell.getCellType();
				
		System.out.println(CellInfo);
		
		System.out.println("=====================");
		
		// code for reading multiple date from excel by using Static method

		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				String Value = MySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(Value+" ");
			}
		
			System.out.println();
		}
	}

}
