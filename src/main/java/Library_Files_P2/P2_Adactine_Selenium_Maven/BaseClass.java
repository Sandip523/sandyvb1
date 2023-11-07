package Library_Files_P2.P2_Adactine_Selenium_Maven;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass 
{
	public WebDriver  driver;
	
    public void InitializeBrowser()
    {
    	
		 ChromeOptions CO=new ChromeOptions();
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
		 driver=new ChromeDriver(CO); 
		
		 driver.manage().window().maximize();
		 
		 driver.get("http://adactinhotelapp.com/HotelAppBuild2/");
			
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
    }
}
