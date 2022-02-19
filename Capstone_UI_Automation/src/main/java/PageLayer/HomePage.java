package PageLayer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.Base1;

public class HomePage extends Base1 {

	@FindBy(xpath="//a[@type='button'][3]")
	WebElement res;


	public HomePage() throws IOException {
		super();

	}
	public void   homeMethod() throws IOException, InterruptedException {

		res.click();
		Thread.sleep(5000);
		//return new  ResistrationPage();
	}
}
