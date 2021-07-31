package Day11;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo5 {

	static {
		System.setProperty("webdriver.chrome.driver",
				"/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/chromedriver");
		System.setProperty("webdriver.gecko.driver",
				"/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/geckodriver");
	}

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("file:/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/File/ActionDemo.html");
		// driver.get("https://demo.actitime.com/login.do");

		driver.findElement(By.id("A4")).click();

		Thread.sleep(3000);
		String xpath1 = "//h1[text()='Block 1']";
		WebElement block1 = driver.findElement(By.xpath(xpath1));

		String xpath3 = "//h1[text()='Block 3']";
		WebElement block3 = driver.findElement(By.xpath(xpath3));

		Actions actions = new Actions(driver);
		Duration delay=Duration.ofSeconds(3);
		actions.clickAndHold(block1).pause(delay).moveToElement(block3).pause(delay).release().perform();

		Thread.sleep(1000);
		driver.close();

	}

}
