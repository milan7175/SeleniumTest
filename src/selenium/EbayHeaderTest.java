package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbayHeaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.ebay.ca/");
		
		List<WebElement> headerlist = driver.findElements(By.xpath("//ul[@class=\"hl-cat-nav__container\"]/li"));
		
		System.out.println(headerlist.size());
		
		for(int i = 0; i<headerlist.size(); i++) {
			System.out.println(headerlist.get(i).getText());
		}
		
	}

}
