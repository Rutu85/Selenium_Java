import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:/SeleniumJars/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("fgbrdve");
		driver.findElement(By.name("pass")).sendKeys("efgrjbehfc");
		driver.findElement(By.xpath("//label[@id='loginbutton']/input")).click();
		
	}

}
