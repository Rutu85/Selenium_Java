import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementTest {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		
		WebElement email =  driver.findElement(By.xpath("//*[@id='identifierId']"));
		email.sendKeys("test49@gmail.com");
		
		WebElement emailNextButton = driver.findElement(By.xpath("//*[@id='identifierNext']/content/span"));
		emailNextButton.click();
	}

}
