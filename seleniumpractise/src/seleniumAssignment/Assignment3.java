package seleniumAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		//Step1 :set executable path
		System.setProperty("webdriver.chrome.driver", ".\\excutable\\chromedriver.exe");
		//STEP2 :create instance of required browser
        WebDriver d= new ChromeDriver();
        
        d.get("https://www.google.com");
        
        System.out.println("Application current URL :"+d.getCurrentUrl());
        System.out.println("Application Source Code :"+d.getPageSource());
        String PageSource= d.getPageSource();
      
        
        System.out.println("Appliction length :"+PageSource.length());
        d.close();
        

	}

}
