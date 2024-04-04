package stepDefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.qa.factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.OrderSummary;

public class AcronisMarketplacePaypalOrderExisCust extends DriverFactory{
	DriverFactory df=new DriverFactory();
	WebDriver driver;
	Properties prop=new Properties();
	OrderSummary orders;
	
	@Given("Open Acronis Offer Link")
	public void open_acronis_offer_link() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		FileInputStream fis=new FileInputStream("src\\test\\resources\\Config\\config.properties");
		prop.load(fis);
		driver=df.launchBrowser(prop.getProperty("browser"));
	    driver.get(prop.getProperty("AcronisOrderLink"));
	    driver.manage().window().maximize();
	}

	@Given("Update Quantity")
	public void update_quantity() {
	    // Write code here that turns the phrase above into concrete actions	    
	    orders=new OrderSummary(driver);
	    orders.qtyPlusButton();
	}

	@Given("Provide username")
	public void provide_username() {
	    // Write code here that turns the phrase above into concrete actions		
		orders.acronisUserName();
		orders.selectUserNameButton();
	}

	@When("Select Add to Cart")
	public void select_add_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ac_username_select_button2")));
		orders.addToCart();
	}
	
	@Then("Login through existing customer credentials")
	public void login_through_existing_customer_credentials() {
	    // Write code here that turns the phrase above into concrete actions
		orders.userName();
		orders.password();
		orders.signinbutton();
		
	}

	@Then("Verify Offer Name on Cart Page")
	public void verify_offer_name_on_cart_page() {
	    // Write code here that turns the phrase above into concrete actions
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0,250)");
		
	}

	@Then("Verify Amount on Cart Page")
	public void verify_amount_on_cart_page() {
	    // Write code here that turns the phrase above into concrete actions
		String expectedOfferName="Backup General - Acronis General Plan 150sdsd ( 150 GB )";
		String actualOfferName=orders.getOfferName();
		Assert.assertEquals(actualOfferName, expectedOfferName);
		
		
	}

	@Then("Select Checkout")
	public void select_checkout() {
	    // Write code here that turns the phrase above into concrete actions
		orders.checkoutButton();
	}

	@Then("Click Ok on additional taxes popup")
	public void click_ok_on_additional_taxes_popup() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Test");
	}

	@Then("Verify page is navigated to Checkout page")
	public void verify_page_is_navigated_to_checkout_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Test");
	}

	@Then("Select PayPal Radio button")
	public void select_pay_pal_radio_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Test");
	}

	@Then("Select PayNow button")
	public void select_pay_now_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Test");
	}

	@Then("Select Ok on Confirmation popup to proceed")
	public void select_ok_on_confirmation_popup_to_proceed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Test");
	}

	@Then("Provide PayPal email and password")
	public void provide_pay_pal_email_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Test");
	}

	@Then("Login into paypal through Login button")
	public void login_into_paypal_through_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Test");
	}

	@Then("On Paypal page Click Continue to Review Order")
	public void on_paypal_page_click_continue_to_review_order() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Test");
	}

	@Then("verify Successful payment confirmation screen")
	public void verify_successful_payment_confirmation_screen() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Test");
	}

	@Then("Login into Admin panel and verify placed order")
	public void login_into_admin_panel_and_verify_placed_order() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Test");
	}

	@Then("In admin panel verify Invoice Details page")
	public void in_admin_panel_verify_invoice_details_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Test");
	}


}
