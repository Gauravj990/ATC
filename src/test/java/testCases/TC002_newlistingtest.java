package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pageObject.newlisting;

public class TC002_newlistingtest extends baseClass {
	
	@Test
	public void newlistingtest()
	{
		newlisting nlw=new newlisting(driver);
		nlw.enterusername("testermail776@gmail.com");
		nlw.enterpassword("Test@1234");
		WebElement Login_btn=driver.findElement(By.xpath("//button[normalize-space()='Log In']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Login_btn);
		nlw.login();
		nlw.newtransaction();
		nlw.newtransactionradio();
		nlw.enter_property("611 west street");
		driver.findElement(By.xpath("//div[@class='search-btn']//*[name()='svg']")).click();
		driver.findElement(By.xpath("//span[@class='suggestion-text']")).click();
		
		nlw.select_property_type();
		WebElement property_type=driver.findElement(By.xpath("//select[@id='propertyType']"));
		Select propertytype=new Select(property_type);
		propertytype.selectByIndex(4);
		
		nlw.client_type();
		WebElement client_type=driver.findElement(By.xpath("//select[@id='clientType']"));
		Select clienttype=new Select(client_type);
		clienttype.selectByIndex(1);
		try{
			if(driver.findElement(By.xpath("//label[@for='entityName']")).isDisplayed())
			{
				driver.findElement(By.xpath("//input[@id='entityName']")).click();
				driver.findElement(By.xpath("//input[@id='entityName']")).sendKeys("Solitaire");
				driver.findElement(By.xpath("//input[@id='entityTitle']")).click();
				driver.findElement(By.xpath("//input[@id='entityTitle']")).sendKeys("Trustee");
			}
			}
			catch (Exception e)
			{
				nlw.seller_name("Solitaire");
			}
		nlw.seller_name("Solitaire");
		nlw.seller_email("nate@mailinator.com");
		nlw.submit_btn();
	}

}
