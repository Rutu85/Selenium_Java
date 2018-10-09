import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BackwordAndForwardButtonTest {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		//driver.findElement(By.linkText("Advertising")).click();
		driver.findElement(By.partialLinkText("Advert")).click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.navigate().back();
		//driver.navigate().back();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
	}

}
