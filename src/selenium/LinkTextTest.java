package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkTextTest {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.findElement(By.partialLinkText("Abo")).click();
		
		
		//Thread.sleep(2000);
		
		
		wait.until(ExpectedConditions.titleIs("Google - About Google, Our Culture & Company News"));
		String ExpTitle = "Google - About Google, Our Culture & Company News";
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		
		wait.until(ExpectedConditions.urlContains("https://about.google"));
		String ExpUrl = "https://about.google";
		String ActUrl = driver.getCurrentUrl();
		System.out.println(ActUrl);
		
		
		if (ExpTitle.equals(ActualTitle)& ActUrl.contains(ExpUrl)) {
			System.out.println("TestPass");
			
		}else {
			System.out.println("testfail");
		}
		
	}

}
