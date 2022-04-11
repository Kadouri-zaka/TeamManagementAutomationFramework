package StepsDefinition.ScControl;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

public class AddNormalPerformance {
    CommonHelper commonHelper = new CommonHelper();
    DriverHandler driver = new DriverHandler();
    String daysWoeked = new String("5");
    @When("User click on performance button")
    public void user_click_on_performance_button() {
       commonHelper.clickElementByJs(By.id("tab3Id"),30);
    }
    @And("User click on add month button")
    public void user_click_on_add_month_button() {
        commonHelper.waitElementToBeClickable(By.id("OpenDWId")).click();
    }
    @And("User add month and days worked")
    public void user_add_month_and_days_worked() {
        commonHelper.waitElementToBeClickable(By.xpath("(//button[@class='btn btn-default' and @ng-click ='open2()'])[1]")).click();
        commonHelper.waitElementToBeClickable(By.xpath("(//button[@class='btn btn-default' and @ng-click='select(dt.date)'])[4]")).click();
        commonHelper.waitElementToBeClickable(By.id("NumberOfDaysWorkedId")).sendKeys(daysWoeked);
    }
    @And("user click on add month")
    public void user_click_on_add_month() {
        commonHelper.waitElementToBeClickable(By.id("IDSaveForm")).click();
    }
    @And("Uer click on save edit SC")
    public void uer_click_on_save_edit_sc() {
        commonHelper.waitElementToBeClickable(By.id("SaveFormId")).click();
    }
    @And("User click on add comment button")
    public void user_click_on_add_comment_button() {
        commonHelper.waitElementToBeClickable(By.name("SaveFormComment")).click();
    }
    @Then("Month is added successfully")
    public void month_is_added_successfully() {
        System.out.println("Month is added successfully");
    }
}
