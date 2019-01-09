package WebDriverSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.com");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int count=links.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			System.out.println(links.get(i).getText());
		}
		
		driver.quit();
		
		
	}

}
