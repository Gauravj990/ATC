package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObject.tdsForm;

public class TC005_TDSform extends baseClass {

//	@Test(priority=1)
//	public void login() throws InterruptedException {
//		WebDriver driver= new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://qa-atc.valueaddsofttech.com/login");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//input[@id='my_email']")).click();
//		driver.findElement(By.xpath("//input[@id='my_email']")).sendKeys("nate@mailinator.com");
//		driver.findElement(By.xpath("//input[@placeholder='Enter password']")).click();
//		driver.findElement(By.xpath("//input[@placeholder='Enter password']")).sendKeys("Test@123");
//		Thread.sleep(3);
//		WebElement login=driver.findElement(By.xpath("//button[contains(text(),'Log In')]"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", login);
//		login.click();
//		Thread.sleep(5);
//		if(driver.findElement(By.xpath("//button[contains(text(),'+ New Transaction')]")).isDisplayed())
//		{
//			System.out.println("user loggedin successfully");
//		}
//		else {
//			System.out.println("user not logeedin");
//		}
//	}
	
	@Test
	public void tdsform() throws InterruptedException
	{
		tdsForm tds=new tdsForm(driver);
		tds.enterusername("nate@mailinator.com");
		tds.enterpassword("Test@123");
		WebElement login=driver.findElement(By.xpath("//button[contains(text(),'Log In')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", login);
		login.click();
		Thread.sleep(5);
		tds.getstarted_btn();
		System.out.println("1");
		tds.start_TDSform();
		System.out.println("2");
		tds.radiobtn_no();
		System.out.println("3");
		Thread.sleep(2);
		tds.lets_get_started_btn();
		System.out.println("4");
		tds.select_Accept_checkbox();
		tds.select_continue_btn();
		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Save & Next')]")));
		Thread.sleep(10);
		
		//part 1
		tds.question_I0();
		tds.question_I1();
		tds.question_I1_description("Test");
		tds.question_I3();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Save & Next')]")));
//		tds.Q1();
//		System.out.println("5");
//		tds.saveandnext_btn();
//		System.out.println("6");
//		//I2
//		tds.Q2();
//		System.out.println("7");
//		tds.Q2_enterdesciption("test message");
//		System.out.println("8");
//		tds.saveandnext_btn();
//		System.out.println("9");
//		//I3
//		tds.Q3();
//		System.out.println("10");
////		tds.Q3_enterdesciption("test message");
////		System.out.println("11");
		tds.saveandnext_btn();
		System.out.println("12");
		Thread.sleep(7000);
		
		//Part ii.A
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='No']")));
		tds.radiobtn_no();
		System.out.println("13");
		Thread.sleep(3);
		System.out.println("14");
		tds.A_checkbox();
//		tds.Question_exhaustfan("Test message");
//		System.out.println("17");
//		tds.Question_220volt("Test message");
//		System.out.println("18");
//		tds.Question_firepalce("Test message");
//		System.out.println("19");
//		tds.Question_gasstarter();
//		tds.Question_gasstarter_description("Test message");
//		System.out.println("20");
//		tds.Question_roofs();
//		tds.Question_roofs_description("Test message");
//		System.out.println("21");
//		tds.Question_age("22");
//		System.out.println("22");
//		Thread.sleep(7);
//		tds.Question_otheritems();
//		tds.Question_otheritems_description("Test message");
		System.out.println("15");
		WebElement Saveandnext=driver.findElement(By.xpath("//button[normalize-space()='Save & Next']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Saveandnext);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[normalize-space()='No']//input[@name='IIA']")));
		driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='IIA']")).click();
		Thread.sleep(3000);
		tds.saveandnext_btn();
//		Saveandnext.click();
//		tds.Question_exhaustfan("Test message");
//		System.out.println("17");
//		tds.Question_220volt("Test message");
//		System.out.println("18");
//		tds.Question_firepalce("Test message");
//		System.out.println("19");
//		tds.Question_gasstarter();
//		tds.Question_gasstarter_description("Test message");
//		System.out.println("20");
//		tds.Question_roofs();
//		tds.Question_roofs_description("Test message");
//		System.out.println("21");
//		tds.Question_age("22");
//		System.out.println("22");
//		Thread.sleep(7);
//		tds.Question_otheritems();
//		tds.Question_otheritems_description("Test message");
		System.out.println("23");
		Thread.sleep(4000);
		
		//Part II B
		try {
		WebElement radio=driver.findElement(By.xpath("//input[@value='No']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", radio);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='No']")));
		tds.radiobtn_no();
		System.out.println("24");
		Thread.sleep(2000);
		WebElement Saveandnext1=driver.findElement(By.xpath("//button[normalize-space()='Save & Next']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Saveandnext1);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Save & Next']")));
