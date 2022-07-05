package StepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class P05_SwitchCurrency {

    Pages.Currency currencypage ;

    @When("user choose Euro from dropdown menu")
    public void user_select_Euro()  {
        currencypage = new Pages.Currency(Hooks.driver);
        currencypage.currency().click();
        currencypage.currency€().click();
    }

    @Then("euro is selected successfully")
    public void euro_is_selected_successfully()  {
     int count =Hooks.driver.findElements(
      By.xpath("//option[@value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F\"]")).size();
        for(int i=0;i<count;i++){
    String selected = Hooks.driver.findElement(By.cssSelector("span[class=\"price actual-price\"]")).getText();
    Assert.assertTrue(selected.contains("€"), "euro selected successfully");
}

    }}
