package StepsDefinition.BusinessRequest.AddBr;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

public class AddNewBrPSA {
    DriverHandler driver= new DriverHandler();
    CommonHelper commonHelper = new CommonHelper();
    String candidateInfo[]={"ertyulpmw","uytyuwwq","EBEL","Ruiz","Recruitment","good"};
    String typeOfContract[] ={"Employee","Subcontractor","Freelance"};
    String typeOfSubcontractor[] = {"Ats","Proinit"};
    String oerpCode = "99856";



    @And("User add First name, Last name, Company, Recruitement, Resource type and Detail interview")
    public void user_add_first_name_last_name_company_recruitement_resource_type_and_detail_interview()  {
        commonHelper.waitElementToBeClickable(By.id("CandidateFirstName")).sendKeys(candidateInfo[0]);
        commonHelper.waitElementToBeClickable(By.name("CandidateLastName")).sendKeys(candidateInfo[1]);
        commonHelper.selectText(candidateInfo[2],By.id("cdcompany"));
        commonHelper.selectText(candidateInfo[3],By.id("reccandidate"));
        commonHelper.selectText(candidateInfo[4],By.id("idResourceType"));
        commonHelper.waitElementToBeClickable(By.name("InterviewDetail")).sendKeys(candidateInfo[5]);
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

    }




