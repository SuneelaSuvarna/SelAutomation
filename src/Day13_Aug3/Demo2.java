package Day13_Aug3;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo2 {

	static {
		System.setProperty("webdriver.chrome.driver",
				"/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/chromedriver");
		System.setProperty("webdriver.gecko.driver",
				"/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/geckodriver");
	}
//Getting title of all the browsers and closing one by one 
	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		

		driver.get("file:/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/File/PopUpDemo.html");


		driver.findElement(By.id("A5")).click();

		Thread.sleep(1000);
		
		Set<String> allWHS = driver.getWindowHandles();
		
		for(String whs:allWHS)
		{
			driver.switchTo().window(whs);
			System.out.println(driver.getTitle());
			Thread.sleep(1000);
			driver.close();
		
		}
		
		
	
			

		

	}

}
