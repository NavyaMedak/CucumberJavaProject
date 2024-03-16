package POM;

//import java.util.Stack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
	
	private static WebElement element = null;
	
	public static WebElement textboxt_search(WebDriver driver) {
		element=driver.findElement(By.xpath("//textarea[@id='APjFqb'])"));
		return element;
		
	}
	
	public static WebElement button_search(WebDriver driver) {
		
	     element = driver.findElement(By.xpath("(//input[@tabindex='0'])[2]"));
	     return element;
	}

}
