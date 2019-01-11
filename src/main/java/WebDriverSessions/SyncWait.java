package WebDriverSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SyncWait {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver, 20);
		driver.get("https://app.hubspot.com/login");
		driver.findElement(By.id("username")).sendKeys("kamal.gyanesh8@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Windowvista1#");
		driver.findElement(By.id("loginBtn")).click();
		//Thread.sleep(10000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("private-page_title")));
	//	System.out.println(driver.findElement(By.className("private-page_title")).isDisplayed());
		
		
		
		
		
		
	}

}
