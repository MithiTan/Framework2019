package test.facebook;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeAssertTryCatch{
	@Test
	public void trycatchTest(){
		String expValue="google";//requirement
		String actValue="gooogle";//results,webapp
	
		Assert.assertEquals(actValue, expValue);
			
}
}