package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObject.selleracceptinvite;

public class TC004_selleracceptinvite {
	
	public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https:mailinator.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='search']")).click();
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("nate");
	driver.findElement(By.xpath("//button[contains(text(),'GO')]")).click();
	driver.findElement(By.xpath("//td[normalize-space()='testermail776@gmail.com']")).click();
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//tbody//tr//td//div//button")).click();
	String winhandle = driver.getWindowHandle();

	// Switch to new window opened
	for(String winHandle : driver.getWindowHandles())
	{
	    driver.switchTo().window(winHandle);
	}
	driver.findElement(By.xpath("//input[@id='my_email']")).click(); 
	driver.findElement(By.xpath("//input[@id='my_email']")).sendKeys("nate@mailinator.com");
	driver.findElement(By.xpath("//input[@placeholder='Enter password']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Enter password']")).sendKeys("Test@123");
	Thread.sleep(3);
	WebElement sellerlogin=driver.findElement(By.xpath("//button[contains(text(),'Log In')]"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", sellerlogin);
	sellerlogin.click();

	
//	@Test(priority=1)
//	public void launchmailinator()
//	{
//		driver.get("mailinator.com");
//	}
//	
//	@Test(priority=2)
//	public void selleracceptinvitetest()
//	{
//	selleracceptinvite si=new selleracceptinvite(driver);
//	//driver.get("mailinator.com");
//	si.search("nate");
//	si.gobtn();
//	si.selectmail();
//	si.acceptinvitebtn();
//	si.enterusername("nate@mailinator.com");
//	si.enterpassword("Test@123");
//	WebElement Login_btn=driver.findElement(By.xpath("//button[normalize-space()='Log In']"));
//	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Login_btn);
//	si.loginbtn();
//	
//		
	}

}
