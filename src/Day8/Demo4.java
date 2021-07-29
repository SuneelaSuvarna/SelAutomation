package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	static {
		System.setProperty("webdriver.chrome.driver",
				"/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/chromedriver");
		System.setProperty("webdriver.gecko.driver",
				"/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/geckodriver");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("file:/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/File/Demo.html");

		WebElement ele = driver.findElement(By.id("A2"));

		String tag = ele.getTagName();

		System.out.println(tag);
		System.out.println(ele.getAttribute("id"));
		System.out.println(ele.getAttribute("href"));
		System.out.println(ele.getAttribute("target"));
		System.out.println(ele.getText());
		driver.close();
		
	}

}
