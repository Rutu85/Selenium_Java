import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://moodle.cestarcollege.com/moodle/");
		driver.findElement(By.linkText("Faq")).click();
		Set<String> windowIds = driver.getWindowHandles(); // Set not allows duplicate values
		System.out.println(windowIds);
		
		/*
		 * Using Object array conversation
		 */
		Object[] array = windowIds.toArray();
		System.out.println(array[0]);
		System.out.println(array[1]);
		
		/*
		 * Using Iterator conversion - Optional
		 */
		Iterator<String> iterator = windowIds.iterator();
		String mainWindow = iterator.next();
		String childWindow = iterator.next();
		System.out.println(mainWindow);
		System.out.println(childWindow);
		
		driver.switchTo().window((String) array[0]);
		System.out.println(driver.getTitle());
		driver.switchTo().window((String) array[1]);
		System.out.println(driver.getTitle());
		
	}

}
