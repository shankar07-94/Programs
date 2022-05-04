package browseroperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./excutable/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//STEP3 :to run link using get string refernce.get(URL);
		driver.get("https://demo.actitime.com/");
		//Step4:in order to username of site by using findelement(By.locator).sendleys(name);
        driver.findElement(By.id(("username"))).sendKeys("admin");
        driver.findElement(By.className("pwdfield")).sendKeys("manager");
        driver.findElement(By.id("loginButton")).click();
	}

}
