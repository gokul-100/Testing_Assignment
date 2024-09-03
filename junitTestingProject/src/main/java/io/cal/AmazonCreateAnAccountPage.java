package io.cal;

public class AmazonCreateAnAccountPage {
	
	public String yourname(String fname, String lname) {
		return (fname+" "+lname);
	}
	
	public String MobNoANdEmail(long expectedMobNo,String EmailID) {
		return (expectedMobNo + EmailID);
	}
	
	public boolean checkPassword(String pass) {
		return pass.length()==6;
	}
	
	public boolean clickContinue(String name, String email,String password) {
		return true;
	}
}
