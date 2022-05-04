package browseroperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class genericwaytoopenchromebrowser {

	public static void main(String[] args) {
		String driverPath1 = "D:\\accleration\\java Programs\\seleniumpractise\\excutable\\chromedriver.exe";
		//or
		String driverPath2 =".\\excutable\\chromedriver.exe";
		//or
		String driverPath3 =System.getProperty("user.dir")+"\\excutable\\chromedriver.exe";
		
		//Step1 :set executable path by using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath1);
		//Step2 :create an instance path of firefox Browser
		WebDriver cdriver= new ChromeDriver();


	}

}
