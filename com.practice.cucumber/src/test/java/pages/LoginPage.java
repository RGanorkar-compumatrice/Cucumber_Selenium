package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
WebDriver driver;
	
	@FindBy(id="uEmail")
	WebElement username; 

	@FindBy(id="pass")
	WebElement password; 
	
	@FindBy(xpath="//*[@id='login-box']/div[3]/div/button")
	WebElement loginbutton; 

	public LoginPage(WebDriver driver) throws Exception {
		this.driver=driver;
		
	}
	
	public void Login(String Username, String Password) throws Exception{
		PageFactory.initElements(driver, this);
		HighlightElement(driver, username);
		username.sendKeys(Username);
		HighlightElement(driver,password);
		password.sendKeys(Password);
	}
	
	public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	 {
	       JavascriptExecutor jse=(JavascriptExecutor)wd;
	       jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	       Thread.sleep(1500);
	       jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	    
	 }
}
