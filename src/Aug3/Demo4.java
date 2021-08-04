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

public class Demo4 {

	static {
		System.setProperty("webdriver.chrome.driver",
				"/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/chromedriver");
		System.setProperty("webdriver.gecko.driver",
				"/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/geckodriver");
	}

	//browser and tab
	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.actitime.com/login.do");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();

		Thread.sleep(1000);

		Set<String> allWHS = driver.getWindowHandles();

		for (String whs : allWHS) {
			driver.switchTo().window(whs);
		}

		driver.findElement(By.xpath("//a[text()='Try Free']")).click();

		Thread.sleep(1000);

		driver.close();

	}

}
