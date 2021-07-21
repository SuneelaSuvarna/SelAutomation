package Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/chromedriver");
		System.setProperty("webdriver.gecko.driver","/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/geckodriver");	
	}
	
	public static void test(WebDriver driver) throws InterruptedException
	{
		driver.get("https://www.google.com");
		Thread.sleep(1000);
		driver.navigate().to("https://www.fb.com");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		Demo2.test(driver);
	}

}
