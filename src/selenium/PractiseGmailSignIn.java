package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PractiseGmailSignIn {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://accounts.google.com/signin");
		
		driver.findElement(By.id("identifierId")).sendKeys("hdofhsvofhbhi");
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		
		Thread.sleep(2000);
		String ExpErr = "Couldn’t find your Google Account";
		String ActErr = driver.findElement(By.className("o6cuMc")).getText();
		System.out.println(ActErr);
		
		if(ExpErr.equals(ActErr)) {
			System.out.println("test pass");
		}else {
			System.out.println("test fail");
		}
		}

}
