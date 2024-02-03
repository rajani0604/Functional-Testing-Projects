package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
	WebDriver driver;

	public ProductPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void takeScreenshot(String screenshotname)
	{
		pages.LoginPage lp = new pages.LoginPage(driver);
		lp.takeScreenshot(screenshotname);
	}
	
	public void AddProducttoCartbyName(String productname)
	{

		//product page objects
		//product id - static object
		WebElement ProductName = driver.findElement(By.xpath("//div[text()='"+productname+"']"));
		ProductName.isDisplayed();
		takeScreenshot("ProductPageBeforeSelect");
		//add to cart button - dynamic object
		WebElement AddToCartBtn = driver.findElement(By.xpath("//div[text()='"+productname+"']/following::button[text()='Add to cart'][1]"));		
		ProductName.isDisplayed();
		AddToCartBtn.click();
		takeScreenshot("ProductPageAfterSelect");
		
	}
}
