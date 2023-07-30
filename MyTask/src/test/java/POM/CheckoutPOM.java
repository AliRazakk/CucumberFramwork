package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;
import stepdefinition.BaseClass;

public class CheckoutPOM extends BaseClass {

	// public WebDriver driver;

	public CheckoutPOM(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
		driver.manage().window().maximize();
	}

	@FindBy(xpath = "//*[@id=\"inventory_filter_container\"]/select")
	@CacheLookup
	WebElement sort;

	@FindBy(css = "#inventory_container > div > div:nth-child(1) > div.pricebar > button")
	@CacheLookup
	WebElement onesie;

	@FindBy(css = "#inventory_container > div > div:nth-child(4) > div.pricebar > button")
	@CacheLookup
	WebElement tshirt;

	@FindBy(css = "#shopping_cart_container > a > svg > path")
	@CacheLookup
	WebElement cart;

	@FindBy(css = "#cart_contents_container > div > div.cart_footer > a.btn_action.checkout_button")
	@CacheLookup
	WebElement checkout;

	@FindBy(id = "first-name")
	@CacheLookup
	WebElement fname;

	@FindBy(id = "last-name")
	@CacheLookup
	WebElement lname;

	@FindBy(id = "postal-code")
	@CacheLookup
	WebElement code;

	@FindBy(css = "#checkout_info_container > div > form > div.checkout_buttons > input")
	@CacheLookup
	WebElement conButton;

	@FindBy(css = "#checkout_summary_container > div > div.summary_info > div.cart_footer > a.btn_action.cart_button")
	@CacheLookup
	WebElement finButton;

	@FindBy(css = "#checkout_complete_container > h2")
	@CacheLookup
	WebElement succMessage;

	public void selectFilter() {
		Select filter = new Select(sort);
		filter.selectByIndex(2);
	}

	public void clickAddTocartButton() {
		onesie.click();
		tshirt.click();
	}

	public void clickCartandCheckout() {
		cart.click();
		checkout.click();
	}

	public void fillForm(String firstName, String lastName, String postCode) {
		fname.sendKeys(firstName);
		lname.sendKeys(lastName);
		code.sendKeys(postCode);
		conButton.click();
	}

	public void clickOnFinishButton() {
		finButton.click();
	}

	public void verifySuccessMessage() {
		String actualMessage = succMessage.getText();
		System.out.println("Success Message--------------" + actualMessage);
		Assert.assertEquals("THANK YOU FOR YOUR ORDER", actualMessage);

	}

	// #checkout_complete_container > h2
}
