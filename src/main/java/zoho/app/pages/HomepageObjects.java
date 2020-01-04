package zoho.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomepageObjects extends Basepage 
{
	@FindBy(xpath="//a[@title='Women']")
    private WebElement Women;
	
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement Dresses;
	
	@FindBy(xpath="(//a[@title='T-shirts'])[2]")
	private WebElement Tshirts;
	
	public HomepageObjects() {
		PageFactory.initElements(driver, this);
	}

	public WebElement verifyWomen() {
		return Women;
	
	}
    public WebElement verifyDresses() {
	   return Dresses;
     }
    public WebElement verifyTshirts() {
    	return Tshirts;
    	
    }
 
    public WebElement clickwomen() {
    	Women.click();
    	return Women;
    }
    public WebElement clickdresses() {
    	Dresses.click();
    	return Dresses;
    }
    public WebElement clickTshirts() {
    	Tshirts.click();
    	return Tshirts;
    }
    	
    	
   

    

}

	
			


