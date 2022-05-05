package StepsDefinition.BusinessRequest.EditBr;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

public class AccessScFromBrWihtoutMod {
    CommonHelper commonHelper = new CommonHelper();
    DriverHandler driver= new DriverHandler();
    @When("User click on button SC Control")
    public void user_click_on_button_sc_control()  {
        commonHelper.waitElementToBeVisible(By.id("ControlSCId"));
        commonHelper.clickElementByJs(By.id("ControlSCId"),2000);
    }
    @And("Click on yes and proceed button")
    public void click_on_yes_and_proceed_button()  {
        commonHelper.waitElementToBeClickable(By.xpath("//button[@class='swal2-confirm btn btn-success swal2-styled' and contains(text(),'Yes, and proceed!')]")).click();
    }
}
