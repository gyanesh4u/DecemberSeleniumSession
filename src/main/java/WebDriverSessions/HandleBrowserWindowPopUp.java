package WebDriverSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindowPopUp {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindowId = it.next();
		System.out.println(parentWindowId);
		String childWindowId = it.next();
		System.out.println(childWindowId);
		driver.switchTo().window(childWindowId);
		System.out.println("child window title is: "+driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window title is: "+driver.getTitle());
		driver.quit();
		
		
		
	}

}
