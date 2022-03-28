package StepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

public class create_SC_2_OERP {

    CommonHelper commonHelper = new CommonHelper();
    DriverHandler driver= new DriverHandler();
    String date = new String("25/03/2022");

    @And("User add secund Profile , level , on site , sales price, nbr of days other expertise")
    public void user_add_secund_profile_level_on_site_sales_price_nbr_of_days_other_expertise() throws InterruptedException {
        WebElement TxtProfile = driver.getDriver().findElement(By.name("Profile"));
        Select s8 = new Select(TxtProfile);
        s8.selectByVisibleText("Adev");
        Thread.sleep(1000);

        WebElement TxtLevel = driver.getDriver().findElement(By.name("Level"));
        Select s9 = new Select(TxtLevel);
        s9.selectByVisibleText("Junior");
        Thread.sleep(1000);

        WebElement TxtOnOfSite = driver.getDriver().findElement(By.name("OnSite"));
        Select s10 = new Select(TxtOnOfSite);
        s10.selectByVisibleText("On site");
        Thread.sleep(1000);

        WebElement TxtNbrDays = driver.getDriver().findElement(By.id("ndaysprofile"));
        TxtNbrDays.sendKeys("100");
        Thread.sleep(1000);

        WebElement TxtSalesPrice = driver.getDriver().findElement(By.xpath("//input[@id='SalespriceProfile']"));
        TxtSalesPrice.clear();
        TxtSalesPrice.sendKeys("250");
        Thread.sleep(1000);

        WebElement TxtOtherExpertise = driver.getDriver().findElement(By.name("Other_Expertise_required"));
        TxtOtherExpertise.sendKeys("java selenium");
        Thread.sleep(1000);
    }


    @When("User click on candidate partner button")
    public void user_click_on_candidate_partner_button() {

      commonHelper.waitElementToBeClickable(By.id("tab3Step3")).click();
    }

    @And("User click on new candidate button")
    public void user_click_on_new_candidate_button() {

        commonHelper.waitElementToBeClickable(By.id("IdgetListPartners")).click();
    }

    @And("User add first name , last name , recruitement , company , resource type")
    public void user_add_first_name_last_name_recruitement_company_resource_type() throws InterruptedException {

        commonHelper.waitElementToBeClickable(By.name("CandidatePartnerFirstName")).sendKeys("aqxws");
        commonHelper.waitElementToBeClickable(By.name("CandidatePartnerLastName")).sendKeys("pfejbwa");
        Thread.sleep(1000);

        WebElement BtnPartner = driver.getDriver().findElement(By.id("IDRecruitment"));
        Select p0 = new Select(BtnPartner);
        p0.selectByVisibleText("Partner");
        Thread.sleep(1000);

        WebElement BtnRecourceType = driver.getDriver().findElement(By.id("ResourceTypeiD"));
        Select p1 = new Select(BtnRecourceType);
        p1.selectByVisibleText("Recruitment");
        Thread.sleep(1000);

    }

    @And("User click on save partner button")
    public void user_click_on_save_partner_button() throws InterruptedException {

        WebElement Btnadd = driver.getDriver().findElement(By.id("AddUpdateCandidatePartnerId"));
        ((JavascriptExecutor) driver.getDriver()).executeScript("arguments[0].click();", Btnadd);
        Thread.sleep(1000);
      //  commonHelper.waitElementToBeClickable(By.id("")).submit();

        WebElement BtnYes = driver.getDriver().findElement(By.xpath("//button[@class='swal2-confirm btn btn-success stylebutton swal2-styled' and contains(text(),'Yes')]"));
        ((JavascriptExecutor) driver.getDriver()).executeScript("arguments[0].click();", BtnYes);
        Thread.sleep(1000);
    }

