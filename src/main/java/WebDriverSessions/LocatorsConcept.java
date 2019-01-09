package WebDriverSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.hubspot.com/login/");
		
		WebElement email = driver.findElement(By.id("username"));
		
		email.sendKeys("naveenanimation20@gmail.com");
		
		WebElement password = driver.findElement(By.id("password"));
		
		password.sendKeys("test@1234");
		
		driver.findElement(By.id("loginBtn")).click();
		
		//1. id
		//2. name
		//3. xpath/css selector
		//4. className
		
		
		
	}
	
	
	
	
	
	
	
	
}