//		Saveandnext1.click();
		tds.saveandnext_btn();
		}
		catch(Exception e)
		{
			WebElement radio=driver.findElement(By.xpath("//input[@value='No']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", radio);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='No']")));
			radio.click();
			WebElement Saveandnext1=driver.findElement(By.xpath("//button[normalize-space()='Save & Next']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Saveandnext1);
			tds.saveandnext_btn();
			
		}
		Thread.sleep(3000);
//		System.out.println("G9");
//		try {
//			Thread.sleep(2000);
//			
//			tds.saveandnext_btn();
//			
//			
//		}
//		catch(Exception e)
//		{
//			System.out.println("stale element");
//			driver.navigate().refresh();
//			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Saveandnext);
//			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Save & Next']")));
//			Saveandnext.click();
//		}
//		Thread.sleep(8);
		//Part ii.B
		//Question B1
		
		//tds.radiobtn_no();
//		WebElement radio_B1=driver.findElement(By.xpath("//input[@value='No']"));
//		try {
//		Actions act =  new Actions(driver);
//		act.moveToElement(driver.findElement(By.xpath("//input[@value='No']"))).click().perform();
//			radio_B1.click();
//		}
//		catch(StaleElementReferenceException e)
//		{
//			radio_B1.click();
//		}
		//driver.findElement(By.xpath("//input[@value='No']")).click();
		System.out.println("25");
		
		//II.C
		try {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='No']")));
		tds.radiobtn_no();
		}
		catch(Exception e)
		{
			WebElement no=driver.findElement(By.xpath("//input[@value='No']"));
			no.click();
		}
		WebElement Saveandnext2=driver.findElement(By.xpath("//button[normalize-space()='Save & Next']"));
		Saveandnext2.click();
		System.out.println("26");
		Thread.sleep(2000);
		//C2
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='No']")));
			tds.radiobtn_no();
			}
			catch(Exception e)
			{
				WebElement no=driver.findElement(By.xpath("//input[@value='No']"));
				no.click();
			}
		WebElement Saveandnext3=driver.findElement(By.xpath("//button[normalize-space()='Save & Next']"));
		Saveandnext3.click();
		System.out.println("27");
		Thread.sleep(2000);
		//C3
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='No']")));
			tds.radiobtn_no();
			}
			catch(Exception e)
			{
				WebElement no=driver.findElement(By.xpath("//input[@value='No']"));
				no.click();
			}
		WebElement Saveandnext4=driver.findElement(By.xpath("//button[normalize-space()='Save & Next']"));
		Saveandnext4.click();
		System.out.println("28");
		Thread.sleep(3000);
		//C4
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='No']")));
			tds.radiobtn_no();
			}
			catch(Exception e)
			{
				WebElement no=driver.findElement(By.xpath("//input[@value='No']"));
				no.click();
			}
		WebElement Saveandnext5=driver.findElement(By.xpath("//button[normalize-space()='Save & Next']"));
		Saveandnext5.click();
		System.out.println("29");
		Thread.sleep(2000);
		//C5
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='No']")));
			tds.radiobtn_no();
			}
			catch(Exception e)
			{
				WebElement no=driver.findElement(By.xpath("//input[@value='No']"));
				no.click();
			}
		WebElement Saveandnext6=driver.findElement(By.xpath("//button[normalize-space()='Save & Next']"));
		Saveandnext6.click();
		System.out.println("30");
		Thread.sleep(3000);
		//C6
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='No']")));
			tds.radiobtn_no();
			}
			catch(Exception e)
			{
				WebElement no=driver.findElement(By.xpath("//input[@value='No']"));
				no.click();
			}
		WebElement Saveandnext7=driver.findElement(By.xpath("//button[normalize-space()='Save & Next']"));
		Saveandnext7.click();
		System.out.println("31");
		Thread.sleep(3000);
		//C7
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='No']")));
			tds.radiobtn_no();
			}
			catch(Exception e)
			{
				WebElement no=driver.findElement(By.xpath("//input[@value='No']"));
				no.click();
			}
		WebElement Saveandnext8=driver.findElement(By.xpath("//button[normalize-space()='Save & Next']"));
		Saveandnext8.click();
		System.out.println("32");
		Thread.sleep(3000);
		//C8
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='No']")));
			tds.radiobtn_no();
			}
			catch(Exception e)
			{
				WebElement no=driver.findElement(By.xpath("//input[@value='No']"));
				no.click();
			}
		WebElement Saveandnext9=driver.findElement(By.xpath("//button[normalize-space()='Save & Next']"));
		Saveandnext9.click();
		System.out.println("33");
		Thread.sleep(3000);
		//C9
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='No']")));
			tds.radiobtn_no();
			}
			catch(Exception e)
			{
				WebElement no=driver.findElement(By.xpath("//input[@value='No']"));
				no.click();
			}
		WebElement Saveandnext10=driver.findElement(By.xpath("//button[normalize-space()='Save & Next']"));
		Saveandnext10.click();
		System.out.println("34");
		Thread.sleep(3000);
		//C10
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='No']")));
			tds.radiobtn_no();
			}
			catch(Exception e)
			{
				WebElement no=driver.findElement(By.xpath("//input[@value='No']"));
				no.click();
			}
		WebElement Saveandnext11=driver.findElement(By.xpath("//button[normalize-space()='Save & Next']"));
		Saveandnext11.click();
		System.out.println("35");
		Thread.sleep(3000);
		//C11
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='No']")));
			tds.radiobtn_no();
			}
			catch(Exception e)
			{
				WebElement no=driver.findElement(By.xpath("//input[@value='No']"));
				no.click();
			}
		WebElement Saveandnext12=driver.findElement(By.xpath("//button[normalize-space()='Save & Next']"));
		Saveandnext12.click();
		System.out.println("36");
		Thread.sleep(3000);
		//C12
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='No']")));
			tds.radiobtn_no();
			}
			catch(Exception e)
			{
				WebElement no=driver.findElement(By.xpath("//input[@value='No']"));
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='No']")));
				no.click();
			}
		WebElement Saveandnext13=driver.findElement(By.xpath("//button[normalize-space()='Save & Next']"));
		Saveandnext13.click();
		System.out.println("37");
		Thread.sleep(3000);
		//C13
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='No']")));
			tds.radiobtn_no();
			}
			catch(Exception e)
			{
				WebElement no=driver.findElement(By.xpath("//input[@value='No']"));
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='No']")));
				no.click();
			}
		WebElement Saveandnext14=driver.findElement(By.xpath("//button[normalize-space()='Save & Next']"));
		Saveandnext14.click();
		System.out.println("38");
		Thread.sleep(3000);
		//C14
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='No']")));
			tds.radiobtn_no();
			}
			catch(Exception e)
			{
				WebElement no=driver.findElement(By.xpath("//input[@value='No']"));
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='No']")));
				no.click();
			}
		WebElement Saveandnext15=driver.findElement(By.xpath("//button[normalize-space()='Save & Next']"));
		Saveandnext15.click();
		System.out.println("39");
		Thread.sleep(3000);
		//C15
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='No']")));
			tds.radiobtn_no();
			}
			catch(Exception e)
			{
				WebElement no=driver.findElement(By.xpath("//input[@value='No']"));
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='No']")));
				no.click();
			}
		WebElement Saveandnext16=driver.findElement(By.xpath("//button[normalize-space()='Save & Next']"));
		Saveandnext16.click();
		System.out.println("40");
		Thread.sleep(3000);
		//C16
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='No']")));
			tds.radiobtn_no();
			}
			catch(Exception e)
			{
				WebElement no=driver.findElement(By.xpath("//input[@value='No']"));
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='No']")));
				no.click();
			}
		WebElement Saveandnext17=driver.findElement(By.xpath("//button[normalize-space()='Save & Next']"));
		Saveandnext17.click();
		System.out.println("41");
		Thread.sleep(3000);
		
		//Review form
		
		Thread.sleep(5);
		WebElement TDS_Done=driver.findElement(By.xpath("//button[normalize-space()='Done']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TDS_Done);
		TDS_Done.click();
		tds.Review_TDSform();
		}
	}


	

			

