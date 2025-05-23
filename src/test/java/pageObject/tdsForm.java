package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tdsForm  {
	
WebDriver driver;
	
	//constructor
	public tdsForm(WebDriver driver)
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
	
	@FindBy(xpath="//input[@value='I-0']")
	WebElement checkbox1;
	
	@FindBy(xpath="//input[@value='I-1']")
	WebElement checkbox2;
	
	@FindBy(xpath="//input[@id='I_text']")
	WebElement description_I1;
	
	@FindBy(xpath="//input[@value='I-2']")
	WebElement checkbox3;
	
	
	@FindBy(xpath="//button[contains(text(),'Save & Next')]")
	WebElement saveandnext_btn;
	
	@FindBy(xpath="//div[contains(text(),'Interior Walls')]")
	WebElement checkbox;
	
	@FindBy(xpath="//input[@name='I1']")
	WebElement Q1;
	
	@FindBy(xpath="//input[@name='I2']")
	WebElement Q2;
	
	@FindBy(xpath="//textarea[@id='I2_explanation']")
	WebElement Q2_description;
	
	@FindBy(xpath="//input[@name='I3']")
	WebElement Q3;
	
	@FindBy(xpath="//textarea[@id='I3_explanation']")
	WebElement Q3_description;
	
	@FindBy(xpath="//input[@value='Range-0']")
	WebElement A_checkbox;
	
	@FindBy(xpath="//input[@id='exhaustFansIn_text']")
	WebElement exhaust_fan;
	
	@FindBy(xpath="//input[@id='wiringIn_text']")
	WebElement voltwiring;
	
	@FindBy(xpath="//input[@id='fireplacesIn_text']")
	WebElement firepalce;
	
	@FindBy(xpath="//input[@name='gasStarter']")
	WebElement gasstarter;
	
	@FindBy(xpath="//input[@id='gasStarter_text']")
	WebElement gasstarter_description;
	
	@FindBy(xpath="//input[@name='roofsType']")
	WebElement roofs;
	
	@FindBy(xpath="//input[@id='roofsType_text']")
	WebElement roofs_description;
	
	@FindBy(xpath="//input[@id='age_text']")
	WebElement age;
	
	@FindBy(xpath="//input[@name='otherItems']")
	WebElement others;
	
	@FindBy(xpath="//input[@id='otherItems_text']")
	WebElement others_description;
	
	@FindBy(xpath="//button[normalize-space()='Yes']")
	WebElement Reviewform;
	
	
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
	
	public void question_I0()
	{
		checkbox1.click();
	}
	
	public void question_I1()
	{
		checkbox2.click();
	}
	
	public void question_I1_description(String description)
	{
		description_I1.sendKeys(description);
	}
	
	public void question_I3()
	{
		checkbox3.click();
	}
	
	
	public void Q1()
	{
		Q1.click();
		
	}
	
	public void saveandnext_btn()
	{
		saveandnext_btn.click();
	}
	
	public void Q2()
	{
		Q2.click();
	}
	
	
	
	public void Q2_enterdesciption(String description)
	{
		Q2_description.sendKeys(description);
	}
	
	public void Q3()
	{
		Q3.click();
		
	}
	
	public void Q3_enterdesciption(String description)
	{
		Q3_description.sendKeys(description);
		
	}
	
	public void A_checkbox()
	{
		A_checkbox.click();
		
	}
	
	public void Question_exhaustfan(String message)
	{
		exhaust_fan.sendKeys(message);
		saveandnext_btn.click();
	}
	
	public void Question_220volt(String message)
	{
		voltwiring.sendKeys(message);
		saveandnext_btn.click();
	}
	
	public void Question_firepalce(String message)
	{
		firepalce.sendKeys(message);
		saveandnext_btn.click();
	}
	
	public void Question_gasstarter()
	{
		gasstarter.click();;
	}
	
	public void Question_gasstarter_description(String message)
	{
		gasstarter.sendKeys(message);
		saveandnext_btn.click();
	}
	
	public void Question_roofs()
	{
		roofs.click();
	}
	
	public void Question_roofs_description(String message)
	{
		roofs.sendKeys(message);
		saveandnext_btn.click();
	}
	
	public void Question_age(String message)
	{
		age.sendKeys(message);
		saveandnext_btn.click();
	}
	
	
	
	public void Question_otheritems()
	{
		others.click();
	}
	
	public void Question_otheritems_description(String message)
	{
		others.sendKeys(message);
		saveandnext_btn.click();
	}
	
	public void Review_TDSform()
	{
		Reviewform.click();;
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
	
	
	
}

