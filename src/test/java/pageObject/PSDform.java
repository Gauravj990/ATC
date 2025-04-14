package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PSDform extends baseClass {

	public PSDform(WebDriver driver) {
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
	
	@FindBy(xpath="//div[5]//div[1]//div[1]//div[1]//*[name()='svg']")
	WebElement starthere;
	
	@FindBy(xpath="//input[@id='limitationAccepted']")
	WebElement checkbox;
	
	@FindBy(xpath="//button[normalize-space()='Continue']")
	WebElement Continue_btn;
	
	@FindBy(xpath="//input[@value='Seller has been using parking space.']")
	WebElement radio_btn1;
	
	@FindBy(xpath="//textarea[@id='A_explanation']")
	WebElement explaination_textA;
	
	@FindBy(xpath="//input[@value='Seller has been using storage space.']")
	WebElement radio_btn2;
	
	@FindBy(xpath="//textarea[@id='B_explanation']")
	WebElement explaination_textB;
	
	@FindBy(xpath="//button[normalize-space()='Save & Next']")
	WebElement saveandnext_btn;
	
	
	@FindBy(xpath="//textarea[@id='C_explanation']")
	WebElement explaination_textC;
	
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
	
	public void start_PSDform()
	{
		starthere.click();
	}
	
	public void Select_checkbox()
	{
		checkbox.click();
	}
	
	public void click_continue_btn()
	{
		Continue_btn.click();
	}
	
	public void select_radio_btn1()
	{
		radio_btn1.click();
	}
	
	public void Enter_explainationtext_A(String textA)
	{
		explaination_textA.sendKeys(textA);
	}
	
	public void select_radio_btn2()
	{
		radio_btn2.click();
	}
	
	public void Enter_explainationtext_B(String textB)
	{
		explaination_textB.sendKeys(textB);
	}
	
	public void Enter_explainationtext_C(String textC)
	{
		explaination_textC.sendKeys(textC);
	}
	
	public void saveandnext_btn()
	{
		saveandnext_btn.click();
	}
	
	
	public void Review_form()
	{
		done_btn.click();
	}
	
	public void select_Yes()
	{
		Yes_btn.click();
	}
	
	
	
	
	
	
	
	

	

	
	
	

}
