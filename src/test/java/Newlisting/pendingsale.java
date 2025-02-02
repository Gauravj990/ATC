package Newlisting;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pendingsale {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
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
		WebElement pendingsale=driver.findElement(By.xpath("//button[contains(text(),'+ New Transaction')]"));
		pendingsale.click();
		WebElement radiobtn=driver.findElement(By.xpath("//input[@value='pending_sale']"));
		radiobtn.click();
		WebElement propertylocation=driver.findElement(By.xpath("//input[@class='autocomplete-input !px-4 !py-2 !text-base !placeholder !placeholder-gray-400 !placeholder-opacity-90 disabled:bg-[#f3f4f6]']"));
		propertylocation.click();
		propertylocation.sendKeys("911 Tower St. Los Angeles, CA 90026");
		driver.findElement(By.xpath("//div[@class='search-btn']//*[name()='svg']")).click();
		driver.findElement(By.xpath("//span[@class='suggestion-text']")).click();
		String proptext=propertylocation.getText();
		String transname=driver.findElement(By.xpath("//input[@id='transactionName']")).getText();
		if(proptext.equals(transname))
				{
			System.out.println("both text entered match");
				}
		else {
			System.out.println("eneter text do not match");
		}
		
		//Select property type
		WebElement proptype=driver.findElement(By.xpath("//select[@id='propertyType']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", proptype);
		Select propertytype= new Select(proptype);
		propertytype.selectByIndex(3);
		
		//Select Seller type
		WebElement sellertype=driver.findElement(By.xpath("//select[@id='sellerType']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", sellertype);
		Select sellertypedrp= new Select(sellertype);
		sellertypedrp.selectByIndex(1);
		try{
			if(driver.findElement(By.xpath("//input[@id='sellerEntityName']")).isDisplayed())
			{
				driver.findElement(By.xpath("//input[@id='sellerEntityName']")).click();
				driver.findElement(By.xpath("//input[@id='sellerEntityName']")).sendKeys("Solitaire");
				driver.findElement(By.xpath("//input[@id='sellerEntityTitle']")).click();
				driver.findElement(By.xpath("//input[@id='sellerEntityTitle']")).sendKeys("Trustee");
			}
			}
		catch(Exception e)
		{
			
		}
		
		//Select buyer type
		WebElement buyertype=driver.findElement(By.xpath("//select[@id='buyerType']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", buyertype);
		Select buyertypedrp= new Select(buyertype);
		buyertypedrp.selectByIndex(1);
		try
		{
			if(driver.findElement(By.xpath("//input[@id='buyerEntityName']")).isDisplayed())
			{
				driver.findElement(By.xpath("//input[@id='buyerEntityName']")).click();
				driver.findElement(By.xpath("//input[@id='buyerEntityName']")).sendKeys("Solitaire");
				driver.findElement(By.xpath("//input[@id='buyerEntityTitle']")).click();
				driver.findElement(By.xpath("//input[@id='buyerEntityTitle']")).sendKeys("Trustee");
			}
		}
			catch(Exception e)
			{
								
			}
		
		WebElement buyername=driver.findElement(By.xpath("//input[@id='buyer.fullName']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", buyername);
		buyername.sendKeys("Rob Smith");

		
		WebElement buyeremail=driver.findElement(By.xpath("//input[@id='buyer.email']"));
		buyeremail.sendKeys("rob@mailinator.com");
		
		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
		
		
		//Upload documents
		
		
		WebElement uploaddoc =driver.findElement(By.xpath("//div[@class='w-full h-full']//button[@id='upload-doc']"));
		uploaddoc.click();
	    //WebElement fileInput=driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='browse files'])[2]"));
		//Thread.sleep(9);

	    //fileInput.click();
	    //Runtime.getRuntime().exec("C:\\Users\\GauravJ\\Desktop\\Autoit.exe");
		//StringSelection selection = new StringSelection("C:/Users/GauravJ/Downloads/AVID Form (1).pdf");
	     // driver.findElement(By.xpath("//button[normalize-space()='Upload 1 file']")).click();
		uploaddoc.sendKeys("C:/Users/GauravJ/DownloadsModified_TDS (4).pdf");
		Thread.sleep(9);

		//driver.findElement(By.xpath("//button[normalize-space()='Upload 1 file']")).click();
		
		
		
		
		
		

	}

}
