package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VLQform {
	WebDriver driver;

	
	public VLQform(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
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
	
	@FindBy(xpath="//input[@value='Yes']")
	WebElement radiobtn_yes;
	
	@FindBy(xpath="//input[@value='No']")
	WebElement radiobtn_no;
	
	@FindBy(xpath="//button[contains(text(),'Let’s Get Started!')]")
	WebElement Letsgetstarted;
	
	@FindBy(xpath="//input[@id='limitationAccepted']")
	WebElement accept_checkbox;
	
	@FindBy(xpath="//button[normalize-space()='Continue']")
	WebElement continue_btn;
	
	@FindBy(xpath="//button[normalize-space()='Yes']")
	WebElement Reviewform;
	
	@FindBy(xpath="//button[contains(text(),'Save & Next')]")
	WebElement saveandnext_btn;
	
	@FindBy(xpath="//input[@name='17A']")
	WebElement lastQuestion;
	
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
	
	public void start_TDSform()
	{
		starthere.click();
	}
	
	public void lets_get_started_btn()
	{
		Letsgetstarted.click();
	}
	
	public void select_Accept_checkbox()
	{
		accept_checkbox.click();
	}
	
	public void select_continue_btn()
	{
		continue_btn.click();
	}
	
	public void saveandnext_btn()
	{
		saveandnext_btn.click();
	}
	
	public void radiobtn_yes()
	{
		radiobtn_yes.click();
		
	}
	
	public void radiobtn_no()
	{
		radiobtn_no.click();
		
	}
	
	public void lastQuestion()
	{
		lastQuestion.click();
	}
	

}
