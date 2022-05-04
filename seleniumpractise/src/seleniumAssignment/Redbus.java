package seleniumAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilities.SeleniumUtility;

public class Redbus {

	public static void main(String[] args) {
		
		//SeleniumUtility s1 = new SeleniumUtility();
		//WebDriver driver = s1.setUp("chrome", "https://www.redbus.com/");
		//driver.findElement(By.cssSelector("#src")).sendKeys("Pune");
		
	//	SeleniumUtility s1=new SeleniumUtility();
		//WebDriver driver=s1.setUp("chrome", "https://www.redbus.in/");
		
        System.setProperty("webdriver.chrome.driver",".\\excutable\\chromedriver.exe");
		
		WebDriver chrome = new ChromeDriver();
		
		chrome.get("https://www.redbus.in/");
		
		chrome.manage().timeouts().implicitlyWait(23, TimeUnit.SECONDS);
		
		chrome.manage().window().maximize();
		
		//Depature From
		chrome.findElement(By.cssSelector("#src")).sendKeys("Pune");
		
		//Destination
		chrome.findElement(By.cssSelector("#dest")).sendKeys("Goa");

		
		// Calender On Date to go
		chrome.findElement(By.cssSelector("#onward_cal")).click();
		
		 //calender next button
	    
	    chrome.findElement(By.cssSelector("td[class='next']")).click();
	  
	    // date selection
	  
	      chrome.findElement(By.cssSelector(".rb-monthTable tr:nth-of-type(5) td:nth-of-type(6)")).click();
	    
	    //search button
	    
	    chrome.findElement(By.cssSelector("#search_btn")).click();
	    
	    //filter bus deptime
	    
	   chrome.findElement(By.cssSelector(".dept-time>li:nth-of-type(4)")).click(); 
	   
	   //Filter AC
	   chrome.findElement(By.cssSelector(".list-chkbox li:nth-of-type(3)")).click();
	}
	
}
		
	

	


