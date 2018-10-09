import org.openqa.selenium.firefox.FirefoxDriver;

public class MaximixeWindow {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.nike.com/ca/en_gb/");
		driver.manage().window().maximize();

	}

}
