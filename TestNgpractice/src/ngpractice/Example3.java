package ngpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example3 {
@Test
	public void actiTime() {
		System.setProperty("webdriver.chrome.driver", ".\\excutable\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get("https://demo.actitime.com");
	}

}
