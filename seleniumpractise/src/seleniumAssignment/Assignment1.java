package seleniumAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		//Step1 :set executable path
		System.setProperty("webdriver.chrome.driver", ".\\excutable\\chromedriver.exe");
		//STEP2 :create instance of required browser
        WebDriver kd= new ChromeDriver();
        
        kd.get("https://demo.actitime.com");
        
       System.out.println("Appllication current title :"+kd.getTitle());
        
        String title=kd.getTitle();
        int titlelength= kd.getTitle().length();
        System.out.println("length of title :"+titlelength);
       System.out.println("Application Source code:"+kd.getPageSource());
        
        String SourceCode= kd.getPageSource();
        System.out.println("source code length:"+SourceCode.length());
        
       kd.close();
	}

}
