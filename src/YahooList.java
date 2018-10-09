import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooList {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.yahoo.com/");
		driver.findElement(By.id("uh-search-box")).sendKeys("canada");
		Thread.sleep(3000);
		//List<WebElement> suggestion = driver.findElements(By.xpath("//*[contains(@data,'canada')]"));
		List<WebElement> suggestion = driver.findElements(By.xpath("//li[@role='option']"));
		System.out.println(suggestion.size());
		for(WebElement i:suggestion) {
			System.out.println(i.getAttribute("data"));
		}
	}

}
