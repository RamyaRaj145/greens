
package zoho.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartobj1 extends Basepage {
	
	@FindBy(xpath="//a//img[@width='250']")
      private WebElement image;
	
	public Cartobj1() {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement product1() {
		return image;
	}
	
	public WebElement clickproduct() {
		image.click();
		return image;
	}
	}
