package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PractiseOutlookLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://login.microsoftonline.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Can’t access your account?")).click();
		
		String ExpTitle = "Sign in to your account";
		String ActTitle = driver.getTitle();
		System.out.println(ActTitle);
		
		String ExpUrl = "https://login.microsoftonline.com";
		String ActUrl = driver.getCurrentUrl();
		System.out.println(ActUrl);
		
		if (ExpTitle.equals(ActTitle) & ActUrl.contains(ExpUrl)) {
			System.out.println("Test Pass");
			
		}else {
			System.out.println("fail");
		}
		
		Thread.sleep(2000);
		driver.findElement(By.id("idBtn_Back")).click();
		

		
		
	}

}
