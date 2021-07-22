package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	static {
		System.setProperty("webdriver.chrome.driver",
				"/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/chromedriver");
		System.setProperty("webdriver.gecko.driver",
				"/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/geckodriver");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("file:/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/File/Sample.html");

		driver.findElement(By.tagName("a")).click();

		waitForSec(driver);

		driver.findElement(By.id("d1")).click();

		waitForSec(driver);

		driver.findElement(By.name("n1")).click();

		waitForSec(driver);

		driver.findElement(By.className("c1")).click();

		waitForSec(driver);

		driver.findElement(By.linkText("Google")).click();

		waitForSec(driver);

		driver.findElement(By.partialLinkText("Goo")).click();

		driver.close();

	}

	public static void waitForSec(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
	}

}
