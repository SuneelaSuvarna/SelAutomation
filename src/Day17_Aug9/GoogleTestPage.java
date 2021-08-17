package Day17_Aug9;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTestPage {

	static {
		System.setProperty("webdriver.chrome.driver",
				"/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/chromedriver");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		GooglePage google = new GooglePage(driver);
		int linkSize=google.getLinkSize();
		System.out.println(linkSize);
		
		
		List<String>allLinkText = google.printAllLinkText();
		for(int i=0;i<allLinkText.size();i++)
		{
			String text=allLinkText.get(i);
			System.out.println(text);
		}
		driver.close();
	}

}
