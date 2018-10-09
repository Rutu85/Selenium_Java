import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QainterviewQueAns {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://qaquestions.net/");
		
		WebElement content = driver.findElement(By.xpath(".//*[@id='content-section-3']/div[1]/div/div/div[1]"));
		
		Thread.sleep(3000);
		
		String data = content.getText();
		System.out.println(data);

	}

}
