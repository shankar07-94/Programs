package practise.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationPage {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", ".\\excutable\\chromedriver.exe");
		WebDriver sk= new ChromeDriver();
		
		sk.get("https://www.saucedemo.com/");
		
		sk.findElement(By.id("user-name")).sendKeys("standard_user");
		sk.findElement(By.id("password")).sendKeys("secret_sauce");
		sk.findElement(By.name("login-button")).click();

	}

}
