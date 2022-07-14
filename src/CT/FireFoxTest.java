package CT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFoxTest {
  @Test
  
  public void FireFox()
  {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\FireFox\\geckodriver.exe");

	  WebDriver driver=new FirefoxDriver();
      driver.get("https://paytm.com/");

  
  }
}
