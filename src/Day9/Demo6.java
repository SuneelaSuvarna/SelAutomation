package Day9;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {

	static {
		System.setProperty("webdriver.chrome.driver",
				"/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/chromedriver");
		System.setProperty("webdriver.gecko.driver",
				"/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/geckodriver");
	}

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");

		Thread.sleep(2000);

		List<WebElement> allEle = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));

		int count = allEle.size();

		for (int i = 0; i < count; i++) {
			System.out.println(allEle.get(i).getText());

			if (allEle.get(i).getText().equals("selenium download")) {
				allEle.get(i).click();
				break;
			}

		}
		Thread.sleep(1000);

		driver.close();

	}

}
