import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeysTest {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("test49@gmail.com");
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys(Keys.ENTER);;
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("eyrgfwdjfc");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(Keys.ENTER);;
		
	}
}
