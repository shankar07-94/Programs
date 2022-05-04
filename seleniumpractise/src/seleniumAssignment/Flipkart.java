package seleniumAssignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		
          System.setProperty("webdriver.chrome.driver", ".\\excutable\\chromedriver.exe");
		
		WebDriver d= new ChromeDriver();
		 //maximize
		 d.manage().window().maximize();
		 
		 //implicitly wait
		 d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		 d.get("https://www.flipkart.com/");
		 List<WebElement> name = d.findElements(By.cssSelector("._37M3Pb>div>a>div>div>div"));
			System.out.println(name.size());
			for(int i=0;i<name.size();i++ ) {
				WebElement print = name.get(i);
				System.out.println(print.getText());
			}
			
	}


	}


