package StepsDefinition.BusinessRequestScenarioOutline;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

public class AddNewBrPIPScenarioOutline {
    DriverHandler driver = new DriverHandler();
    CommonHelper commonHelper = new CommonHelper();
    By totalManDaysSelector = By.id("TOTAL_man_daysStep3");
    By specificContractButtonSelector =By.xpath("//a[@id='step5']");

    By profileLevelConsultantButtonSelector =By.id("tab1Step3");
    By editButtonConsultantSelector =By.id("editConsultantName");


    By contractNumberSelector = By.id("ContracNbrStep5");
    By ScReceivedSelector =By.id("dtSCRStep5");
    By ScSignedSelector = By.id("dtSCStep5");
    By endDateSelector = By.id("dtMaxStep5");

    By sweetAlertSelector = By.xpath("//div[@id='swal2-content']");
    By okButtonSelector = By.xpath("//button[contains(text(),'OK')]");
    @And("^User add total man days as (.*)$")
    public void user_add_total_man_days_as_total_man_days(String totalManDays)  {
        commonHelper.waitElementToBeClickable(totalManDaysSelector).sendKeys(totalManDays);    }
    @When("User click on Specefic contract button")
    public void user_click_on_specefic_contract_button() {
        commonHelper.waitElementToBeClickable(specificContractButtonSelector).click();
    }
    @And("^User add Specific contract number as (.*), Date SC is received as (.*), Date SC is signed as (.*),and Maximum end date as (.*)$")
    public void user_add_specific_contract_number_as_contract_number_date_sc_is_received_as_sc_received_date_sc_is_signed_as_sc_is_signed_project_start_date_as_start_date_and_maximum_end_date_as_end_date(String contractNumber,String ScReceived,String ScSigned,String endDate) {
        commonHelper.waitElementToBeClickable(contractNumberSelector).sendKeys(contractNumber);
        commonHelper.waitElementToBeClickable(ScReceivedSelector).sendKeys(ScReceived);
        commonHelper.waitElementToBeClickable(ScSignedSelector).sendKeys(ScSigned);
        commonHelper.waitElementToBeClickable(endDateSelector).sendKeys(endDate);
    }

    @And("user click on Profile level consultant button")
    public void user_click_on_Profile_level_consultant_button () {
        commonHelper.waitElementToBeClickable(profileLevelConsultantButtonSelector).click();
    }
    @And("User click on edit button consultant")
    public void user_click_on_edit_button_consultant () {
        commonHelper.waitElementToBeClickable(editButtonConsultantSelector).click();
    }

    @Then("Business Request with Status PIP is added")
    public void business_request_with_status_pip_is_added() {
        String sweetAlert = commonHelper.waitElementToBeVisible(sweetAlertSelector).getText();
        Assert.assertTrue( "Request is not saved because "+sweetAlert,sweetAlert.equalsIgnoreCase("Request is saved"));
        commonHelper.waitElementToBeClickable(okButtonSelector).click();
    }
}
