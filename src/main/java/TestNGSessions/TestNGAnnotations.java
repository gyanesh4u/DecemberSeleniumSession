package TestNGSessions;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {

	@BeforeSuite//1
	public void launchBrowser()
	{
	System.out.println("Launch Browser");
	}
	@BeforeTest//2
	public void deleteAllCookies()
	{
		System.out.println("delete all cookies");
	}
	@BeforeClass//3
	public void enterURL()
	{
		System.out.println("enter URL");
	}
	@BeforeMethod//4//7//10
	public void login()
	{
		System.out.println("login to app");
	}
	
	@Test//5
	public void homePageHeaderTest()
	{
		System.out.println("home page header test");
	}
	@Test//6
	public void homePageUserInfoTest()
	{
		System.out.println("homePageUserInfoTest");
	}
	@Test//7
	public void homePageTittleTest()
	{
		System.out.println("homePageTittleTest");
	}
	
	@AfterMethod//6//9//12
	public void logout()
	{
		System.out.println("logout");
	}
	@AfterClass
	public void deleteUser()
	{
		System.out.println("delete user");
	}
	@AfterTest
	public void closeDBConnection()
	{
		System.out.println("close db connection");
	}
	@AfterSuite
	public void closeBrowser()
	{
		System.out.println("close browser");
	}
}
