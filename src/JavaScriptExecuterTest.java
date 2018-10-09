

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecuterTest {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.mississauga.ca/portal/home");
		WebElement image = driver.findElement(By.xpath(".//img[@alt='City Hall']"));
		/*Point point = image.getLocation();
		System.out.println("X Position : " + point.x);
		System.out.println("Y Position : " + point.y);*/
		
		driver.get("http://www.mississauga.ca/portal/cityhall/agendas");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0,1000)", "");
		
		WebElement ele = driver.findElement(By.linkText("Council"));
		jse.executeScript("arguments[0].scrollIntoView(true);",ele);
	}

}
