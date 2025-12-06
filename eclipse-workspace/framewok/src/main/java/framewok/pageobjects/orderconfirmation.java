package framewok.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.abstarctpackage.Abstractclass;

public class orderconfirmation extends Abstractclass{
	
	WebDriver driver;

	public orderconfirmation(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	By ordermessage =By.cssSelector(".hero-primary");
	

	@FindBy(css=".hero-primary")
	WebElement message;
	
	public String ordersnapo() {
		visibilityofelement(ordermessage);
		String confirmationmessage=message.getText();
		return confirmationmessage;
	}
	

}
