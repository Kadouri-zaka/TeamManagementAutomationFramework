package StepsDefinition.ScControl;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

public class DeleteScFromScControl {
    CommonHelper commonHelper = new CommonHelper();
    DriverHandler driver= new DriverHandler();
    String requestNumber = new String("ZakaTest17/03/22_6");
    @And("User click search button")
    public void user_click_search_button() {
    commonHelper.waitElementToBeClickable(By.id("searchBtn")).click();
    }
    @And("User add a Request number in filter")
    public void user_add_a_request_number_in_filter() {
    commonHelper.waitElementToBeClickable(By.id("filterId")).sendKeys(requestNumber);
    }
    @And("User click on Request in grid")
    public void user_click_on_request_in_grid() {
    commonHelper.waitElementToBeClickable(By.xpath("//div[@class='ui-grid-cell-contents ng-binding ng-scope' and contains(text(),'"+requestNumber+"')]")).click();
    }
    @And("User click on remove request button")
    public void user_click_on_remove_request_button() {
    commonHelper.waitElementToBeClickable(By.id("removeId")).click();
    }
    @And("User click on yes delete button")
    public void user_click_on_yes_delete_button() {
    commonHelper.waitElementToBeClickable(By.xpath("//button[@class='swal2-confirm btn btn-success swal2-styled' and contains(text(),'Yes, delete it!')]")).click();
    }
    @Then("Sc is deleted successfully")
    public void sc_is_deleted_successfully() {
    System.out.println("Sc is deleted successfully");
    }
}
