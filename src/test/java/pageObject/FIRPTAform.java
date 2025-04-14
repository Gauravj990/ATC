package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FIRPTAform extends baseClass {

	public FIRPTAform(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@id='my_email']")
	WebElement username;
	
	@FindBy(xpath="//input[@placeholder='Enter password']")
	WebElement password;
	
	@FindBy(xpath="//button[normalize-space()='Log In']")
	WebElement Login_btn;
	
	@FindBy(xpath="(//button[contains(text(),'Get Started')])[1]") 
	WebElement GetStarted;
	
	@FindBy(xpath="//div[4]//div[1]//div[1]//div[1]//*[name()='svg']")
	WebElement Starthere;
	
	@FindBy(xpath="//button[normalize-space()='Start Here']")
	WebElement Startunit;
	
	@FindBy(xpath="//button[normalize-space()='Continue']")
	WebElement continue_btn;
	
	@FindBy(xpath="//input[@value='(For individual Transferors) I am not a nonresident alien for purposes of U.S. income taxation.']")
	WebElement radio_btn;
	
	@FindBy(xpath="//button[normalize-space()='Save & Next']")
	WebElement saveandnext_btn;
	
	@FindBy(xpath="//input[@name='4']")
	WebElement checkbox_btn;
	
	@FindBy(xpath="//div[contains(text(),'Social Security No., or Federal Employer Identific')]//input[contains(@id,'')]")
	WebElement SSN_number;
	
	@FindBy(xpath="//textarea[contains(@id,'')]")
	WebElement Address;
	
	@FindBy(xpath="//body//div[@id='__nuxt']//div[@class='flex flex-row justify-between']//div//div//div//div[1]//div[1]//div[1]//input[1]")
	WebElement Phone_number;
	
	@FindBy(xpath="//button[normalize-space()='Next']")
	WebElement next_btn;
	
	@FindBy(xpath="//button[normalize-space()='Done']")
	WebElement done_btn;
	
	@FindBy(xpath="//button[normalize-space()='Yes']")
	WebElement Yes_btn;
	
	
	public void enterusername(String name)
	{
		username.sendKeys(name);
	}
	
	public void enterpassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void login_btn()
	{
		Login_btn.click();
	}
	
	
	public void getstarted_btn()
	{
		GetStarted.click();
	}
	
	public void start_FIRPTAform()
	{
		Starthere.click();
	}
	
	public void start_unit()
	{
		Startunit.click();
	}
	
	
	public void click_continue_btn()
	{
		continue_btn.click();
	}
	
	public void select_radio_btn()
	{
		radio_btn.click();
	}
	
	public void saveandnext_btn()
	{
		saveandnext_btn.click();
	}
	
	public void select_checkbox()
	{
		checkbox_btn.click();
	}
	
	public void Enter_SSN_number(String SSN)
	{
		SSN_number.sendKeys(SSN);
	}
	
	public void Enter_address(String address)
	{
		Address.sendKeys(address);
	}
	
	public void Enter_phone_number(String phone)
	{
		Phone_number.sendKeys(phone);
	}
	
	
	public void click_next_btn()
	{
		next_btn.click();
	}
	
	
	public void review_form()
	{
		done_btn.click();
	}
	
	
	public void click_Yes()
	{
		Yes_btn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
