import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test {

	@Test
	public void practicetest() {
		System.out.println("test1 is ran successsfully");
	}
	@Test
	public void practicetest2() {
		System.out.println("test2 is ran successsfully");
	}
	@BeforeTest
	public void practicetest3() {
		System.out.println(" before test is ran successsfully");
	}
	@AfterTest
	public void practicetest4() {
		System.out.println(" After test is ran successsfully");
	}

}
