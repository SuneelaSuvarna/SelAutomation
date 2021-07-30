package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Demo5 {

	static {
		System.setProperty("webdriver.chrome.driver",
				"/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/chromedriver");
		System.setProperty("webdriver.gecko.driver",
				"/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/geckodriver");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");

		driver.findElement(By.xpath("//div[text()='Login ']")).click();

		Thread.sleep(3000);

		WebElement errorEle = driver.findElement(By.xpath("//span[contains(text(),'invalid')]"));
		String colorValue = errorEle.getCssValue("color");//rgba format
		System.out.println(colorValue);
		String hexaColor=Color.fromString(colorValue).asHex();
		System.out.println(hexaColor);
		if (hexaColor.equals("#ce0100")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		

		driver.close();

	}

}
