package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
driver.get("https://echoecho.com/htmlforms10.htm");
		
		//List<WebElement> c= driver.findElements(By.xpath("//input[@name='group1']"));
		//System.out.println(c.size());
		System.out.println(driver.findElement(By.xpath("//input[@name='group1']")).getText());
		System.out.println(driver.findElement(By.xpath("(//input[@name='group1'])[1]")).getText());

		

	}

}
