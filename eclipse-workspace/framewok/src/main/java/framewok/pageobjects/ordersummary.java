package framewok.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.abstarctpackage.Abstractclass;

public class ordersummary extends Abstractclass {
   
	WebDriver driver;
	
	public ordersummary(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	By countrysearch=By.cssSelector(".ta-results");
	By submit=By.cssSelector(".action__submit");
	
	@FindBy(css="[placeholder='Select Country']")
   WebElement entercountry;
	
	@FindBy(xpath="(//button[@class='ta-item list-group-item ng-star-inserted'])[2]")
	WebElement countryselect;
	
	@FindBy(css=".action__submit")
	WebElement submitbtn;
	
	public orderconfirmation order(String country) {
		Actions a=new Actions(driver);
	    a.sendKeys(entercountry,country).build().perform();
	    visibilityofelement(countrysearch);
	    countryselect.click();
	    scrollmethodforwindow();
	    elementclickable(submit);
	    submitbtn.click();
	    orderconfirmation obj5= new orderconfirmation(driver);
	    return obj5;
	    
		
	}


}
