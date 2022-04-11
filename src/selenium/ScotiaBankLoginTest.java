package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScotiaBankLoginTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
	
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=0emWDZ4ugMI&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5nb29nbGUuY29tXC8iLCJvYXV0aF9rZXkiOiIwZW1XRFo0dWdNSSIsImNvbnNlbnRfcmVxdWlyZWQiOmZhbHNlLCJyZWRpcmVjdF91cmkiOiJodHRwczpcL1wvd3d3LnNjb3RpYW9ubGluZS5zY290aWFiYW5rLmNvbVwvb25saW5lXC9sYW5kaW5nXC9vYXV0aGxhbmRpbmcuYm5zIiwiZXhwIjoxNjQyOTcxOTkwLCJpYXQiOjE2NDI5NzA3OTAsImp0aSI6IjU5Y2MwN2NkLWVhYjctNDI5Mi04M2NhLTEzMmRmMzMzZmM4MCIsImNsaWVudF9pZCI6IjhlZTkwYzM5LTFjNTItNGZmNC04YWU2LWE3YjU0YzUzOTkzMyIsImNsaWVudF9tZXRhZGF0YSI6eyJDaGFubmVsSUQiOiJTT0wiLCJBcHBsaWNhdGlvbkNvZGUiOiJINyJ9LCJpc3N1ZXIiOiJodHRwczpcL1wvcGFzc3BvcnQuc2NvdGlhYmFuay5jb20ifQ.mZ0hV894UX9ewur1Vzwtc2fPU0dCH9OHdwEMX688pakDGVhqErBN8FIYEqrxSqXY3ntwkKSPueUrSbZEdOZ-n_YmoJGfl7U2qFhVo2vILSdDW1WEb2WDiRdwspSmj7LqHTee4GKjMJLRCKAgAuL_mVwh0pi5VinamlMIq1BF1dupGo3eNBCLh2Dbc-qWeR9INtjgsrS3ov3Wu3AwoDEYSi8oRM99S9498giJnBL6gaceM9k20ZbipCUaB3e5sRgmKY1Gp-xSDAMRAknXKR1p0zpAbq8Eb3q9VO7Mf4I_y4H6p5_GuuPXV5kWc4H3S1yvNWMiz2kKNfdHM24f85khSw&preferred_environment=");

		
		driver.findElement(By.id("usernameInput-input")).sendKeys("hbidfvbisbv");
		driver.findElement(By.id("password-input")).sendKeys("dfibibfv");
	
		driver.findElement(By.className("ButtonCore__block")).click();
		
		Thread.sleep(2000);
		
		String ExpectedMessage = "Please check your card number / username or password and try again.";
		String ActualMessage = driver.findElement(By.id("globalError")).getText();
		System.out.println(ActualMessage);
		
		if(ExpectedMessage.equals(ActualMessage)) {
			System.out.println("TestPass");
		} else {
			System.out.println("testfail");
			
		}
	}

}
