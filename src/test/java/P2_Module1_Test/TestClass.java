package P2_Module1_Test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_Files_P2.P2_Adactine_Selenium_Maven.BaseClass;
import Library_Files_P2.P2_Adactine_Selenium_Maven.UtilityClass;
import P2_Module1.LoginPage;

public class TestClass extends BaseClass 
{
	LoginPage login;
   @BeforeMethod
   public void openBrowser()
   {
	   InitializeBrowser();
	   
	   login = new LoginPage(driver);
   }
   
   @Test
   public void LoginToApp() throws IOException
   {
	   login.EnterUsername(UtilityClass.getDatafromPF("username"));
	   login.EnterPassword(UtilityClass.getDatafromPF("password"));
	   login.ClickLoginBTN();
   }
   
}
