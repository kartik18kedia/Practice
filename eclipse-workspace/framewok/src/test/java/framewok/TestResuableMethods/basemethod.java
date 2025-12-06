package framewok.TestResuableMethods;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import framewok.pageobjects.loginpage;

public class basemethod {
	public static loginpage obj1;
	public static WebDriver driver;
	
	public static WebDriver driverini() {
		 
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\KARTIK\\eclipse-workspace\\drivers");
	    driver= new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	@BeforeMethod
	public static loginpage launchapp() throws IOException {
		String url="https://rahulshettyacademy.com/client";
		driverini();
		obj1=new loginpage(driver);
		obj1.togo(url);
		return obj1;
	}
	
	

}
