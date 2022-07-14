package webTable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableEg1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Software\\Selenium\\chromedriver_win32//chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
				
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		//to find no of Row in tables
		List<WebElement> Row = driver.findElements(By.xpath("//table//tr"));
		int TotalNosOfRow = Row.size();
		System.out.println("Total Num of Columns "+TotalNosOfRow);
//---OR		
		//System.out.println(Row.size());

		//to find no of Column in tables
		List<WebElement> Column = driver.findElements(By.xpath("//table//tr[1]//th"));
		int TotalNosOfColumn = Column.size();
		System.out.println("Total Num of Columns "+TotalNosOfColumn);
		
		System.out.println("====================================");
		//how to read Header
		for(WebElement header:Column)
		{
			System.out.print(header.getText()+"!!");
			System.out.print("");
		}
		
		//System.out.println("====================================");
		//how to read all rows text frm tables
		
//		List<WebElement> AllRowData = driver.findElements(By.xpath("//table//tr"));
//		
//		Iterator<WebElement> R = AllRowData.iterator();
//		while(R.hasNext())
//		{
//			System.out.println(R.next().getText()+" "); 
//		}
		
		//===OR
		
		for(int i=0;i<=TotalNosOfRow-1;i++)
		{
			System.out.println(Row.get(i).getText());
		}
			
	}

}
