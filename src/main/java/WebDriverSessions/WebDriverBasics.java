package WebDriverSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics 
{

	public static void main(String[] args) {
		
	//	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
	//	System.out.println(driver.getPageSource());
		
		
		//validate the title
		if(title.equals(title))
		{
			System.out.println("correct title");
		}
		else
		{
			System.out.println("incorrect title");
		}
		
		driver.quit();
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
