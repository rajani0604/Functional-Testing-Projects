package testng;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoanTest extends BaseClass{
	@BeforeMethod
	public void Method1() {
		
		System.out.println("Inside Before Method");
	}
	
	@AfterMethod
	public void Method2() {
		
		System.out.println("Inside After Method");
	}
	
	
	
	@BeforeTest
	public void Method3() {
		
		System.out.println("Inside Before Test");
	}
	
	@AfterTest
	public void Method4() {
		
		System.out.println("Inside After Test");
	}
	
	
	@Test
	public void TC01_HomeLoanTest() {
		
		System.out.println("Inside HomeLoan");
	}
	
	@Test
	public void TC02_CarLoanTest() {
		
		System.out.println("Inside CarLoan");
	}
	
	@Test
	public void TC00_PersonalLoanTest() {
		
		System.out.println("Inside PersonalLoan");
	}

}