    @And("User click on check partner button")
    public void user_click_on_check_partner_button() throws InterruptedException {

        WebElement BtnChekBTN = driver.getDriver().findElement(By.xpath("//body/div[@id='myModal']/div[@id='relative-large-modal']/div[1]/div[3]/form[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
        BtnChekBTN.click();
        Thread.sleep(1000);
    }

    @And("User click select as consultant button")
    public void user_click_select_as_consultant_button() throws InterruptedException {

        commonHelper.waitElementToBeClickable(By.id("IDaddAsConsultant")).click();

        WebElement BtnYesC2 = driver.getDriver().findElement(By.xpath("//button[contains(text(),'Yes, and proceed')]"));
        BtnYesC2.click();
        Thread.sleep(1000);
    }

    @And("User add Type of contract and Employee number for partner")
    public void user_add_type_of_contract_and_employee_number_for_partner() throws InterruptedException {

       Actions actions = new Actions(driver.getDriver());
 WebElement btnElement = driver.getDriver().findElement(By.xpath("//div[@class='ui-grid-cell-contents ng-binding ng-scope' and contains(text(),'--Choose item--')]"));
     actions.doubleClick(btnElement).perform();
      WebElement BtnSel = driver.getDriver().findElement(By.id("TOCCand"));
        Select p4 = new Select(BtnSel);
        p4.selectByVisibleText("Employee");
       Thread.sleep(1000);
        WebElement btnEN = driver.getDriver().findElement(By.id("OERPEmployeeId"));
     actions.doubleClick(btnEN).perform();
      WebElement BtnEnumber = driver.getDriver().findElement(By.id("OERPCand"));
      BtnEnumber.sendKeys("50767");
      Thread.sleep(1000);
    }

    @And("User add consultant cost and profile")
    public void user_add_consultant_cost_and_profile() throws InterruptedException {

        WebElement TxtSalesPrice = driver.getDriver().findElement(By.id("ConsultantCostEtit"));
        TxtSalesPrice.clear();
        TxtSalesPrice.sendKeys("250");
        Thread.sleep(1000);

        WebElement BtnProfile = driver.getDriver().findElement(By.id("ProfileConsultantId"));
        Select s1 = new Select(BtnProfile);
        s1.selectByVisibleText("    AA;Junior;On site");
        Thread.sleep(1000);





    }

    @And("User click on edit partner button")
    public void user_click_on_edit_partner_button() {



     commonHelper.waitElementToBeClickable(By.xpath("//button[@id='editConsultantName' and @class='edit'])[last()]")).click();
    }

    @And("User add profile cost and profile")
    public void user_add_profile_cost_and_profile() throws InterruptedException {

        WebElement TxtSalesPrice = driver.getDriver().findElement(By.id("ConsultantCostEtit"));
        TxtSalesPrice.clear();
        TxtSalesPrice.sendKeys("300");
        Thread.sleep(1000);

        WebElement BtnProfile = driver.getDriver().findElement(By.id("ProfileConsultantId"));
        Select s1 = new Select(BtnProfile);
        s1.selectByVisibleText("    Adev;Junior;On site");
        Thread.sleep(1000);

    }

    @And("User click on edit partner save button")
    public void user_click_on_edit_partner_save_button() {

        commonHelper.waitElementToBeClickable(By.id("SaveEdteConsultant")).click();
    }

    @And("User click on edit second profile")
    public void user_click_on_edit_second_profile() {
        commonHelper.waitElementToBeClickable(By.xpath("//button[@id='editWorkOrder' and @class='edit'])[1]")).click();
    }

    @And("User add sent to customer, Date proposal is submitted to customer , Acceptance date , Date FO is submitted to customer for second  profile")
    public void user_add_sent_to_customer_date_proposal_is_submitted_to_customer_acceptance_date_date_fo_is_submitted_to_customer_for_second_profile() throws InterruptedException {
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
    @And("User add second OERP code")
    public void user_add_second_oerp_code() throws InterruptedException {

        WebElement TxtOERP = driver.getDriver().findElement(By.name("OERPProjectCode"));
        TxtOERP.sendKeys("15933");
        Thread.sleep(1000);

    }
}
