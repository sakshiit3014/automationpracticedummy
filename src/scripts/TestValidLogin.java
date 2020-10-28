package scripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generic.BaseTest;
import generic.Lib;
import pompages.CreateAccount;
import pompages.ValidLogin;

public class TestValidLogin extends BaseTest{
	
	@Test
	public void testValidLogin() throws InterruptedException{
		ValidLogin validLogin = new ValidLogin(driver);
		
		validLogin.clickSignIn();
		String email = Lib.getCellValue(EXCEL_PATH, "ValidLogin", 1, 0);
		String password = Lib.getCellValue(EXCEL_PATH, "ValidLogin", 1, 1);
		String expectedTitle = Lib.getCellValue(EXCEL_PATH, "ValidLogin", 1, 2);
		validLogin.setUsername(email);
		validLogin.setPassword(password);
		validLogin.clickSign();
		String actualtitle = driver.getTitle();
		SoftAssert s = new SoftAssert();
		s.assertEquals(actualtitle, expectedTitle);
		s.assertAll();
}
}
