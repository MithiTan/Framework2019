package test.facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class FacebookEmailandPassword {
	
	

	@Test//test annotation-without this annotation you cant excuted any test
	public void testfacebookemailpassword(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mithitan\\Documents\\GitHub\\Framework2019\\drivers\\chromedriver.exe");
	//intit the chrome driver
	WebDriver driver=new ChromeDriver();
	//lets go the facebook
	driver.get("https://www.facebook.com/");
	// maximize the window 
	driver.manage().window().maximize();
	// wait 30 second to wait all elements to load in the page
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	//locators
	String email = "//input[@name='reg_email__']";
	String password = "//input[@name='reg_passwd__']";
	//values
	String EVal = "Fname";
	String PVal = "Lname";

	//Enter first name 
	driver.findElement(By.xpath(email)).sendKeys(EVal);
	//Enter last name
	driver.findElement(By.xpath(  password)).sendKeys( PVal);


	}

}
