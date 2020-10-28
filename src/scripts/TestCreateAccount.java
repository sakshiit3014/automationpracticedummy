package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import org.testng.Assert;

import generic.BaseTest;
import generic.Lib;
import pompages.CreateAccount;

public class TestCreateAccount extends BaseTest {

	@Test
	public void testCreateAccount() throws InterruptedException{
		CreateAccount createAccount = new CreateAccount(driver);
		
		createAccount.clickSign();
		String email = Lib.getCellValue(EXCEL_PATH, "CreateAccount", 1, 0);
		createAccount.setEmail(email);
		createAccount.clickCreateAccount();
		createAccount.clickTitle();
		String cFirstName = Lib.getCellValue(EXCEL_PATH, "CreateAccount", 1, 1);
		createAccount.setcFirstName(cFirstName);
		
		String cLastName = Lib.getCellValue(EXCEL_PATH, "CreateAccount", 1, 2);
		createAccount.setcLastName(cLastName);
		
		String password = Lib.getCellValue(EXCEL_PATH, "CreateAccount", 1, 3);
		createAccount.setPassword (password);
		
		createAccount.clickDays();
		createAccount.clickMonths();
		createAccount.clickYears();
		createAccount.clickNewsletter();
		createAccount.clickOffers();
		
		String firstName = Lib.getCellValue(EXCEL_PATH, "CreateAccount", 1, 4);
		createAccount.setfirstName(firstName);
		
		String lastName = Lib.getCellValue(EXCEL_PATH, "CreateAccount", 1, 5);
		createAccount.setcLastName(lastName);
		
		String company = Lib.getCellValue(EXCEL_PATH, "CreateAccount", 1, 6);
		createAccount.setcompany(company);
		
		String address = Lib.getCellValue(EXCEL_PATH, "CreateAccount", 1, 7);
		createAccount.setaddress(address);
		
		String address2 = Lib.getCellValue(EXCEL_PATH, "CreateAccount", 1, 8);
		createAccount.setaddress2(address2);
		
		String city = Lib.getCellValue(EXCEL_PATH, "CreateAccount", 1, 9);
		createAccount.setcity(city);
		
		createAccount.clickState();
		
		String zipCode = Lib.getCellValue(EXCEL_PATH, "CreateAccount", 1, 10);
		createAccount.setzipCode(zipCode);
		
		createAccount.clickCountry();
		
		String additionalInfo = Lib.getCellValue(EXCEL_PATH, "CreateAccount", 1, 11);
		createAccount.setadditionalInfo(additionalInfo);
		
		String homePhone = Lib.getCellValue(EXCEL_PATH, "CreateAccount", 1, 12);
		createAccount.setHomePhone(homePhone);
		
		String mobilePhone = Lib.getCellValue(EXCEL_PATH, "CreateAccount", 1, 13);
		createAccount.setMobilePhone(mobilePhone);
		
		String alias = Lib.getCellValue(EXCEL_PATH, "CreateAccount", 1, 14);
		createAccount.setalias(alias);
		
		createAccount.clickRegister();
		
		int warningMsg = driver.findElements(By.className("alert-danger")).size();
		System.out.println(warningMsg);
		Assert.assertEquals(0,warningMsg);
	}
}