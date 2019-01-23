package WebDriverSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementPresence {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.freecrm.com/register/");
		//boolean flag = driver.findElement(By.id("submitButton")).isEnabled();
		
		//System.out.println(flag);
		boolean presence = driver.findElement(By.id("submitButton")).isDisplayed();
		System.out.println(presence);
		boolean check = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(check);
		driver.findElement(By.name("agreeTerms")).click();
		boolean flag = driver.findElement(By.id("submitButton")).isEnabled();
		
		System.out.println(flag);
		
		
		
		
		
	}
}
