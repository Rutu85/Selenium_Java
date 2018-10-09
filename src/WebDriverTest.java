import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTest {

	public static void main(String[] args) {
		WebDriver driver0 = new FirefoxDriver();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		//driver.findElement(By.linkText("Advertising")).click();
		driver.findElement(By.partialLinkText("Advert")).click();
		

	}

}
