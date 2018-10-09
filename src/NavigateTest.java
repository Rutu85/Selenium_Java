import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTest {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.google.ca/");
		
		//driver.navigate().forward();
		//driver.navigate().back();
		//driver.navigate().refresh();
	}

	// get() method executes 
	// navigate() returns object to call backword, forward etc
}
