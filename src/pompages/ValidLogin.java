package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidLogin {
	@FindBy (className= "login")
	private WebElement signInBN;
	
	@FindBy(id= "email")
	private WebElement emailTB; 
	
	@FindBy(id="passwd")
	private WebElement pwTB;
	
	@FindBy (id="SubmitLogin")
	private WebElement signBN;
	
	public ValidLogin(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername(String email){
		emailTB.sendKeys(email);
	}
	public void setPassword(String password){
		pwTB.sendKeys(password);
	}
	public void clickSign() {
		signBN.click();
	}
	public void clickSignIn() {
		signInBN.click();
	}
}
	
