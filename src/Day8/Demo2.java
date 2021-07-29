package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	static {
		System.setProperty("webdriver.chrome.driver",
				"/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/chromedriver");
		System.setProperty("webdriver.gecko.driver",
				"/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/geckodriver");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("file:/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/File/Demo.html");

		int x = driver.findElement(By.id("A1")).getLocation().getX(); // get x axis
		System.out.println(x);

		int y = driver.findElement(By.id("A1")).getLocation().getY(); // get y axis
		System.out.println(y);

		int h = driver.findElement(By.id("A1")).getSize().getHeight(); // get height of the location
		System.out.println(h);

		int w = driver.findElement(By.id("A1")).getSize().getWidth(); // get width of the location
		System.out.println(w);

		Rectangle r = driver.findElement(By.id("A1")).getRect(); // get x axis, y axis, height and width of the location

		System.out.println(r.getX());
		System.out.println(r.getY());
		System.out.println(r.getHeight());
		System.out.println(r.getWidth());

		driver.close();

	}

}
