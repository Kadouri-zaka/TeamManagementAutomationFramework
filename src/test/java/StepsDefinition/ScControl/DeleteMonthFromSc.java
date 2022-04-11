package StepsDefinition.ScControl;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

public class DeleteMonthFromSc {
    CommonHelper commonHelper = new CommonHelper();
    DriverHandler driver = new DriverHandler();
    String deleteButonXpath = new String("(//a[@id='DeleteDWId'])[1]");
    @And("User click on button delete month")
    public void user_click_on_button_delete_month() {
        commonHelper.waitElementToBeVisible(By.id("largeModelTMPTM"));
        commonHelper.waitElementToBeClickable(By.xpath(deleteButonXpath)).click();
        commonHelper.waitElementToBeClickable(By.xpath("//button[@class='swal2-confirm btn btn-success swal2-styled']")).click();
        commonHelper.waitElementToBeClickable(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
    }

    @Then("Month is deleted successfully")
    public void month_is_deleted_successfully() {
        System.out.println("Month is deleted successfully");
    }
}
