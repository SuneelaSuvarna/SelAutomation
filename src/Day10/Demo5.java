package Day10;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo5 {

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

		WebElement listBox = driver.findElement(By.id("A2"));

		ArrayList<String> allText = new ArrayList<String>();
	
		Select select = new Select(listBox);

		List<WebElement> allOptions = select.getOptions();
		for (WebElement option : allOptions) {
			String text = option.getText();
			allText.add(text);
		}
		
		
		System.out.println(allText);
		
		//Sorting
		Collections.sort(allText);
		System.out.println(allText);
		
		//Reverse Sorting
		Collections.reverse(allText);
		System.out.println(allText);	
		
		//Check Duplicate Element
		for (int i=0;i<allText.size();i++)
		{
			if(allText.contains(allText.get(i)))
				
			{
				System.out.println(allText.get(i)+ " is duplicated");
			}
		}
		driver.close();
		
		

	}
	
	//check if list box contains any duplicats
	//reverse sorting order
	//print list box content in sorted order
	//check if list box has any duplicate options
	//print list box content in reverse sorted order	
}
