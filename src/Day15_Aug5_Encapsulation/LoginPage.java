package Day15_Aug5_Encapsulation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private WebElement unTB;
	private WebElement pwTB;
	private WebElement loginBtn;

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
}
