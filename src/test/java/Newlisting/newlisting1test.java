package Newlisting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class newlisting1test {
	WebDriver driver;
	@BeforeClass
	void Setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://qa-atc.valueaddsofttech.com/login");
		driver.manage().window().maximize();
	}

	@Test
	void newlistingtest()
	{
		newlisting1 nlw=new newlisting1(driver);
		nlw.enterusername("testermail776@gmail.com");
		nlw.enterpassword("Test@1234");
		WebElement Login_btn=driver.findElement(By.xpath("//button[normalize-space()='Log In']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Login_btn);
		nlw.login();
		nlw.newtransaction();
		nlw.newtransactionradio();
		nlw.enter_property("101 east street");
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
