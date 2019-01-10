package WebDriverSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementAction {

	public static WebDriver driver;
	/*
	 * This method is uded to launch the url.If url is blank
	 * or null,it will throw exception
	 * If url is valid it will launch the url
	 */
	public static void launchUrl(String url)
	{
		if(url.equals("")||url.equals(null))
		{
			try
			{
				throw new Exception("url is blank null");
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		try
		{
			driver.get(url);
		}
		catch(Exception e)
		{
			System.out.println("URL fif not load");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	/*
	 * This method is uded to launch the url.If url is blank
	 * or null,it will throw exception
	 * If url is valid it will launch the url
	 */
	public static void navigateToUrl(String url)
	{
		if(url.equals("")||url.equals(null))
		{
			try
			{
				throw new Exception("url is blank null");
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		try
		{
			driver.get(url);
		}
		catch(Exception e)
		{
			System.out.println("URL fif not load");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	/*
	 * This method will return title of the page
	 */
	public static String getPageTitle()
	{
		String title=null;
		try{
		title=driver.getTitle();
		System.out.println("Page title is"+title);
		return title;
		}
		catch(Exception e)
		{
			try {
				throw new Exception("Title not available exception,some error occured");
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			
		}
		return null;
	}
	/*
	 * This method will return a webelemaent on the basis
	 * of selector
	 */
	public static WebElement getElement(By selector)
	{
		try
		{
		return driver.findElement(selector);
		}
		catch(Exception e)
		{
			try {
				throw new Exception("Element not found or not visible ");
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		return null;
	}
	
	
	
	public static void main(String[] args) {
		driver=new ChromeDriver();
		launchUrl("http://www.google.com");
		getPageTitle();
		
		By un=By.name("username");
		By pwd=By.name("password");
		getElement(un).sendKeys("jimmy4u");
		getElement(pwd).sendKeys("windowvista");
	}
	
	
	
	
	
	
	
	
	
	
}
