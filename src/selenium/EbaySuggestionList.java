package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbaySuggestionList {

	public static void main(String[] args) throws InterruptedException {
		
		
		//type iphone in search box
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.ebay.ca/");
		
		driver.findElement(By.id("gh-ac")).sendKeys("iphone");
		
		Thread.sleep(3000);
		
		
		List<WebElement> iphone = driver.findElements(By.xpath("//ul[contains(@class,'ui-autocomplete')]/li"));
		
		System.out.println(iphone.size());
		
		Thread.sleep(2000);
		
		for(int i=0; i<iphone.size(); i++) {
			System.out.println(iphone.get(i).getText());
		}

	}

}
