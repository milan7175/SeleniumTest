package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		//driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		
		List<WebElement> sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		
		if(sortable.size()>0) {
			System.out.println("sortable present");
		}else {
			System.out.println("sortable not present");
		}
		
		List<WebElement> dragable = driver.findElements(By.id("draggable"));
		System.out.println(dragable.size());
		
		if(dragable.size()>0) {
			System.out.println("dragable present");
		}else {
			System.out.println("dragable not present");
		}
		
		System.out.println("-------after switching frame");
		
		driver.switchTo().frame(0);
	    //driver.switchTo().frame(null) this case we cannot use
		//driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		
		if(sortable.size()>0) {
			System.out.println("sortable present");
		}else {
			System.out.println("sortable not present");
		}
		
		dragable = driver.findElements(By.id("draggable"));
		System.out.println(dragable.size());
		
		if(dragable.size()>0) {
			System.out.println("dragable present");
		}else {
			System.out.println("dragable not present");
		}
		System.out.println("------------");
		driver.switchTo().defaultContent();
		
		sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		
		if(sortable.size()>0) {
			System.out.println("sortable present");
		}else {
			System.out.println("sortable not present");
		}
		
		dragable = driver.findElements(By.id("draggable"));
		System.out.println(dragable.size());
		
		if(dragable.size()>0) {
			System.out.println("dragable present");
		}else {
			System.out.println("dragable not present");
		}
		
	}

}
