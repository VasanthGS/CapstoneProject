package PageLayer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.Base1;

public class RegisterationPage extends Base1 {
	
	@FindBy(xpath="//input[@id='username']")
	WebElement userName;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//li[@id='Inpatient Ward']")
	WebElement ward;
	
	@FindBy(xpath="//input[@class='btn confirm']")
	WebElement loginbtn;

	@FindBy (xpath = "//a[@type='button'][3]")
	WebElement registerpatient;
	
	@FindBy(xpath="//input[@name='givenName']")
	WebElement name;
	
	@FindBy(xpath = "//input[@name='familyName']")
	WebElement familyname;
	
	@FindBy(css = "button#next-button")
	WebElement nxtbtn1;
	
	@FindBy(xpath = "//option[@value='M']")
	WebElement selectgender;

	@FindBy(css = "button#next-button")
	WebElement nextbtn2;

	@FindBy(xpath = "//input[@id='birthdateDay-field']")
	WebElement typeday;

	@FindBy(xpath = "//select[@name='birthdateMonth']")
	WebElement selectmonth;

	@FindBy(xpath = "//input[@id='birthdateYear-field']")
	WebElement typeyear;

	@FindBy(css = "button#next-button")
	WebElement nextbtn3;

	@FindBy(xpath = "//input[@id='address1']")
	WebElement address1;

	@FindBy(xpath = "//input[@id='address2']")
	WebElement address2;

	@FindBy(xpath = "//input[@id='cityVillage']")
	WebElement village;

	@FindBy(xpath = "//input[@id='stateProvince']")
	WebElement state;

	@FindBy(xpath = "//input[@id='country']")
	WebElement country;

	@FindBy(xpath = "//input[@id='postalCode']")
	WebElement postcode;

	@FindBy(css = "button#next-button")
	WebElement nextbtn4;

	@FindBy(xpath = "//input[@name='phoneNumber']")
	WebElement mobilenumber;

	@FindBy(css = "button#next-button")
	WebElement nextbtn5;

	@FindBy(css = "select#relationship_type")
	WebElement relationship;

	@FindBy(xpath = "//input[@placeholder='Person Name']")
	WebElement personname;
	
	@FindBy(css = "button#next-button")
	WebElement nextbtn6;

	@FindBy(xpath = "//input[@value='Confirm']")
	WebElement confirm;
	
//	@FindBy(xpath = "//a[@type='button'] [1]")
//	WebElement patientrecord;
//	
//	@FindBy(css = "input#patient-search")
//	WebElement searchpatient;
	
	public RegisterationPage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	public  void registerMethod(String un,String pass) throws IOException, InterruptedException {
		userName.sendKeys(un);
		password.sendKeys(pass);
		ward.click();
		loginbtn.click();
		Thread.sleep(3000);
		registerpatient.click();
		name.sendKeys("Vasanth");
		familyname.sendKeys("Ganesan");
		nxtbtn1.click();
		selectgender.click();
		nextbtn2.click();
		typeday.sendKeys("17");
		Select s = new Select(selectmonth);
		s.selectByIndex(6);
		typeyear.sendKeys("1996");
		nextbtn3.click();
		address1.sendKeys("Dindigul");
		address2.sendKeys("Chinnalapati");
		village.sendKeys("Chinnalapati");
		state.sendKeys("Tamilnadu");
		country.sendKeys("India");
		postcode.sendKeys("64301");
		nextbtn4.click();
		mobilenumber.sendKeys("8807130040");
		nextbtn5.click();
		Select se = new Select(relationship);
		se.selectByIndex(2);
		personname.sendKeys("Jai");
		nextbtn6.click();
		confirm.click();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(2000);

//		patientrecord.click();
//		searchpatient.sendKeys("Vasanth Ganesan");
//		searchpatient.click();
		
	}
}
//	//public void registeraPatient() {
//		// TODO Auto-generated method stub
//		
//	}
//}
