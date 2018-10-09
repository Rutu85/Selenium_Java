import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class PopupTest {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.aliexpress.com/");
		
		List<WebElement> popup = driver.findElements(By.cssSelector(".close-layer"));
		if(popup.size() == 1) {
			Thread.sleep(3000);
			popup.get(0).click();
			System.out.println("There was a popup on screen, and I have closed it");
		}else {
			System.out.println("There is No popup");
		}
		
	}

}
