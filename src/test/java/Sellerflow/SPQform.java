package Sellerflow;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SPQform {

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
		Thread.sleep(3);
		WebElement sellerlogin=driver.findElement(By.xpath("//button[contains(text(),'Log In')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", sellerlogin);
		sellerlogin.click();
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
		
		
		
		
		//Start SPQ form
		try {
			
		if(driver.findElement(By.xpath("//div[3]//div[1]//div[1]//div[1]//*[name()='svg']")).isDisplayed())
		{
			driver.findElement(By.xpath("//div[3]//div[1]//div[1]//div[1]//*[name()='svg']")).click();
		}
		}catch (Exception e2){
//			driver.findElement(By.xpath("//span[contains(text(),'%')]")).click();
			driver.findElement(By.xpath("//body/div[@id='__nuxt']/div/div[@class='relative']/div[@class='drawer drawer-end']/div[@class='drawer-content flex flex-col']/div[@class='flex bg-packed font-lexend dark:bg-gray-900']/div[@id='body-scroll']/div[@class='grow overflow-auto bg-gray-100']/div[@class='bg-[#F3F4F6] mx-[24px] mt-[15px]']/div[@class='flex flex-col mt-5']/div[@class='flex flex-col bg-white mt-5 p-5']/div[@class='flex flex-col w-full h-fit text-bold text-black rounded-lg border border-opacity-0 items-center justify-between mt-10 p-5']/div[@class='w-full flex items-center']/div[@class='w-[30%] flex items-center justify-between']/div[2]//*[name()='svg']")).click();

		}
		//driver.findElement(By.xpath("//div[3]//div[1]//div[1]//div[1]//*[name()='svg']")).click();
		
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
				radiobtn4.click();
				driver.findElement(By.xpath("//input[@placeholder='Please Enter Unit Name']")).clear();
				driver.findElement(By.xpath("//input[@placeholder='Please Enter Unit Name']")).sendKeys("living room");
				driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
				WebElement SPQstart=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SPQstart);
//				try {
//				if(SPQstart.isDisplayed())
//				{
//					SPQstart.click();
//					
//				}				}
//				catch (Exception E)
//				{
//					driver.findElement(By.xpath("//div[@class='flex flex-col w-full h-fit text-bold text-black items-center justify-between']//div[2]//*[name()='svg']")).click();
//				}
				SPQstart.click();
				Thread.sleep(5);
				WebElement checkbox=driver.findElement(By.xpath("//input[@id='limitationAccepted']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkbox);
				checkbox.click();
				driver.findElement(By.xpath("(//button[@class='w-[161px] h-[44px] bg-[#0A3CEB] rounded-[4px] text-white mt-4'])[1]")).click();
				
				//move focus to part 5 of the SPQ form
				WebElement part5=driver.findElement(By.xpath("//body/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/button[1]"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", part5);
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='areYouSellerAwareOf']")).click();
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				
			//SPQ form part 6
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='aWithinTheLast3YearsTheDeath']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='test']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='6C']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='6D']")).click();
				WebElement scroll=driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='6E']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll);
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='6E']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='6F']")).click();
				WebElement scroll1=driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='6G']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll1);
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='6G']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='6H']")).click();
				WebElement scroll2=driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='6I']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll2);
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='6I']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='6J']")).click();
				WebElement scroll3=driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='6K']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll3);
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='6K']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='6L']")).click();
				WebElement scrollsubmit6=driver.findElement(By.xpath("//button[@type='submit']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollsubmit6);
				scrollsubmit6.click();
				
				//SPQ form part 7
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='anyAlterations']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='B']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='6C']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='6D']")).click();
				WebElement scroll4=driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='6E']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll4);
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='6E']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='ESUBONE']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='ESUBTWO']")).click();
				WebElement scroll5=driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='F']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll5);
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='F']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='FSUBONE']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='ESUBTWO']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='ESUBTWO']")).click();
				WebElement scrollsubmit7=driver.findElement(By.xpath("//button[@type='submit']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollsubmit7);
				scrollsubmit7.click();
				
				
				
				
				//SPQ form part 8
				WebElement g1=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/label[1]"));
				Boolean g2=g1.isDisplayed();
				System.out.println(g2);
				Thread.sleep(10);
				try {
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='anyAlterations']")).click();
				}catch(StaleElementReferenceException e) {
					WebElement g=driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='anyAlterations']"));
					g.click();
				}		
				//driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='anyAlterations']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='B']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='6C']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='6D']")).click();
				WebElement scroll6=driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='6E']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll6);
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='6E']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='ESUBONE']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='ESUBTWO']")).click();
				WebElement scrollsubmit8=driver.findElement(By.xpath("//button[@type='submit']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollsubmit8);
				scrollsubmit8.click();
				
				//SPQ form part 9
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='aFinancial']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='test']")).click();
				WebElement scrollsubmit9=driver.findElement(By.xpath("//button[@type='submit']"));
				//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollsubmit9);
				scrollsubmit9.click();
				
				//SPQ form part 10
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='aFinancial']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='B']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='C']")).click();
				WebElement scrollsubmit10=driver.findElement(By.xpath("//button[@type='submit']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollsubmit10);
				scrollsubmit10.click();
				
				//SPQ form part 11
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='A']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='B']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='C']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='D']")).click();
				WebElement scrollsubmit11=driver.findElement(By.xpath("//button[@type='submit']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollsubmit11);
				scrollsubmit11.click();
				
				//SPQ form part 12
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='A']"));
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='B']"));
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='C']"));
				WebElement scrollsubmit12=driver.findElement(By.xpath("//button[@type='submit']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollsubmit12);
				scrollsubmit12.click();
				
				//SPQ form part 13
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='A']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='B']")).click();
				driver.findElement(By.xpath("//input[@value='manually']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='B2']")).click();
				WebElement scroll7=driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='C']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll7);
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='C']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='C1']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='D']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='D1']")).click();
				WebElement scroll8=driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='E']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll8);
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='E']")).click();
				WebElement scrollsubmit13=driver.findElement(By.xpath("//button[@type='submit']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollsubmit13);
				scrollsubmit13.click();
				
				//SPQ form part 14
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='A']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='B']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='C']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='D']")).click();
				WebElement scroll9=driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='E']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll9);
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='E']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='F']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='F1']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='F2']")).click();
				WebElement scrollsubmit14=driver.findElement(By.xpath("//button[@type='submit']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollsubmit14);
				scrollsubmit14.click();
				
				//SPQ form part 15
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='15A']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='15B']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='15C']")).click();
				WebElement scroll10=driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='15D']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll10);
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='15D']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='15E']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='15F']")).click();
				WebElement scroll11=driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='15G']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll11);
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='15G']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='15H']")).click();
				WebElement scrollsubmit15=driver.findElement(By.xpath("//button[@type='submit']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollsubmit15);
				scrollsubmit15.click();
			
				//SPQ form part 16
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='16A']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='16B']")).click();
				WebElement scrollsubmit16=driver.findElement(By.xpath("//button[@type='submit']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollsubmit16);
				scrollsubmit16.click();
				
				//SPQ form part 17
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='17A']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='17B']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='17C']")).click();
				WebElement scroll12=driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='17D']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll12);
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='17D']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='17E']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='17F']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='17G']")).click();
				WebElement scroll13=driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='17H']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll13);
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='17H']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='17I']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='17J']")).click();
				WebElement scrollsubmit17=driver.findElement(By.xpath("//button[@type='submit']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollsubmit17);
				scrollsubmit17.click();

				//SPQ form part 18
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='A']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='B']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='C']")).click();
				WebElement scroll14=driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='D']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll14);
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='D']")).click();
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='E']")).click();
				WebElement scrollsubmit18=driver.findElement(By.xpath("//button[@type='submit']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollsubmit18);
				scrollsubmit18.click();
				
				//SPQ form part 19
				driver.findElement(By.xpath("//label[normalize-space()='No']//input[@name='A']")).click();
				driver.findElement(By.xpath("//input[@name='b']")).click();
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				
				//Review SPQ form
				WebElement donebtn=driver.findElement(By.xpath("//button[normalize-space()='Done']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", donebtn);
				donebtn.click();
				
				
				
				
				
				


				

				
				


				
				
				
				
				
				
	}

}
