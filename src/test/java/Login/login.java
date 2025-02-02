package Login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class login {

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
		Thread.sleep(10);
		
		String actual=driver.getCurrentUrl();
		System.out.println(actual);
		String expectedUrl="https://qa-atc.valueaddsofttech.com/transaction-overview";
//		if(actual.equals(expectedUrl))
//		{
//			System.out.println("User logged in successfully");
//		}
//		else {
//			System.out.println("User not loggedin");
//		}
		if(driver.findElement(By.xpath("//button[contains(text(),'+ New Transaction')]")).isDisplayed())
		{
			System.out.println("user loggedin successfully");
		}
		else {
			System.out.println("user not logeedin");
		}
		
		
		
		
		
	}

}
