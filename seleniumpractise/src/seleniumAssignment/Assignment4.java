package seleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

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
		        
		         kd.findElement(By.id("username")).sendKeys("admin");
		        
		        //identify the required element from the UI
		        WebElement pwdinputfield= kd.findElement(By.name("pwd"));
		        //perform appropriate action the identified element
		        pwdinputfield.sendKeys("manager");
		        
		        //identify the required element from the UI
		        WebElement loginButton= kd.findElement(By.id("loginButton"));
		        //perform appropriate action the identified element
		        loginButton.click();
		        
		        // close browser
		       // kd.close();

		        
		        
		        
		        
		        
		        
		        
	}

}
