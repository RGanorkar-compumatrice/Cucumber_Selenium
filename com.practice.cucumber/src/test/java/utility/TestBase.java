package utility;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	static WebDriver driver;
	public static Properties prop;
	public TestBase() throws Exception {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("src\\test\\java\\config\\Config.properties");
		prop.load(fis);
	}
	
	public static WebDriver Initialization(String url){
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
}