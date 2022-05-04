package day5handlingmultipleElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoblazeCategorie1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\excutable\\chromedriver.exe");
		
		WebDriver d= new ChromeDriver();
		 //maximize
		 d.manage().window().maximize();
		 
		 //implicitly wait
		 d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		 d.get("https://demoblaze.com/");
		 
		 WebElement categories= d.findElement(By.cssSelector(".list-group>*:nth-child(1)"));
		 System.out.println(categories.isDisplayed());
		 System.out.println(categories.isEnabled());
		 System.out.println(categories.getText().equals("CATEGORIES"));
		 System.out.println("*********************************************************");
		 
		 WebElement phones= d.findElement(By.cssSelector(".list-group>*:nth-child(2)"));
		 System.out.println(phones.isDisplayed());
		 System.out.println(phones.isEnabled());
		 System.out.println(phones.getText().equals("Phones"));
		 System.out.println("*********************************************************");
		 
		 WebElement laptops= d.findElement(By.cssSelector(".list-group>*:nth-child(3)"));
		 System.out.println(laptops.isDisplayed());
		 System.out.println(laptops.isEnabled());
		 System.out.println(laptops.getText().equals("Laptops"));
		 System.out.println("*********************************************************");
		 
		 WebElement monitors= d.findElement(By.cssSelector(".list-group>*:nth-child(4)"));
		 System.out.println(monitors.isDisplayed());
		 System.out.println(monitors.isEnabled());
		 System.out.println(monitors.getText().equals("Monitors"));
	}

}
