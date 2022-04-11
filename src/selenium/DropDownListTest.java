package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownListTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		//driver.findElement(By.name("_sacat"));
		
		List<WebElement> dropdown = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		System.out.println(dropdown.size());
		
		for(int i = 0; i<dropdown.size(); i++) {
			System.out.println(dropdown.get(i).getText()+ "------"+ dropdown.get(i).isSelected());
		}
		
		WebElement dropdown2 = driver.findElement(By.name("_sacat"));
		Select s = new Select(dropdown2);
		
		s.selectByIndex(2);
		Thread.sleep(2000);
		
		for(int i = 0; i<dropdown.size(); i++) {
			System.out.println(dropdown.get(i).getText()+ "------"+ dropdown.get(i).isSelected());
		}

		
		
		
		
		
		
		
	}
	
	

}
