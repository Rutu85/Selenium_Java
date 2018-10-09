import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextTest {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.findElement(By.linkText("Advertising")).click();
		driver.findElement(By.partialLinkText("Advert")).click();
		Thread.sleep(4000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		System.out.println(driver.getPageSource());
		
		if(driver.getPageSource().contains("Google PPC Online Advertising – Google AdWords")) {
			System.out.println("Pass");
		}
	}

}
