package Day10;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo4 {

	static {
		System.setProperty("webdriver.chrome.driver",
				"/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/chromedriver");
		System.setProperty("webdriver.gecko.driver",
				"/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/geckodriver");
	}

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("file:/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/File/ListBox1.html");
		System.out.println("Please enter the city ");
		Scanner sc=new Scanner(System.in);
		
		String expected = sc.nextLine();
		sc.close();
		System.out.println("Searching ....");
		String msg = expected + " is not found";
		WebElement listBox = driver.findElement(By.id("A1"));
		Select select = new Select(listBox);

		List<WebElement> options = select.getOptions();
		int count = options.size();
		for (int i = 0; i < count; i++) {
			String actual = options.get(i).getText();
			if (actual.equals(expected)) {
				msg = expected + " is found at position " + i;
				break;
			}
		}
		System.out.println(msg);
		Thread.sleep(1000);

		driver.close();

	}

}
