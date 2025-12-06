import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class dummy {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\KARTIK\\eclipse-workspace\\drivers");
	    WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client");
		

	}

}
