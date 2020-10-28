package pompages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCart {

	@FindBy (xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	private WebElement womenBN;
	
	@FindBy (linkText = "Faded Short Sleeve T-shirts")
	private WebElement product1BN;
	
	@FindBy (id = "add_to_cart")
	private WebElement productAddToCartBN;
	
	@FindBy (linkText = "Printed Dress")
	private WebElement product2BN; 
	
	@FindBy (className = "icon-chevron-left")
	private WebElement continueBN;
	
	@FindBy (linkText = "Proceed to checkout")
	private WebElement proceedToCheckoutBN;
	
	@FindBy (name = "processAddress")
	private WebElement processAddressBN; 
	
	@FindBy (name = "processCarrier")
	private WebElement processCarrierBN;
	
	@FindBy (id = "cgv")
	private WebElement termofServicesCB;
	
	public AddToCart(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void clickOn(WebDriver driver, WebElement element, int timeout) {
		new WebDriverWait(driver,timeout).
		until(ExpectedConditions.visibilityOf(element));
		element.click();
	}
	
	public void clickWomenMenu() {
		womenBN.click();
	}
	
	public void addProduct1BNToCart() {
		product1BN.click();
	}
	
	public void addProduct2BNToCart() {
		product2BN.click();
	}
	
	public void productsAddToCart() {
		productAddToCartBN.click();
	}
	
	public void continueShopping(WebDriver driver) {
		clickOn(driver, continueBN,10);
	}
	
	public void proceedToCheckOut() {
		proceedToCheckoutBN.click();
	}
	
	public void processAddress() {
		processAddressBN.click();
	}
	
	public void processCarrier() {
		processCarrierBN.click();
	}
	
	public void checkTermsofServices() {
		termofServicesCB.click();
	}
	
}
