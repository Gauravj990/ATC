package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class baseClass {
	
WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://qa-atc.procasaonboard.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterTest
	public void Teardown()
	{
		driver.quit();
	}
	
	public String randomemail()
	{
		String randomstring= RandomStringUtils.randomAlphabetic(6);
		return randomstring;
	}

	public String randomphonenumber()
	{
		String randominteger= RandomStringUtils.randomNumeric(9);
		return randominteger;
	}

	public String captureScreen(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
