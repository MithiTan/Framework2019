package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Function {
	
public WebDriver driver;
	
	public void typexpath(String BNElocator ,String BNEvalue){
		//classname locators/classname values)
		driver.findElement(By.xpath(BNElocator)).sendKeys(BNEvalue);	
	}
	
	public void clickbyxpath(String BNElocator ){
		driver.findElement(By.xpath(BNElocator)).click();
		
	}
	public void clickbylinktext(String  ELoc){
		driver.findElement(By.linkText( ELoc)).click();
		
	}
	public void gettitle(String BNElocator){
		driver.findElement(By.xpath(BNElocator)).getText();
	}
	
		
		
	

}
