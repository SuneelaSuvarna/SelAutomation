package Day8;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Demo6 {

	static {
		System.setProperty("webdriver.chrome.driver",
				"/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/chromedriver");
		System.setProperty("webdriver.gecko.driver",
				"/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/geckodriver");
	}

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");

		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(3000);
		WebElement errorEle = driver.findElement(By.xpath("//span[contains(text(),'invalid')]"));
		
		Thread.sleep(3000);
		File srcFile = errorEle.getScreenshotAs(OutputType.FILE);  //to get the screenshot of element
		System.out.println(srcFile);
		FileUtils.copyFile(srcFile, new File("/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Screenshot/error.png")); //copy file from java heap file(tmp file) to destinaton flder)
		

		driver.close();

	}

}
