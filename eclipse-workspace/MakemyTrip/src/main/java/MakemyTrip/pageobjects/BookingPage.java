package MakemyTrip.pageobjects;

import org.openqa.selenium.*;

public class BookingPage {
    private WebDriver driver;

    public BookingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickContinue() {
        try { driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click(); } catch (Exception e) {}
    }

    public void selectXpressFlex() {
        try { driver.findElement(By.xpath("//*[contains(text(),'Xpress Flex')]//button")).click(); } catch (Exception e) {}
    }

    public void handlePriceIncrease() {
        try {
            WebElement popup = driver.findElement(By.xpath("//*[contains(text(),'price') and contains(text(),'increase')]"));
            String amount = popup.getText().replaceAll("[^0-9]","");
            System.out.println("Price increased by: ₹" + amount);
            popup.findElement(By.xpath(".//button[contains(text(),'Continue')]")).click();
        } catch (Exception e) { }
    }
}
