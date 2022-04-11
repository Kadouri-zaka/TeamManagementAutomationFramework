package StepsDefinition.ScControl;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

public class CreateScFromScControl {

    CommonHelper commonHelper = new CommonHelper();
    DriverHandler driver = new DriverHandler();
    String requestNumber = new String("Zaka09/09/2022_PSA");
    String oERPCode = new String("478");

    @When("User click on Sc Control")
    public void user_click_on_sc_control() {
        commonHelper.waitElementToBeClickable(By.id("IdSCControl")).click();
    }
    @And("User click on T&M control")
    public void user_click_on_t_m_control() {
        commonHelper.waitElementToBeClickable(By.id("IdT&MControl")).click();
    }
    @And("User click on new sc control button")
    public void user_click_on_new_sc_control_button() {
        commonHelper.waitElementToBeClickable(By.id("addPanelHeader")).click();
    }

    @And("User add a Request number")
    public void user_add_a_request_number() {
        commonHelper.waitElementToBeClickable(By.id("ReqNumberId")).sendKeys(requestNumber);
    }

    @And("User click on T&M control button")
    public void user_click_on_t_m_control_button() {
        commonHelper.waitElementToBeVisible(By.id("tab2Id")).click();
    }

    @And("User add OERP PROJECT CODE")
    public void user_add_oerp_project_code() {
        commonHelper.waitElementToBeClickable(By.id("DarwinCodeId")).sendKeys(oERPCode);
    }

    @And("User click on add button for OERP Projet code")
    public void user_click_on_add_button_for_oerp_projet_code() {
        commonHelper.waitElementToBeClickable(By.id("addOERPId")).click();
    }

    @And("User Click on save New SC Button")
    public void user_click_on_save_new_sc_button() {
        commonHelper.waitElementToBeClickable(By.id("SaveFormId")).click();
    }

    @And("User click on ok button")
    public void user_click_on_ok_button() {
    commonHelper.waitElementToBeClickable(By.xpath("//button[@class='swal2-confirm swal2-styled' and contains(text(),'OK')]")).click();
    }

    @Then("Sc is created successfully")
    public void sc_is_created_successfully() {
    System.out.println("Sc is created successfully");
    }

}
