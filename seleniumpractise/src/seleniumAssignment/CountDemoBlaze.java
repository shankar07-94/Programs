package seleniumAssignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.omg.Messaging.SyncScopeHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountDemoBlaze {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", ".\\excutable\\chromedriver.exe");
		
		WebDriver d= new ChromeDriver();
		 //maximize
		 d.manage().window().maximize();
		 
		 //implicitly wait
		 d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		 d.get("https://demoblaze.com/");
		 List<WebElement> name = d.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
			System.out.println(name.size());
			for(int i=0;i<name.size();i++ ) {
				WebElement print = name.get(i);
				System.out.println(print.getText());
			}
			
	}
}
		 

	


