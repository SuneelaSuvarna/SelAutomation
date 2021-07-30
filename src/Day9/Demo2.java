package Day9;

import java.io.IOException;
import java.util.List;

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

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("file:/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/File/Demo_2.html");

		List<WebElement> allEle = driver.findElements(By.xpath("//input[@type='text']"));

		int size = allEle.size();

		for (int i = 0; i < size; i++) {
			WebElement ele = allEle.get(i);
			ele.sendKeys("Sunil Suvarna_" + i);
			Thread.sleep(1000);
		}

		driver.close();

	}

}
