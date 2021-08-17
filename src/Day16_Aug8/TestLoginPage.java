package Day16_Aug8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLoginPage {

	static {
		System.setProperty("webdriver.chrome.driver",
				"/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/chromedriver");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		LoginPage login = new LoginPage(driver);
		login.setUserName("aaaa");
		login.setPassword("bbb");
		login.clickOnLogin();
		login.validateErrorMsg(driver);
		Thread.sleep(2000);
		login.setUserName("aaaa");
		login.setPassword("bbb");
		login.clickOnLogin();

	}
}
