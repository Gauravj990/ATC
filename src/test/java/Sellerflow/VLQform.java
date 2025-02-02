package Sellerflow;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VLQform {

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
		Thread.sleep(15);
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
		
		
		//Start VLQ form
		List <WebElement> startbtn=driver.findElements(By.xpath("(//span[contains(text(),'Start Here')])"));
		int startbtncount=startbtn.size();
		System.out.println("total element size is:" +startbtncount);
		if(elementsize>0)
		{
			WebElement lastElement = startbtn.get(startbtncount - 1);
            System.out.println("Last element: " + lastElement.getText());
            lastElement.click();
		}
		else {
            System.out.println("No elements found.");
        }
		
		WebElement vlqform=driver.findElement(By.xpath("//span[normalize-space()='[VLQ] Vacant Land Questionnaire']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", vlqform);
		driver.findElement(By.xpath("//input[@id='limitationAccepted']")).click();
		driver.findElement(By.xpath("(//button[@class=contains(text(),'Continue')])[2]")).click();
		
		//part 5
		List<WebElement> radioButtons = driver.findElements(By.xpath("//label[normalize-space()='No']"));

        // Iterate through the list of radio buttons and click each one
        for (WebElement radioButton : radioButtons) {
            if (!radioButton.isSelected()) 
            { // Click only if the radio button is not selected
                radioButton.click();
                System.out.println("Clicked radio button: " + radioButton.getAttribute("value"));
            }
            
            WebElement Save=driver.findElement(By.xpath("//button[normalize-space()='Save']"));
            Save.click();
            Thread.sleep(5);
        }
        
      //part 6 
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement radiobtn1= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[normalize-space()='No']")));
        for (WebElement radiobtn2: radioButtons) {
            if (!radiobtn2.isSelected()) 
            { // Click only if the radio button is not selected
            	radiobtn2.click();
                System.out.println("Clicked radio button: " + radiobtn2.getAttribute("value"));
            }
            
            WebElement Save=driver.findElement(By.xpath("//button[normalize-space()='Save']"));
            Save.click();
        }
        
	}
}

	
	
