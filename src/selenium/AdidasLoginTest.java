package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdidasLoginTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.adidas.ca/en/account-login");
		
		Thread.sleep(2000);
		 
		driver.findElement(By.id("login-email")).sendKeys("jbvivbi@gmail.com");
		driver.findElement(By.id("login-password")).sendKeys("ubfiveb");
		
		
		
		
		//driver.findElement(By.className("gl-cta__content")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		String experr = "Incorrect email/password – please check and retry";
		String acterr = driver.findElement(By.xpath("//div[@data-auto-id='login-error-message']")).getText();
		System.out.println(acterr);
		
		if (experr.equals(acterr)) {
			System.out.println("pass");
			
		}else {
			System.out.println("fail");
			
		}
		// verify error message in adidas login page
	}

}
