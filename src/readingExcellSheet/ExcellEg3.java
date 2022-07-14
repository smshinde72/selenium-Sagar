package readingExcellSheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcellEg3 {


	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File MyFile = new File("G:\\Software\\Selenium\\Read Excell Sheet\\Excell Sheet1.xlsx");
		
		Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet2");
		int ToatalRow = MySheet.getLastRowNum();
		int RowCount = ToatalRow;
		System.out.println(RowCount);
		short ToatalCell = MySheet.getRow(ToatalRow).getLastCellNum();
		int CellCount = ToatalCell-1;
		System.out.println(CellCount);
		System.out.println("=============================");

		
		for(int i=0;i<=RowCount;i++)
		{
			for(int j=0;j<=CellCount;j++)
			{
				Cell MyCell = MySheet.getRow(i).getCell(j);
				CellType TypeData = MyCell.getCellType();
			
		if(TypeData==CellType.STRING)
		{
			String Value = MyCell.getStringCellValue();
			System.out.print(Value+" ");
		}
		
		else if(TypeData==CellType.BOOLEAN) 
		{
			boolean Value = MyCell.getBooleanCellValue();
			System.out.print(Value+" ");
		}
		else if(TypeData==CellType.NUMERIC)
		{
			double value = MyCell.getNumericCellValue();
			System.out.print(value+" ");
		}
		else if (TypeData==CellType.BLANK)
		{
	
			System.out.print(" ");
		}
		
			}
		System.out.println();
		}
		
        		
		
		
	}

}
