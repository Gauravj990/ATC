package transactioneverview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class transactionoverview {

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
		
		//Edit transaction details
		WebElement edit=driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[1]"));
		edit.click();
		driver.findElement(By.xpath("//span[contains(text(),'Edit Transaction Details')]")).isDisplayed();
		driver.findElement(By.xpath("//input[@placeholder='Edit Transaction Name']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Edit Transaction Name']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Edit Transaction Name']")).sendKeys("123 beverly hills");
		driver.findElement(By.xpath("//input[@placeholder='Select Date']")).click();
		driver.findElement(By.xpath("//div[@class='dp__cell_inner dp__pointer dp--future dp__date_hover'][normalize-space()='30']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Select']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Transaction Details Updated Successfully !')]")).isDisplayed();
		
		//view details
		driver.findElement(By.xpath("//button[contains(text(),'View Details')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Details Of Transaction')]")).isDisplayed();
		driver.findElement(By.xpath("//header/button[@id='view_detail_close']/img[1]")).click();
		
		//upload documents
//		WebElement uploaddoc=driver.findElement(By.xpath("//button[@id='upload-doc']"));
//		uploaddoc.click();
//		
//		// Set the file path (use raw string in Windows for file path)
//        String filePath = "C:/Users/GauravJ/Downloads/SampleJPGImage_200kbmb (2)";  // Replace with your file path
//        
//        WebElement fileInput = driver.findElement(By.name("uploadfile"));
//        fileInput.sendKeys("C:/path/to/file.jpg");
//        
//        // Upload the file by sending the file path to the input field
//        WebElement uploadElement = driver.findElement(By.xpath("//button[contains(text(),'browse files')]")); // Example using ID
//
//        uploadElement.sendKeys(filePath);
//        
//        // Optionally, click a submit button if needed to complete the upload (replace with actual button identifier)
//        //WebElement submitButton = driver.findElement(By.id("upload-button")); // Replace with the actual submit button ID
//        //submitButton.click();


		

	}

}
