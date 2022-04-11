package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TdListTest {

	public static void main(String[] args) {
		//verify footer links
	
		

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();
	
	driver.get("https://www.td.com/ca/en/personal-banking/");
	
	List<WebElement> footerlist = driver.findElements(By.xpath("//div[contains(@class,'td-footer-links')]/a"));
	
	System.out.println(footerlist.size());
	
	for(int i = 0; i<footerlist.size(); i++) {
		System.out.println(footerlist.get(i).getText());
	}

	}

}
