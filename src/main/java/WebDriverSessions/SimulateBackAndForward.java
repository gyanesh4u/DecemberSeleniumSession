package WebDriverSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimulateBackAndForward 
{

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		
		driver.get("http://www.google.com");
		
		driver.navigate().to("http://www.rediffmail.com");
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		
		driver.quit();
		
	}
	
	
	
	
	
	
	
}
