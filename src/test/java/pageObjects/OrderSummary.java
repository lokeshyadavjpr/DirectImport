package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderSummary {
	WebDriver driver;
	
	@FindBy(xpath="//a[@class='less-btn-quntity qtyplus']")
	WebElement qty_plus;
	
	@FindBy(id="new_ac_username_name")
	WebElement acronis_User_Name;
	
	@FindBy(id="ac_username_select_button1")
	WebElement select_username;
	
	@FindBy(id="mcaCheck")
	WebElement add_to_cart;
	
	@FindBy(id="login_form_user")
	WebElement username;
	
	@FindBy(id="login_form_password")
	WebElement password;
	
	@FindBy(xpath="//input[@class='btn btn-primary w-100'][@name='log_in']")
	WebElement signin_button;	
	
	@FindBy(xpath="//div[@class='products-titlename mb-2']/h5")
	WebElement offerName;
	
	
	@FindBy(id="checkOutButton")
	WebElement checkout_button;	
	
		
	public OrderSummary(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void qtyPlusButton() {
		qty_plus.click();
	}
	
	public void acronisUserName() {
		acronis_User_Name.sendKeys("acronisnewuser");
	}
	
	public void selectUserNameButton() {
		select_username.click();
	}
	
	public void addToCart() {
		add_to_cart.click();
	}
	
	public void userName() {
		username.sendKeys("automation");
	}
	
	public void password() {
		password.sendKeys("Abcd$1234");
	}
	
	public void signinbutton() {
		signin_button.click();
	}
	
	public void checkoutButton() {
		checkout_button.click();
	}
	
	public String getOfferName() {
		return offerName.getText();
	}
	
}
