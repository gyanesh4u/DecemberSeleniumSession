package WebDriverSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FreeCRMSignUp 
{

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.freecrm.com/register/");
		driver.findElement(By.name("first_name")).sendKeys("Gyanesh");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Kamal");
		driver.findElement(By.cssSelector("input[name=email]")).sendKeys("kamal.gyanesh8@gmail.com");
		driver.findElement(By.name("email_confirm")).sendKeys("kamal.gyanesh8@gmail.com");
		driver.findElement(By.name("username")).sendKeys("gyanesh123");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("abc123");
		driver.findElement(By.name("passwordconfirm")).sendKeys("abc123");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.id("submitButton")).click();
		
		driver.quit();
		
		
	}
}
