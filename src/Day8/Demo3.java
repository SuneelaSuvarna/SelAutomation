package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	static {
		System.setProperty("webdriver.chrome.driver",
				"/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/chromedriver");
		System.setProperty("webdriver.gecko.driver",
				"/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/geckodriver");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("file:/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/File/Demo.html");

		WebElement ele = driver.findElement(By.id("A1"));
		int x = ele.getLocation().getX(); // get x axis of the element
		System.out.println(x);

		int y = ele.getLocation().getY(); // get y axis of the element
		System.out.println(y);

		int h = ele.getSize().getHeight(); // get height of the element
		System.out.println(h);

		int w = ele.getSize().getWidth(); // get width of the element
		System.out.println(w);

		Rectangle r = ele.getRect(); // get x axis, y axis, height and width of the element

		System.out.println(r.getX());
		System.out.println(r.getY());
		System.out.println(r.getHeight());
		System.out.println(r.getWidth());

		driver.close();

	}

}
