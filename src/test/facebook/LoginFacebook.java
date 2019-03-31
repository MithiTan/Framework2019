package test.facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginFacebook {
	@BeforeTest
	public void openbrower(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mithitan\\Documents\\GitHub\\Framework2019\\drivers\\chromedriver.exe");
		//intit the chrome driver
		WebDriver driver=new ChromeDriver();
		//lets go the facebook
		
	}
   //tell the code where is your driver locators
	
	@Test//test annotation-without this annotation you cant excuted any test
	public void testfacebookSignUp(){
	
	driver.get("https://www.facebook.com/");
	// maximize the window 
	driver.manage().window().maximize();
	// wait 30 second to wait all elements to load in the page
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	//driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Fname");
	//driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Lname");

	//locators
	String fnLoc = "//input[@name='firstname']";
	String lnLoc = "//input[@name='lastname']";
	//values
	String fnVal = "Fname";
	String lnVal = "Lname";

	//Enter first name 
	driver.findElement(By.xpath(fnLoc)).sendKeys(fnVal);
	//Enter last name
	driver.findElement(By.xpath( lnLoc)).sendKeys(lnVal);

	}
	
}
