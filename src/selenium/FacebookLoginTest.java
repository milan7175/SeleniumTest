package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		
		
		// when we have space in the the text , we cannot use directly
		//1. classname
		//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("hbri");  not permitted because of space.
		
		//2. cssSelector
		//driver.findElenemt(by.cssSelector(null)) need to learn css selector first
		
		//3. id -working
		//driver.findElement(By.id("email")).sendKeys("bigrjibr");
		
		//4. linkTest - not working
		//driver.findElement(By.linkText(null)) only for Link
		
		//5.  name- working
		//driver.findElement(By.name("email")).sendKeys("ibubvibue");
		
		//6. partialLinkTest- not working
		//driver.findElement(By.partialLinkText(null)) only for link
		
		//7. TagName
		//driver.findElement(By.tagName("input")).sendKeys("biefbgiugfiu"); - not unique, repeated many times
		
		//8. xpath
		//driver.findElement(By.xpath(null)) need to learn xpath
		
		// password
//		driver.findElement(By.name("pass")).sendKeys("bfeiif");
//		
//		driver.findElement(By.name("login")).click();
//		
		WebElement logo = driver.findElement(By.xpath("//img[contains(@class,'fb_logo')]"));
		System.out.println(logo.isDisplayed());
		
		driver.quit()
		;
		
		
		
	}

}
