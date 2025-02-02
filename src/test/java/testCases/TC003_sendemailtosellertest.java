package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObject.sendemailtoseller;

public class TC003_sendemailtosellertest extends baseClass{
	
	@Test
	public void sendemailtosellertest()
	{
	sendemailtoseller se=new sendemailtoseller(driver);
	se.enterusername("testermail776@gmail.com");
	se.enterpassword("Test@1234");
	WebElement Login_btn=driver.findElement(By.xpath("//button[normalize-space()='Log In']"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Login_btn);
	se.login();
	se.selectalltransaction();
	se.selecttransaction();
	se.sendemailtosellerbtn();
	se.sendmailbtn();

	}
}
