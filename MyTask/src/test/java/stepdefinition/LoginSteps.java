package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.CheckoutPOM;
import POM.LoginPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.bytebuddy.asm.Advice.OffsetMapping.Sort;

public class LoginSteps extends BaseClass {

	@Given("Launch browser")
	public void launch_browser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		loginpom = new LoginPOM(driver);
		checkoutPOM=new CheckoutPOM(driver);
	}

	@When("User open URL {string}")
	public void user_open_url(String url) {
		driver.get(url);
	}

	@When("User enter email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String name, String pass) {
		loginpom.setUserName(name);
		loginpom.setPassword(pass);
	}

	@When("Click on Login button")
	public void click_on_login_button() throws InterruptedException {
		loginpom.clickButton();
		Thread.sleep(5000);
		System.out.println("Sleeping------------");

	}

	@When("User click on Filter button")
	public void user_click_on_filter_button() {
		System.out.println("In Filter method------------");

		// checkoutPOM=new CheckoutPOM(driver);
		checkoutPOM.selectFilter();

	}

	@When("User Click on add to cart button")
	public void user_click_on_add_to_cart_button() {
		checkoutPOM.clickAddTocartButton();

	}

	@When("User Click on cartIcon and Checkout button")
	public void user_click_on_cart_icon_and_checkout_button() {
		checkoutPOM.clickCartandCheckout();
	}

	@When("User Fill Form fname as {string} and lname as {string} and code as {string} and click on continue button")
	public void user_fill_form_fname_as_and_lname_as_and_code_as_and_click_on_continue_button(String fname,
			String lname, String code) {
		checkoutPOM.fillForm(fname, lname, code);

	}

	@When("Click on Finish button")
	public void click_on_finish_button() {
		checkoutPOM.clickOnFinishButton();
	}

	@When("Verify Success Message")
	public void verify_success_message() {
		checkoutPOM.verifySuccessMessage();
		
		
	}

}

