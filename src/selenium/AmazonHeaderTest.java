package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonHeaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.ca");
		
		List<WebElement> header = driver.findElements(By.xpath("//div[@class=\"nav-progressive-content\"]/a"));
		
		System.out.println(header.size());
		
		for(int i=0; i<header.size(); i++) {
			System.out.println(header.get(i).getText());
		}
		
		/*for(WebElement a : header) {
			System.out.println(a.getText());     // alternate way to run for loop
		}*/
		
		

	}

}
