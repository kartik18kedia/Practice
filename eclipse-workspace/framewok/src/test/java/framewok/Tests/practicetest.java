package framewok.Tests;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import framewok.TestResuableMethods.basemethod;
import framewok.TestResuableMethods.jasonreader;
import framewok.pageobjects.homepage;
import framewok.pageobjects.orderconfirmation;
import framewok.pageobjects.orderpage;
import framewok.pageobjects.ordersummary;

public class practicetest extends basemethod{
@Test(dataProvider="getData")
	public void order(HashMap<String,String> testinput) throws InterruptedException, IOException {
		String country="india";
		homepage obj2=obj1.login(testinput.get("email"),testinput.get("pass"));
		List<WebElement> products=obj2.getproducts();
		obj2.productselection(testinput.get("productre"));
		obj2.confirmmessage();
		Thread.sleep(3000);
		orderpage obj3=obj2.clickoncart();
		Boolean match=obj3.verifycorrectproduct(testinput.get("productre"));
		Assert.assertTrue(match);
		ordersummary obj4=obj3.clickoncheckout();
		orderconfirmation obj5 =obj4.order(country);
		String confirmationmessage=obj5.ordersnapo()
				;
		Assert.assertTrue(confirmationmessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
		driver.quit();
	}

@DataProvider
public Object[][] getData1() {
	HashMap<String, String> map= new HashMap<String,String>();
	map.put("email","gfu@gmail.com");
	map.put("pass","Kartikk@15");
	map.put("productre", "ZARA COAT 3");	
	HashMap<String, String> map2= new HashMap<String,String>();
	map2.put("email","gfu@gmail.com");
	map2.put("pass","Kartikk@15");
	map2.put("productre", "ADIDAS ORIGINAL");
	Object[][] data= new Object[][] {{map},{map2}};
	return data;
}

@DataProvider
public Object[][] getData() throws IOException {
	jasonreader q= new jasonreader();
	 List<HashMap<String,String>>data1 =q.hashmapcreater();
	//Object[][] data= new Object[][] {{data1.get(0)},{data1.get(1)}};
	Object[][] data= new Object[][] {{data1.get(0)}};
	return data;
}

@DataProvider
public void getDatafromexcel() throws IOException {
	
}



}
