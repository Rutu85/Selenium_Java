import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemonTest {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20); 
		driver.get("http://store.demoqa.com/");
		Actions action = new Actions(driver);
		WebElement pCategory = driver.findElement(By.linkText("Product Category"));
		action.moveToElement(pCategory).build().perform();
		driver.findElement(By.linkText("iPads")).click();
		driver.findElement(By.xpath("(.//*[@value='Add To Cart'])[2]")).click();
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("(.//*[@class='alert addtocart'])[2]/p"), "Item has been added to your cart!"));
		System.out.println(driver.findElement(By.xpath("(.//*[@class='alert addtocart'])[2]/p")).getText());
		driver.findElement(By.className("item")).click();
		String price = driver.findElement(By.xpath(".//*[@class='wpsc_product_price wpsc_product_price_0']/span/span")).getText();
		String quantity = driver.findElement(By.name("quantity")).getAttribute("value");
		
		if(price.equals("$270.00") && quantity.equals("1")) {
			System.out.println("Correct selection  -- quantity " + quantity + " -- price -- " + price);
		}else {
			System.out.println("wrong selection");
		}
		
		driver.findElement(By.xpath(".//*[@class='step2']/span")).click();
		
		driver.findElement(By.id("wpsc_checkout_form_9")).sendKeys("rutupatel@ymail.com");
		driver.findElement(By.id("wpsc_checkout_form_2")).sendKeys("Rutu");
		driver.findElement(By.id("wpsc_checkout_form_3")).sendKeys("Patel");
		driver.findElement(By.id("wpsc_checkout_form_4")).sendKeys("151 Hughson St S");
		driver.findElement(By.id("wpsc_checkout_form_5")).sendKeys("Hamilton");
		driver.findElement(By.id("wpsc_checkout_form_6")).sendKeys("Ontario");
		Select dropCountry = new Select(driver.findElement(By.id("wpsc_checkout_form_7")));
		dropCountry.selectByVisibleText("Canada");
		driver.findElement(By.id("wpsc_checkout_form_8")).sendKeys("L8N 3Y4");
		driver.findElement(By.id("wpsc_checkout_form_18")).sendKeys("9059663106");
		driver.findElement(By.id("shippingSameBilling")).click();
		driver.findElement(By.xpath(".//*[@value='Purchase']")).click();
				
	}

}
