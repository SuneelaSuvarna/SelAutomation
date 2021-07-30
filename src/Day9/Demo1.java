package Day9;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		//driver.get("file:/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/File/Demo.html");
		driver.get("https://demo.actitime.com/login.do");
		
		//Taking screenshot of full page
		
		TakesScreenshot screenShot=(TakesScreenshot) driver;
		File srcImg = screenShot.getScreenshotAs(OutputType.FILE);
		
	

		String fileDate = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
		
		FileUtils.copyFile(srcImg, new File("/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Screenshot/fullScreen_"+fileDate+".png"));
	
		
		driver.close();

	}

}
