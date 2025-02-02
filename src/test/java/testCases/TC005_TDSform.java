package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
		Thread.sleep(10);
		//I1
		tds.Q1();
		System.out.println("5");
		tds.saveandnext_btn();
		System.out.println("6");
		//I2
		tds.Q2();
		System.out.println("7");
		tds.Q2_enterdesciption("test message");
		System.out.println("8");
		tds.saveandnext_btn();
		System.out.println("9");
		//I3
		tds.Q3();
		System.out.println("10");
//		tds.Q3_enterdesciption("test message");
//		System.out.println("11");
		tds.saveandnext_btn();
		System.out.println("12");
		Thread.sleep(10);
		//Question ii.A
		tds.radiobtn_no();
		System.out.println("13");
		tds.saveandnext_btn();
		Thread.sleep(3);
		System.out.println("14");
		tds.A_checkbox();
		System.out.println("15");
		WebElement Saveandnext=driver.findElement(By.xpath("//button[normalize-space()='Save & Next']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Saveandnext);
		Saveandnext.click();
		System.out.println("16");
		tds.Question_exhaustfan("Test message");
		System.out.println("17");
		tds.Question_220volt("Test message");
		System.out.println("18");
		tds.Question_firepalce("Test message");
		System.out.println("19");
		tds.Question_gasstarter();
		tds.Question_gasstarter_description("Test message");
		System.out.println("20");
		tds.Question_roofs();
		tds.Question_roofs_description("Test message");
		System.out.println("21");
		tds.Question_age("22");
		System.out.println("22");
		Thread.sleep(7);
		tds.Question_otheritems();
		tds.Question_otheritems_description("Test message");
		System.out.println("23");
		Thread.sleep(5);
		tds.radiobtn_no();
		System.out.println("24");
		Thread.sleep(3);
		driver.findElement(By.xpath("//button[normalize-space()='Save & Next']")).click();
		System.out.println("G9");
//		try {
//		Saveandnext.click();
//		}
//		catch(Exception e)
//		{
//			System.out.println("stale element");
//			Saveandnext.click();
//		}
//		System.out.println("25");
		Thread.sleep(7);
		//ii.B
		//Question B1
		try {
		tds.radiobtn_no();
		WebElement Saveandnext1=driver.findElement(By.xpath("//button[normalize-space()='Save & Next']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Saveandnext);
		Saveandnext1.click();
		
		//II.C
		tds.radiobtn_no();
		Saveandnext.click();
		//C2
		tds.radiobtn_no();
		Saveandnext.click();
		//C3
		tds.radiobtn_no();
		Saveandnext.click();
		//C4
		tds.radiobtn_no();
		Saveandnext.click();
		//C5
		tds.radiobtn_no();
		Saveandnext.click();
		//C6
		tds.radiobtn_no();
		Saveandnext.click();
		//C7
		tds.radiobtn_no();
		Saveandnext.click();
		//C8
		tds.radiobtn_no();
		Saveandnext.click();
		//C9
		tds.radiobtn_no();
		Saveandnext.click();
		//C10
		tds.radiobtn_no();
		Saveandnext.click();
		//C11
		tds.radiobtn_no();
		Saveandnext.click();
		//C12
		tds.radiobtn_no();
		Saveandnext.click();
		//C13
		tds.radiobtn_no();
		Saveandnext.click();
		//C14
		tds.radiobtn_no();
		Saveandnext.click();
		//C15
		tds.radiobtn_no();
		Saveandnext.click();
		//C16
		tds.radiobtn_no();
		Saveandnext.click();
		
		
		Thread.sleep(5);
		WebElement TDS_Done=driver.findElement(By.xpath("//button[normalize-space()='Done']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TDS_Done);
		TDS_Done.click();
		tds.Review_TDSform();
		
	}
			
}
