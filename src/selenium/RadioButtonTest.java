package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// get size of milk butter and cheese on https://echoecho.com/htmlforms10.htm website
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		//driver.manage().window().maximize();
		
		driver.get("https://echoecho.com/htmlforms10.htm");
		
		List<WebElement> group1 = driver.findElements(By.xpath("//*[@name='group1']"));
		System.out.println(group1.size());
		
	
		
		
		//for(int i = 0; i<group1.size(); i++) {
		for (WebElement a : group1) {
			
			
			if(a.isSelected()) {
			System.out.println(a.getAttribute("value")+ "----"+ a.isSelected());
			
			
		}
		}
		System.out.println("-----");
		
		driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		
		for (WebElement a : group1) {
			if(a.isSelected()) {
		
			System.out.println(a.getAttribute("value")+ "----"+ a.isSelected());
			
			}
		}
		
		
	}

}


/*List<WebElement> allRadioButtons = driver.findElements(By.name("group1"));
System.out.println(allRadioButtons.size());

for(WebElement a : allRadioButtons) {
	if(a.isSelected()) {
	System.out.println(a.getAttribute("value")+"----"+ a.isSelected());
}
}

//driver.findElement(By.xpath("//input[@value='Cheese']")).click();
allRadioButtons.get(2).click();
System.out.println("-----------------------------");

for(WebElement a : allRadioButtons) {
	if(a.isSelected()) {
	System.out.println(a.getAttribute("value")+"----"+ a.isSelected());
}
}
*/