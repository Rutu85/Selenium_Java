import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MultipleBriwserTest {

	public static void main(String[] args) {
		String browser = "Chrome";
		WebDriver driver;
		
		if(browser.equals("Firefox")) {
			driver = new FirefoxDriver();
			System.out.println("I m FireFox");
		}
		else if (browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:/SeleniumJars/chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("I m Chrome");
		}
		else {
			System.setProperty("webdriver.ie.driver", "E:/SeleniumJars/IEdriver.exe");
			driver = new InternetExplorerDriver();
			System.out.println("I m IE");
		}
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("fgbrdve");
		driver.findElement(By.name("pass")).sendKeys("efgrjbehfc");
		driver.findElement(By.xpath("//label[@id='loginbutton']/input")).click();
		

	}

}
