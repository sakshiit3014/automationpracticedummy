package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	
        //declaration
	
		@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
		private WebElement signBN;
		
		@FindBy(id="email_create")
		private WebElement emailTB;
		
		@FindBy(id="SubmitCreate")
		private WebElement createAccountBN;

		@FindBy(id="uniform-id_gender2")
		private WebElement titleRB;
		
		@FindBy(id="customer_firstname")
		private WebElement cfnTB;
		
		@FindBy(id="customer_lastname")
		private WebElement clnTB;
		
		@FindBy(id="passwd")
		private WebElement pwTB;
		
		@FindBy(id="firstname")
		private WebElement fnTB;
		
		@FindBy(id="lastname")
		private WebElement lnTB;
		
		@FindBy(id="company")
		private WebElement companyTB;
		
		@FindBy(id="address1")
		private WebElement addTB;
		
		@FindBy(id="address2")
		private WebElement add2TB;
		
		@FindBy(id="city")
		private WebElement cityTB;
		
		@FindBy(id="postcode")
		private WebElement zipTB;
		
		@FindBy(id="other")
		private WebElement infoTB;
		
		@FindBy(id="phone")
		private WebElement phoneTB;
		
		@FindBy(id="phone_mobile")
		private WebElement mobileTB;
		
		@FindBy(id="alias")
		private WebElement aliasTB;
		
		@FindBy (id="days")
		private WebElement days;
		
		@FindBy (id="months")
		private WebElement months;
		
		@FindBy (id="years")
		private WebElement years;
		
		@FindBy (id="newsletter")
		private WebElement newsletter;
		
		@FindBy (id="uniform-optin")
		private WebElement offer;
		
		@FindBy (id="id_state")
		private WebElement state;
		
		@FindBy (id="id_country")
		private WebElement country;
		
		@FindBy(id="submitAccount")
		private WebElement RegisterBN;
		
		//Initialization
		
		public CreateAccount(WebDriver driver){
			PageFactory.initElements(driver, this);
		}
		
		//Utilization
		
		public void clickSign(){
			signBN.click();
		}
		
		public void setEmail(String email){
			emailTB.sendKeys(email);
		}
		
		public void clickCreateAccount(){
			createAccountBN.click();
		}
		
		public void clickTitle() {
			titleRB.click();
		}
		public void setcFirstName(String cFirstName){
			cfnTB.sendKeys(cFirstName);
		}
		
		public void setcLastName(String cLastName){
			clnTB.sendKeys(cLastName); 
		}
		
		public void setPassword(String password){
			pwTB.sendKeys(password); 
		}
		
		public void clickDays() {
			Select dropdown = new Select(days);
			dropdown.selectByValue("7");
			//days.click();
		}
		
		public void clickMonths() {
			Select dropdown = new Select(months);
			dropdown.selectByValue("9");
			
		}
		
		public void clickYears() {
			Select dropdown = new Select(years);
			dropdown.selectByValue("1993");
			
		}
		
		public void clickNewsletter() {
			newsletter.click();
		}
		
		public void clickOffers() {
			offer.click();
		}
		
		public void setfirstName(String firsttName){
			fnTB.sendKeys(firsttName); 
		}
		
		public void setlastName(String lastName){
			lnTB.sendKeys(lastName); 
		}
		
		public void setcompany(String company){
			companyTB.sendKeys(company); 
		}
		
		public void setaddress(String address){
			addTB.sendKeys(address); 
		}
		
		public void setaddress2(String address2){
			add2TB.sendKeys(address2); 
		}
		
		public void setcity(String city){
			cityTB.sendKeys(city); 
		}
		
		public void clickState() {
			Select dropdown = new Select(state);
			dropdown.selectByValue("31");
			
		}
		
		public void setzipCode(String zipCode){
			zipTB.sendKeys(zipCode); 
		}
		
		public void clickCountry() {
			Select dropdown = new Select(country);
			dropdown.selectByValue("21");
			
		}
		
		public void setadditionalInfo(String additionalInfo){
			infoTB.sendKeys(additionalInfo); 
		}
		
		public void setHomePhone(String homePhone){
			phoneTB.sendKeys(homePhone); 
		}
		
		public void setMobilePhone(String mobilePhone){
			mobileTB.sendKeys(mobilePhone); 
		}
		
		public void setalias(String alias){
			aliasTB.clear();
			aliasTB.sendKeys(alias); 
		}
		
		public void clickRegister() {
			RegisterBN.click();
		}
}