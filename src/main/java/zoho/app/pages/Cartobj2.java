package zoho.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartobj2 extends Basepage{
	
	@FindBy(xpath="//*[@name='Submit']")
	private WebElement Addtocart;
	
	@FindBy(name="Submit")
	private WebElement CartAdd;
	
	@FindBy(xpath="//strong[@class='dark']")
	private WebElement Verified;
	
	
	public Cartobj2() {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement cart() {
		return Addtocart;
	}
	public WebElement Verified() {
		return Verified;
		
	}
	
	public WebElement clickcart() {
		CartAdd.click();
		return CartAdd;
	}
	
	public WebElement cartText() {
		return Addtocart;
		
	}
}
