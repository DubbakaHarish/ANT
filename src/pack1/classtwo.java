package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class classtwo {
	@Test
	public void methodtwoA(){
		
		System.out.println("method twoA");
		
		  System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("http://www.facebook.com");
		  
		  driver.close();
	}
	@Test
	public void methodoneB(){
		System.out.println("method twoB");
	}

}
