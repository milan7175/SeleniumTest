package selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSuggestionList {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("canada");
		
		Thread.sleep(3000);
		
		
		List<WebElement> alloption = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println(alloption.size());
		
		for(int i = 0; i<alloption.size(); i++) {
			System.out.println(alloption.get(i).getText());
		}
		
		
		
		
	}

}
