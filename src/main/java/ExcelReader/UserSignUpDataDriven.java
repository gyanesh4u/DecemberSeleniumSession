package ExcelReader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserSignUpDataDriven {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.freecrm.com/register/");
		
		Xls_Reader reader=new Xls_Reader();
		
	}
	
	
	
	
	
	
}
