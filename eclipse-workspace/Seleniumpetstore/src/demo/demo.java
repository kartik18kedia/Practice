package demo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.jupiter.api.Assertions;

public class demo {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\KARTIK\\eclipse-workspace\\drivers");
		WebDriver driver= new ChromeDriver();
		String name1="Dalmation";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click();
        driver.findElement(By.name("username")).sendKeys("kartik1345");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("kk123");
        driver.findElement(By.name("signon")).click();
        driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[2]/img")).click();
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[4]/td[1]/a")).click();
        String value1=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[4]")).getText();
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[5]/a")).click();
        String totaalvalue=driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[7]")).getText();
        String name2=driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[3]")).getText();
        Assertions.assertEquals(value1,totaalvalue);
        name2.contains(name1);
        //driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click();
        
     
        
         
        

	}

}
