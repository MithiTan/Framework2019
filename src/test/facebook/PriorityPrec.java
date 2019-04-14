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
	//@Test(enabled=false)
	//public void dontRunThisTest(){
	//	System.out.println("do not run this test");
	//}
	@Test(enabled=true,priority=5)
	public void RunThisTest(){
		System.out.println(" run this test");
	}
	
	
}
