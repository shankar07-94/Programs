package browseroperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openGoogle {

	public static void main(String[] args) {
		//open chrome browser
		//Step1 :set executable path
		System.setProperty("webdriver.chrome.driver", ".\\excutable\\chromedriver.exe");
		
		//STEP2 :create instance of required browser
		WebDriver driver= new ChromeDriver();
		
		//enter google URL
		driver.get("https://www.google.com/");
		       
		 
		System.out.println("Application page source : "+driver.getPageSource());
		String sourceCode = driver.getPageSource();
	    System.out.println("source code length :"+sourceCode.length()); 
		System.out.println("Application current url: "+driver.getCurrentUrl());
		System.out.println("Application current Title: "+driver.getTitle());
		
		//close current instance of browser
		driver.close();

				

	}

}
