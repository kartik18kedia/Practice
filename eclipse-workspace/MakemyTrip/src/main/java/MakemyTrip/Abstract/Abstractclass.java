package MakemyTrip.Abstract;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Abstractclass {
	WebDriver driver;
	
	public Abstractclass (WebDriver driver) {
		this.driver=driver;
		
	}

	public void visibilityofelement(By weblocator) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(weblocator));
	}
	public void elementclickable(By weblocator) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(weblocator));
	}
	
	public void scrollmethodforwindow() {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,10000)");
		
			}
}
