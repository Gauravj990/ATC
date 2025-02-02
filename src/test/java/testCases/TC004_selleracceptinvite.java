package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObject.selleracceptinvite;

public class TC004_selleracceptinvite extends baseClass {
	
	@Test
	public void selleracceptinvitetest()
	{
	selleracceptinvite si=new selleracceptinvite(driver);
	driver.get("mailinator.com");
	si.search("nate");
	si.gobtn();
	si.selectmail();
	si.acceptinvitebtn();
	si.enterusername("nate@mailinator.com");
	si.enterpassword("Test@123");
	WebElement Login_btn=driver.findElement(By.xpath("//button[normalize-space()='Log In']"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Login_btn);
	si.loginbtn();
	
		
	}

}
