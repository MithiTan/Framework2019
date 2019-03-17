package test.facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFacebook {
//tell the code where is your driver locators
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mithitan\\Documents\\GitHub\\Framework2019\\drivers\\chromedriver.exe");
	//intit the chrome driver
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//locators
	String Fnloc="/input[@name='firstname']";
	
	
	
	
	
	
	
	
	//Enter first name 
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Fname");
	//Enter last name
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Lname");

	}

}
