package webDrivermanager;

import java.util.concurrent.TimeUnit; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class webDrivermanagerSetupForChrome {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", ".\\excutable\\chromedriver.exe");
		                   //or
		//Use WebDrivermanager to manager Chrome browser executable based on system requirement
		//use setup method of WebDriverManager
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.makemytrip.com");
		
		driver.close();
		

	}

}
