package StepsDefinition.BussnissRequest.AddBr;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

public class AddNewBrPIP {
    DriverHandler driver= new DriverHandler();
    CommonHelper commonHelper = new CommonHelper();
    String date = new String("19/04/2022");
    String totalManDays = new String("100");
    String scInformation[] = {"okoi",date,"30/07/2022",date};
    String consultantCost = new String("150");
    @And("User add total man days")
    public void user_add_total_man_days()  {
        commonHelper.waitElementToBeClickable(By.id("TOTAL_man_daysStep3")).sendKeys(totalManDays);    }

    @When("User click on Specefic contract button")
    public void user_click_on_specefic_contract_button() {
        commonHelper.waitElementToBeClickable(By.xpath("//a[@id='step5']")).click();
    }
        @And("User add Specific contract number, Date SC is received, Date SC is signed, Project start date  and Maximum end date")
    public void user_add_specific_contract_number_date_sc_is_received_date_sc_is_signed_project_start_date_and_maximum_end_date() throws InterruptedException {
        commonHelper.waitElementToBeClickable(By.id("ContracNbrStep5")).sendKeys(scInformation[0]);
        commonHelper.waitElementToBeClickable(By.id("dtSCRStep5")).sendKeys(scInformation[1]);
        commonHelper.waitElementToBeClickable(By.id("dtSCStep5")).sendKeys(scInformation[1]);
        commonHelper.waitElementToBeClickable(By.id("dtMaxStep5")).sendKeys(scInformation[2]);
    }

    @When("User click on work order")
    public void user_click_on_work_order()  {
        commonHelper.waitElementToBeClickable(By.id("step2")).click();
    }
    @And("User click on edit profile button")
    public void user_click_on_edit_profile_button()  {
        commonHelper.waitElementToBeClickable(By.xpath("(//a[@id='editWorkOrder'])[1]")).click();

    }
        @And("User add sent to customer, Date proposal is submitted to customer , Acceptance date , Date FO is submitted to customer")
        public void user_add_sent_to_customer_date_proposal_is_submitted_to_customer_acceptance_date_date_fo_is_submitted_to_customer
        ()  {
            commonHelper.waitElementToBeClickable(By.name("YNToCustomer")).sendKeys(scInformation[1]);
            commonHelper.waitElementToBeClickable(By.name("dtProposal")).sendKeys(scInformation[1]);
            commonHelper.waitElementToBeClickable(By.name("dtAcceptance")).sendKeys(scInformation[1]);
            commonHelper.waitElementToBeClickable(By.name("dtFO")).sendKeys(scInformation[3]);
        }
        @And("User click on save edit work order button")
        public void user_click_on_save_edit_work_order_button ()  {
            commonHelper.waitElementToBeClickable(By.id("SaveWOProfile")).click();
           // commonHelper.waitElementToBeClickable(By.xpath("//button[@class='swal2-cancel btn btn-danger stylebutton swal2-styled']")).click();
        }
    @And("user click on Profile level consultant button")
    public void user_click_on_Profile_level_consultant_button () {
        commonHelper.waitElementToBeClickable(By.id("tab1Step3")).click();
    }

        @And("User click on edit button consultant")
        public void user_click_on_edit_button_consultant () {
            commonHelper.waitElementToBeClickable(By.id("editConsultantName")).click();
        }
        @And("User add consultant cost and click on save button")
            public void user_add_consultant_cost_and_click_on_save_button ()  {
            commonHelper.waitElementToBeClickable(By.id("ConsultantCostEtit")).sendKeys(consultantCost);
            commonHelper.waitElementToBeClickable(By.id("SaveEdteConsultant")).click();
        }
    }

