package WebDriverSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpAlertHandlin {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        System.out.println(text);
        
        if(text.equals("Please enter a valid user name"))
        {
        	System.out.println("correct error text");
        }
        else
        {
        	System.out.println("incorrect error text");
        }
		
		Thread.sleep(5000);
		alert.accept();//ok button
		
	
	}

}
