package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PractiseJunitTest {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();				
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.id("email")).sendKeys("hvodsv@gmail.com");
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(2000);
		String experr = "The email you entered isn’t connected to an account. ";
		String Act = driver.findElement(By.xpath("//div[@class='_9ay7']")).getText();
		System.out.println(Act);
		
		if(Act.contains(experr)) {
			System.out.println("Test pass");
		}else {
			System.out.println("Test fail");
		}
	}

}
