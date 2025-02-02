package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class userregistration extends baseClass {
	
	public userregistration(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[normalize-space()='Sign up']")
	WebElement signup;
	
	@FindBy(xpath="//input[@placeholder='Enter Full Name']")
	WebElement fullname;
	
	@FindBy(xpath="//input[@placeholder='Enter Email']")
	WebElement email;
	
	@FindBy(xpath="//input[@placeholder='Enter Password']")
	WebElement password;
	
	@FindBy(xpath="//input[@placeholder='Confirm Password']")
	WebElement confirmpassword;
	
	@FindBy(xpath="//input[@value='Agent']")
	WebElement agentradiobtn;
	
	@FindBy(xpath="//input[@value='TC']")
	WebElement TCradiobtn;
	
	@FindBy(xpath="//input[@placeholder='Enter Cellphone No.']")
	WebElement cellphone;
	
	@FindBy(xpath="//button[normalize-space()='Sign Up']")
	WebElement submitbtn;
	
	
	public void clicksignupbtn()
	{
		signup.click();
	}
	
	public void enterfullname(String name)
	{
		fullname.sendKeys(name);
	}
	
	public void enteremail(String mail)
	{
		email.sendKeys(mail);
	}
	
	public void enterpassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void enterconfirmpassword(String cpwd)
	{
		confirmpassword.sendKeys(cpwd);
	}
	
	public void selectagentradiobtn()
	{
		agentradiobtn.click();
	}
	
	public void selectTCradiobtn()
	{
		TCradiobtn.click();
	}
	
	
	public void entercellphone(String phone)
	{
		cellphone.sendKeys(phone);
	}
	
	public void selectsubmitbtn()
	{
		submitbtn.click();
	}
	
	
	
	
	
	
	

}









