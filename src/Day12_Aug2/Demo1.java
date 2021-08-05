package Day12_Aug2;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo1 {

	static {
		System.setProperty("webdriver.chrome.driver",
				"/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/chromedriver");
		System.setProperty("webdriver.gecko.driver",
				"/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/geckodriver");
	}

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("file:/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/File/PopUpDemo.html");
		// driver.get("https://demo.actitime.com/login.do");

		driver.findElement(By.id("A1")).click();

		Thread.sleep(1000);

		Alert alert = driver.switchTo().alert();

		System.out.println(alert.getText());

		 alert.accept();
		Thread.sleep(1000);
		//alert.dismiss(); //	 NoAlertPresentException	

		driver.close();

	}

}
