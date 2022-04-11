package selenium;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseTest {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	
	public  BaseTest() throws Exception {
		FileInputStream f = new FileInputStream("C:\\Users\\Milan Thakkar\\Desktop\\Selenium Notes\\pageObjectmodel.properties");
	
		Properties prop = new Properties();
		prop.load(f);
	}
//C:\Selenium_workspace\PractisePageObjectModel\src\main\java\facebookPropertiesFiles\config.properties
	
	public static void initialization() {
		String browser = prop.getProperty("browser");
		if(browser.equals("FireFox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println(browser);
			}
		else {
				System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
			 driver = new ChromeDriver();
			 System.out.println(browser);
				
			}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}
	
	


}
