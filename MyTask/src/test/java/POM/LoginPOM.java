package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {

	public WebDriver driver;

	public LoginPOM(WebDriver driver) {
		System.out.println("Constructor Called-->");
		this.driver=driver;
		 
		PageFactory.initElements(driver, this);
		driver.manage().window().maximize();

	}

	@FindBy(id = "user-name")
	@CacheLookup
	WebElement uname;

	@FindBy(id = "password")
	@CacheLookup
	WebElement password;
	

	@FindBy(id = "login-button")
	@CacheLookup
	WebElement LoginButton;
	
	public void setUserName(String username) {
		uname.sendKeys(username);
	}


	public void setPassword(String password1) {
		password.sendKeys(password1);
	}
	
	public void clickButton() {
		LoginButton.click();
	}
	
	
}
