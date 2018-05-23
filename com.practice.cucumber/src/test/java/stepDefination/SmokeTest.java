package stepDefination;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;
import utility.TestBase;

public class SmokeTest extends TestBase {

	static WebDriver driver;
	By username = By.id("uEmail");
	By password = By.id("pass");
	By loginbutton = By.xpath("//*[@id='login-box']/div[3]/div/button");

	public SmokeTest() throws Exception {

	}

	@Given("^Open Chrome start application$")
	public void Open_Chrome_start_application() {
		driver = TestBase.Initialization(prop.getProperty("url"));
	}

	@When("^Enter valid username and password$")
	public void Enter_valid_username_and_password() throws Exception {
		LoginPage login = new LoginPage(driver);
		login.Login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Then("^user should able to login successfully$")
	public void user_should_able_to_login_successfully() throws Exception {
		HighlightElement(driver, driver.findElement(loginbutton));
	}

	@When("^Parametarization \"([^\"]*)\" and \"([^\"]*)\"$")
	public void Enter_valid_username_and_password(String uname, String pass) throws Exception {
		HighlightElement(driver, driver.findElement(username));
		driver.findElement(username).sendKeys(uname);
		HighlightElement(driver, driver.findElement(password));
		driver.findElement(password).sendKeys(pass);
	}

	@Then("^user should able to loginIn DataDriven parametarization$")
	public void user_should_able_to_login_in_parametarization() throws Exception {
		HighlightElement(driver, driver.findElement(loginbutton));
	}

	@When("^DataDriven \"([^\"]*)\" and \"([^\"]*)\"$")
	public void DataDriven_username_and_password(String uname, String pass) throws Exception {
		HighlightElement(driver, driver.findElement(username));
		driver.findElement(username).sendKeys(uname);
		HighlightElement(driver, driver.findElement(password));
		driver.findElement(password).sendKeys(pass);
	}

	@When("^DataTable username and password$")
	public void DataTable_username_and_password(DataTable Credentials) throws Exception {
		List<List<String>> data = Credentials.raw();
		HighlightElement(driver, driver.findElement(username));
		driver.findElement(username).sendKeys(data.get(0).get(0));
		HighlightElement(driver, driver.findElement(password));
		driver.findElement(password).sendKeys(data.get(0).get(1));
		HighlightElement(driver, driver.findElement(username));
		driver.findElement(username).sendKeys(data.get(1).get(0));
		HighlightElement(driver, driver.findElement(password));
		driver.findElement(password).sendKeys(data.get(1).get(1));
	}

	@When("^DataMap username and password$")
	public void DataMap_username_and_password(DataTable Credentials) throws Exception {

		for (Map<String, String> data : Credentials.asMaps(String.class, String.class)) {
			HighlightElement(driver, driver.findElement(username));
			driver.findElement(username).sendKeys(data.get("username"));
			HighlightElement(driver, driver.findElement(password));
			driver.findElement(password).sendKeys(data.get("password"));
		}
	}

	public static void HighlightElement(WebDriver wd, WebElement element) throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) wd;
		jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element, "border: 5px solid red;");
		Thread.sleep(1500);
		jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");

	}
}
