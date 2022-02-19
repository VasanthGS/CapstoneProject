package TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base1;
import PageLayer.HomePage;
import PageLayer.LoginPage;


public class LoginPageTest extends Base1 {
	public LoginPage lp; 
	public HomePage hp; 


	public LoginPageTest() throws IOException { super(); }

	@BeforeMethod 
	public void launchBrowser() throws InterruptedException,IOException { 
		initialization(); lp=new LoginPage();

	}

	@Test(priority=1)
	public void validateLoginPage() throws IOException,
	InterruptedException {
		hp=lp.loginMethod(prop.getProperty("username"),prop.getProperty("password"));
		System.out.println("ValidateLoginPage is done");


	}
	@Test(priority=2)
	public void invalidvalidateLoginPage() throws IOException,
	InterruptedException {
		lp.Invalid_loginMethod(prop.getProperty("invalidusername"), prop.getProperty("invalidpassword"));



	}
	
//	@AfterMethod
//	public void close_browser() {
//		driver.close();
//	}

	



}
