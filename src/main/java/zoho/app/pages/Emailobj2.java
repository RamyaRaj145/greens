package zoho.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Emailobj2 extends Basepage{
	@FindBy(xpath="//*[@class='alert alert-success']")
	private WebElement verified;
	
	public Emailobj2() {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement verified() {
		return verified;
	}
}
