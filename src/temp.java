import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class temp {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/sql/");
		List<WebElement> suggestion = driver.findElements(By.xpath("(.//*[@target='_top'])"));
		
		for(WebElement x:suggestion) {
			System.out.println(x.getText());
		}
	}

}
