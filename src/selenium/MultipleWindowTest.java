package selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowTest {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.adidas.ca");
		
		Thread.sleep(5000);
		
		//driver.findElement(By.name("reebok")).click();
		driver.findElement(By.linkText("also visit")).click();
		Thread.sleep(2000);
		
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows.size());
		
		Iterator<String> itr = allWindows.iterator();
		String parentwindow = itr.next();
		String childwindow = itr.next();
		System.out.println(parentwindow);
		System.out.println(childwindow);
		
		driver.switchTo().window(parentwindow);
		System.out.println(driver.getTitle());
		
	
		
		driver.switchTo().window(childwindow);
		System.out.println(driver.getTitle());
		//Thread.sleep(2000);
		
		driver.quit();
		

		
				
		
	}

}
