package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuterClassTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.adidas.ca/en");
		
		Thread.sleep(10000);
		
		//driver.
		
		WebElement careers = driver.findElement(By.linkText("Careers"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//option 1 - Using x and Y cordinate
				//System.out.println(careers.getLocation());
				jse.executeScript("window.scrollBy(0,4500)");
				careers.click();

				
				//option 2 
				////Option - Scroll until the element is in the view is true
				//jse.executeScript("arguments[0].scrollIntoView(true);", careers);
				//careers.click();

		//option3 Direct click using javascript executer
				//jse.executeScript("arguments[0].click();",careers);
	}

}
