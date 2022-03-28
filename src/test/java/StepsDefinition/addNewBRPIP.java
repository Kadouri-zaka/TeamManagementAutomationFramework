package StepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

public class addNewBRPIP {
    DriverHandler driver= new DriverHandler();
    CommonHelper commonHelper = new CommonHelper();
    String date = new String("25/03/2022");
    @And("User add total man days")
    public void user_add_total_man_days() throws InterruptedException {
        WebElement TxtTotalManDays = driver.getDriver().findElement(By.id("TOTAL_man_daysStep3"));
        TxtTotalManDays.sendKeys("100");
        Thread.sleep(1000);
    }



    @When("User click on Specefic contract button")
    public void user_click_on_specefic_contract_button() throws InterruptedException {

        WebElement BtnSCBtn = driver.getDriver().findElement(By.id("step5"));
        BtnSCBtn.click();
        Thread.sleep(1000);


    }

        @And("User add Specific contract number, Date SC is received, Date SC is signed, Project start date  and Maximum end date")
    public void user_add_specific_contract_number_date_sc_is_received_date_sc_is_signed_project_start_date_and_maximum_end_date() throws InterruptedException {
        WebElement TxtSCNumber = driver.getDriver().findElement(By.id("ContracNbrStep5"));
        TxtSCNumber.sendKeys("ok");
        Thread.sleep(1000);

        WebElement TxDateSCReceived = driver.getDriver().findElement(By.id("dtSCRStep5"));
        TxDateSCReceived.sendKeys(date);
        Thread.sleep(1000);

        WebElement TxtDateSCsigned = driver.getDriver().findElement(By.id("dtSCStep5"));
        TxtDateSCsigned.sendKeys(date);
        Thread.sleep(1000);


        WebElement TxtMaximumEndDate = driver.getDriver().findElement(By.id("dtMaxStep5"));
        TxtMaximumEndDate.sendKeys("25/06/2022");
        Thread.sleep(1000);




    }

    @When("User click on work order")
    public void user_click_on_work_order() throws InterruptedException {
        WebElement BtnWorkOrder = driver.getDriver().findElement(By.id("step2"));
        BtnWorkOrder.click();
        Thread.sleep(1000);

    }
    @And("User click on edit profile button")
    public void user_click_on_edit_profile_button() throws InterruptedException {
        commonHelper.waitElementToBeClickable(By.xpath("//button[@id='editWorkOrder' and @class='edit'])[0]")).click();
       /* WebElement BtnEditProfile = driver.getDriver().findElement(By.id("editWorkOrder"));
        BtnEditProfile.click();
        Thread.sleep(1000);*/
    }



        @And("User add sent to customer, Date proposal is submitted to customer , Acceptance date , Date FO is submitted to customer")

        public void user_add_sent_to_customer_date_proposal_is_submitted_to_customer_acceptance_date_date_fo_is_submitted_to_customer
        () throws InterruptedException {
            WebElement TxtSentToCustomer = driver.getDriver().findElement(By.name("YNToCustomer"));
            TxtSentToCustomer.sendKeys(date);
            Thread.sleep(1000);

            WebElement TxtDateProposal = driver.getDriver().findElement(By.name("dtProposal"));
            TxtDateProposal.sendKeys(date);
            Thread.sleep(1000);

            WebElement TxtAcceptanceDate = driver.getDriver().findElement(By.name("dtAcceptance"));
            TxtAcceptanceDate.sendKeys(date);
            Thread.sleep(1000);

            WebElement TxtDateFO = driver.getDriver().findElement(By.name("dtFO"));
            TxtDateFO.sendKeys("06/04/2022");
            Thread.sleep(1000);

        }

        @And("User click on save edit work order button")
        public void user_click_on_save_edit_work_order_button () throws InterruptedException {
            WebElement BtnSaveEditWO = driver.getDriver().findElement(By.id("SaveWOProfile"));
            BtnSaveEditWO.click();
            Thread.sleep(1000);
        }

    @And("user click on Profile level consultant button")
    public void user_click_on_Profile_level_consultant_button () throws InterruptedException {
        WebElement BtnPLConsultant = driver.getDriver().findElement(By.id("tab1Step3"));
        BtnPLConsultant.click();
        Thread.sleep(1000);
    }

        @And("User click on edit button consultant")
        public void user_click_on_edit_button_consultant () throws InterruptedException {
            WebElement BtnPLConsultant = driver.getDriver().findElement(By.id("editConsultantName"));
            BtnPLConsultant.click();
            Thread.sleep(1000);

        }


        @And("User add consultant cost and click on save button")
            public void user_add_consultant_cost_and_click_on_save_button () throws InterruptedException {
            WebElement TxtConsultantCost = driver.getDriver().findElement(By.id("ConsultantCostEtit"));
            TxtConsultantCost.sendKeys("150");
            Thread.sleep(1000);

            WebElement BtnPLConsultant = driver.getDriver().findElement(By.id("SaveEdteConsultant"));
            BtnPLConsultant.click();
            Thread.sleep(1000);



        }

//    public void user_click_on_save_of_br_pip() throws InterruptedException {
  //      WebElement BtnsAVEbppip = driver.getDriver().findElement(By.id("SaveBusinessRq"));
   //     BtnsAVEbppip.click();
   //     Thread.sleep(1000);
    }
  //  }
