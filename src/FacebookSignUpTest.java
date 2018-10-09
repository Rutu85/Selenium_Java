
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class FacebookSignUpTest {
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("lastname")).sendKeys("Patel");
		driver.findElement(By.name("reg_email__")).sendKeys("rutu@gmail.com");
		driver.findElement(By.xpath(".//*[@aria-label='Re-enter email']")).sendKeys("rutu@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("qwertdfghxvb");	
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select s = new Select(month);
		s.selectByIndex(5);
		
		WebElement day = driver.findElement(By.name("birthday_day"));
		s = new Select(day);
		s.selectByIndex(8);
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		s = new Select(year);
		s.selectByValue("2003");
		
		driver.findElement(By.xpath(".//input[@value='1']")).click();
		driver.findElement(By.name("birthday_month")).sendKeys("May");
		driver.findElement(By.xpath(".//*[@name='websubmit']")).click();
		
		Thread.sleep(2000); 
		
		
	}
}
 