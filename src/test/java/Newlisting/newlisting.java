package Newlisting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import dev.failsafe.internal.util.Assert;

public class newlisting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://qa-atc.valueaddsofttech.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='my_email']")).click();
		driver.findElement(By.xpath("//input[@id='my_email']")).sendKeys("testermail776@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter password']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter password']")).sendKeys("Test@1234");
		Thread.sleep(3);
		WebElement login=driver.findElement(By.xpath("//button[contains(text(),'Log In')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", login);
		login.click();
		
		//Create new transaction
		WebElement newtransaction=driver.findElement(By.xpath("//button[contains(text(),'+ New Transaction')]"));
		newtransaction.click();
		WebElement radiobtn=driver.findElement(By.xpath("//input[@value='new_listing']"));
		radiobtn.click();
		WebElement propertylocation=driver.findElement(By.xpath("//input[@class='autocomplete-input !px-4 !py-2 !text-base !placeholder !placeholder-gray-400 !placeholder-opacity-90 disabled:bg-[#f3f4f6]']"));
		propertylocation.click();
		propertylocation.sendKeys("888 Ridgewood Dr.Cupertino, CA 95014");
		driver.findElement(By.xpath("//div[@class='search-btn']//*[name()='svg']")).click();
		driver.findElement(By.xpath("//span[@class='suggestion-text']")).click();
		String transname=driver.findElement(By.xpath("//input[@id='transactionName']")).getText();
//		if(proptext.equals(transname))
//				{
//			System.out.println("both text entered match");
//				}
//		else {
//			System.out.println("eneter text do not match");
//		}
		
		
		WebElement propertytype= driver.findElement(By.xpath("//select[@id='propertyType']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", propertytype);
		Select proptype=new Select(propertytype);
		proptype.selectByIndex(4);
		
		WebElement Clienttype= driver.findElement(By.xpath("//select[@id='clientType']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Clienttype);

		Select clienttype=new Select(Clienttype);
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
			WebElement nameseller1=driver.findElement(By.xpath("//input[@id='seller.fullName']"));
			nameseller1.click();
			nameseller1.sendKeys("Nate Williams");
		}
		WebElement nameseller1=driver.findElement(By.xpath("//input[@id='seller.fullName']"));
		nameseller1.click();
		nameseller1.sendKeys("Nate Williams");
			
		
		
		
		
		WebElement emailseller1=driver.findElement(By.xpath("//input[@id='seller.email']"));
		emailseller1.click();
		emailseller1.sendKeys("nate@mailinator.com");
		
		WebElement addsellerbtn=driver.findElement(By.xpath("//button[contains(text(),'+ Add Seller')]"));
		addsellerbtn.click();
		
		WebElement Submitbtn=driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
		Submitbtn.click();
		
		String currenturl=driver.getCurrentUrl();
		String expectedurl="https://qa-atc.valueaddsofttech.com/transaction-overview";

//		if(actualurl.equals(expectedurl))
//		{
//			System.out.println("Test passed");
//		}
//		else {
//			System.out.println("test failed");
//		}


	}

}
