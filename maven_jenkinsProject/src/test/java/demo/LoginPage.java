package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPage {
	WebDriver driver=null;
	@Test
	
	
	public void loginFlipkart() {
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}
	
	@Test
	public void logoutFlipkart() {
		driver.quit();
	}
}
