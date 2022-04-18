package StepsDefinition.BussnissRequest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

public class CreateBrWith2Consultant {

    CommonHelper commonHelper = new CommonHelper();
    DriverHandler driver= new DriverHandler();
    String date = new String("18/04/2022");
    String profileList[]={"Adev","Junior","On site","100","250","java selenium"};
    By levelName=By.name("Level");
    By profileName=By.name("Profile");
    By onOffsite =By.name("OnSite");
    By nbrOfDays = By.id("ndaysprofile");
    By salesPrice = By.id("SalespriceProfile");
    By otherExpertiseRequired = By.name("Other_Expertise_required");
    String candidateInformation[] = {"uyup","mljhj","Partner","Recruitment"};
    String partnerInformaton[]={"Freelance","9491","250","    AA;Junior;On site"};
    String consultantInformation[]={"300","    Adev;Junior;On site"};
    String oerpSeondCode = new String("267489");
    String checkButtonXPath = new String("(//div[@class='ui-grid-selection-row-header-buttons ui-grid-icon-ok ng-scope' and @ng-class=\"{'ui-grid-all-selected': grid.selection.selectAll}\"])[2]");
    @And("User add second Profile , level , on site , sales price, nbr of days other expertise")
    public void user_add_second_profile_level_on_site_sales_price_nbr_of_days_other_expertise()  {
        commonHelper.selectText(profileList[0],profileName);
        commonHelper.selectText(profileList[1],levelName);
        commonHelper.selectText(profileList[2],onOffsite );
        commonHelper.waitElementToBeClickable(nbrOfDays).sendKeys(profileList[3]);
        commonHelper.waitElementToBeClickable(salesPrice).clear();
        commonHelper.waitElementToBeClickable(salesPrice).sendKeys(profileList[4]);
        commonHelper.waitElementToBeClickable(otherExpertiseRequired).sendKeys(profileList[5]);
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
    public void user_add_first_name_last_name_recruitement_company_resource_type()  {
        commonHelper.waitElementToBeClickable(By.name("CandidatePartnerFirstName")).sendKeys(candidateInformation[0]);
        commonHelper.waitElementToBeClickable(By.name("CandidatePartnerLastName")).sendKeys(candidateInformation[1]);
        commonHelper.selectText(candidateInformation[2],By.id("IDRecruitment"));
        commonHelper.selectText(candidateInformation[3],By.id("ResourceTypeiD"));
    }
    @And("User click on save partner button")
    public void user_click_on_save_partner_button()  {
        commonHelper.waitElementToBeClickable(By.id("AddUpdateCandidatePartnerId")).click();
        commonHelper.waitElementToBeClickable(By.xpath("//button[@class='swal2-confirm btn btn-success stylebutton swal2-styled' and contains(text(),'Yes')]")).click();
    }
    @And("User click on check partner button")
    public void user_click_on_check_partner_button() {
        commonHelper.waitElementToBeClickable(By.xpath(checkButtonXPath)).click();
    }
    @And("User click select as consultant button")
    public void user_click_select_as_consultant_button()  {
        commonHelper.waitElementToBeClickable(By.id("IDaddAsConsultant")).click();
        commonHelper.waitElementToBeClickable(By.xpath("//button[contains(text(),'Yes, and proceed')]")).click();
    }
    @And("User add Type of contract and Employee number for partner")
    public void user_add_type_of_contract_and_employee_number_for_partner()  {
        commonHelper.doubleClick(By.xpath("//div[@class='ui-grid-cell-contents ng-binding ng-scope' and contains(text(),'--Choose item--')]"));
        commonHelper.selectText(partnerInformaton[0], By.id("TOCCand"));
      /*  commonHelper.DoubleClick(By.id("OERPEmployeeId"));
        commonHelper.waitElementToBeClickable(By.id("OERPCand")).sendKeys(partnerInformaton[1]);*/
    }
    @And("User add consultant cost and profile")
    public void user_add_consultant_cost_and_profile()  {
        commonHelper.waitElementToBeClickable(By.id("ConsultantCostEtit")).clear();
        commonHelper.waitElementToBeClickable(By.id("ConsultantCostEtit")).sendKeys(partnerInformaton[2]);
    //    commonHelper.selectText(partnerInformaton[3], By.id("ProfileConsultantId"));
    }
    @And("User click on edit partner button")
    public void user_click_on_edit_partner_button()  {
      commonHelper.waitElementToBeClickable(By.xpath("(//a[@id='editConsultantName'])[2]")).click();
    }
    @And("User add profile cost and profile")
    public void user_add_profile_cost_and_profile()  {
        commonHelper.waitElementToBeClickable(By.id("ConsultantCostEtit")).clear();
        commonHelper.waitElementToBeClickable(By.id("ConsultantCostEtit")).sendKeys(consultantInformation[0]);
    //    commonHelper.selectText(consultantInformation[1],By.id("ProfileConsultantId") );
    }
    @And("User click on edit partner save button")
    public void user_click_on_edit_partner_save_button() {
        commonHelper.waitElementToBeClickable(By.id("SaveEdteConsultant")).click();
    }
    @And("User click on edit second profile")
    public void user_click_on_edit_second_profile() {
        commonHelper.waitElementToBeClickable(By.xpath("(//a[@id='editWorkOrder'])[2]")).click();
    }
    @And("User add sent to customer, Date proposal is submitted to customer , Acceptance date , Date FO is submitted to customer for second  profile")
    public void user_add_sent_to_customer_date_proposal_is_submitted_to_customer_acceptance_date_date_fo_is_submitted_to_customer_for_second_profile() {
      commonHelper.waitElementToBeClickable(By.name("YNToCustomer")).sendKeys(date);
        commonHelper.waitElementToBeClickable(By.name("dtProposal")).sendKeys(date);
        commonHelper.waitElementToBeClickable(By.name("dtAcceptance")).sendKeys(date);
        commonHelper.waitElementToBeClickable(By.name("dtFO")).sendKeys(date);
    }
    @And("User add second OERP code")
    public void user_add_second_oerp_code() {
        commonHelper.waitElementToBeClickable(By.name("OERPProjectCode")).sendKeys(oerpSeondCode);
    }
}
