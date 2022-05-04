package seleniumAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		//Step1 :set executable path
				System.setProperty("webdriver.chrome.driver", ".\\excutable\\chromedriver.exe");
				//STEP2 :create instance of required browser
		        WebDriver d= new ChromeDriver();
		        
		        d.get("https://www.facebook.com");
		        
		        String actualTitle= d.getTitle();
		        System.out.println("ActualTitle is :"+actualTitle);
		        
		        System.out.println("Application current Title:"+d.getTitle());
		       // d.close();

	}

}
