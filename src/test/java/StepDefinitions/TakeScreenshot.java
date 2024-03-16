package StepDefinitions;
import org.junit.After;  
import org.junit.Before;  
import org.junit.Test;  
import java.io.File;  
import java.io.IOException;  
import org.apache.commons.io.FileUtils;  
import org.openqa.selenium.OutputType;  
import org.openqa.selenium.TakesScreenshot;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.firefox.FirefoxDriver;  
  
public class TakeScreenshot {  
WebDriver driver; 
@Before  
public void setUp() throws Exception {  
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shivva.naresh\\OneDrive - Entain Group\\Desktop\\Personal\\chromedriver_win32 (2)\\chromedriver.exe");  
	driver.manage().window().maximize();
	driver.get("https://www.javatpoint.com/selenium-interview-questions");;
}  
@After  
public void tearDown() throws Exception {  
//driver.quit();  
}  
  
@Test  
public void test() throws IOException {  
//capture the screenshot  
          File scrFile = ((TakeScreenshot)driver).getScreenshotAs(OutputType.FILE);  
// paste the screenshot in the desired location  
         FileUtils.copyFile(scrFile, new File("C:\\Screenshot\\Scr.jpg"));
}
private File getScreenshotAs(OutputType<File> file) {
	// TODO Auto-generated method stub
	return null;
}  
}  