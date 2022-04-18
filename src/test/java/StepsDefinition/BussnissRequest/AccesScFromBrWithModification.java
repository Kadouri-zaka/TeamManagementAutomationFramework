package StepsDefinition.BussnissRequest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

public class AccesScFromBrWithModification {

            CommonHelper commonHelper = new CommonHelper();
    DriverHandler driver= new DriverHandler();
    @And("User click on SC Control button")
    public void user_click_on_sc_control_button()  {
        commonHelper.clickElementByJs(By.id("ControlSCId"),2000);

                    // yes and procceed
        commonHelper.waitElementToBeClickable(By.id("controlSCwithUpdateBR")).click();
                    //no and proceed
      /*  commonHelper.waitElementToBeClickable(By.id("controlSCwithoutUpdateBR")).click();*/
                    //Cancel
       /* commonHelper.waitElementToBeClickable(By.id("CancelcontrolSC")).click();*/
    }
    @Then("Sc is displayed")
    public void sc_is_displayed() {
        System.out.println("Sc is displayed");
    }

}
