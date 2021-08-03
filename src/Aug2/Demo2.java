package Aug2;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


//how do you handle fileupload popup?
//using sendkeys method

//what is the arg for sendkeys method?
//absoulte path of file should be uploaded

//how to upload absolute path?
//how to convert relative path to absolute path?


public class Demo2 {

	static {
		System.setProperty("webdriver.chrome.driver",
				"/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/chromedriver");
		System.setProperty("webdriver.gecko.driver",
				"/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/geckodriver");
	}

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("file:"+System.getProperty("user.dir")+"/File/PopUpDemo.html");

		String filePath=System.getProperty("user.dir")+"/File/TestFile.docx"; 
		System.out.println(filePath);
		
		Thread.sleep(1000);
		driver.findElement(By.id("A2")).sendKeys(filePath);
		
		Thread.sleep(1000);
		
		driver.close();

	}

}
