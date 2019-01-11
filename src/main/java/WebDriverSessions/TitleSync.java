package WebDriverSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TitleSync {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
//		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		System.out.println("before login page title is"+driver.getTitle());
		driver.findElement(By.id("username")).sendKeys("kamal.gyanesh8@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Windowvista1#");
		driver.findElement(By.id("loginBtn")).click();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Reports dashboard"));
		Thread.sleep(10000);
		System.out.println("after login page title is"+driver.getTitle());
		
		
	}
	
	
	
	
	
	
	
}
