package browseroperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiTimelogin {

	public static void main(String[] args) {
		//Step1 :set executable path
		System.setProperty("webdriver.chrome.driver", ".\\excutable\\chromedriver.exe");
		//STEP2 :create instance of required browser
        WebDriver d= new ChromeDriver();
        
        d.get("https://demo.actiTime.com/login.do");
        
        String expectedTitle= "actiTIME - Login";
        String actualTitle= d.getTitle();
        if(actualTitle.equals(expectedTitle)) {
        	System.out.println("login page opened succesfully..");
        	}else {
        		System.out.println("Either login page not opened or page title got changed");
        	}
      
        //identify the required element from the UI
       // WebElement userNameinputfield= d.findElement(By.id("username"));
        //perform appropriate action the identified element
        //userNameinputfield.sendKeys("admin");
        //remove existing text from the input field
        //userNameinputfield.clear();
        //userNameinputfield.sendKeys("admin");
        
        //identify the required element from the UI
        //WebElement pwdinputfield= d.findElement(By.name("pwd"));
        //perform appropriate action the identified element
        //pwdinputfield.sendKeys("manager");
        
        //identify the required element from the UI
       // WebElement loginButton= d.findElement(By.id("loginButton"));
        
         //perform appropriate action the identified element
        //loginButton.click();
        
        // close browser
      // d.close();
        
        
	}

}
