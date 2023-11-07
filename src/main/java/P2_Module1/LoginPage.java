package P2_Module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	 @FindBy(xpath="//input[@id='username']") private WebElement UN;
	 @FindBy(xpath="//input[@id='password']") private WebElement PSW;
	 @FindBy(xpath="//input[@id='login']") private WebElement LOGIN;
	 
	 public LoginPage(WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
	 }
	 
	 public void EnterUsername(String USER)
	 {
		 UN.sendKeys(USER);
	 }
	 public void EnterPassword(String PASS)
	 {
		 PSW.sendKeys(PASS);
	 }
	 public void ClickLoginBTN()
	 {
		 LOGIN.click();
	 }
}
