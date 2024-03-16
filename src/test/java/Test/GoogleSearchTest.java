package Test;

//import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import POM.GoogleSearchPage;

public class GoogleSearchTest {
	
	static WebDriver driver = null;

	public static void main(String[] args) {
		googleSearch();

	}
	
	public static void googleSearch() {
		
		
		//String projectPath= System.getProperty("user.dir");
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\shivva.naresh\\OneDrive - Entain Group\\Desktop\\Personal\\geckodriver-v0.33.0-win64");
	      driver = new ChromeDriver();
	   
	   //Go to Google Search
	   driver.get("https://google.com");
	   
	   //Enter text in search box
	   GoogleSearchPage.textboxt_search(driver).sendKeys("Automation step by step");
	   
	   //Click on search button
	   GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
	   
	   //Final Status
	   System.out.println("Test is completed");
	}
	

}
