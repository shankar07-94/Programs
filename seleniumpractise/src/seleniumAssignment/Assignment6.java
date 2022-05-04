package seleniumAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment6 {

	public static void main(String[] args) {
		
		System.setProperty(" webdriver.gecko.driver", ".\\excutable\\geckodriver.exe");
		
		WebDriver k= new FirefoxDriver();
		
		k.get("");

	}

}
