import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		Actions builder = new Actions(driver);
		driver.get("http://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		System.out.println(droppable.getText());
		
		builder.dragAndDrop(draggable, droppable).build().perform();
		
		Thread.sleep(4000);
		
		System.out.println(droppable.getText());
		
	}

}
