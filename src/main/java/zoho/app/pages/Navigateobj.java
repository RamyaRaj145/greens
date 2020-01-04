package zoho.app.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Navigateobj extends Basepage {
	
	@FindBy(xpath="//a//img[@width='250']")
	private List<WebElement> image;
	
	@FindBy(xpath="//*[@class='heading-counter']")
	private WebElement productcount;
	
	public Navigateobj() {
		PageFactory.initElements(driver, this);
	}
	
	public int count() {
		String value= productcount.getText();
		String[]v=value.split("");
		int total=Integer.parseInt(v[2]);
		
		return total;
	}
	public int image() {
		return image.size();
	}
	

}
