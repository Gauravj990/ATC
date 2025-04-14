package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class sendemailtoseller extends baseClass {
	
	public sendemailtoseller(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='my_email']")
	WebElement username;
	
	@FindBy(xpath="//input[@placeholder='Enter password']")
	WebElement password;
	
	@FindBy(xpath="//button[normalize-space()='Log In']")
	WebElement Login_btn;
	
	@FindBy(xpath="//span[normalize-space()='All Transactions']")
	WebElement Alltransactions;
	
	@FindBy(xpath="//tbody/tr[1]/td[1]")
	WebElement selecttransaction;
	
	@FindBy(xpath="//button[normalize-space()='Send Email to Seller']")
	WebElement sendemailtosellerbtn;
	
	@FindBy(xpath="//button[normalize-space()='Send Email']")
	WebElement sendemailbtn;
	
	
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
	
	public void selectalltransaction()
	{
		Alltransactions.click();
	}
	
	
	public void selecttransaction()
	{
		selecttransaction.click();
	}
	
	public void sendemailtosellerbtn()
	{
		sendemailtosellerbtn.click();
	}
	
	public void sendmailbtn()
	{
		sendemailbtn.click();
	}
	
	
	
	
	
	

}
