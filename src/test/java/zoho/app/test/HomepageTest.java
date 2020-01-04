package zoho.app.test;
import org.testng.Assert;
import org.testng.annotations.Test;
import zoho.app.pages.Basepage;
import zoho.app.pages.HomepageObjects;


public class HomepageTest {
	
	HomepageObjects Hp;
	Basepage Bp;

	public HomepageTest()
	{

	Hp=new HomepageObjects();
	Bp=new Basepage();
}
	@Test
	public void verifyWomen() {
		Assert.assertTrue(Hp.verifyWomen().isDisplayed());
	}
	
	@Test
	public void verifyDresses() {
		Assert.assertTrue(Hp.verifyDresses().isDisplayed());
	}
	
	@Test
	public void verifyTshirts() {
		Assert.assertTrue(Hp.verifyTshirts().isDisplayed());
	}
	
}