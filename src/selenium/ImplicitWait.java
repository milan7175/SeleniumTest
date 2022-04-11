package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();

           driver.get("https://www.facebook.com/");
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));// max 20 seconds, also not fixed time
          

		
		driver.findElement(By.linkText("Create new account")).click();
		 
		//Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("jbvj");
		
		driver.findElement(By.name("lastname")).sendKeys("bucdic");
		driver.findElement(By.name("reg_email__")).sendKeys("6945695995");
		driver.findElement(By.id("password_step_input")).sendKeys("nvoheoivh");
		
		// select day, month, year
		
		WebElement month = driver.findElement(By.id("month"));
		Select m = new Select(month);
		m.selectByValue("7");
		
		WebElement day = driver.findElement(By.id("day"));
		Select da = new Select(day);
		da.selectByValue("20");
		

		WebElement year = driver.findElement(By.id("year"));
		Select y = new Select(year);
		y.selectByValue("2020");
		
		List<WebElement> gender = driver.findElements(By.xpath("//span[@data-type='radio']/span//label"));
		System.out.println(gender.size());
		
		//driver.findElement(By.xpath("//label[text()='Male']")).click();
		//System.out.println("......");
		
		for(WebElement a : gender) {
			
			if(a.isDisplayed()) {
				System.out.println(a.getText()+"......"+a.isSelected());
				
			}
		}
			System.out.println("......");
			
		WebElement radio = 	driver.findElement(By.xpath("//input[@value='2']"));
		radio.click();
		//Thread.sleep(4000);
		System.out.println(radio.isSelected()+"fahfkjehkghk");
		
		List<WebElement> gender1 = driver.findElements(By.xpath("//span[@data-type='radio']/span//input"));
			
			for(WebElement a : gender1) {
				if(a.isSelected()) {
					System.out.println(a.getAttribute("value")+",,,,,"+a.isSelected());
					
				}
			}
				
			
			
		driver.findElement(By.name("websubmit")).click();
		
		
	}

}
