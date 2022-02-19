package TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base1;
import PageLayer.CaptureVitalsPage;
import PageLayer.LoginPage;

public class CaptureVitalsTest extends Base1 {
	public CaptureVitalsTest() throws IOException {
		super();
	}
	@BeforeMethod
	public void beforeTest() throws IOException, InterruptedException {
		initialization();
		Thread.sleep(5000);
	}

	@Test
	public void validateLogin() throws Exception {
		LoginPage login = new LoginPage();
		login.loginMethod(prop.getProperty("username"),prop.getProperty("password"));
		Thread.sleep(500);
		CaptureVitalsPage capt = new CaptureVitalsPage();
		capt.capture1();
		System.out.println("Verified  Patient ID Successfully");
	}

	@AfterMethod
	public void afterTest() {
		driver.close();
	}
}
