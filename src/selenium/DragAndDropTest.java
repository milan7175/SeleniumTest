package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDropTest {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		//driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		
		driver.switchTo().frame(0);
		WebElement dragabble = driver.findElement(By.id("draggable"));
		WebElement dropabble = driver.findElement(By.id("droppable"));

		Actions builder = new Actions(driver);
		builder.dragAndDrop(dragabble, dropabble).build().perform();
		
		//Thread.sleep(3000);
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//p[text()='Dropped!']"), 0));
		
		
		// add verification
		
		List<WebElement> dropped = driver.findElements(By.xpath("//p[text()='Dropped!']"));
		System.out.println(dropped.size());
		
		if(dropped.size()>0) {
			System.out.println("test pass");
		}else
		{
			System.out.println("test fail");
		}
		
	}

}
