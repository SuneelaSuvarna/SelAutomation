package Day15_Aug5;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2 {

	static {
		System.setProperty("webdriver.chrome.driver",
				"/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/chromedriver");
		System.setProperty("webdriver.gecko.driver",
				"/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/geckodriver");
	}

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();  //upcasting
		
		 driver.get("https://www.actimind.com/");
		
		 driver.manage().window().maximize();
		 
		 JavascriptExecutor jse=(JavascriptExecutor) driver; //typecasting
		 
		 for(int i=1;i<=10;i++)
		 {
			 jse.executeScript("window.scroll(0,100)");
			 Thread.sleep(1000);
		 }
		
		 for(int i=1;i<=10;i++)
		 {
			 jse.executeScript("window.scroll(0,-100)");
			 Thread.sleep(1000);
		 }
		
	driver.close();

	}

}
