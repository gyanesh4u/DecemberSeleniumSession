package WebDriverSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickMethod {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
		
		driver.findElement(By.name("username")).sendKeys("jimmy4u");
		driver.findElement(By.name("password")).sendKeys("windowvista");
	//	driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Actions action=new Actions(driver);
		action.click(driver.findElement(By.xpath("//input[@type='submit']"))).build().perform();
		
		
	}

}
