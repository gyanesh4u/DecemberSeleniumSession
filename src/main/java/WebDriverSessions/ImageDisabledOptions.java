package WebDriverSessions;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ImageDisabledOptions {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		
		disableImageChrome(options);
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://www.amazon.com");
		System.out.println(driver.getTitle());
	}
	public static void disableImageChrome(ChromeOptions options)
	{
		HashMap<String,Object> images=new HashMap<String, Object>();
		images.put("images",2);
		HashMap<String,Object> prefs=new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values", images);
		options.setExperimentalOption("prefs",prefs);
	}
	
	
	
	
	
	
}
