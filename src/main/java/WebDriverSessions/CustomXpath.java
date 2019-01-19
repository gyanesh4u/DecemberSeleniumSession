package WebDriverSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
//		driver.findElement(By.xpath("//input[@class='form-control private-form__control login-email']"))
//		.sendKeys("kamal.gyanesh8@gmail.com");
//		
//		driver.findElement(By.xpath("//input[@id='username]"))
//		.sendKeys("kamal.gyanesh8@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='username' and @type='email']"))
		.sendKeys("kamal.gyanesh8@gmail.com");
		
//		//*[contains(@id,'username')] for contains is used with comma not =
		
		//body//div --30
		//body/div --5
		
		//CSS Selector
		driver.findElement(By.cssSelector("input.form-control.private-form__control.login-email"))
		.sendKeys("kamal.gyanesh8@gmail.com");
		driver.findElement(By.cssSelector("input.login-email")).sendKeys("test");
		driver.findElement(By.cssSelector(".login-email")).sendKeys("test");
		
		//input#username===>id
		//input.login====>class
		//#username
	}
		
}
