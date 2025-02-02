package Newlisting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class newlisting1 {
	
	WebDriver driver;
	
	//constructor
	newlisting1(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//locator
	@FindBy(xpath="//input[@id='my_email']")
	WebElement username;
	
	@FindBy(xpath="//input[@placeholder='Enter password']")
	WebElement password;
	
	@FindBy(xpath="//button[normalize-space()='Log In']")
	WebElement Login_btn;

	@FindBy(xpath="//button[normalize-space()='+ New Transaction']")
	WebElement new_transaction;
	
	@FindBy(xpath="//label[normalize-space()='New Listing']")
	WebElement new_listing_radio_btn;
	
	@FindBy(xpath="//input[@class='autocomplete-input !px-4 !py-2 !text-base !placeholder !placeholder-gray-400 !placeholder-opacity-90 disabled:bg-[#f3f4f6]']")
	WebElement property_location;
	
	@FindBy(xpath="//select[@id='propertyType']")
	WebElement property_type;
	
	@FindBy(xpath="//select[@id='clientType']")
	WebElement client_type;
	
	@FindBy(xpath="//input[@id='seller.fullName']")
	WebElement Seller_name;
	
	@FindBy(xpath="//input[@id='seller.email']")
	WebElement Seller_email;
	
	@FindBy(xpath="//input[@id='entityName']")
	WebElement entity_name;
	
	@FindBy(xpath="//input[@id='entityTitle']")
	WebElement entity_title;
	
	@FindBy(xpath="//button[normalize-space()='Submit']")
	WebElement submit_btn;
	
	
	
	//action methods
	
	public void enterusername(String user)
	{
		username.sendKeys(user);
	}
	
	public void enterpassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void login()
	{
		Login_btn.click();
		
	}
	
	public void newtransaction()
	{
		new_transaction.click();
		
	}
	
	public void newtransactionradio()
	{
		new_listing_radio_btn.click();
		
	}
	
	public void enter_property(String proploc)
	{
		property_location.sendKeys(proploc);
		
	}
	
	public void select_property_type()
	{
		property_type.click();
		
	}
	
	public void client_type()
	{
		client_type.click();
		
	}
	
	public void seller_name(String seller)
	{
		Seller_name.sendKeys(seller);
		
	}
	
	public void seller_email(String email)
	{
		Seller_email.sendKeys(email);
		
	}
	
	public void submit_btn()
	{
		submit_btn.click();
		
	}
	

}
