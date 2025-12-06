package framewok.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.abstarctpackage.Abstractclass;

public class orderpage extends Abstractclass {
	
	WebDriver driver;

	public orderpage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(css=".cartSection h3")
	List<WebElement> cartproduct;
	
	@FindBy(css=".totalRow button")
	WebElement checkoutbutton;
	
	By prodname=By.cssSelector(".cartSection h3");
	
	By checkoutlocator=By.cssSelector(".totalRow button");
	
	public boolean verifycorrectproduct(String productre) {
		visibilityofelement(prodname);
		Boolean match=cartproduct.stream().anyMatch(s->s.getText().equalsIgnoreCase(productre));
		return match;
	}
	
	public ordersummary clickoncheckout() {
		scrollmethodforwindow();
		elementclickable(checkoutlocator);
		checkoutbutton.click();
		ordersummary obj4=new ordersummary(driver);
		return obj4;
	}
	
	

}
