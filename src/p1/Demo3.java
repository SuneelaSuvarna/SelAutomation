package p1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/chromedriver");
		System.setProperty("webdriver.gecko.driver","/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/geckodriver");	
	}
	
	public static void test(WebDriver driver) throws InterruptedException
	{
		driver.get("https://www.google.com");
		Thread.sleep(1000);
		
		
		WebElement element=driver.switchTo().activeElement();
		element.sendKeys("Sunil");
		
		
		driver.close();
		
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		Demo3.test(driver);
	}

}
