package StepsDefinition.BussnissRequest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

public class DeleteBr {
    DriverHandler driver= new DriverHandler();
    CommonHelper commonHelper = new CommonHelper();
    String request = new String("ZakaTest14/04/22_2");

    @And("User click on Search Button")
    public void user_click_on_search_button()  {
        commonHelper.waitElementToBeClickable(By.id("btnSearch")).click();
    }
    @And("User enter the request number in the filter")
    public void user_enter_the_request_number_in_the_filter()  {
        commonHelper.waitElementToBeClickable(By.id("filter")).sendKeys(request);
    }
    @And("User click on the request")
    public void user_click_on_the_request()  {
        commonHelper.waitElementToBeVisible(By.xpath("//div[contains(text(),'"+request+"')]"));
        commonHelper.clickElementByJs(By.xpath("//div[contains(text(),'"+request+"')]"),2000);
    }
    @When("User click on remove button")
    public void user_click_on_remove_button()  {
        commonHelper.waitElementToBeClickable(By.id("DeleteRq")).click();
    }
    @And("User Click on yes button")
    public void user_click_on_yes_button()  {
        commonHelper.waitElementToBeClickable(By.xpath("//button[contains(text(),'Yes, delete it!')]")).click();
    }
    @Then("BR is deleted")
    public void br_is_deleted()  {
            commonHelper.doubleClick(By.xpath("//button[contains(text(),'OK')]"));
    }
}
