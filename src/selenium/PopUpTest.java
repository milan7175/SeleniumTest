package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.aliexpress.com/");
		
		// if you get the pop up -close pop up- type laptop
		// if you donot get popup - type laptop in search box
		
		//WebElement popup = driver.findElement(By.className("close-btn"));
		//popup.click();
		
		List<WebElement> popup = driver.findElements(By.className("close-btn"));
		System.out.println(popup.size());
		
		if(popup.size()>0) {
		//driver.findElement(By.className("close-btn")).click();
			popup.get(0).click();
			
		}
	
		Thread.sleep(2000);
		
		driver.findElement(By.id("search-key")).sendKeys("laptop");
		
		
		
		
		
		
		
			
			
		}
	}

