package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class classone {
  @Test
  public void methodoneA() {
	  
	  System.out.println("inside method one A");
	  
	  System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("http://www.google.com");
	  
	  driver.close();
	  
	  
	  
	  
  }
}
