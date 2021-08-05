package Day15_Aug5;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo4 {

	static {
		System.setProperty("webdriver.chrome.driver",
				"/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/chromedriver");
		System.setProperty("webdriver.gecko.driver",
				"/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/geckodriver");
	}

	//scroll to bottom of the screen using JS
	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();  //upcasting
		
		 driver.get("https://www.actimind.com/");
		 driver.manage().window().maximize();

		Thread.sleep(2000);
		 
		 JavascriptExecutor jse=(JavascriptExecutor) driver; //typecasting
		 
		 jse.executeScript("window.scroll(0,document.body.scrollHeight)");
			Thread.sleep(2000);
		 jse.executeScript("window.scroll(0,-(document.body.scrollHeight))");
		
		 
		
	//driver.close();

	}

}
