package framewok.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.abstarctpackage.Abstractclass;

public class loginpage extends Abstractclass{
  
	WebDriver driver;
	
	public loginpage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(id="userEmail")
	WebElement userEmail;
	
	@FindBy(id="userPassword")
	WebElement pass;
	
	@FindBy(id="login")
	WebElement loginbutton;
	
	public void togo(String url) {
		driver.get(url);
	}

	public homepage login(String email,String password) {
		userEmail.sendKeys(email);
		pass.sendKeys(password);
		loginbutton.click();
		homepage obj2= new homepage(driver);
		return obj2;
	}

}
