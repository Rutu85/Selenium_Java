import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotTest {

	public static void main(String[] args) throws IOException {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.mississauga.ca/portal/home");
		
		File srcFile = driver.getScreenshotAs(OutputType.FILE);
		//File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//THis is for WebDriver object
		FileUtils.copyFile(srcFile, new File("E:\\ScreenShot\\screenshot.jpeg"));

	}

}
