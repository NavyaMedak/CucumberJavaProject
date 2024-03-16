

public class callWebDriver {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shivva.naresh\\OneDrive - Entain Group\\Desktop\\Personal\\chromedriver_win32 (2)\\chromedriver.exe");  
	ChromeDriver driver=new ChromeDriver();   
      driver.navigate().to("http://www.javatpoint.com/");
      driver.manage().window().maximize();

}
