package Day16_Aug8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private WebElement unTB;
	private WebElement pwTB;
	private WebElement loginBtn;
	private WebElement	errorMsg;

	public LoginPage(WebDriver driver) {
		unTB = driver.findElement(By.id("username"));
		pwTB = driver.findElement(By.name("pwd"));
		loginBtn = driver.findElement(By.xpath("//div[text()='Login ']"));
		
	}

	public void setUserName(String un) {
		unTB.sendKeys(un);
	}

	public void setPassword(String pwd) {
		pwTB.sendKeys(pwd);
	}

	public void clickOnLogin() {
		loginBtn.click();
	}
	
	public void validateErrorMsg(WebDriver driver)
	{
		driver.findElement(By.xpath("//span[contains(text(),'invalid')]"));
		System.out.println(errorMsg.isDisplayed());
	}
}
