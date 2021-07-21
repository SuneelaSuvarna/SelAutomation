package Day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		System.out.println("Selenium");
		
		String key="webdriver.chrome.driver";
		String value="/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/chromedriver";
		System.setProperty(key, value);
		ChromeDriver driver= new ChromeDriver();
		driver.close();

	}

}
