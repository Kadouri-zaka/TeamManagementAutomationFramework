package StepsDefinition.BussnissRequest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

public class CreateScBr {
    DriverHandler driver= new DriverHandler();
    CommonHelper commonHelper = new CommonHelper();
    String oerpCode = new String("2759");
    @When("User click on edit button")
    public void user_click_on_edit_button()  {
        commonHelper.waitElementToBeClickable(By.id("EditBR")).click();
    }
    @And("User click on Specific contract button")
    public void user_click_on_specific_contract_button()  {
        commonHelper.waitElementToBeVisible(By.id("step5")).click();
    }
    @And("User click on Create SC button")
    public void user_click_on_create_sc_button()  {
        commonHelper.waitElementToBeClickable(By.id("CreateSC")).click();
        commonHelper.waitElementToBeClickable(By.xpath("//button[contains(text(),'Yes, and proceed!')]")).click();
    }
    @And("User add OERP project code")
    public void user_add_oerp_project_code() {
        commonHelper.waitElementToBeClickable(By.name("OERPProjectCode")).sendKeys(oerpCode);
    }
    @And("User click on add OERP button")
    public void user_click_on_add_oerp_button()  {
        commonHelper.waitElementToBeClickable(By.id("ButtonAddOERP")).click();
    }
    @And("User click on save OERP button")
    public void user_click_on_save_oerp_button()  {
        commonHelper.waitElementToBeClickable(By.id("SaveOERPcode")).click();
    }
    @Then("Sc is created")
    public void sc_is_created() {
        System.out.println("SC created");
    }
}
