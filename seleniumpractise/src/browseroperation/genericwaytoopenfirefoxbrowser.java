package browseroperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class genericwaytoopenfirefoxbrowser {

	public static void main(String[] args) {
		String driverPath1 = "D:\\accleration\\java Programs\\seleniumpractise\\excutable\\geckodriver.exe";
		//or
		String driverPath2 =".\\excutable\\geckodriver.exe";
		//or
		String driverPath3 =System.getProperty("user.dir")+"\\excutable\\geckodriver.exe";
		
		//Step1 :set executable path by using System.setProperty(String key,String value)
		System.setProperty("webdriver.gecko.driver", driverPath1);
		//Step2 :create an instance path of firefox Browser
		WebDriver cdriver= new FirefoxDriver();


	}

}
