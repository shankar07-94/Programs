package webDrivermanager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDrivermanagerSetupforfirefox {

	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver", ".\\excutable\\geckodriver.exe");
        //or
//Use WebDrivermanager to manager firefox browser executable based on system requirement
//use setup method of WebDriverManager
WebDriverManager.firefoxdriver().setup();

WebDriver driver = new FirefoxDriver();
//maximize browser
driver.manage().window().maximize();
//implicit wait
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

driver.get("https://www.makemytrip.com");

driver.close();

	}

}
