package Day16_Aug8;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	
	static {
		System.setProperty("webdriver.chrome.driver",
				"/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/chromedriver");
		System.setProperty("webdriver.gecko.driver",
				"/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/geckodriver");
	}

	
	//StaleElementReferenceException
	
	//Reference Element is old or address is old  //After finding the element and before performing the action  if page is refreshed we get SERE
	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement unTB=driver.findElement(By.id("username"));
		WebElement pwdTB=driver.findElement(By.name("pwd"));
		unTB.sendKeys("admin");
		Thread.sleep(3000);
		driver.navigate().refresh();
		pwdTB.sendKeys("manager");
		
		driver.close();
			

		
//what are the difference between implicit wait and explicit wait
		
	}	


}
