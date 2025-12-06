package framewok.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.abstarctpackage.Abstractclass;

public class homepage extends Abstractclass {
	WebDriver driver;

	public homepage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	
	
	
	@FindBy(xpath="(//button[@class='btn btn-custom'])[3]")
	WebElement cartbutton;
	
	@FindBy(xpath="//i[@class='fa fa-sign-out']")
	WebElement logout;
	
	@FindBy(css=".ng-animating")
	WebElement spinner;
	
	@FindBy(xpath="//div[@class='text-muted m-2']")
	WebElement countoffilterproduct;
	
	@FindBy(xpath="//div[@class='py-2 border-bottom ml-3']/div[@class='form-group ng-star-inserted']/label[@for='sub']")
	List<WebElement> subcategory;
	
	@FindBy(xpath="//div[@class='py-2 border-bottom ml-3']/div[@class='form-group ng-star-inserted']/label[@for='sub']/parent::div/input")
	List<WebElement> checboxsubcat;
	
	
	@FindBy(xpath="//div[@class='col-lg-4 col-md-6 col-sm-10 offset-md-0 offset-sm-1 mb-3 ng-star-inserted']")
	List<WebElement> products;
	
	@FindBy(xpath="(//input[@name='minPrice'])[2]")
	WebElement minprice;
	
	@FindBy(xpath="(//input[@name='maxPrice'])[2]")
	WebElement maxprice;
	
	By logoutbtn= By.xpath("//i[@class='fa fa-sign-out']");
	
	By subc =By.xpath("//div[@class='py-2 border-bottom ml-3']/div[@class='form-group ng-star-inserted']/label[@for='sub']");
			
	By table=By.xpath("//div[@class='col-lg-4 col-md-6 col-sm-10 offset-md-0 offset-sm-1 mb-3 ng-star-inserted']");
	By toastmessage=By.cssSelector("#toast-container");
	
	By filter=By.xpath("(//input[@name='minPrice'])[2]");
	
	public List<WebElement> getproducts(){
		visibilityofelement(table);
		return products;
	}
	public WebElement productcheck(String product){
		WebElement prodsel=getproducts().stream().filter(s->s.findElement(By.cssSelector("b")).getText().equals(product)).findFirst().orElse(null);
		return prodsel;
	}
	public void productselection(String product){
		WebElement products=productcheck(product);
		products.findElement(By.cssSelector(".card-body button:last-of-type")).click();
	}
	public void confirmmessage(){
		visibilityofelement(toastmessage);
	}
	
	public orderpage clickoncart(){
		cartbutton.click();
		orderpage obj3=new orderpage(driver);
	    return obj3;
	}
	
	public void subcatsel(String prodreq) {
		visibilityofelement(filter);
		for(int i=0;i<subcategory.size();i++) {
			if(subcategory.get(i).getText().equalsIgnoreCase(prodreq)) {
				checboxsubcat.get(i).click();
				
			}
			
		}
		
	}
	
	public void logout() {
		visibilityofelement(logoutbtn);
		logout.click();
	}
	
	public String pricefilter() throws InterruptedException {
		visibilityofelement(filter);
		Actions a= new Actions(driver);
		minprice.sendKeys("0");
		a.moveToElement(maxprice).click().sendKeys("12000").sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		String temp= countoffilterproduct.getText();
		return temp;
		
		
	}


}
