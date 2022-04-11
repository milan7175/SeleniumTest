package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonHoverTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.ca");
		
		WebElement sign = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		
		
		Actions builder = new Actions(driver);
		builder.moveToElement(sign).build().perform();
		Thread.sleep(2000);
		
		
		
		
		List<WebElement> signin = driver.findElements(By.xpath("//div[@id='nav-al-wishlist']//a"));
		System.out.println(signin.size());
		
		for(WebElement a: signin) {
			System.out.println(a.getText());
			
		}
		driver.quit();
		
	}

}
