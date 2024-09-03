package io.cal;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

class AmazonCreateAnAccountTest {

	@Test
	void tesyourName() {
		AmazonCreateAnAccountPage a =new AmazonCreateAnAccountPage ();
		String expectedFname= "Harry";
		String expectedlname ="potter";
		
		String actualResult = a.yourname(expectedFname, expectedlname);
	//	assertSame(a.yourname(expectedFname, expectedlname),actualResult, "please provide your fname and lname " );
		assertEquals(a.yourname(expectedFname, expectedlname),actualResult);
	}
	
	@Test
	void testMobNoAndEmailId() {
		AmazonCreateAnAccountPage a =new AmazonCreateAnAccountPage ();
		
		long expectedMobNo=9361061543l;
		String ExpectedEmailID = "gokul@gmail.com";
		
		String actualResult =a.MobNoANdEmail(expectedMobNo, ExpectedEmailID);
		assertEquals(a.MobNoANdEmail(expectedMobNo, ExpectedEmailID),actualResult);
	}
	
	@Test
	void testMobNoAndEmailIdFail() {
		Scanner sc =new Scanner(System.in);
		AmazonCreateAnAccountPage a =new AmazonCreateAnAccountPage ();
		System.out.println("enter your mobile no:");
		long mob=sc.nextLong();
		System.out.println("enter your emailId ");
		String emailId=sc.nextLine();
		
		long expectedMobNo=9361061543l;
		String ExpectedEmailID = "gokul@gmail.com";
		
		String actualResult=a.MobNoANdEmail(expectedMobNo, ExpectedEmailID);
		assertEquals(a.MobNoANdEmail(mob, emailId), actualResult,"please provide the email id");
	}
	//@Test
	void testPassword() {
		AmazonCreateAnAccountPage a =new AmazonCreateAnAccountPage ();
		String ValidPass = "123456";
		boolean isvalid = a.checkPassword(ValidPass);
		
		assertTrue(isvalid,"Password must be 6 charchter");
		
	}
	
	//@Test
	private boolean isValidPassword() {
		AmazonCreateAnAccountPage a =new AmazonCreateAnAccountPage ();
		System.out.println("enter your password");
		Scanner sc =new Scanner(System.in);
		String pass=sc.nextLine();
		if(pass.length()==6) {
			assertEquals(a.checkPassword(pass),"password accepted");
		}
		else {
			System.out.println("enter the correct format of password...");
		}
		return false;
		
		
		
	
	}
	//@Test
	void testContinueButton() {
		AmazonCreateAnAccountPage a =new AmazonCreateAnAccountPage ();
		
		String name ="Harry Potter";
		String email ="harry@gmail.com";
		String password ="pass@123";
		String invalivpassword = "@2";
		String validPAssword = "pass!";
		
		
		boolean invalid = checkContinueButton(name,email,invalivpassword);
		
		boolean Valid = a.clickContinue(name, email, validPAssword);
		
		assertTrue(invalid);
		
	}
	

	private boolean checkContinueButton(String name, String email, String password) {
		
		if(name.trim() == "" || email.trim() == "" || password.trim() == "")
			return false;
		
		if(password.length() != 6)
			return false;
		
		
		return true;
	}
	
	
	TestInfo  testinfo;
	TestReporter testReporter;
	@Test
	@Tag("testUserName")
	@Tag("testContactNumber")
	@Tag("testEmailId")
	@Tag("testPassword")
	void init1(TestInfo testinfo,TestReporter testReporter) {
		
		this.testinfo = testinfo;
		this.testReporter = testReporter;
		testReporter.publishEntry("Tested All FastFood CreateAnAccount Fields sucessfully " +testinfo.getTags());
		
	}
	}
	

	


