package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CSPform extends baseClass {

	public CSPform(WebDriver driver) {
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
	
	@FindBy(xpath="(//span[contains(text(),'Start Here')])[1]")
	WebElement starthere;
	
	@FindBy(xpath="//input[@id='limitationAccepted']")
	WebElement accept_checkbox;
	
	@FindBy(xpath="//button[normalize-space()='Continue']")
	WebElement continue_btn;
	
	@FindBy(xpath="//button[contains(text(),'Save & Next')]")
	WebElement saveandnext_btn;
	
	@FindBy(xpath="//input[@value='Yes']")
	WebElement radiobtn_yes;
	
	@FindBy(xpath="//input[@value='No']")
	WebElement radiobtn_no;
	
	@FindBy(xpath="//input[@name='21A']")
	WebElement lastQuestion;
	
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
	
	public void start_CSPform()
	{
		starthere.click();
	}
	
	public void select_Accept_checkbox()
	{
		accept_checkbox.click();
	}
	
	public void select_continue_btn()
	{
		continue_btn.click();
	}
	
	public void radiobtn_no()
	{
		radiobtn_no.click();
		
	}
	
	public void savenext_btn()
	{
		saveandnext_btn.click();
	}
	
	public void lastQuestion()
	{
		lastQuestion.click();
	}
	
	public void reviewform() throws InterruptedException
	{
		done_btn.click();
		Thread.sleep(3000);
		Yes_btn.click();
	}

}
