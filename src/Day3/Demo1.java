package Day3;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	
	static {
		System.setProperty("webdriver.chrome.driver", "/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/chromedriver");
		System.setProperty("webdriver.gecko.driver","/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/geckodriver");	
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		Dimension currentSize = driver.manage().window().getSize();
		System.out.println(currentSize);
		
		Dimension newSize= new Dimension(600, 400);
		driver.manage().window().setSize(newSize); //resize the browser 
		
		Thread.sleep(500);
		Point currentPoint = driver.manage().window().getPosition();
		System.out.println(currentPoint);
		
		int x=200;
		int y;
		for(int i=1;i<10;i++)
		{
			Point newPoint=new Point(x, 100);
			driver.manage().window().setPosition(newPoint); //move the browser
	
			
			x=x+50;
			Thread.sleep(500);
		}
		
		driver.close();
	}

}
