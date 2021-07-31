package Day10;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3 {

	static {
		System.setProperty("webdriver.chrome.driver",
				"/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/chromedriver");
		System.setProperty("webdriver.gecko.driver",
				"/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/geckodriver");
	}

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("file:/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/File/ListBox2.html");

		Thread.sleep(1000);

		WebElement listBox = driver.findElement(By.id("A3"));

		Select select = new Select(listBox);

		List<WebElement> selectedOptions = select.getAllSelectedOptions();
		int count = selectedOptions.size();
		System.out.println("Selected options : " + count);
		System.out.println();
		
		for (int i = 0; i < count; i++) {
			System.out.println(selectedOptions.get(i).getText());
		}
		System.out.println();
		
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		System.out.println("First Selected option :" + firstSelectedOption.getText());
		System.out.println();
		
		List<WebElement> allOptions = select.getOptions();
		int count1 = allOptions.size();
		System.out.println("All options :" + count1);
		System.out.println();
		
		for (int i = 0; i < count1; i++) {
			System.out.println(allOptions.get(i).getText());
		}
		System.out.println();
		WebElement element = select.getWrappedElement();
		System.out.println(element.getText());

		driver.close();

	}

}
