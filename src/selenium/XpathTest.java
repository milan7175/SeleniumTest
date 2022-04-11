package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hbvihc");
		
		
				//"//input[@id='email'])
	}

}
