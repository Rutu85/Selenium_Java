import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MississaugaActionTest {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		Actions builder = new Actions(driver);
		driver.get("http://www.mississauga.ca/portal/home");
		WebElement image = driver.findElement(By.xpath(".//img[@alt='City Hall']"));
		builder.moveToElement(image).build().perform();
		Thread.sleep(4000);
		
		List<WebElement> menu = driver.findElements(By.xpath(".//*[@id='tnNavHallMenu']/a"));
		
		for(WebElement i:menu) {
			//System.out.println(i.getText());
			if(i.getText().equals("Agendas & Minutes")) {
				i.click();
				Thread.sleep(4000);
				System.out.println(driver.getTitle());
				break;
			}
		}

	}

}
