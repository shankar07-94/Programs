package seleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		
		        //Step1 :set executable path
				System.setProperty("webdriver.chrome.driver", ".\\excutable\\chromedriver.exe");
				//STEP2 :create instance of required browser
		        WebDriver d= new ChromeDriver();
		        
		        d.get("https://demo.vtiger.com//vtigercrm//index.php");
		        
		        String expectedTitle= "";
		        String actualTitle= d.getTitle();
		        if(actualTitle.equals(expectedTitle)) {
		        	System.out.println("login page opened succesfully..");
		        	}else {
		        		System.out.println("Either login page not opened or page title got changed");
		        	}
		     
		        //identify the required element from the UI
		        WebElement userNameinputfield= d.findElement(By.id("username"));
		        //perform appropriate action the identified element
		        userNameinputfield.sendKeys("admin");
		        //remove existing text from the input field
		       userNameinputfield.clear();
		       userNameinputfield.sendKeys("admin");
		        
		        //identify the required element from the UI
		        WebElement passwordinputfield= d.findElement(By.name("password"));
		        //perform appropriate action the identified element
		        passwordinputfield.sendKeys("Test@123");
		        
		      //remove existing text from the input field
               passwordinputfield.clear();
               passwordinputfield.sendKeys("Test@123");
               
               //identify the required element from the UI
               WebElement loginButton= d.findElement(By.className("button"));
               //perform appropriate action the identified element
               loginButton.click();
		        
		        //close browser
              // d.close();

	}

}
