package WebDriverSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTitleTest 
{

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.facebook.com");
	String aTitle=driver.getTitle();
	System.out.println("Actual Title is " +aTitle);
	
	String eTitle="Facebook – log in or sign up";
	
	if(aTitle.equals(eTitle))
	{
		System.out.println("Title is matching");
	}
	else
	{
		System.out.println("Title is not matching");
	}
		driver.quit();
		
		
	}
	
}
