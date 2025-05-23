package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObject.tdsForm;

public class TC009_CSPform extends baseClass{
	
	@Test
	public void CSPform() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		pageObject.CSPform csp=new pageObject.CSPform(driver);
		csp.enterusername("nate@mailinator.com");
		csp.enterpassword("Test@123");
		csp.login_btn();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'Get Started')])[1]")));	
		csp.getstarted_btn();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[name()='svg'][@class='cursor-pointer'])[1]")));
		try {
		
		if(driver.findElement(By.xpath("(//*[name()='svg'][@class='cursor-pointer'])[1]")).isDisplayed());
		driver.findElement(By.xpath("(//*[name()='svg'][@class='cursor-pointer'])[1]")).click();
		}
		catch(Exception E)
		{
			if(driver.findElement(By.xpath("//div[contains(text(),'%')]")).isDisplayed());
			driver.findElement(By.xpath("//div[contains(text(),'%')]")).click();
		}
		try {
		WebElement ckbox=driver.findElement(By.xpath("//input[@id='limitationAccepted']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ckbox);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='limitationAccepted']")));
		csp.select_Accept_checkbox();
		csp.select_continue_btn();
		}
		catch(Exception E) {
			System.out.println("Checkbox already selected");
		}
		Thread.sleep(2000);
		for(int i=1; i<=67; i++)
		{
			try {
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='No']")));
				csp.radiobtn_no();
				csp.savenext_btn();
				Thread.sleep(1000);
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
			if(driver.findElement(By.xpath("//input[@name='21A']")).isDisplayed())
			{
				csp.lastQuestion();
			}
			
			//Review form
			
			Thread.sleep(3000);
			
			WebElement TDS_Done=driver.findElement(By.xpath("//button[normalize-space()='Done']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TDS_Done);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Done']")));
			csp.reviewform();
		
	}

}
