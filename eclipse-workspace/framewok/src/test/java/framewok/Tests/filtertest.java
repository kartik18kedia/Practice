package framewok.Tests;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import framewok.TestResuableMethods.basemethod;
import framewok.pageobjects.homepage;

public class filtertest extends basemethod {
	
	@Test(priority=5)
		public void filtercode() throws InterruptedException, IOException {
			
			homepage obj2=obj1.login("gfu@gmail.com","Kartikk@15");
			String jk=obj2.pricefilter();
			System.out.println("filtercode");
			Assert.assertTrue(jk.contains("1"));;
			driver.quit();
		}

	 @Test(priority=-11)
		public void categoryfilter() throws InterruptedException, IOException {
		 String product="ADIDAS ORIGINAL";
			homepage obj2=obj1.login("gfu@gmail.com","Kartikk@15");
			String prode= "shoes";
			obj2.subcatsel(prode);
			WebElement prodsel=obj2.productcheck(product);
			String k=prodsel.findElement(By.tagName("b")).getText();
			Assert.assertEquals(product,k);
			System.out.println("categoryfilter");
			driver.quit();
			
		}
	 }
