package StepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

public class acces_SC_fromBR_Mod {

            CommonHelper commonHelper = new CommonHelper();
    DriverHandler driver= new DriverHandler();

    @And("User click on SC Control button")
    public void user_click_on_sc_control_button() throws InterruptedException {
        WebElement BtnSCControl = driver.getDriver().findElement(By.id("ControlSCId"));
        ((JavascriptExecutor) driver.getDriver()).executeScript("arguments[0].click();", BtnSCControl);
        Thread.sleep(1000);

                    // yes and procceed
        WebElement BtnYesC1 = driver.getDriver().findElement(By.id("controlSCwithUpdateBR"));
        ((JavascriptExecutor) driver.getDriver()).executeScript("arguments[0].click();", BtnYesC1);
        Thread.sleep(1000);



                    //no and proceed
       /* WebElement BtnYesC1 = driver.getDriver().findElement(By.id("controlSCwithoutUpdateBR"));
        ((JavascriptExecutor) driver.getDriver()).executeScript("arguments[0].click();", BtnYesC1);
        Thread.sleep(1000);*/

      /*  WebElement BtnYesC1 = driver.getDriver().findElement(By.id("CancelcontrolSC"));
        ((JavascriptExecutor) driver.getDriver()).executeScript("arguments[0].click();", BtnYesC1);
        Thread.sleep(1000);*/


    }
    @Then("Sc is displayed")
    public void sc_is_displayed() {
        System.out.println("Sc is displayed");
    }

}
