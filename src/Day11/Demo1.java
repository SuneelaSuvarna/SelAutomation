package Day11;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
		driver.get("file:/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/File/ListBox1.html");
		// driver.get("https://demo.actitime.com/login.do");

		Thread.sleep(1000);

		WebElement listBox = driver.findElement(By.id("A1"));

		Select select = new Select(listBox);
		select.selectByIndex(0);
		Thread.sleep(1000);
		select.selectByValue("b");
		Thread.sleep(1000);
		select.selectByVisibleText("Rajahmundry");
		Thread.sleep(1000);
		boolean flag = select.isMultiple();
		System.out.println(flag);
		Thread.sleep(1000);
		// select.selectByIndex(4);
		driver.close();

	}

}
