package StepsDefinition.ScControl;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

public class AccessBrFromScControl {
    CommonHelper commonHelper = new CommonHelper();
    DriverHandler driver = new DriverHandler();
    @And("User click on edit Sc button")
    public void user_click_on_edit_sc_button() {
        commonHelper.waitElementToBeClickable(By.id("updateId")).click();
    }
    @And("User click on Business Request button")
    public void user_click_on_business_request_button() {
        commonHelper.waitElementToBeClickable(By.id("RedirectToBRId")).click();
        commonHelper.waitElementToBeClickable(By.xpath("//button[@class='swal2-confirm btn btn-success swal2-styled']")).click();
    }

    @Then("Business Request page is opened")
    public void business_request_page_is_opened() {
        System.out.println("Business request page is opened");
    }
}
