package TestNGSessions;

import org.testng.annotations.Test;

public class InvocationCount {
	@Test(invocationCount=10)
	public void homePageHeaderTest()
	{
		System.out.println("home page header test");
	}
	
	@Test
	public void homePageUserInfoTest()
	{
		System.out.println("homePageUserInfoTest");
	}
}
