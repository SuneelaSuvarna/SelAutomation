package Day15_Aug5;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

	//Selenium will scroll and find the element
	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		//driver.get("file:/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/File/ListBox1.html");
		 driver.get("https://www.actimind.com/");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//a[contains(text(),'Learn') and contains(text(),'more')]")).click();
		 Thread.sleep(1000);
	driver.close();

	}

}
