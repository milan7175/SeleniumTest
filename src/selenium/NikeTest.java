package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NikeTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
// get size and text for 2nd column
		
		// https://www.nike.com/ca/?
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		//driver.manage().window().maximize();
		
		driver.get("https://www.nike.com");
		
		WebElement men = driver.findElement(By.linkText("Men"));
		Actions builder = new Actions(driver);
		builder.moveToElement(men).build().perform();
		
		Thread.sleep(7000);
		
		List<WebElement> shoes = driver.findElements(By.xpath("//div[@id='DesktopMenu-0-1-0']/div/div[2]/a"));
		System.out.println(shoes.size());
		
		for(WebElement a : shoes) {
			System.out.println(a.getText());
		}
		
		
		

	}

}
