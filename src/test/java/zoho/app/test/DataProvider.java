package zoho.app.test;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataProvider {
	    public WebDriver driver;
	    
	    @BeforeMethod
	    public void launch() {
		System.setProperty("webdriver.chrome.driver","F:\\chrome79\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://adactin.com/HotelApp/");

	}
  @org.testng.annotations.DataProvider (name="VerifyLogin1")
  public Object[][]getData(){
	  Object[][]data=new Object[3][2];
	  data[0][0]="RamyaRaj";
	  data[0][1]="balaji";
	  
	  data[1][0]="RamyaRaj";
	  data[1][1]="balaji";
	  
	  data[2][0]="RamyaRaj";
	  data[2][1]="balaji";
	  
	  return data;
  }
	  
@Test(dataProvider="VerifyLogin1")
public void VerifyLogin(String Username,String Password) {
	
	driver.findElement(By.id("username")).sendKeys(Username);
	driver.findElement(By.id("password")).sendKeys(Password);
	driver.findElement(By.id("login")).click();
	
	
}
  

}
