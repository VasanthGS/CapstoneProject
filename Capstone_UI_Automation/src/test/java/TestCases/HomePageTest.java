package TestCases;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import Base.Base1;
import PageLayer.HomePage;
import PageLayer.LoginPage;
import PageLayer.RegisterationPage;

public class HomePageTest extends Base1 {
	public HomePageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@Test
	public void validateRegistrationOfPatient() throws IOException, InterruptedException{
		
		LoginPage lp=new LoginPage();
		lp.loginMethod(prop.getProperty("username"), prop.getProperty("password"));
		//HomePage hp=new HomePage();
//		//hp.homeMethod();
//		RegisterationPage rp= new RegisterationPage();
//		rp.registerMethod(prop.getProperty("username"), prop.getProperty("password"));
	}
}
