package testCases;

import java.time.Duration;


import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;


public class baseClass {

	WebDriver driver;
	
	@BeforeClass
	public void setup() throws InterruptedException
	
	{
		WebDriverManager.chromedriver().setup();
		// driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
        options.addArguments("--remote-debugging-port=9223");
//        options.addArguments("--user-data-dir=C:\\temp\\chromeprofile");
//        options.addArguments("--disable-extensions");  // Disable extensions
//        options.addArguments("--headless");

        driver = new ChromeDriver(options);
        driver.get("https://qa-atc.procasaonboard.com/login");
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


}
