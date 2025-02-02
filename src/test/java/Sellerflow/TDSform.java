package Sellerflow;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TDSform {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://qa-atc.valueaddsofttech.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='my_email']")).click();
		driver.findElement(By.xpath("//input[@id='my_email']")).sendKeys("nate@mailinator.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter password']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter password']")).sendKeys("Test@123");
		Thread.sleep(2);
		WebElement Login_btn=driver.findElement(By.xpath("//button[normalize-space()='Log In']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Login_btn);
		Login_btn.click();
		
		//Disclosure progress
		List <WebElement> element=driver.findElements(By.xpath("(//button[contains(text(),'Get Started')])"));
		int elementsize=element.size();
		System.out.println("total element size is:" +elementsize);
		if(elementsize>0)
		{
			WebElement lastElement = element.get(elementsize - 1);
            System.out.println("Last element: " + lastElement.getText());
            lastElement.click();
		}
		else {
            System.out.println("No elements found.");
        }
//		Actions actions = new Actions(driver);
//		actions.sendKeys(Keys.PAGE_DOWN).perform();
//		WebElement getstartedbtn=driver.findElement(By.xpath("//body/div/div/div/div/div/div/div/div/div/div[13]/div[2]/div[1]/button[1]"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",getstartedbtn );
//		driver.findElement(By.xpath("(//button[contains(text(),'Get Started')])[14]")).click();
		
		//start TDS form
		try {
			
			if(driver.findElement(By.xpath("//body/div/div/div/div/div/div/div/div/div/div/div/div[2]/div[1]/div[1]/span[1]")).isDisplayed())
			{
				driver.findElement(By.xpath("//body/div/div/div/div/div/div/div/div/div/div/div/div[2]/div[1]/div[1]/span[1]")).click();
			}
			}catch (Exception e2){
//				driver.findElement(By.xpath("//span[contains(text(),'%')]")).click();
				driver.findElement(By.xpath("//body/div[@id='__nuxt']/div/div[@class='relative']/div[@class='drawer drawer-end']/div[@class='drawer-content flex flex-col']/div[@class='flex bg-packed font-lexend dark:bg-gray-900']/div[@id='body-scroll']/div[@class='grow overflow-auto bg-gray-100']/div[@class='bg-[#F3F4F6] mx-[24px] mt-[15px]']/div[@class='flex flex-col mt-5']/div[@class='flex flex-col bg-white mt-5 p-5']/div[@class='flex flex-col w-full h-fit text-bold text-black rounded-lg border border-opacity-0 items-center justify-between mt-10 p-5']/div[@class='w-full flex items-center']/div[@class='w-[30%] flex items-center justify-between']/div[2]//*[name()='svg']")).click();

			}
		//Select property a duplex or triplex
		WebElement radiobtn1=driver.findElement(By.xpath("//input[@value='Yes']"));
		radiobtn1.click();
		driver.findElement(By.xpath("//input[@value='No']")).click();
		radiobtn1.click();
		if(radiobtn1.isSelected()) {
			driver.findElement(By.xpath("//span[normalize-space()='How many Units?']")).isDisplayed();
		}
		
		//Name of units
		WebElement radiobtn4=driver.findElement(By.xpath("//input[@value='1']"));
		radiobtn4.click();
		if(driver.findElement(By.xpath("//input[@placeholder='Please Enter Unit Name']")).isDisplayed())
		{
			System.out.println("Text box is displayed");

		}
		else
		{
			System.out.println("Text box is not displayed");
		}
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Solitaire");
		
		WebElement radiobtn5=driver.findElement(By.xpath("//input[@value='2']"));
		radiobtn5.click();
		if(driver.findElement(By.xpath("//input[@name='UnitName2']")).isDisplayed())
		{
			System.out.println("Text box is displayed");

		}
		else
		{
			System.out.println("Text box is not displayed");
		}
		
		WebElement radiobtn6=driver.findElement(By.xpath("//input[@value='3']"));
		radiobtn6.click();
		if(driver.findElement(By.xpath("//input[@name='UnitName3']")).isDisplayed())
		{
			System.out.println("Text box is displayed");

		}
		else
		{
			System.out.println("Text box is not displayed");
		}
		WebElement radiobtn7=driver.findElement(By.xpath("//input[@value='4']"));
		radiobtn7.click();
		if(driver.findElement(By.xpath("//input[@name='UnitName4']")).isDisplayed())
		{
			System.out.println("Text box is displayed");

		}
		else
		{
			System.out.println("Text box is not displayed");
		}
		
		driver.findElement(By.xpath("//input[@value='No']")).click();
		//radiobtn4.click();
		//driver.findElement(By.xpath("//input[@placeholder='Please Enter Unit Name']")).clear();
		//driver.findElement(By.xpath("//input[@placeholder='Please Enter Unit Name']")).sendKeys("living room");
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		
		WebElement TDSstart=driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/span[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TDSstart);
		Thread.sleep(9);
		try 
		{
		if(driver.findElement(By.xpath("*//span[contains(text(),'Start Here')])[1]")).isDisplayed());
		{
			driver.findElement(By.xpath("*//span[contains(text(),'Start Here')])[1]")).click();
		}
		}
		catch(Exception e)
		{
			driver.findElement(By.xpath("//span[contains(text(),'Start Here')])[1]")).click();
			
		}
		
		//property infirmation
		driver.findElement(By.xpath("//input[@id='limitationAccepted']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
		
		//Part 1
		driver.findElement(By.xpath("//input[@name='substitutedDisclosuresCB1']")).click();
		driver.findElement(By.xpath("//input[@name='substitutedDisclosuresCB2']")).click();
		driver.findElement(By.xpath("//textarea[@id='substitutedDisclosuresEX1_explanation']")).sendKeys("test123");
		driver.findElement(By.xpath("//input[@name='substitutedDisclosuresCB3']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		//Part 2
		driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='sellersInformationRD1']")).click();
		WebElement btn1=driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='propertyItemsExhaustFanSGasStarterAndOther']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btn1);
		btn1.click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Part 3
		driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='areYouSellerRD1']")).click();
		WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submit);
		submit.click();
		
		//Part 4
		driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='c1']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='c2']")).click();
		WebElement btn3=driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='c3']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btn3);
		btn3.click();
		driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='c4']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='c5']")).click();
		WebElement btn6=driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='c6']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btn6);
		btn6.click();
		driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='c7']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='c8']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='c9']")).click();
		WebElement btn10=driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='c10']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btn10);
		btn10.click();
		driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='c11']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='c12']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='c13']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='c14']")).click();
		WebElement btn15=driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='c15']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btn15);
		btn15.click();
		driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='c16']")).click();
		WebElement submitbtn=driver.findElement(By.xpath("//button[@type='submit']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitbtn);
		submitbtn.click();
		
		//Review form
		WebElement donebtn=driver.findElement(By.xpath("//button[normalize-space()='Done']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", donebtn);
		donebtn.click();
		
		
		
		
		
		
		
		
		
	}

}
