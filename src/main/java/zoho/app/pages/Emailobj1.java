package zoho.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Emailobj1 extends Basepage {
	@FindBy(xpath="//input[@id='newsletter-input']")
	private WebElement Email;
	
	@FindBy(xpath="//button[@type='submit'])[2]")
	private WebElement Click;
	
	public Emailobj1() {
		PageFactory.initElements(driver,this);
	}
	public String setemail(String email) {
		setText(Email.click());
		return email;
	}
}
