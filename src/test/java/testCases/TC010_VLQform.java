package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObject.VLQform;

public class TC010_VLQform extends baseClass {
	@Test
	public void VLQform() throws InterruptedException
	{
	
	VLQform vlq=new VLQform(driver);
	vlq.enterusername("nate@mailinator.com");
	vlq.enterpassword("Test@123");
	vlq.login_btn();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'Get Started')])[1]")));	
	vlq.getstarted_btn();
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
	vlq.select_Accept_checkbox();
	vlq.select_continue_btn();
	}
	catch(Exception E) {
		System.out.println("Checkbox already selected");
	}
	Thread.sleep(2000);
	for(int i=1; i<=47; i++)
	{
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='No']")));
			vlq.radiobtn_no();
			vlq.saveandnext_btn();
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
	if(driver.findElement(By.xpath("//input[@name='17A']")).isDisplayed())
	{
		vlq.lastQuestion();
	}

}
}
