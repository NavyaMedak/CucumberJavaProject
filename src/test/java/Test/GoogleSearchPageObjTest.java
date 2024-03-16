package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.GoogleSearchPageObjects;

public class GoogleSearchPageObjTest {
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		googleSearchTest();
		
	}
	
	public static void googleSearchTest()
	{
		
		String projectPath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+ "/Drivers/ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		GoogleSearchPageObjects obj = new GoogleSearchPageObjects(driver);
	      driver.get("https://google.com");
	      obj.setTextInSearchBox("filpkart");
	      obj.clickSearchButton();
	      
	      
	}

}
