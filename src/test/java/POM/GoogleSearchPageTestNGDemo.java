package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import java.util.Stack;


//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

public class GoogleSearchPageTestNGDemo {
	WebDriver driver=null;
	
	@BeforeTest
	public void setup() {
		
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\shivva.naresh\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	 ChromeDriver driver = new ChromeDriver();
	
	}
	
     @Test
	public void googleSearch() {
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("flipkart");	
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	}
		
		@AfterTest
		public void tearDown() {
			driver.close();
			driver.quit();
		System.out.println("Test Complete sucessfully");
		}
		
		
		
	

	
	}
	
	
	

