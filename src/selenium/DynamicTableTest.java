package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicTableTest {

	public static void main(String[] args) {
// https://www.w3schools.com/html/html_tables.asp
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//List<WebElement> table = driver.findElements(By.id("customers"));
		//System.out.println(table.size());
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println(row.size());
		
		List<WebElement> col = driver.findElements(By.xpath("//table[@id='customers']//tr[2]/td"));
		System.out.println(col.size());
		
		for(int i = 2; i<=row.size(); i++) {
			for(int j =1; j<=col.size();j++)
			System.out.println(driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]/td["+j+"]")).getText());
			System.out.println("       ");
		}
		System.out.println();
	}

}
