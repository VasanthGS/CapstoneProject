package TestCases;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import Base.Base1;
import PageLayer.RegisterationPage;

public class RegisterTest extends Base1 {
	public RegisterTest() throws IOException {
	}
	
	@Test
	public void registerpatientdetails() throws IOException, InterruptedException {
		initialization();
		RegisterationPage reg = new RegisterationPage();
		reg.registerMethod(prop.getProperty("username"),prop.getProperty("password"));
		System.out.println("Pateint Details Registered Successfully");
	}
}
