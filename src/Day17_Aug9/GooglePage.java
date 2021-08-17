package Day17_Aug9;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {

	@FindBy(xpath = "//a")
	private List<WebElement> allLinks;

	public GooglePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public int getLinkSize() {
			return allLinks.size();
	}

	public List<String> printAllLinkText()
	{
		List<String>allLinkText = new ArrayList<String>();
		for(int i=0;i<allLinks.size();i++)
		{
			allLinkText.add(allLinks.get(i).getText());
		}
		return allLinkText;
	}
}
