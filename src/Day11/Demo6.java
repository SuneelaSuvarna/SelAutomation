package Day11;

import java.io.IOException;
import java.time.Duration;

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

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		// driver.get("file:/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/File/ActionDemo.html");
		driver.get("https://demo.actitime.com/login.do");

		Thread.sleep(3000);
		WebElement un = driver.findElement(By.id("username"));
		WebElement pwd = driver.findElement(By.name("pwd"));

		// Actions actions=new Actions(driver);
		// actions.sendKeys("trainee").perform();

		un.sendKeys("trainee");
		un.sendKeys(Keys.COMMAND + "a");

		// unTB.sendKeys(Keys.CONTROL+"a");

		un.sendKeys(Keys.COMMAND + "c");
		Thread.sleep(1000);

		pwd.sendKeys(Keys.COMMAND + "v");

		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[text()='Login ']")).click();

		Thread.sleep(1000);
		// driver.close();

	}

}
