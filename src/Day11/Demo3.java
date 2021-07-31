package Day11;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo3 {

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

		driver.findElement(By.id("A3")).click();
		Thread.sleep(1000);
		String xpath1="//input[@value='Double Click']";
		WebElement doubleClick = driver.findElement(By.xpath(xpath1));
		Actions actions=new Actions(driver);
		actions.doubleClick(doubleClick).perform();

	}

}
