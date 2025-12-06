package practice;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testing {
	@Test(groups= {"q"})
	public void aracticetest() {
		String k="kartik";
		Assert.assertEquals("kartik", k);
		System.out.println("test1 is ran successsfully");
	}
	@Test
	public void practicetest2() {
		System.out.println("test2 is ran successsfully");
	}
	
	@Test(timeOut=300)
	public void practicetest5() throws InterruptedException {
		Thread.sleep(30);
		System.out.println("test3 is ran successsfully");
	}
	@BeforeMethod
	public void practicetest3() {
		System.out.println(" before method is ran successsfully");
	}
	@AfterTest
	public void practicetest4() {
		System.out.println(" After test is ran successsfully");
	}

}
