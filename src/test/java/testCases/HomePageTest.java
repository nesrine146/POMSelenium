package testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.ContactsPage;
import pages.HomePage;
import pages.LoginPage;
import utils.TestUtils;

public class HomePageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	
	TestUtils testUtils;
	ContactsPage contactsPage;
	
	public HomePageTest() {
		super();
		
	}
	
	@BeforeMethod
	public void setUp() {
	
		
		initialization();
		testUtils = new TestUtils();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		
	}
	
	@Test
	public void verifyHomePageTitle() {
		
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "CRMPRO","Home page title not matched");
	}
	
	@Test
	public void verifyUserNameTest() {
		
		testUtils.switchToFrame();
		Assert.assertTrue(homePage.verifyCorrectUserName());
	}
	
	@Test
	public void verifyContactsLinkTest() {
		testUtils.switchToFrame();
		contactsPage= homePage.clickOnContactsLink();
		
		
	}
	
	@AfterMethod
    public void tearDown() {
		
		driver.quit();
		
		

	}
	
	

}
