package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MississaugaTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		//driver.manage().window().maximize();
		
		driver.get("https://www.mississauga.ca/");
		
		driver.findElement(By.xpath("//button[contains(text(),'Our organization')]")).click();
		
		
		List<WebElement> dropdown = driver.findElements(By.xpath("//ul[@class='dropdown-menu nav-dropdown-menu show']/li"));
		System.out.println(dropdown.size());
		
		for(WebElement a : dropdown) {
			System.out.println(a.getText());
		}
	}

}
