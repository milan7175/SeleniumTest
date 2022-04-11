package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MultipleBrowserTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// read driver from excel file

		Xls_Reader d = new Xls_Reader("C:\\testing\\ScotiaBank.xlsx");
		WebDriver driver;
		 
		String browser = d.getCellData("Sheet2", 0, 2);
		System.out.println(browser);
		if(browser.equals("Firefox")) {
			
			
			
			System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
				System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
			 driver = new ChromeDriver();
				
			}
			
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("nvdhbuodanvoisnvi");
		driver.findElement(By.id("pass")).sendKeys("jbivsv");
		driver.findElement(By.name("login")).click();
		
		
	}

}
