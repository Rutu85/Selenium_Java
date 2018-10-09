import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/*
 * Make an Object of Actions class by passing Webdriver Object and then we can
 * use its methods on Webelement searched by webdriver
 * used to do Mouse and Keyboard actions
 */

public class ActionClassTest {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		Actions builder = new Actions(driver);
		driver.get("https://www.amazon.com/");
		WebElement department = driver.findElement(By.linkText("Departments"));
		builder.moveToElement(department).build().perform();
		
		Thread.sleep(3000);
		
		WebElement music = driver.findElement(By.xpath("(//span[contains(text(),\"Amazon Music\")])[1]"));
		builder.moveToElement(music).build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("Prime Music")).click();
	}
	
}
