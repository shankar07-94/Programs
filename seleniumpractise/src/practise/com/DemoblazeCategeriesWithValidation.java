package practise.com;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoblazeCategeriesWithValidation {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", ".\\excutable\\chromedriver.exe");
		
		WebDriver d= new ChromeDriver();
		 //maximize
		 d.manage().window().maximize();
		 
		 //implicitly wait
		 d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		 d.get("https://demoblaze.com/");
		 
		 List<WebElement> categories= d.findElements(By.cssSelector(".list-group>a"));
		 System.out.println("Option size is :"+categories.size());
		 List<String> l1= new ArrayList();
		 l1.add("CATEGORIES");
		 l1.add("Phones");
		 l1.add("Laptops");
		 l1.add("Monitors");
		 for(int i=0;i<categories.size();i++){
		 
		 WebElement cat= categories.get(i);
		 System.out.println("***** element of List is:"+cat.getText()+"*******");
		 
		 System.out.println(cat.isDisplayed());
		 System.out.println(cat.isEnabled());
		 System.out.println(cat.getText().equals(l1.get(i)));
		 }
	}

}
