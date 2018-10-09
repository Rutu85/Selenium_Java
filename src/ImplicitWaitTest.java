import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWaitTest {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("test49@gmail.com");
		driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("eyrgfwdjfc");
		driver.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();
		
		Thread.sleep(4000); // Implicit wait will not work here as password text is not ready and password element is already available to the driver
		
		String pageErrMessage = driver.findElement(By.xpath(".//*[@id='password']/div[2]/div[2]")).getText();
		System.out.println(pageErrMessage);
		
		String actualErrMessage = "Wrong password. Try again or click Forgot password to reset it.";
		
		if(pageErrMessage.equals(actualErrMessage)) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test failed");
		}
		
		
	}	

}
