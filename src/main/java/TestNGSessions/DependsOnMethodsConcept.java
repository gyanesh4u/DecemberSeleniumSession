package TestNGSessions;

import org.testng.annotations.Test;

public class DependsOnMethodsConcept {

	@Test
	public void login()
	{
		System.out.println("login to app");
		int i=9/0;
	}
	@Test(dependsOnMethods="login")
	public void homePageTest()
	{
		System.out.println("home page test");
	}
}
