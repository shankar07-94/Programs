package seleniumAssignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglesearchValidation {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", ".\\excutable\\chromedriver.exe");
		
		WebDriver d= new ChromeDriver();
		 //maximize
		 d.manage().window().maximize();
		 
		 //implicitly wait
		 d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		 d.get("https://www.google.com/");

		 WebElement drive = d.findElement(By.className("gLFyf"));
		 
		 drive.sendKeys("selenium interview question");
		 List<WebElement> write = d.findElements(By.cssSelector(".G43f7e>li"));
		 
		 System.out.println(write.size());
		 
		 for(int i =0;i<write.size();i++) {
		 WebElement print = write.get(i);
		 System.out.println(print.getText());
		 

	}

	}

}
