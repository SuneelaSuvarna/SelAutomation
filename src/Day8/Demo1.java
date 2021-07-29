package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	static {
		System.setProperty("webdriver.chrome.driver",
				"/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/chromedriver");
		System.setProperty("webdriver.gecko.driver",
				"/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/geckodriver");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("file:/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/File/Demo.html");

		WebElement element = driver.findElement(By.id("A1"));

		element.clear(); // to remove value present in text box
		driver.findElement(By.id("A1")).sendKeys("Sunil"); // to enter the input

		// driver.findElement(By.id("A2")).click(); to click on element

		System.out.println(driver.findElement(By.id("A2")).isDisplayed()); // to check whether element is displayed or
																			// not
		boolean flag = driver.findElement(By.id("A3")).isDisplayed();
		System.out.println(flag);

		System.out.println(driver.findElement(By.id("A1")).isEnabled()); // to check whether element is enabled or
																			// disabled
		System.out.println(driver.findElement(By.id("A4")).isEnabled());

		System.out.println(driver.findElement(By.id("A5")).isSelected()); // to check whether element is selected or not
																			// //radio button and checkbox
		System.out.println(driver.findElement(By.id("A6")).isSelected());

		driver.findElement(By.id("A7")).click();
		driver.findElement(By.id("A8")).submit(); // type=submit

		Thread.sleep(3000);

		driver.close();

	}

}
