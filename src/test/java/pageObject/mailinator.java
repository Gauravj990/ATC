package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class mailinator extends baseClass {
	
	public mailinator(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath="//input[@id='search']")
	WebElement searchbox;
	
	@FindBy(xpath="//button[normalize-space()='GO']")
	WebElement Go;
	
	@FindBy(xpath="//td[normalize-space()='testermail776@gmail.com']")
	WebElement emailinvite;
	
	@FindBy(xpath="//tbody//tr//td//div//button")
	WebElement invite;
	
	

}

