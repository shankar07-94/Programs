package seleniumAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Vtigerloginlogout {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\excutable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 //implicit way
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		String PageTitle = driver.getTitle();
		System.out.println("Page Title :"+PageTitle);
		System.out.println("Page Title Length :"+PageTitle.length());
		
		String SourceCode= driver.getPageSource();
		System.out.println("Source Code :"+SourceCode.length());
		//System.out.println("Source Code :"+SourceCode);
		
		String actualURL = driver.getCurrentUrl();
		System.out.println("Actual url :"+actualURL);
		String ExpectedURL = "https://demo.vtiger.com/vtigercrm/index.php";
		if (actualURL.equals(ExpectedURL)) {
			System.out.println("Login page opened sucessfully...");
		} else {
			System.out.println("Either login page not opened or page title got changed");
		}

		WebElement UserNameInputField = driver.findElement(By.id("username"));
		UserNameInputField.clear();
        UserNameInputField.sendKeys("admin");

		WebElement PwdInputField = driver.findElement(By.name("password"));
		PwdInputField.clear();
		PwdInputField.sendKeys("Test@123");

		WebElement SignINButton = driver.findElement(By.tagName("button"));
        SignINButton.click();
        
        WebElement SignoutButton= driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT"));
        //Explicitly Wait
       WebDriverWait wait= new WebDriverWait(driver,40);
       wait.until(ExpectedConditions.elementToBeClickable(SignoutButton));
       
       String actualHomepageTitle= driver.getTitle();
       System.out.println("Actual home Page:"+actualHomepageTitle);
       
       String expectedHomepageTitle="https://demo.vtiger.com/vtigercrm/index.php";
       if(actualHomepageTitle.equals(expectedHomepageTitle)) {
       	System.out.println("Login is succesfully and Home page Title is verified");
       }else {
       	System.out.println("Either login is failed or Home page Title is changed ");
       }

      // driver.findElement(By.className("fa-user")).click();
		
		 driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
		// driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT"))
		driver.manage().timeouts().implicitlyWait(65, TimeUnit.SECONDS);
		
		//driver.close();
	}
}
		
		
		

	


