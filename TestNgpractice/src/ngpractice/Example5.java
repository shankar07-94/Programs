package ngpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Example5 {


	@Test
	public void loginLogoutInActitimeApplication() {
      
		//SeleniumUtility utility = new SeleniumUtility();
		//WebDriver driver = utility.setUp("chrome", "https://demo.actitime.com/login.do");
		//Step1 :set executable path
				System.setProperty("webdriver.chrome.driver", ".\\excutable\\chromedriver.exe");
				//STEP2 :create instance of required browser
		        WebDriver driver= new ChromeDriver();
		        
		        driver.get("https://demo.actitime.com");
		        
		System.out.println("Before login page title: " + driver.getTitle());
		// validation using TestNG
		// Assert.assertEquals(driver.getTitle(), "actiTIME - Login"); //or
		Assert.assertEquals(driver.getTitle(), "actiTIME - Login", "Either login page not opened or title got changed");

		// identify the required element from the UI and perform required action 0-30
		WebElement usernameInputField = driver.findElement(By.id("username"));
		usernameInputField.sendKeys("admin");
		// identify the required element from the UI and perform required action 0-30
		driver.findElement(By.name("pwd")).sendKeys("manager");
		// identify the required element from the UI and perform required action
		driver.findElement(By.id("loginButton")).click(); // 0-30

		WebElement logoutBtn = driver.findElement(By.linkText("logout"));
		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(logoutBtn));

		System.out.println("After login page title: " + driver.getTitle());

		logoutBtn.click();

		driver.close();
	}

	@Test
	public void loginPageValidationInActitimeApplication() {

	//	SeleniumUtility utility = new SeleniumUtility();
//		WebDriver driver = utility.setUp("chrome", "https://demo.actitime.com/login.do");
		//Step1 :set executable path
		System.setProperty("webdriver.chrome.driver", ".\\excutable\\chromedriver.exe");
		//STEP2 :create instance of required browser
        WebDriver driver= new ChromeDriver();
        
        driver.get("https://demo.actitime.com");
		System.out.println("Before login page title: " + driver.getTitle());
		// validation using TestNG
		// Assert.assertEquals(driver.getTitle(), "actiTIME - Login"); //or
		Assert.assertEquals(driver.getTitle(), "actiTIME - Login", "Either login page not opened or title got changed");

		// identify the required element from the UI and perform required action 0-30
		WebElement usernameInputField = driver.findElement(By.id("username"));
		Assert.assertTrue(usernameInputField.isDisplayed());
		Assert.assertTrue(usernameInputField.isEnabled(),"User name input field is not functional");
		Assert.assertEquals(usernameInputField.getAttribute("placeholder"),"Username","Username input field placeholder name is changed");

		// identify remember check box
		WebElement checkBox = driver.findElement(By.name("remember"));
		Assert.assertTrue(checkBox.isDisplayed());
		Assert.assertTrue(checkBox.isEnabled(),"Checkbox is not functional");
		Assert.assertFalse(checkBox.isSelected(),"Checkbox is by defualt selected");
		
		checkBox.click();
		Assert.assertTrue(checkBox.isSelected(),"Checkbox is not functional");
		driver.close();
	}

}
