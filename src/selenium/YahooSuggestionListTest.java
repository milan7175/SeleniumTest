package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;


public class YahooSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://ca.yahoo.com/");
		
		driver.findElement(By.name("p")).sendKeys("canada");
		
		Thread.sleep(2000);
		
		List<WebElement> dropdown = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println(dropdown.size());
		
		Thread.sleep(2000);
		
		
		for(int i = 0; i<dropdown.size(); i++) {
			if(dropdown.get(i).getText().contains("canada")) {
			System.out.println(dropdown.get(i).getText());
		}else {
			System.out.println("fail");
		}
		
		}
		
		
		
		
		
		
		

	}// type canada in search bar

}

