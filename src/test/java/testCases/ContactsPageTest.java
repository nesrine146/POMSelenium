package testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.ContactsPage;
import pages.HomePage;
import pages.LoginPage;
import reports.ExtentManager;
import utils.TestUtils;

public class ContactsPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	private TestUtils testUtils;
	
	
	public ContactsPageTest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setUp() {
		
		
		initialization();
		testUtils = new TestUtils();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		testUtils.switchToFrame();
		contactsPage = homePage.clickOnContactsLink();
		 
	}
	
	@Test
	public void verifyContactsPageLabelTest() {
		
		Assert.assertTrue(contactsPage.verifyContactsLabel(),"Contacts label is missing on the page");
		
		
	}
	
	@Test
	public void selectMultipleContactsTest() {
		
		contactsPage.selectContactsByName("a c");
		contactsPage.selectContactsByName("aa bb");
	}
	
	@Test
	public void selectSingleContactsTest() {
		
		contactsPage.selectContactsByName("a c");
		
	}
 
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		
	}
	
	

}
