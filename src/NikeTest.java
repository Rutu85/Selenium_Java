import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NikeTest {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.nike.com/ca/en_gb/");
		Actions builder = new Actions(driver);
		WebElement menDept = driver.findElement(By.linkText("MEN"));
		builder.moveToElement(menDept).build().perform();
		
		Thread.sleep(2000);
		
		List<WebElement> menShoes = driver.findElements(By.xpath("//*[@data-subnav='men']/div/div/div[2]/div/div/ul/li"));
		
		System.out.println(menShoes.size() + "\n");
		
		for(WebElement q: menShoes) {
			System.out.println(q.getText());
		}
		
	}

}
