package StepDefinitions;

//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;

import java.io.File;
//import java.nio.channels.Selector;
import java.util.List;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.Select;

//import io.cucumber.java.en.And;
//import io.cucumber.java.en.And.Ands;
//import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
import io.cucumber.java.en.When;


public class LoginSteps {
	
	ChromeDriver driver=new ChromeDriver();
	//WebDriver driver=new FirefoxDriver();
	
	
	
	/*@Given("User sucefully launched the racing post url")
	public void user_sucefully_launched_the_racing_post_url() {
		
			String projectPath= System.getProperty("user.dir");
			System.out.println("projectPath : " +projectPath);
			System.out.println("=========================");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shivva.naresh\\OneDrive - Entain Group\\Desktop\\Personal\\chromedriver_win32 (2)\\chromedriver.exe");  
		//System.setProperty("webdriver.chrome.driver", projectPath+ "\\Drivers\\geckodriver\\geckodriver.exe");
		driver.get("https://www.racingpost.com/");
		
		driver.manage().window().maximize();
		System.out.println("sucessfully launched the racing post url");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}
	
	@Then("verify racing post title")
	public void verify_racing_post_title() {
		System.out.println(driver.getTitle());
	}
	
	@Then("verify today's racing count")
	public void verify_today_s_racing_count() {
	    WebElement el=driver.findElement(By.xpath("(//span[@class=\"RaceMatrixHeader_race-matrix-header__button-label__R3Z6B RaceMatrixHeader_race-matrix-header__button-label--active__Ogtif\" and contains(text(),'Today')])[2]"));
	    System.out.println("User is on the "+ el.getText() +"Tab");
	}
	
	@Then("Close the pop up window")
	public void close_the_pop_up_window() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(20);
	    driver.findElement(By.xpath("//div//button[@class='ab-close-button']")).click();
	    }
	
	@When("user clicks on More drop down")
	public void user_clicks_on_more_drop_down() {
	    driver.findElement(By.xpath("(//img[@alt='Chevron down'])[2]")).click();
	    System.out.println("User clicks on More drop down option");
	}
	
	@When("verify drop down list values")
	public void verify_drop_down_list_values() {
		 List<WebElement> allElements = driver.findElements(By.xpath("//ul[@data-testid='List__DropdownMenu']"));
		 System.out.println(allElements);
		 
		 for(WebElement element: allElements) {
			 System.out.println("Elements Inside drop down are"    + element.getText());
		 }
	  
	}
	
	@Then("verify header links")
	public void verify_header_links() throws InterruptedException {
		 List<WebElement> allElements1 = driver.findElements(By.xpath("(//ul[@class='MainNavigationstyles__MainNavigationList-sc-1rflx2l-2 fqZNEZ'])[2]"));
	     for(WebElement element:allElements1) {
	    	 System.out.println("===========================");
	    	 System.out.println(element.getText());
	    	 
	     }
	}
	
	@Then("Close the pop up window")
	public void close_the_pop_up_window() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(20);
	    driver.findElement(By.xpath("//div//button[@class='ab-close-button']")).click();
	    }

	@Then("click How to Bet option")
	public void click_how_to_bet_option() throws InterruptedException {
		 Thread.sleep(20);
	 driver.findElement(By.xpath("(//a[@href='https://help.racingpost.com/hc/en-us/categories/200924449-Betting'])[1]")).click();	
		
	}*/
	
	/*===================================================================*/
			
			@Given("User launch the DMS url")
	public void user_launch_the_dms_url() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
				
				System.setProperty("webdriver.chrome.driver","C:\\Users\\shivva.naresh\\OneDrive - Entain Group\\Desktop\\Personal\\chromedriver_win32 (2)\\chromedriver.exe");  
				driver.manage().window().maximize();    
				driver.get("https://cms-thunderbolt.load.env.works/sitecore/login?fbc=1");	
	    Thread.sleep(20);
			
			}

	@Then("enter the username and passwrod")
	public void enter_the_username_and_passwrod() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("Display");
	    driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Display");

	}

	@Then("click on log in button")
	public void click_on_log_in_button() throws InterruptedException {
	  driver.findElement(By.xpath("//input[@value='Log in']")).click();
	  Thread.sleep(10);
	  driver.findElement(By.xpath("(//span[@class='sc-launchpad-text'])[3]")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//span[text()='Racing']")).click();
	  //JavascriptExecutor js = (JavascriptExecutor)driver;
	  //js.executeScript("arguments[1].click();", element);
	  //js.executeScript("document.getElementById('mat-tab-label-2-1').click();");
	  //js.executeScript("window.document.getElementById('mat-tab-label-2-1').click()");
	  Thread.sleep(5000);
	  //driver.findElement(By.xpath("//li[text()=' Today ']")).click();
	  Thread.sleep(8000);
	  driver.findElement(By.xpath("//div[@class='mat-select-arrow-wrapper ng-tns-c76-3']")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//span[text()=' LADBROKES ']")).click();
	  driver.navigate().refresh();
	  Thread.sleep(5000);
	  driver.navigate().back();
	  Thread.sleep(8000);
	  driver.findElement(By.xpath("(//span[@class='sc-launchpad-text'])[3]")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//button[@aria-label='Toggle HorseRacing']")).click();
	}

	
	
}
		


