package StepsDefinition.BusinessRequest.AddBr;

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


        @And("User add Specific contract number, Date SC is received, Date SC is signed, Project start date  and Maximum end date")
    public void user_add_specific_contract_number_date_sc_is_received_date_sc_is_signed_project_start_date_and_maximum_end_date() throws InterruptedException {
        commonHelper.waitElementToBeClickable(By.id("ContracNbrStep5")).sendKeys(scInformation[0]);
        commonHelper.waitElementToBeClickable(By.id("dtSCRStep5")).sendKeys(scInformation[1]);
        commonHelper.waitElementToBeClickable(By.id("dtSCStep5")).sendKeys(scInformation[1]);
        commonHelper.waitElementToBeClickable(By.id("dtMaxStep5")).sendKeys(scInformation[2]);
    }


        @And("User add sent to customer, Date proposal is submitted to customer , Acceptance date , Date FO is submitted to customer")
        public void user_add_sent_to_customer_date_proposal_is_submitted_to_customer_acceptance_date_date_fo_is_submitted_to_customer
        ()  {
            commonHelper.waitElementToBeClickable(By.name("YNToCustomer")).sendKeys(scInformation[1]);
            commonHelper.waitElementToBeClickable(By.name("dtProposal")).sendKeys(scInformation[1]);
            commonHelper.waitElementToBeClickable(By.name("dtAcceptance")).sendKeys(scInformation[1]);
            commonHelper.waitElementToBeClickable(By.name("dtFO")).sendKeys(scInformation[3]);
        }

    }

