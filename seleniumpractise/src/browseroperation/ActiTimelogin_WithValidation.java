package browseroperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimelogin_WithValidation {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", ".\\excutable\\chromedriver.exe");
		
		WebDriver d= new ChromeDriver();
		 //maximize
		 d.manage().window().maximize();
		 
		 //implicitly wait
		 d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		 d.get("https://demo.actiTime.com/login.do");
		 
		 WebElement usernameinputField= d.findElement(By.id("username"));
		 System.out.println("Username input field Visibility status is: "+usernameinputField.isDisplayed());
		 System.out.println("Username input field Editable status is: "+usernameinputField.isEnabled());
		 String actualDefaulttextusernamefield=usernameinputField.getAttribute("placeholder");
		 System.out.println("Defult text validation field of username :"+actualDefaulttextusernamefield.equals("Username"));
		 usernameinputField.sendKeys("admin");
		 
		 WebElement passwordinputField= d.findElement(By.name("pwd"));
		 System.out.println("password input field Visibility status is: "+passwordinputField.isDisplayed());
		 System.out.println("password input field Editable status is: "+passwordinputField.isEnabled());
		 String actualDefaulttextpasswordfield=passwordinputField.getAttribute("placeholder");
		 System.out.println("Defult text validation field of password :"+actualDefaulttextpasswordfield.equals("Password"));
		 passwordinputField.sendKeys("manager");
		 
		 //identify remember check box
		 WebElement checkbox= d.findElement(By.id("loginButton"));
		 System.out.println("keep me loggedin checkbox  field Visibility status is: "+checkbox.isDisplayed());
		 System.out.println("keep me loggedin checkbox clickable status is: "+checkbox.isEnabled());
		 System.out.println("keep me loggedin checkbox Default status is: "+checkbox.isSelected());
		// checkbox.click();
		 
		 
		 WebElement loginbutton= d.findElement(By.id("loginButton"));
		 System.out.println("loginbutton  field Visibility status is: "+loginbutton.isDisplayed());
		 System.out.println("loginbutton  field clickable status is: "+loginbutton.isEnabled());
		 loginbutton.click();
		 
         String actualloginbuttonName =loginbutton.getText();	 
		 System.out.println("actual button name validation :"+actualloginbuttonName.equals("Login"));
		loginbutton.click();
		 
	}

}
