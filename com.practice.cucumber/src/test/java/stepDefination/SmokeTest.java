package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	static WebDriver driver;
	
	By username= By.id("uEmail");
	By password= By.id("pass");
	By loginbutton= By.xpath("//*[@id='login-box']/div[3]/div/button");
	
	@Given("^Open Chrome start application$")
	public void Open_Chrome_start_application(){
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://uat.parcelplatform.com/");
	}
	
	@When("^Enter valid username and password$")
	public void Enter_valid_username_and_password() throws Exception{
		HighlightElement(driver, driver.findElement(username));
		driver.findElement(username).sendKeys("mpatel1");
		HighlightElement(driver, driver.findElement(password));
		driver.findElement(password).sendKeys("Myprodpass@72");
	}
	
	@Then("^user should able to login successfully$")
	public void user_should_able_to_login_successfully() throws Exception{
		HighlightElement(driver, driver.findElement(loginbutton));
	//	driver.findElement(loginbutton).click();
	}
	
	@When("^Enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void Enter_valid_username_and_password(String uname, String pass) throws Exception{
		HighlightElement(driver, driver.findElement(username));
		driver.findElement(username).sendKeys(uname);
		HighlightElement(driver, driver.findElement(password));
		driver.findElement(password).sendKeys(pass);
	}
	
	@Then("^user should able to login in parametarization$")
	public void user_should_able_to_login_in_parametarization() throws Exception{
		HighlightElement(driver, driver.findElement(loginbutton));
	}
	
	@When("^DataDriven \"([^\"]*)\" and \"([^\"]*)\"$")
	public void DataDriven_username_and_password(String uname, String pass) throws Exception {
		HighlightElement(driver, driver.findElement(username));
		driver.findElement(username).sendKeys(uname);
		HighlightElement(driver, driver.findElement(password));
		driver.findElement(password).sendKeys(pass);
	}
	
	
	public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException
	 {
	       JavascriptExecutor jse=(JavascriptExecutor)wd;
	       jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"border: 5px solid red;");
	       Thread.sleep(1500);
	       jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"");
	    
	 }
}
