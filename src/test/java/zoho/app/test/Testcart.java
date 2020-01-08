package zoho.app.test;

import org.junit.Assert;
import org.testng.annotations.Test;

import zoho.app.pages.Basepage;
import zoho.app.pages.Cartobj1;
import zoho.app.pages.Cartobj2;
import zoho.app.pages.HomepageObjects;

public class Testcart {
	
	Cartobj1 a;
	Cartobj2 b;
	HomepageObjects c;
	Basepage d;
	
	public Testcart() {
		a=new Cartobj1();
		b=new Cartobj2();
		c=new HomepageObjects();
		d=new Basepage();
	}
	
	@Test
	
	public void Checkcart() {
		c.clickwomen();
		a.clickproduct();
		b.elementFound(b.clickcart());
		b.clickcart();
		
		Assert.assertTrue(b.Verified().getText().contains("checkout"));
	}
	

}
