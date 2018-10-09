import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementPresentTest {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.nike.com/ca/en_gb/");
		
		List<WebElement> element = driver.findElements(By.linkText("MEN"));
		System.out.println(element.size());
		
		if(element.size()==1) {
			System.out.println("Element present");
		}else {
			System.out.println("Element absent");
		}

	}

}
