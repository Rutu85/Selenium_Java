import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AttributeTest {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		String placeHolder = driver.findElement(By.xpath("//*[@placeholder='Search for anything']")).getAttribute("placeholder");
		System.out.println(placeHolder);
	
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys("fgbrdve");
		
		System.out.println(driver.findElement(By.name("email")).getAttribute("value"));
		
	}
}
