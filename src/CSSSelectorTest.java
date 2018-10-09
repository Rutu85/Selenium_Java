import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSSelectorTest {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("rutpatel");
		
		driver.findElement(By.cssSelector("#pass")).sendKeys("efgrjbehfc");
		
		driver.findElement(By.cssSelector("*[value='Log In']")).click();

		//or
		
		//driver.findElement(By.cssSelector("#loginbutton>input")).click();

	}

}
