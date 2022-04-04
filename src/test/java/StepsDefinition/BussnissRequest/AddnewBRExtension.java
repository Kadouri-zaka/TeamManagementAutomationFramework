package StepsDefinition.BussnissRequest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

import java.util.concurrent.TimeUnit;

public class AddnewBRExtension {
    DriverHandler driver= new DriverHandler();
    CommonHelper commonHelper = new CommonHelper();
    String bussnissRequestInformaation[] = {"NahidTest_Extension","CASIS Lot 1","Project in Progress (PiP)","TM","Extension"};

    @And("User add a Request number, Framework contract,Service type")
    public void user_add_a_request_number_framework_contract_service_type_source() {
        commonHelper.waitElementToBeClickable(By.name("ReqNumber")).sendKeys(bussnissRequestInformaation[0]);
        commonHelper.selectText(bussnissRequestInformaation[1],By.name("typeofct"));
        commonHelper.selectText(bussnissRequestInformaation[2],By.name("status"));
        commonHelper.selectText(bussnissRequestInformaation[3],By.name("typebr"));
    }

    @And("Choose source Extension")
    public void choose_source_extension() {
        commonHelper.selectText(bussnissRequestInformaation[4],By.id("SourceBusinessRq"));
    }

    @And("fill field Linked BR")
    public void fill_field_linked_br() {
        commonHelper.waitElementToBeVisible(By.name("LinkedBR")).sendKeys("ZakaTest17/03/22");
    }

    @When("click on the icon of loading extension")
    public void click_on_the_icon_of_loading_extension() {
        ((JavascriptExecutor)driver.getDriver()).executeScript(
                "arguments[0].click();", commonHelper.waitElementToBeClickable(By.id("LoadLinkedBR")));

    }

    @When("click on yes in the sweet alert appeared")
    public void click_on_yes_in_the_sweet_alert_appeared() {
        ((JavascriptExecutor)driver.getDriver()).executeScript(
                "arguments[0].click();",
                commonHelper.waitElementToBeVisible(By.xpath("//*[contains(text(), 'Yes, and proceed!')]")));
        driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Then("the extension request is saved")
    public void the_extension_request_is_saved() {
      System.out.print("Request is saved");
    }


}
