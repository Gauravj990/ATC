package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SPQform {

WebDriver driver;
	
	//constructor
	public SPQform(WebDriver driver)
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
	
	//@FindBy(xpath="//button[contains(text(),'Get Started')])[1]")
	//WebElement getStarted;
	
	@FindBy(xpath="(//button[contains(text(),'Get Started')])[1]") 
	WebElement GetStarted;
	
	//@FindBy(xpath="(//span[contains(text(),'Start Here')])[2]")
	@FindBy(xpath="//div[3]//div[1]//div[1]//div[1]//*[name()='svg']")
	WebElement starthere;
	
	@FindBy(xpath="//button[contains(text(),'Let’s Get Started!')]")
	WebElement Letsgetstarted;
	
	
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

	@FindBy(xpath="//input[@name='19B']")
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
	
	public void getstarted_btn()
	{
		GetStarted.click();
	}
	
	public void start_SPQform()
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
	
	public void radiobtn_yes()
	{
		radiobtn_yes.click();
		
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
