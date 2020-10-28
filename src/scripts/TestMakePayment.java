package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import pompages.AddToCart;
import pompages.MakePayment;

public class TestMakePayment extends BaseTest {

	@Test
	public void testMakePayment() throws InterruptedException{
		MakePayment makePayment = new MakePayment(driver);
		makePayment.payByChecque();
		makePayment.iConfirm(driver);
		WebElement alertMsg = driver.findElement(By.className("alert-success"));
		String successMsg = alertMsg.getText();
		Assert.assertEquals("Your order on My Store is complete.",successMsg);
	}
}
