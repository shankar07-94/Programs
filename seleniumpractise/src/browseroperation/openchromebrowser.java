package browseroperation;

import org.openqa.selenium.chrome.ChromeDriver;

public class openchromebrowser {

	public static void main(String[] args) {
		
		String driverPath1 = "D:\\accleration\\java Programs\\seleniumpractise\\excutable\\chromedriver.exe";
		  //or
		String driverPath2 = ".\\excutable\\chromedriver.exe";
		  //or
		String driverPath3 = System.getProperty("user.dir")+"\\excutable\\chromedriver.exe";
		
		
		//Step1 :set driver executable path by using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver",driverPath1);
		//Step2 :create an instance path of chrome Browser
		ChromeDriver cdriver= new ChromeDriver();

	}

}
