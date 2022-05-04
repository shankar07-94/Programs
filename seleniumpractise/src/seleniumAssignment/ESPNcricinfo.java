package seleniumAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ESPNcricinfo {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", ".\\excutable\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();

		chrome.get("https://www.espncricinfo.com/");
		
		String expectedtitle = "Indian Premier League,Indian Premier League2022,Match...";

		String actualtitle=chrome.getTitle() ;
		
		System.out.println(actualtitle.equals(expectedtitle));
		
System.out.println("*******************************");
		
		WebElement matches = chrome.findElement(By.className("ds-cursor-pointer"));
		
		System.out.println(matches.isDisplayed());
		System.out.println(matches.isSelected());
		System.out.println(matches.isEnabled());

		System.out.println("*******************************");
		
	
    	WebElement livescores =chrome.findElement(By.cssSelector(".ds-popper-wrapper :nth-of-type(1)"));
        
		System.out.println(livescores.isDisplayed());
		System.out.println(livescores.isSelected());
		System.out.println(livescores.isEnabled());

		System.out.println("*******************************");
		
		WebElement search = chrome.findElement(By.className("ds-flex-row"));
		
		System.out.println(search.isDisplayed());
		System.out.println(search.isSelected());
		System.out.println(search.isEnabled());

		System.out.println("*******************************");
		
		List<WebElement> count = chrome.findElements(By.cssSelector(".ds-flex >div>div>div>span>span>span"));
		
		System.out.println(count.size());
		
		for(int i=0;i<count.size();i++) {
			
			System.out.println(count.get(i).getText());
			
			System.out.println("*******************************");
	
			
			
		}
		



	}

}
