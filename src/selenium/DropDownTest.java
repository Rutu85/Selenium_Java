package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) throws InterruptedException {
		/*FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		List<WebElement> dropDownMenu = driver.findElements(By.xpath("//*[@aria-label='Select a category for search']/option"));
		
		System.out.println(dropDownMenu.size());
		System.out.println("**************");
		for(WebElement q : dropDownMenu) {
			System.out.println(q.getText()+"------"+q.isSelected());
		}
		
		driver.findElement(By.xpath("//*[@aria-label='Select a category for search']")).sendKeys("Books");
		System.out.println();
		System.out.println("*****************after****************");
		System.out.println();
		for(WebElement q : dropDownMenu) {
			System.out.println(q.getText()+"------"+q.isSelected());
		}
		*/
		checkAmazonList();
	}

	private static void checkAmazonList() throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		WebElement searchList = driver.findElement(By.id("searchDropdownBox"));
		List<WebElement> list = searchList.findElements(By.tagName("option"));
		System.out.println(list.size());
		System.out.println("**************");
		for(WebElement q : list) {
			if(q.isSelected()) {
				System.out.println(q.getText()+"------"+q.isSelected());
				}
		}
		
		searchList.sendKeys("Women");
		System.out.println();
		System.out.println("*****************after****************");
		System.out.println();
		for(WebElement q : list) {
			if(q.isSelected()) {
			System.out.println(q.getText().trim()+"------"+ q.isSelected());
			}
		}
		
		Select select = new Select(searchList);
		select.selectByIndex(4);
		Thread.sleep(3000);
		select.selectByVisibleText("Software");
	}

}
