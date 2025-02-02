package Avidform;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class avidform {

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
		
		//All transaction
		driver.findElement(By.xpath("//span[contains(text(),'All Transactions')]")).click();
		driver.findElement(By.xpath("//tbody//td[2]")).click();
		
		//Avid form
		driver.findElement(By.xpath("//button[normalize-space()='+ Add AVID']")).click();
		WebElement radiobtn1=driver.findElement(By.xpath("//input[@value='procasaWorkflow']"));
		radiobtn1.click();
		WebElement radiobtn2=driver.findElement(By.xpath("//input[@value='direct']"));
		radiobtn2.click();
		radiobtn1.click();
		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
		
		//Select property a duplex or triplex
		WebElement radiobtn3=driver.findElement(By.xpath("//input[@value='true']"));
		radiobtn3.click();
		driver.findElement(By.xpath("//input[@value='false']")).click();
		radiobtn3.click();
		if(radiobtn3.isSelected()) {
			driver.findElement(By.xpath("//label[contains(text(),'Will you provide all the information on 1 AVID?')]")).isDisplayed();	
			}
		driver.findElement(By.xpath("(//input[@value='false'])[2]")).click();
		driver.findElement(By.xpath("(//input[@value='true'])[2]")).click();
		if(driver.findElement(By.xpath("(//input[@value='true'])[2]")).isSelected())
		{
			driver.findElement(By.xpath("//label[contains(text(),'How many AVID’s are needed for this property?')]")).isDisplayed();
		}
//		if(radiobtn3.isSelected()) {
//			driver.findElement(By.xpath("//label[contains(text(),'How many AVID’s are needed for this property?')]")).isDisplayed();
//		}
//		
		//Select how many Avids required
		WebElement radiobtn4=driver.findElement(By.xpath("//input[@value='2']"));
		radiobtn4.click();
		if(driver.findElement(By.xpath("//label[normalize-space()='Unit 2']")).isDisplayed())
		{
			System.out.println("Text box is displayed");

		}
		else
		{
			System.out.println("Text box is not displayed");
		}
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Solitaire");
		
		WebElement radiobtn5=driver.findElement(By.xpath("//input[@value='3']"));
		radiobtn5.click();
		if(driver.findElement(By.xpath("//label[normalize-space()='Unit 3']")).isDisplayed())
		{
			System.out.println("Text box is displayed");

		}
		else
		{
			System.out.println("Text box is not displayed");
		}
		
		WebElement radiobtn6=driver.findElement(By.xpath("//input[@value='4']"));
		radiobtn6.click();
		if(driver.findElement(By.xpath("//label[normalize-space()='Unit 4']")).isDisplayed())
		{
			System.out.println("Text box is displayed");

		}
		driver.findElement(By.xpath("(//input[@value='false'])[2]")).click();
//		else
//		{
//			System.out.println("Text box is not displayed");
//		}
//		WebElement radiobtn7=driver.findElement(By.xpath("//input[@value='4']"));
//		radiobtn7.click();
//		if(driver.findElement(By.xpath("//label[normalize-space()='Unit 4']")).isDisplayed())
//		{
//			System.out.println("Text box is displayed");
//
//		}
//		else
//		{
//			System.out.println("Text box is not displayed");
//		}
		
		//Do you requore single avid form
//		driver.findElement(By.xpath("(//input[@value='true'])[2]")).click();
		
		try {
		if(driver.findElement(By.xpath("//h3[normalize-space()='Remove AVID Data']")).isDisplayed())
		{
			driver.findElement(By.xpath("//button[normalize-space()='Yes']")).click();
		}
		}
		catch(Exception e)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
		}

		
		
		//Enter brokerage name and generate form
		driver.findElement(By.xpath("//input[@placeholder='Enter Brokerage Name']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Brokerage Name']")).sendKeys("Solitiare");
		//driver.findElement(By.xpath("//button[normalize-space()='Generate Form']")).click();
		
		driver.findElement(By.xpath("(//button[@class='text-[#0000FE] rounded-md w-[84px] h-[36px] bg-white border-2 border-[#0000FE] outline-none'][normalize-space()='+ Add'])[1]")).click();
		driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/div[23]/div[1]/div[2]/textarea[1]")).click();
		driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/div[23]/div[1]/div[2]/textarea[1]")).sendKeys("Test message");
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		
		//Not applicable Toggle button
		WebElement togglebtn=driver.findElement(By.xpath("//div[@class='flex justify-between']//label[@class='flex items-center cursor-pointer select-none text-dark dark:text-white']"));
		togglebtn.click();
		if(togglebtn.isSelected())
		{
			System.out.println("The tolggle is selected (On)");
		}
		else
		{
			System.out.println("The toggle is not selected (Off)");

		}
		//driver.findElement(By.xpath("//div[@class='flex justify-between']//label[@class='flex items-center cursor-pointer select-none text-dark dark:text-white']")).click();

		

		
		

		
}
}
