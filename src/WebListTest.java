import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebListTest {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		WebElement footer = driver.findElement(By.id("fsl"));
		List<WebElement> allLinks = footer.findElements(By.tagName("a"));
		
		List<WebElement> allLink = driver.findElements(By.xpath(".//*[@id = 'fsl']"));
		System.out.println(allLinks.size());
		
		for (WebElement i: allLinks) {
			System.out.println(i.getText());
		}		

	}

}
