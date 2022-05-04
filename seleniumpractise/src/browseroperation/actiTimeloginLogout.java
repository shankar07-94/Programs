package browseroperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actiTimeloginLogout {

	public static void main(String[] args) {
		
		//Step1 :set executable path
				System.setProperty("webdriver.chrome.driver", ".\\excutable\\chromedriver.exe");
				//STEP2 :create instance of required browser
		        WebDriver d= new ChromeDriver();
		        
		        //implicit way
		        d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		        
		        
		        d.get("https://demo.actiTime.com/login.do");
		        
		        String expectedTitle= "actiTIME - Login";
		        String actualTitle = d.getTitle();
		        System.out.println("Actual TItle :"+actualTitle);
		        if (actualTitle.equals(expectedTitle)) {
		        	System.out.println("Login page opened successfully..");
		        }else {
	        		System.out.println("Either login page not opened or page title got changed");
	        	}
		        
		        d.findElement(By.id("username")).sendKeys("admin");
		        d.findElement(By.name("pwd")).sendKeys("manager");
		        d.findElement(By.id("loginButton")).click();
		        
		       WebElement logoutButton= d.findElement(By.id("logoutLink"));
		        //Explicitly Wait
		       WebDriverWait wait= new WebDriverWait(d,20);
		       wait.until(ExpectedConditions.elementToBeClickable(logoutButton));
		       
		        String actualHomepageTitle= d.getTitle();
		        System.out.println("Actual home Page:"+actualHomepageTitle);
		        
		        String expectedHomepageTitle="actiTIME - Enter Time-Track";
		        if(actualHomepageTitle.equals(expectedHomepageTitle)) {
		        	System.out.println("Login is succesfully and Home page Title is verified");
		        }else {
		        	System.out.println("Either login is failed or Home page Title is changed ");
		        }
		        
		        d.findElement(By.id("logoutLink")).click();
		       // d.findElement(By.linkText("Logout")).click();

	}

}
