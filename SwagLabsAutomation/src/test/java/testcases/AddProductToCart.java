package testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ProductPage;


public class AddProductToCart extends HelperLibrary{
	@Test
	public void AddGivenProducttoCartbyname()
	{
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("standard_user","secret_sauce");	
		WebElement productpageheader = driver.findElement(By.className("app_logo"));
		AssertJUnit.assertEquals(productpageheader.getText(),"Swag Labs");
		
		ProductPage product = new ProductPage(driver);
		product.AddProducttoCartbyName("Sauce Labs Backpack");
			
	}
}
