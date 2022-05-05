package StepsDefinition.BussnissRequest.AddBr;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

public class AddNewBrPSA {
    DriverHandler driver= new DriverHandler();
    CommonHelper commonHelper = new CommonHelper();
    String candidateInfo[]={"ertyulpmw","uytyuwwq","everis EBEL","Belen Ruiz","Recruitment","good"};
    String typeOfContract[] ={"Employee","Subcontractor","Freelance"};
    String typeOfSubcontractor[] = {"Atos","Projinit"};
    String oerpCode = "99856";
    By toastrConsultant = (By.xpath("//div[@class='toast-message']"));

    String checkButtonXpath = new String("(//div[@class='ui-grid-selection-row-header-buttons ui-grid-icon-ok ng-scope' and @ng-class=\"{'ui-grid-all-selected': grid.selection.selectAll}\"])[1]");

    @When("User click on Everis candidate")
    public void user_click_on_everis_candidate() {
        commonHelper.clickElementByJs(By.xpath("//a[@id='tab2Step3']"),2000);
    }
    @And("User click on new candidate")
    public void user_click_on_new_candidate()  {
        commonHelper.waitElementToBeClickable(By.id("AddnewCand")).click();
    }
    @And("User add First name, Last name, Company, Recruitement, Resource type and Detail interview")
    public void user_add_first_name_last_name_company_recruitement_resource_type_and_detail_interview()  {
        commonHelper.waitElementToBeClickable(By.id("CandidateFirstName")).sendKeys(candidateInfo[0]);
        commonHelper.waitElementToBeClickable(By.name("CandidateLastName")).sendKeys(candidateInfo[1]);
        commonHelper.selectText(candidateInfo[2],By.id("cdcompany"));
        commonHelper.selectText(candidateInfo[3],By.id("reccandidate"));
        commonHelper.selectText(candidateInfo[4],By.id("idResourceType"));
        commonHelper.waitElementToBeClickable(By.name("InterviewDetail")).sendKeys(candidateInfo[5]);
    }
    @And("User click on add button")
    public void user_click_on_add_button() {
        commonHelper.waitElementToBeClickable(By.id("SaveCand")).click();
        commonHelper.waitElementToBeClickable(By.xpath("//button[contains(text(),'Yes, and proceed!')]")).click();
        String toastrTextCandidate = commonHelper.waitElementToBeVisible(By.xpath("//div[@class='toast-message']")).getText();
        Assert.assertTrue("Candidate is not created because "+toastrTextCandidate,toastrTextCandidate.equalsIgnoreCase("Candidate is created"));
    }
    @When("User click on check button")
    public void user_click_on_check_button()  {
        commonHelper.waitElementToBeClickable(By.xpath(checkButtonXpath)).click();
    }
    @And("click on Select as consultant button")
    public void click_on_select_as_consultant_button()  {
        commonHelper.waitElementToBeClickable(By.id("SelectasCons")).click();
        commonHelper.waitElementToBeClickable(By.xpath("//button[contains(text(),'Yes, and proceed')]")).click();
    }
    @And("User add Type of contract and Employee number")
    public void user_add_type_of_contract_and_employee_number()  {
        commonHelper.waitElementToBeVisible(By.xpath("//*[@name='frmConsultantInfo']"));
                         //Employee
        commonHelper.clickElementByJs(By.xpath("//div[@class='ui-grid-cell-contents ng-binding ng-scope' and contains(text(),'--Choose item--')]"),2000);
        commonHelper.doubleClick(By.xpath("//div[@class='ui-grid-cell-contents ng-binding ng-scope' and contains(text(),'--Choose item--')]"));
        commonHelper.selectText(typeOfContract[0],By.id("TOCCand"));
        commonHelper.clickElementByJs(By.id("OERPEmployeeId"),2000);
        commonHelper.doubleClick(By.id("OERPEmployeeId"));
        commonHelper.waitElementToBeClickable(By.id("OERPCand")).sendKeys(oerpCode);

                /*          //subcontactor
        commonHelper.clickElementByJs(By.xpath("//div[@class='ui-grid-cell-contents ng-binding ng-scope' and contains(text(),'--Choose item--')]"),2000);
        commonHelper.doubleClick(By.xpath("//div[@class='ui-grid-cell-contents ng-binding ng-scope' and contains(text(),'--Choose item--')]"));
        commonHelper.selectText(typeOfContract[1],By.id("TOCCand"));
        commonHelper.clickElementByJs(By.xpath("//div[@class='ui-grid-cell-contents ng-binding ng-scope' and contains(text(),'--Choose item--')]"),3000);
        commonHelper.doubleClick(By.xpath("//div[@class='ui-grid-cell-contents ng-binding ng-scope' and contains(text(),'--Choose item--')]"));
        commonHelper.selectText(typeOfSubcontractor[0],By.id("SubmitNameSubcontractor"));*/
         /*          //Freelance
        commonHelper.clickElementByJs(By.xpath("//div[@class='ui-grid-cell-contents ng-binding ng-scope' and contains(text(),'--Choose item--')]"),2000);
        commonHelper.doubleClick(By.xpath("//div[@class='ui-grid-cell-contents ng-binding ng-scope' and contains(text(),'--Choose item--')]"));
        commonHelper.selectText(typeOfContract[2],By.id("TOCCand"));*/
    }
    @And("User click on save button")
    public void user_click_on_save_button()  {
        commonHelper.clickElementByJs(By.id("SaveConsultantinfo"),2000);
       try {
            commonHelper.waitElementToBeVisible(toastrConsultant).isDisplayed();
        }
        catch (NullPointerException e) {
            String errorMessage =commonHelper.waitElementToBeVisible(By.xpath("//label[@class='error  ng-binding']")).getText();
            Assert.assertTrue(errorMessage,commonHelper.waitElementToBeVisible(By.xpath("//label[@class='error  ng-binding']")).isDisplayed()==false);
            driver.closeDriver();}
    }
    @Then("Business Request with Status PSA is added")
    public void business_request_with_status_psa_is_added() {
        String sweetAlert = commonHelper.waitElementToBeVisible(By.xpath("//div[@id='swal2-content']")).getText();
        Assert.assertTrue( "Request is not saved because "+sweetAlert,sweetAlert.equalsIgnoreCase("Request is saved"));
        commonHelper.waitElementToBeClickable(By.xpath("//button[contains(text(),'OK')]")).click();
    }
    }




