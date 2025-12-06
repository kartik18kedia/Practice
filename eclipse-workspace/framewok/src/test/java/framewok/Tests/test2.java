package framewok.Tests;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import framewok.TestResuableMethods.basemethod;
import framewok.pageobjects.homepage;
import framewok.pageobjects.orderconfirmation;
import framewok.pageobjects.orderpage;
import framewok.pageobjects.ordersummary;

public class test2 extends basemethod{
      @Test
	public void logoutcode() throws InterruptedException, IOException {
	
		homepage obj2=obj1.login("gfu@gmail.com","Kartikk@15");
		obj2.logout();
		driver.quit();
	}

}
