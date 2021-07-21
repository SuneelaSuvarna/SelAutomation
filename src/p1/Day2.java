package p1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day2 {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/chromedriver");
		System.setProperty("webdriver.gecko.driver","/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/geckodriver");	
	}

	
	public static void test(WebDriver driver)
	{
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
		
	}
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();  //auto upcasting...assinging child class to parent class
		Day2.test(driver);
		
		WebDriver driver1=new FirefoxDriver();
		Day2.test(driver1);
		
		

	}
	


}
