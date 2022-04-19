package StepsDefinition.BussnissRequest.AddBr;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

public class AddnewBRExtension {
    DriverHandler driver= new DriverHandler();
    CommonHelper commonHelper = new CommonHelper();
    String bussnissRequestInformaation[] = {"NahidTest_Extension_3","CASIS Lot 1","Project in Progress (PiP)","TM","Extension"};
    String linkedBrName = new String("ZakaTest17/03/22");
    @And("User add a Request number, Framework contract,Service type")
    public void user_add_a_request_number_framework_contract_service_type_source() {

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
        commonHelper.waitElementToBeVisible(By.name("LinkedBR")).sendKeys(linkedBrName);
    }
    @When("click on the icon of loading extension")
    public void click_on_the_icon_of_loading_extension() {
        commonHelper.clickElementByJs(By.id("LoadLinkedBR"),2000);
    }
    @When("click on yes in the sweet alert appeared")
    public void click_on_yes_in_the_sweet_alert_appeared() {
        commonHelper.waitElementToBeClickable(By.xpath("//*[contains(text(), 'Yes, and proceed!')]")).click();
        commonHelper.waitElementToBeClickable(By.name("ReqNumber")).sendKeys(bussnissRequestInformaation[0]);
    }
    @Then("the extension request is saved")
    public void the_extension_request_is_saved() {
      System.out.print("Request is saved");
    }


}
