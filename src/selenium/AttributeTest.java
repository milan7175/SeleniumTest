package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AttributeTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.ebay.ca/");
		
		String Search = driver.findElement(By.id("gh-ac")).getAttribute("placeholder");
		
		
		

		System.out.println(Search);
		
		driver.findElement(By.id("gh-ac")).sendKeys("iphone");
		
		String p = driver.findElement(By.id("gh-ac")).getAttribute("value"); //any value you want to type and read then use getattribute - "value"
		System.out.println(p);
		
		
	}

}
