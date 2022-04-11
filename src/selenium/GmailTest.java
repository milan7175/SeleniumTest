package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailTest {

	public static void main(String[] args) throws InterruptedException {
  // verify error message for gmail login
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://accounts.google.com/signin");
		
		//String s = driver.findElement(By.className("VfPpkd-RLmnJb")).getText();
		//System.out.println(s);
		
		
		driver.findElement(By.id("identifierId")).sendKeys("jbiwfjbei");
		
		Thread.sleep(2000);
		

		//driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
		String experr = "Couldn’t find your Google Account";
		String acterr = driver.findElement(By.xpath("//div[@class='o6cuMc']")).getText();
		System.out.println(acterr);
		
		if(experr.equals(acterr)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
	}

}
