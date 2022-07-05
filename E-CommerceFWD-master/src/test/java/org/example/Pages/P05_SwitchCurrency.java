package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class P05_SwitchCurrency {
    WebDriver driver;

    public P05_SwitchCurrency(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement currency() {
        return driver.findElement(By.id("customerCurrency"));
    }

    public WebElement currency€() {
        return driver.findElement(By.xpath("//option[@value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F\"]"));
    }
}
