package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObject.FIRPTAform;

public class TC007_FIRPTAform extends baseClass {
	
	@Test
	public void FIRPTAform() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		FIRPTAform fir=new FIRPTAform(driver);
		fir.enterusername("nate@mailinator.com");
		fir.enterpassword("Test@123");
		fir.login_btn();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'Get Started')])[1]")));
		fir.getstarted_btn();
		WebElement start=driver.findElement(By.xpath("//div[4]//div[1]//div[1]//div[1]//*[name()='svg']//*[name()='path' and contains(@d,'M1.24023 0')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", start);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[4]//div[1]//div[1]//div[1]//*[name()='svg']//*[name()='path' and contains(@d,'M1.24023 0')]")));
		fir.start_FIRPTAform();
		fir.start_unit();
		
		//part 1-2
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Continue']")));
		fir.click_continue_btn();
		
		//part 3
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='(For individual Transferors) I am not a nonresident alien for purposes of U.S. income taxation.']")));
		fir.select_radio_btn();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Save & Next']"))); 
		fir.saveandnext_btn();
		
		//part 4-5
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='4']")));
		fir.select_checkbox();
		WebElement txt_box=driver.findElement(By.xpath("//div[contains(text(),'Social Security No., or Federal Employer Identific')]//input[contains(@id,'')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txt_box);
		fir.Enter_SSN_number("1234");
		fir.Enter_address("Test message");
		fir.Enter_phone_number("6545435444");
		fir.saveandnext_btn();
		
		//part 6
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Next']")));
		fir.click_next_btn();
		
		//review form
		WebElement FIRPTA_Done=driver.findElement(By.xpath("//button[normalize-space()='Done']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", FIRPTA_Done);
		wait.until(ExpectedConditions.elementToBeClickable(FIRPTA_Done));
		fir.review_form();
		Thread.sleep(1000);
		fir.click_Yes();
		

		
	}

}
