package Aug3;

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

public class Demo6 {

	static {
		System.setProperty("webdriver.chrome.driver",
				"/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/chromedriver");
		System.setProperty("webdriver.gecko.driver",
				"/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/geckodriver");
	}
//closing browser,tab and child window
	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();

		driver.get("file:/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/File/sample1_iFrame.html");
		Thread.sleep(1000);
	//driver.switchTo().frame(0);
	//	driver.switchTo().frame("f1");
		//WebElement frameEle = driver.findElement(By.name("n1"));
		//driver.switchTo().frame(frameEle);
		driver.findElement(By.id("t2")).sendKeys("suvarna");
		
		
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.findElement(By.id("t1")).sendKeys("sunil");
		Thread.sleep(1000);

		driver.close();

	}

}
