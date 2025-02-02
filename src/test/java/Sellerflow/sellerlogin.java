package Sellerflow;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sellerlogin {

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
		
//		//All transaction
		driver.findElement(By.xpath("//span[contains(text(),'All Transactions')]")).click();
		driver.findElement(By.xpath("//tbody//td[2]")).click();
	
//		//Send email to seller
		driver.findElement(By.xpath("//button[normalize-space()='Send Email to Seller']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Send Email']")).click();
		
		//login as seller
		driver.get("https://www.mailinator.com/");
		driver.findElement(By.xpath("//input[@id='search']")).click();
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("nate");
		driver.findElement(By.xpath("//button[contains(text(),'GO')]")).click();
		driver.findElement(By.xpath("//td[normalize-space()='testermail776@gmail.com']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//tbody//tr//td//div//button")).click();
		driver.findElement(By.xpath("//input[@id='my_email']")).click();
		driver.findElement(By.xpath("//input[@id='my_email']")).sendKeys("nate@mailinator.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter password']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter password']")).sendKeys("Test@123");
		Thread.sleep(3);
		WebElement sellerlogin=driver.findElement(By.xpath("//button[contains(text(),'Log In')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", sellerlogin);
		sellerlogin.click();
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
		
		Actions actions = new Actions(driver);

		// Simulate pressing the "Page Down" key to scroll down
		actions.sendKeys(Keys.PAGE_DOWN).perform();
		WebElement getstartedbtn=driver.findElement(By.xpath("//body/div/div/div/div/div/div/div/div/div/div[6]/div[1]/div[2]/span[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",getstartedbtn );
		driver.findElement(By.xpath("//button[contains(text(),'Get Started')])[5]")).click();
		

	}

}
