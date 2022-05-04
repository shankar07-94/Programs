package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumUtility {

	public WebDriver setUp(String browserName, String appUrl) {
		WebDriver driver = null;
		if(browserName.equalsIgnoreCase("Chrome")) {
			//use setup method of WebDriverManager
			WebDriverManager.chromedriver().setup();
			//Step2 :create an instance of chrome browser
			driver = new ChromeDriver();
		}else if (browserName.equalsIgnoreCase("firefox")) {
			//use setup method of WebDriverManager
			WebDriverManager.firefoxdriver().setup();
			//Step2 :create an instance of firefox browser
			driver = new FirefoxDriver();
		}
		
	        	//maximize browser
				driver.manage().window().maximize();
				//implicit wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				//driver.get(appUrl)
				driver.get("https://www.makemytrip.com");
				return driver;
			}

}
