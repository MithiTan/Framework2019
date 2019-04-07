package test.facebook;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrecTryCatch {
	
	@Test
	public void trycatchTest(){
		String expValue="google";//requirement
		String actValue="gooogle";//results,webapp
		
		try{
			//verify the expvalue=actvalue
		Assert.assertEquals(actValue, expValue);
			
		}catch(Throwable t){
			//give the reason why falling
			System.err.println("didn't match" +t);
		}
				
	}

}
