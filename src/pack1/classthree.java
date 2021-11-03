package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class classthree {
	
	@Test
	public void methodthreeA(){
		System.out.println("inside methodthree A");
		
		  System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("http://www.flipkart.com");
		  
		  driver.close();
	}

}
