package StepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import test.impl.pages.CommonHelper;

public class add_new_BR_FP {
        CommonHelper commonHelper = new CommonHelper();

    @When("User click on other information button")
    public void user_click_on_other_information_button() {
        commonHelper.waitElementToBeClickable(By.id("step44")).click();
    }

    @And("User add total price")
    public void user_add_total_price() {
        commonHelper.waitElementToBeVisible(By.id("Total_PriceId")).sendKeys("120000");
    }

}
