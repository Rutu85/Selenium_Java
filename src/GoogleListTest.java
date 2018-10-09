import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleListTest {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("lst-ib")).sendKeys("canada");
		Thread.sleep(3000);
		List<WebElement> suggestion = driver.findElements(By.xpath("//div[contains(text(),\"canada\")]"));
		System.out.println(suggestion.size());
		for(WebElement i:suggestion) {
			System.out.println(i.getText());
		}
	}

}
