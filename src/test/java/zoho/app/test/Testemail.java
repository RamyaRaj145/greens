package zoho.app.test;

import java.util.Random;

import org.testng.annotations.Test;

import zoho.app.pages.Basepage;
import zoho.app.pages.Emailobj1;
import zoho.app.pages.Emailobj2;

public class Testemail {
	
	Emailobj1 E1;
	Emailobj2 E2;
	Basepage Bp;
	
	public Testemail() {
		E1=new Emailobj1();
		E2=new Emailobj2();
		Bp=new Basepage();
	}
	int random=new Random().nextInt(4000);
	String email="";
	
	@Test
	public void verified() {
		E1.setemail(email);
		E1.
		
	}
	

}
