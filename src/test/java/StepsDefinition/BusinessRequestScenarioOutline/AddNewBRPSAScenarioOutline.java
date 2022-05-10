package StepsDefinition.BusinessRequestScenarioOutline;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.impl.pages.*;

public class AddNewBRPSAScenarioOutline {
    DriverHandler driver = new DriverHandler();
    CommonHelper commonHelper = new CommonHelper();
    String businessRequestName = new String("BR_" + Util.timeStamp());
    By requestNameSelector = By.name("ReqNumber");
    By frameworkContractSelector = By.name("typeofct");
    By departmentSelector = By.name("DGdepartment");
    By statusSelector = By.name("status");
    By serviceTypeSelector = By.name("typebr");
    By sourceSelector = By.id("SourceBusinessRq");
    By firstNameSelector = By.id("CandidateFirstName");
    By lastNameSelector = By.name("CandidateLastName");
    By companySelector = By.id("cdcompany");
    By recruitementSelector =By.id("reccandidate");
    By resourceTypeSelector = By.id("idResourceType");
    By detailInterviewSelector = By.name("InterviewDetail");
    By frmConsultantInfoSelector =By.xpath("//*[@name='frmConsultantInfo']");
    By gridtypeOfEmployeeSelector =By.xpath("//div[@class='ui-grid-cell-contents ng-binding ng-scope' and contains(text(),'--Choose item--')]");
    By selecttypeOfmployeeSelector = By.id("TOCCand");
    By gridemployeeNumberSelector =By.id("OERPEmployeeId");
    By textemployeeNumberSelector = By.id("OERPCand");
    By gridsubcontractorSelector = By.xpath("//div[@class='ui-grid-cell-contents ng-binding ng-scope' and contains(text(),'--Choose item--')]");
    By selectSubcontractorSelect = By.id("SubmitNameSubcontractor");
    By everisCanditateButtonSelector = By.xpath("//a[@id='tab2Step3']");
    By newCandidateButtonSelector =By.id("AddnewCand");
    By saveCandidateButtonSelector =By.id("SaveCand");
    By yesAndProceedSelector =By.xpath("//button[contains(text(),'Yes, and proceed!')]");
    By toasterSelector =By.xpath("//div[@class='toast-message']");
    String checkButtonXpath = new String("(//div[@class='ui-grid-selection-row-header-buttons ui-grid-icon-ok ng-scope' and @ng-class=\"{'ui-grid-all-selected': grid.selection.selectAll}\"])[1]");
    By candidateSelector =By.id("SelectasCons");
    By yesAndProceedButtonSelector2 =By.xpath("//button[contains(text(),'Yes, and proceed')]");
    By saveConsultantButtonSelector =By.id("SaveConsultantinfo");
    By errorMessageSelector =By.xpath("//label[@class='error  ng-binding']");
    By consultantCostSelector =By.id("ConsultantCostEtit");
    By saveEditConsultantSelector = By.id("SaveEdteConsultant");
    By sweetAlertSelector = By.xpath("//div[@id='swal2-content']");
    By okButtonSelector = By.xpath("//button[contains(text(),'OK')]");
    By typeInvolvementSelector =By.id("TypeInvolvementID");
    By requiredFieldInvolvementSelector = By.id("TotalCostSubcoIdID");
    By typeCurrencySelector =By.id("TotalCostID_Currency");
    By numberDaysSelector = By.id("IdNbr_Days");
    By marginSelector =By.id("MarginconsId");
    Data obj=new Data();
    By sentCustomerSelector = By.name("YNToCustomer");
    By submittedCustomerSelector = By.name("dtProposal");
    By acceptanceDateSelector = By.name("dtAcceptance");
    By foSubmittedCustomerSelector = By.name("dtFO");
    By workOrderSelector =By.id("step2");
    By editProfilButtonSelector =By.xpath("(//a[@id='editWorkOrder'])[1]");
    By saveEditWordOrderSelector =By.id("SaveWOProfile");
    By totalpriceSelector =By.id("Total_PriceId");
    By otherInformationButtonSelector =By.id("step44");
    By profileLevelConsultantButtonSelector =By.id("tab1Step3");
    By editButtonConsultantSelector =By.id("editConsultantName");
    @And("^User add a Request number, Framework contract as (.*),Department as (.*),Status as (.*),Service type as (.*) and Source as (.*)$")
    public Data user_add_a_request_number_framework_contract_as_framework_contract_department_as_department_status_as_status_service_type_as_service_type_and_source_as_source(String frameworkContract, String departement, String status, String serviceType, String source) {
        commonHelper.waitElementToBeClickable(requestNameSelector).sendKeys(businessRequestName);
        commonHelper.selectText(frameworkContract, frameworkContractSelector);
        commonHelper.selectText(status, statusSelector);
        commonHelper.waitElementToBeClickable(departmentSelector).sendKeys(departement);
        commonHelper.selectText(serviceType, serviceTypeSelector);
        commonHelper.selectText(source, sourceSelector);
        obj.FWC = frameworkContract;
        obj.departement = departement;
        obj.serviceType =serviceType;
        return obj;
    }
    @When("User click on Everis candidate")
    public void user_click_on_everis_candidate() {
        commonHelper.clickElementByJs(everisCanditateButtonSelector,2000);
    }
    @And("User click on new candidate")
    public void user_click_on_new_candidate()  {
        commonHelper.waitElementToBeClickable(newCandidateButtonSelector).click();
    }
    @And("^User add First name as (.*), Last name as (.*), Company as (.*), Recruitement as (.*), Resource type as (.*) and Detail interview as (.*)$")
        public void user_add_first_name_as_first_name_last_name_as_last_name_company_as_company_recruitement_as_recuitement_resource_type_as_resource_type_and_detail_interview_as_detail_interview(String firstName,String lastName,String company,String recruitement,String resourceType,String detailInterview) {
        commonHelper.waitElementToBeClickable(firstNameSelector).sendKeys(firstName + Util.timeStamp());
        commonHelper.waitElementToBeClickable(lastNameSelector).sendKeys(lastName);
        commonHelper.selectText(company,companySelector);
        commonHelper.selectText(recruitement,recruitementSelector);
        commonHelper.selectText(resourceType,resourceTypeSelector);
        commonHelper.waitElementToBeClickable(detailInterviewSelector).sendKeys(detailInterview);
    }
    @And("User click on add button")
    public void user_click_on_add_button() {
        commonHelper.waitElementToBeClickable(saveCandidateButtonSelector).click();
        commonHelper.waitElementToBeClickable(yesAndProceedSelector).click();
        String toastrTextCandidate = commonHelper.waitElementToBeVisible(toasterSelector).getText();
        Assert.assertTrue("Candidate is not created because "+toastrTextCandidate,toastrTextCandidate.equalsIgnoreCase("Candidate is created"));
    }
    @When("User click on check button")
    public void user_click_on_check_button()  {
        commonHelper.waitElementToBeClickable(By.xpath(checkButtonXpath)).click();
    }
    @And("click on Select as consultant button")
    public void click_on_select_as_consultant_button() {
        commonHelper.waitElementToBeClickable(candidateSelector).click();
        commonHelper.waitElementToBeClickable(yesAndProceedButtonSelector2).click();
    }
    @And("^User add Type of contract as (.*) and its required field as (.*)$")
    public void user_add_type_of_contract_as_type_of_contract_and_its_required_field_as_required_field(String typeOfContract,String requiredField) {
        commonHelper.waitElementToBeVisible(frmConsultantInfoSelector);
        switch (typeOfContract){
            case "Employee" :
                commonHelper.clickElementByJs(gridtypeOfEmployeeSelector,2000);
                commonHelper.doubleClick(gridtypeOfEmployeeSelector);
                commonHelper.selectText(typeOfContract,selecttypeOfmployeeSelector);
                commonHelper.clickElementByJs(gridemployeeNumberSelector,2000);
                commonHelper.doubleClick(gridemployeeNumberSelector);
                commonHelper.waitElementToBeClickable(textemployeeNumberSelector).sendKeys(requiredField);
                break;
            case "Subcontractor":
                commonHelper.clickElementByJs(gridtypeOfEmployeeSelector,2000);
                commonHelper.doubleClick(gridtypeOfEmployeeSelector);
                commonHelper.selectText(typeOfContract,selecttypeOfmployeeSelector);
                commonHelper.clickElementByJs(gridsubcontractorSelector,3000);
                commonHelper.doubleClick(gridsubcontractorSelector);
                commonHelper.selectText(requiredField,selectSubcontractorSelect);
                break;
            case "Freelance":
                commonHelper.clickElementByJs(gridtypeOfEmployeeSelector,2000);
                commonHelper.doubleClick(gridtypeOfEmployeeSelector);
                commonHelper.selectText(typeOfContract,selecttypeOfmployeeSelector);
                break;
        }
    }
    @And("user click on Profile level consultant button")
    public void user_click_on_Profile_level_consultant_button () {
        commonHelper.waitElementToBeClickable(profileLevelConsultantButtonSelector).click();
    }
    @And("User click on edit button consultant")
    public void user_click_on_edit_button_consultant () {
        commonHelper.waitElementToBeClickable(editButtonConsultantSelector).click();
    }
    @And("User click on save button")
    public void user_click_on_save_button()  {
        commonHelper.clickElementByJs(saveConsultantButtonSelector,2000);
        try {
            commonHelper.waitElementToBeVisible(toasterSelector).isDisplayed();
        }
        catch (NullPointerException e) {
            String errorMessage =commonHelper.waitElementToBeVisible(errorMessageSelector).getText();
            Assert.assertTrue(errorMessage,commonHelper.waitElementToBeVisible(errorMessageSelector).isDisplayed()==false);
            driver.closeDriver();}
    }
    @And("^User add consultant cost as (.*),type of involvement as (.*), required field as (.*) and click on save button$")
    public void user_add_consultant_cost_as_consultant_cost_type_of_involvement_as_type_involvement_required_field_as_required_field_involvement_and_click_on_save_button (String consultantCost,String typeInvolvement,String requiredFieldInvolvement)  {
        switch (obj.FWC){
            case "Axa":
                commonHelper.waitElementToBeClickable(consultantCostSelector).sendKeys(consultantCost);
                commonHelper.waitElementToBeClickable(saveEditConsultantSelector).click();
                break;
            case "CASIS Lot 1":
                commonHelper.waitElementToBeClickable(consultantCostSelector).clear();
                commonHelper.waitElementToBeClickable(consultantCostSelector).sendKeys(consultantCost);
                commonHelper.selectText(typeInvolvement,typeInvolvementSelector);
                switch (typeInvolvement) {
                    case "By amount":
                        commonHelper.waitElementToBeClickable(requiredFieldInvolvementSelector).sendKeys(requiredFieldInvolvement);
                        commonHelper.selectText("€",typeCurrencySelector);
                        commonHelper.waitElementToBeClickable(saveEditConsultantSelector).click();
                        break;
                    case "By number of days":
                        commonHelper.waitElementToBeClickable(numberDaysSelector).sendKeys(requiredFieldInvolvement);
                        commonHelper.waitElementToBeClickable(saveEditConsultantSelector).click();
                        break;
                    case "By percentage":
                        commonHelper.waitElementToBeClickable(marginSelector).sendKeys(requiredFieldInvolvement);
                        commonHelper.selectText("€",typeCurrencySelector);
                        commonHelper.waitElementToBeClickable(saveEditConsultantSelector).click();
                        break;
                }
                break;
        }
        }
    @When("User click on work order")
    public void user_click_on_work_order()  {
        commonHelper.waitElementToBeClickable(workOrderSelector).click();
    }
    @And("User click on edit profile button")
    public void user_click_on_edit_profile_button()  {
        commonHelper.waitElementToBeClickable(editProfilButtonSelector).click();
    }
    @And("^User add sent to customer as (.*), Date proposal is submitted to customer as (.*) , Acceptance date as (.*) , Date FO is submitted to customer as (.*)$")
    public void user_add_sent_to_customer_as_sent_to_customer_date_proposal_is_submitted_to_customer_as_submitted_to_customer_acceptance_date_as_acceptance_date_date_fo_is_submitted_to_customer_as_fo_submitted_to_customer
            (String sentCustomer,String submittedCustomer, String acceptanceDate,String foSubmittedCustomer ) {
        switch (obj.FWC){
            case "Axa":
                break;
            case "CASIS Lot 1":
                commonHelper.waitElementToBeClickable(sentCustomerSelector).sendKeys(sentCustomer);
                commonHelper.waitElementToBeClickable(submittedCustomerSelector).sendKeys(submittedCustomer);
                commonHelper.waitElementToBeClickable(acceptanceDateSelector).sendKeys(acceptanceDate);
                commonHelper.waitElementToBeClickable(foSubmittedCustomerSelector).sendKeys(foSubmittedCustomer);
                break;
        }
    }
    @And("User click on save edit work order button")
    public void user_click_on_save_edit_work_order_button ()  {
        commonHelper.waitElementToBeClickable(saveEditWordOrderSelector).click();
    }
    @When("User click on other information button")
    public void user_click_on_other_information_button() {
        commonHelper.waitElementToBeClickable(otherInformationButtonSelector).click();
    }
    @And("^User add total price as (.*)$")
    public void user_add_total_price_as_total_price(String totalprice) {
        switch (obj.FWC){
            case "Axa":
                break;
            case "CASIS Lot 1":
                switch (obj.serviceType){
                    case "QTM":
                        break;
                    case "FP":
                        commonHelper.waitElementToBeVisible(totalpriceSelector).sendKeys(totalprice);
                        break;
                    case "TM":
                        break;
                    case "Provision of services":
                        break;
                }
        }
    }
    @Then("Business Request with Status PSA is added")
    public void business_request_with_status_psa_is_added() {
        String sweetAlert = commonHelper.waitElementToBeVisible(sweetAlertSelector).getText();
        Assert.assertTrue( "Request is not saved because "+sweetAlert,sweetAlert.equalsIgnoreCase("Request is saved"));
        commonHelper.waitElementToBeClickable(okButtonSelector).click();
    }
    }

