package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// verify size and text for trending now
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://ca.yahoo.com/");
		
		List<WebElement> toptrending = driver.findElements(By.xpath("//div[contains(@class,'c-list-row D(ib)')]/div"));
		
		
		System.out.println(toptrending.size());
		
		for(int i = 0; i<toptrending.size(); i++ ) {
			System.out.println(toptrending.get(i).getText());
		}
		
		
	}

}
