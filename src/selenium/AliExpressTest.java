package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AliExpressTest {

	public static void main(String[] args) {
// after hovering to woman fashion
		
		//System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		//FirefoxDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.google.com/");
		
		//driver.manage().window().maximize();
		
		driver.get("https://www.aliexpress.com/");
		
		//driver.findElement(By.className("close-btn")).click();
		
		WebElement Fashion = driver.findElement(By.linkText("Women's Fashion"));
		Actions builder = new Actions(driver);
		builder.moveToElement(Fashion).build().perform();
		
		List<WebElement> styles = driver.findElements(By.xpath("(//dl[@class='sub-cate-items'])[1]//a"));
		System.out.println(styles.size());
		
		for(WebElement a : styles) {
			System.out.println(a.getText());
		}
		
		
	}

}
