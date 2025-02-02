package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class selleracceptinvite extends baseClass {
	
	public selleracceptinvite(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath="//input[@id='search']")
	WebElement searchbox;
	
	@FindBy(xpath="//button[contains(text(),'GO')]")
	WebElement gobtn;
	
	@FindBy(xpath="//td[normalize-space()='testermail776@gmail.com']")
	WebElement selectmail;
	
	@FindBy(xpath="//tbody//tr//td//div//button")
	WebElement selectaccept;
	
	@FindBy(xpath="//input[@id='my_email']")
	WebElement enteremail;
	
	@FindBy(xpath="//input[@placeholder='Enter password']")
	WebElement enterpassword;
	
	@FindBy(xpath="//button[contains(text(),'Log In')]")
	WebElement loginbtn;
	
	@FindBy(xpath="(//button[contains(text(),'Get Started')])")
	WebElement getstartedbtn;
	
	
	public void search(String name)
	{
		searchbox.sendKeys(name);
	}
	
	public void gobtn()
	{
		gobtn.click();
	}
	
	public void selectmail()
	{
		selectmail.click();
	}
	
	public void acceptinvitebtn()
	{
		selectaccept.click();
	}
	
	public void enterusername(String email)
	{
		enteremail.sendKeys(email);
	}
	
	public void enterpassword(String pwd)
	{
		enterpassword.sendKeys(pwd);
	}
	
	public void loginbtn()
	{
		loginbtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	

}
