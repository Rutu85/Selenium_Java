import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://jqueryui.com/droppable/");
		
		WebElement link = driver.findElement(By.linkText("Sortable"));	
		
		String linkText = (link.getAttribute("href"));
		if(linkText.equals("http://jqueryui.com/sortable/")) {
			System.out.println("Link Present");
		}else {
			System.out.println("Link not present");
		}
		
		List<WebElement> box = driver.findElements(By.id("draggable"));
		if (box.size() == 1) {
			System.out.println("Box Present");
		}else {
			System.out.println("Box not present");
		}
		
		// SwitcTo() Method of Driver to switch between tabs, frames and alerts
		
		System.out.println("************* After Switchnning To Frame ***************");
		
		driver.switchTo().frame(0); // By passing Int
		//driver.switchTo().frame("idofframe"); //By passing ID
		//driver.switchTo().frame(driver.findElement(By.className(("demo-frame")))); //By passing WebElement
		
		box = driver.findElements(By.id("draggable"));
		if (box.size() == 1) {
			System.out.println("Box Present");
		}else {
			System.out.println("Box not present");
		}

		System.out.println("************* After Switching To Main Web Page ***************");
		
		driver.switchTo().defaultContent();
		
		box = driver.findElements(By.id("draggable"));
		if (box.size() == 1) {
			System.out.println("Box Present");
		} else {
			System.out.println("Box not present");
		}
		
		//driver.switchTo().parentFrame();
	}	
}
