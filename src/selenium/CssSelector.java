package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("#email")).sendKeys("bibwbv@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("bdvihbs");
		driver.findElement(By.cssSelector("button[name='login']")).sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
		
		
	}

}
