package testCases;

import java.time.Duration;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObject.userregistration;

public class TC001_userregistrationtest extends baseClass {
	
	
	@Test
	public void userregistrationtest() throws InterruptedException
	{
		
		userregistration ur=new userregistration(driver);
		WebElement signup=driver.findElement(By.xpath("//a[normalize-space()='Sign up']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", signup);
		ur.clicksignupbtn();
		ur.enterfullname("Tom Hardy");
		ur.enteremail(randomemail()+"@mailinator.com");
		ur.enterpassword("Test@123");
		ur.enterconfirmpassword("Test@123");
		ur.entercellphone("8788042263");
		ur.selectagentradiobtn();
		ur.selectTCradiobtn();
		ur.selectagentradiobtn();
		ur.selectsubmitbtn();
		Thread.sleep(2);
		String Toasttext=driver.findElement(By.xpath("//div[@class='Toastify']")).getText();
		System.out.println(Toasttext);
		//Assert.assertEquals("Sign Up successful! You can now login", Toasttext.toLowerCase());
		Assert.assertEquals(Toasttext, Toasttext.toLowerCase());
		
	}
	
	
}
