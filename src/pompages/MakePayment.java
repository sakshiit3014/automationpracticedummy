package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakePayment {
	
	@FindBy (className = "cheque")
	private WebElement payByChequeBN;
	
	@FindBy (xpath = "//*[@id=\"cart_navigation\"]/button")
	private WebElement confirmBN;
	
	public MakePayment(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void clickOn(WebDriver driver, WebElement element, int timeout) {
		new WebDriverWait(driver,timeout).
		until(ExpectedConditions.visibilityOf(element));
		element.click();
	}
	
	public void payByChecque() {
		payByChequeBN.click();
	}
	
	public void iConfirm(WebDriver driver) {
		clickOn(driver, confirmBN,10);
	}
}
