package framewok.Tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import framewok.TestResuableMethods.basemethod;

public class ac {

	public static void main(String[] args) throws AWTException, InterruptedException {
	basemethod a= new basemethod();
	WebDriver driver=a.driverini();
	driver.switchTo().newWindow(WindowType.TAB);
	Set<String> windows=driver.getWindowHandles();
	Iterator<String> k=windows.iterator();
	String window1=k.next();
	String window2=k.next();
	driver.switchTo().window(window2);
	driver.get("https://www.amazon.in/");
	Actions action= new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_ya_signin']"))).moveToElement(driver.findElement(By.xpath("(//span[contains(text(),'Sign in')])[1]"))).click().build().perform();
	
	}
	

}
