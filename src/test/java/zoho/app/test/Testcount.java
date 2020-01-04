package zoho.app.test;

import org.testng.annotations.Test;

import zoho.app.pages.Basepage;
import zoho.app.pages.HomepageObjects;
import zoho.app.pages.Navigateobj;

public class Testcount {
	
	Navigateobj a;
	Basepage Bp;
    HomepageObjects Hp;
    
    public Testcount() {
    	a=new Navigateobj();
    	Bp=new Basepage();
    	Hp=new HomepageObjects();
    	
    }
    
    @Test
    public void verifycountobj() {
    	Hp.clickwomen();
    	System.out.println(a.image());
    	System.out.println(a.count());
    }
    
    
    
}
