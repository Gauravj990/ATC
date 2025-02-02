package Signup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class signup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://qa-atc.valueaddsofttech.com/login");
		driver.manage().window().maximize();
		WebElement signup=driver.findElement(By.xpath("//a[contains(text(),'Sign up')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", signup);
		signup.click();
		
		
		WebElement fullname=driver.findElement(By.xpath("//input[@placeholder='Enter Full Name']"));
		fullname.click();
		fullname.sendKeys("John Smith");
		WebElement email=driver.findElement(By.xpath("//input[@placeholder='Enter Email']"));
		email.sendKeys("john@yopmail.com");
		
		WebElement radiobutton=driver.findElement(By.xpath("//input[@value='TC']"));
		radiobutton.click();
		WebElement phonenumber=driver.findElement(By.xpath("//input[@placeholder='Enter Mobile No.']"));
		phonenumber.click();
		phonenumber.sendKeys("5434543452");
		WebElement signupbtn=driver.findElement(By.xpath("//button[normalize-space()='Sign Up']"));
		signupbtn.click();
		
//		driver.get("https://yopmail.com/en/");
//		driver.findElement(By.xpath("//input[@id='login']")).click();
//		driver.findElement(By.xpath("//input[@id='login']")).sendKeys("john");
//		driver.findElement(By.xpath("//i[@class='material-icons-outlined f36']")).click();
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", "//div[normalize-space()='Welcome to Procasa TC: Account Validation Details']");
//		driver.findElement(By.xpath("//div[normalize-space()='Welcome to Procasa TC: Account Validation Details']")).click();
//		driver.switchTo().frame(0);
		


		


		
	}

}
