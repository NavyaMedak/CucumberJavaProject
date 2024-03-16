package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {
	WebDriver driver = null;
	
	By Google_Search_box = By.name("q");
	By Google_Search_button = By.xpath("(//input[@role='button'])[2]");
	
	public GoogleSearchPageObjects(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void setTextInSearchBox(String txt) {
		driver.findElement(Google_Search_box).sendKeys(txt);
		
	}
	
	public void clickSearchButton() {
		driver.findElement(Google_Search_button).sendKeys(Keys.RETURN);
	}

}
