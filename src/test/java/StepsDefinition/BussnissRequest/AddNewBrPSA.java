package StepsDefinition.BussnissRequest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

public class AddNewBrPSA {
    DriverHandler driver= new DriverHandler();
    CommonHelper commonHelper = new CommonHelper();
    String candidateInfo[]={"aqqws","qsg","everis EBEL","Belen Ruiz","Recruitment","good"};
    String typeOfContract[] ={"Employee","Subcontractor","Freelance"};
    String typeOfSubcontractor = new String("Atos");
    String oerpCode = new String("9823");
    String checkButtonXpath = new String("(//div[@class='ui-grid-selection-row-header-buttons ui-grid-icon-ok ng-scope' and @ng-class=\"{'ui-grid-all-selected': grid.selection.selectAll}\"])[1]");
    @When("User click on Everis condidate")
    public void user_click_on_everis_condidate() {
        commonHelper.waitElementToBeClickable(By.name("tab2")).click();
    }
    @And("User click on new condidate")
    public void user_click_on_new_condidate()  {
        commonHelper.waitElementToBeClickable(By.id("AddnewCand")).click();
    }
    @And("User add Fisrt name, Last name, Company, Recruitement, Resource type, Detail interview")
    public void user_add_fisrt_name_last_name_company_recruitement_resource_type_detail_interview()  {
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
          /*                  //Employee
        commonHelper.DoubleClick(By.xpath("//div[@class='ui-grid-cell-contents ng-binding ng-scope' and contains(text(),'--Choose item--')]"));
        commonHelper.selectText(typeOfContract[0],By.id("TOCCand"));
        commonHelper.DoubleClick(By.id("OERPEmployeeId"));
        commonHelper.waitElementToBeClickable(By.id("OERPCand")).sendKeys(oerpCode);*/
               /*            //subcontactor

        commonHelper.DoubleClick(By.xpath("//div[@class='ui-grid-cell-contents ng-binding ng-scope' and contains(text(),'--Choose item--')]"));
        commonHelper.selectText(typeOfContract[1],By.id("TOCCand"));
        commonHelper.DoubleClick(By.xpath("//div[@class='ui-grid-cell-contents ng-binding ng-scope' and contains(text(),'--Choose item--')]"));
        commonHelper.selectText(typeOfSubcontractor,By.id("SubmitNameSubcontractor"));*/
                   //Frelance
        commonHelper.waitElementToBeVisible(By.name(""));
        commonHelper.doubleClick(By.xpath("//div[@class='ui-grid-cell-contents ng-binding ng-scope' and contains(text(),'--Choose item--')]"));
        commonHelper.selectText(typeOfContract[2],By.id("TOCCand"));
    }
    @And("User click on save button")
    public void user_click_on_save_button()  {
        commonHelper.waitElementToBeClickable(By.id("SaveConsultantinfo")).click();
    }
}
