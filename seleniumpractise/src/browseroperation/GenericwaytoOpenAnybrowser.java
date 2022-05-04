package browseroperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericwaytoOpenAnybrowser {

	public static void main(String[] args) {
		
		String chromedriverPath = System.getProperty("user.dir")+"\\excutable\\chromedriver.exe";
		String geckodriverPath = System.getProperty("user.dir")+"\\excutable\\geckodriver.exe";

		openBrowser(chromedriverPath, "chrome");
		openBrowser(geckodriverPath, "firefox");
	}
	static void openBrowser(String driverPath, String browserName) {
	
	if(browserName.equalsIgnoreCase("chrome")) {
		//Step1 :set driver executable path by using System.setProperty(String key,String value)
				System.setProperty("webdriver.chrome.driver",driverPath);
				//Step2 :create an instance path of chrome Browser
				WebDriver cdriver= new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox"))
		{
			//Step1 :set driver executable path by using System.setProperty(String key,String value)
			System.setProperty("webdriver.gecko.driver",driverPath);
			//Step2 :create an instance path of chrome Browser
			WebDriver cdriver= new FirefoxDriver();
		}

}
}
