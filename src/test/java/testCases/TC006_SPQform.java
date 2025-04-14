package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObject.SPQform;
import pageObject.tdsForm;

public class TC006_SPQform extends baseClass{
	
	@Test
	public void spqform() throws InterruptedException
	{
		
		SPQform spq=new SPQform(driver);
		spq.enterusername("nate@mailinator.com");
		spq.enterpassword("Test@123");
		WebElement login=driver.findElement(By.xpath("//button[contains(text(),'Log In')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", login);
		login.click();
		Thread.sleep(5);
		spq.getstarted_btn();
		try {
			
			if(driver.findElement(By.xpath("//div[3]//div[1]//div[1]//div[1]//*[name()='svg']")).isDisplayed())
			{
				driver.findElement(By.xpath("//div[3]//div[1]//div[1]//div[1]//*[name()='svg']")).click();
			}
			}catch (Exception e2){
//				driver.findElement(By.xpath("//span[contains(text(),'%')]")).click();
				driver.findElement(By.xpath("//div[3]//div[1]//div[1]//div[2]//*[name()='svg']")).click();

			}
		System.out.println("1");
		//spq.start_SPQform();
		System.out.println("2");
		spq.radiobtn_no();
		System.out.println("3");
		Thread.sleep(2000);
		spq.lets_get_started_btn();
		System.out.println("4");
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		try {
		WebElement ckbox=driver.findElement(By.xpath("//input[@id='limitationAccepted']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ckbox);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='limitationAccepted']")));
		spq.select_Accept_checkbox();
		spq.select_continue_btn();
		}
		catch(Exception e) {
			System.out.println("Limitation already accepted");
		}
		Thread.sleep(5000);
		for(int i=1; i<=73;i++)
		{
			try {
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='No']")));
				spq.radiobtn_no();
				spq.savenext_btn();
				}
				catch(Exception E)
				{
					WebElement no=driver.findElement(By.xpath("//input[@value='No']"));
					wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='No']")));
					no.click();
					WebElement Saveandnext= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Save & Next')]")));
					Saveandnext.click();
				}
		
			
			Thread.sleep(3000);
		}
		if(driver.findElement(By.xpath("//input[@name='19B']")).isDisplayed())
		{
			spq.lastQuestion();
			Thread.sleep(1000);
			spq.savenext_btn();
		}
		
		//Review form
		
				Thread.sleep(3000);
				
				WebElement TDS_Done=driver.findElement(By.xpath("//button[normalize-space()='Done']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TDS_Done);
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Done']")));
				spq.reviewform();
			
	}
	}

