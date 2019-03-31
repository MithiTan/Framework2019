package test.facebook;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class PriorityPrec {

	@Test(priority=2)
	public void changePass(){
		System.out.println("changing password");
	}
	@Test(priority=3)
	public void LogOuttest(){
		System.out.println("logout test");
	}
	@Test
	public void LoginTest(){
		System.out.println("login test");
	}
	
	@Test(priority=4)
	public void goingToSkipTest(){
		System.out.println("Skipped the test");
		throw new SkipException("use ticket name -requirment changed to skipping it");
	}
	
}
