package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import pompages.ValidLogin;
import pompages.CreateAccount;
import pompages.AddToCart;

public class TestAddToCart extends BaseTest{
	@Test

	public void testAddToCart() throws InterruptedException{
		AddToCart addToCart = new AddToCart(driver);
		addToCart.clickWomenMenu();
		addToCart.addProduct1BNToCart();
		addToCart.productsAddToCart();
		addToCart.continueShopping(driver);
		addToCart.clickWomenMenu();
		addToCart.addProduct2BNToCart();
		addToCart.productsAddToCart();
		addToCart.proceedToCheckOut();
		addToCart.proceedToCheckOut();
		addToCart.processAddress();
		addToCart.checkTermsofServices();
		addToCart.processCarrier();
		
		int successMsg = driver.findElements(By.id("total_product")).size();
		Assert.assertEquals(1,successMsg);
		
	}
}
