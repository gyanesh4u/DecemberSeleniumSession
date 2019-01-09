package WebDriverSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement target = driver.findElement(By.id("draggable"));
		WebElement source = driver.findElement(By.id("droppable"));
		
		Actions action=new Actions(driver);
		
		//action.clickAndHold(target).moveToElement(source).release().build().perform();
		
		action.dragAndDrop(target, source).perform();
		
		
		
	}

}
