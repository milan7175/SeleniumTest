package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooHeaderTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://ca.yahoo.com/");
		
		List<WebElement> headerlinks = driver.findElements(By.xpath("//ul[@role='presentation']/li"));
		System.out.println(headerlinks.size());
		
		/*for(int i=0; i<headerlinks.size(); i++) {
			System.out.println(headerlinks.get(i).getText());
		}*/
		
		for(WebElement c : headerlinks) {
			System.out.println(c.getText());
		}
	}

}
