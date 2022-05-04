package practise.com;

import org.openqa.selenium.chrome.ChromeDriver;

public class Browserlaunching {

	public static void main(String[] args) {
		//step 1 putpath
		System.setProperty("webdriver.chrome.driver", "./excutable/chromedriver.exe");
         //step 2 makingobject of class
		ChromeDriver d = new ChromeDriver();	
		//step 3 write the URL by using getURL
		d.get("https://www.facebook.com/");
	}

}
