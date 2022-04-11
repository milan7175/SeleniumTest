package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PractiseAliExpress {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		//
		//FirefoxDriver driver = new FirefoxDriver();
		
		//driver.manage().window().maximize();
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aliexpress.com/");
		
		
		driver.findElement(By.className("close-btn")).click();

		WebElement bags = driver.findElement(By.linkText("Outdoor Fun & Sports"));
		//WebElement Fashion = driver.findElement(By.linkText("Women's Fashion"));
		Actions builder = new Actions(driver);
		builder.moveToElement(bags).build().perform();
		
		List<WebElement> styles = driver.findElements(By.xpath("(//dl[@class='sub-cate-items'])[56]/dd//a"));
		System.out.println(styles.size());
		
//		Thread.sleep(5000);
//		
//		List<WebElement> hover = driver.findElements(By.xpath("(//dl[@class='sub-cate-items'])[49]//a"));
//		System.out.println(hover.size());
//		Thread.sleep(5000);
		driver.close();
		
		//for (WebElement b : hover) {
			//System.out.println(b.getText());
		//}
		
		
		
		

	}

}
