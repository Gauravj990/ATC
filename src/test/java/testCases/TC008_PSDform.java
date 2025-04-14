package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TC008_PSDform extends baseClass {
	
	@Test
	public void PSDform() throws InterruptedException 
	{
		WebDriverWait wait= new WebDriverWait (driver,Duration.ofSeconds(20));
		pageObject.PSDform psd=new pageObject.PSDform(driver);
		psd.enterusername("nate@mailinator.com");
		psd.enterpassword("Test@123");
		psd.login_btn();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'Get Started')])[1]")));
		psd.getstarted_btn();
		WebElement psdform=driver.findElement(By.xpath("//span[normalize-space()='[PSD] Parking And Storage Disclosure']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", psdform);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[5]//div[1]//div[1]//div[1]//*[name()='svg']")));
		psd.start_PSDform();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='limitationAccepted']")));
		psd.Select_checkbox();
		psd.click_continue_btn();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Seller has been using parking space.']")));
		psd.select_radio_btn1();
		psd.Enter_explainationtext_A("Test message");
		Thread.sleep(1000);
		psd.select_radio_btn2();
		psd.Enter_explainationtext_B("Test message");
		Thread.sleep(1000);
		WebElement save_btn=driver.findElement(By.xpath("//button[normalize-space()='Save & Next']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", save_btn);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Save & Next']")));
		psd.saveandnext_btn();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='C_explanation']")));
		psd.Enter_explainationtext_C("Test message");
		psd.saveandnext_btn();
		WebElement done_btn=driver.findElement(By.xpath("//button[normalize-space()='Done']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", done_btn);
		psd.Review_form();
		psd.select_Yes();
		
		
		
		
		
	}

}

