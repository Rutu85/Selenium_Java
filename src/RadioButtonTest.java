import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTest {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		List<WebElement> radioButton = driver.findElements(By.xpath("(//td[@class = 'table5'])[2]/input"));
		
		for (int j = 0; j < 3; j++) {
			if(radioButton.get(j).isSelected()) {
			System.out.println(radioButton.get(j).getAttribute("value") + "*****" + radioButton.get(j).isSelected());
			}
		/*for(WebElement i:radioButton) {
			System.out.println(i.getAttribute("value"));
		}*/
	}
		System.out.println("***************after changing selection************");
		radioButton.get(2).click();
		
		for (int j = 0; j < 3; j++) {
			if(radioButton.get(j).isSelected()) {
			System.out.println(radioButton.get(j).getAttribute("value") + "*****" + radioButton.get(j).isSelected());
			}
		/*for(WebElement i:radioButton) {
			System.out.println(i.getAttribute("value"));
		}*/
	}
		
		
}
	
}
