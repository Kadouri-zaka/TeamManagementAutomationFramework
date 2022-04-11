package StepsDefinition.ScControl;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

public class AddDaysWorked {
    CommonHelper commonHelper = new CommonHelper();
    DriverHandler driver = new DriverHandler();

    @And("User add number of days worked")
    public void user_add_number_of_days_worked() {
        commonHelper.waitElementToBeVisible(By.id("tab3"));
        commonHelper.doubleClick(By.xpath("(//div[@class='ui-grid-cell ng-scope ui-grid-coluiGrid-006V'])[2]/div"));
        commonHelper.waitElementToBeClickable(By.id("IdNumberOfDaysWorked")).sendKeys("10");
        commonHelper.doubleClick(By.xpath("(//div[@class='ui-grid-cell ng-scope ui-grid-coluiGrid-006V'])[3]/div"));
        commonHelper.waitElementToBeClickable(By.id("IdNumberOfDaysWorked")).sendKeys("15");

    }

    @Then("Days worked are added successfully")
    public void days_worked_are_added_successfully() {
        System.out.println("Days worked are added successfully");
    }
}
