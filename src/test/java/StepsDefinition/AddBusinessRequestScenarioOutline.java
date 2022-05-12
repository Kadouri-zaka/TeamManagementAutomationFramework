package StepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.impl.pages.CommonHelper;
import test.impl.pages.Data;
import test.impl.pages.DriverHandler;
import test.impl.pages.Util;

public class AddBusinessRequestScenarioOutline {
    DriverHandler driver = new DriverHandler();
    CommonHelper commonHelper = new CommonHelper();
    By unameSelector = By.id("username");
    By passwSelector = By.id("password");
    By loginButtonSelector = By.xpath("//button[@id='loginButton']");
    By businessRequestButtonSelector = By.id("IdBusinessRequest");
    By newBusinessRequestButtonSelector = By.cssSelector("#add");
    By basicCaracteristicSelector = By.id("step3");
    By saveProfileButtonSelector = By.id("SaveBRProfile");
    By saveBrButtonSelector = By.xpath("//button[@name='SaveBusinessRequest']");
    By errorMessageSelector0 =By.xpath("//div[@class='col-lg-12  pull-left text-left paddingrow ']/div");
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
    By recruitementSelector = By.id("reccandidate");
    By resourceTypeSelector = By.id("idResourceType");
    By detailInterviewSelector = By.name("InterviewDetail");
    By frmConsultantInfoSelector = By.xpath("//*[@name='frmConsultantInfo']");
    By gridtypeOfEmployeeSelector = By.xpath("//div[@class='ui-grid-cell-contents ng-binding ng-scope' and contains(text(),'--Choose item--')]");
    By selecttypeOfmployeeSelector = By.id("TOCCand");
    By gridemployeeNumberSelector = By.id("OERPEmployeeId");
    By textemployeeNumberSelector = By.id("OERPCand");
    By gridsubcontractorSelector = By.xpath("//div[@class='ui-grid-cell-contents ng-binding ng-scope' and contains(text(),'--Choose item--')]");
    By selectSubcontractorSelect = By.id("SubmitNameSubcontractor");
    By everisCanditateButtonSelector = By.xpath("//a[@id='tab2Step3']");
    By newCandidateButtonSelector = By.id("AddnewCand");
    By saveCandidateButtonSelector = By.id("SaveCand");
    By yesAndProceedSelector = By.xpath("//button[contains(text(),'Yes, and proceed!')]");
    By toasterSelector = By.xpath("//div[@class='toast-message']");
    String checkButtonXpath = new String("(//div[@class='ui-grid-selection-row-header-buttons ui-grid-icon-ok ng-scope' and @ng-class=\"{'ui-grid-all-selected': grid.selection.selectAll}\"])[1]");
    By candidateSelector = By.id("SelectasCons");
    By yesAndProceedButtonSelector2 = By.xpath("//button[contains(text(),'Yes, and proceed')]");
    By saveConsultantButtonSelector = By.id("SaveConsultantinfo");
    By errorMessageSelector1 = By.xpath("//label[@class='error  ng-binding']");
    By consultantCostSelector = By.id("ConsultantCostEtit");
    By saveEditConsultantSelector = By.id("SaveEdteConsultant");
    By typeInvolvementSelector = By.id("TypeInvolvementID");
    By requiredFieldInvolvementSelector = By.id("TotalCostSubcoIdID");
    By typeCurrencySelector = By.id("TotalCostID_Currency");
    By numberDaysSelector = By.id("IdNbr_Days");
    By marginSelector = By.id("MarginconsId");
    By profileSelector = By.name("Profile");
    By levelSelector = By.name("Level");
    By onSiteSelector = By.name("OnSite");
    By salesPriceSelector = By.id("SalespriceProfile");
    By nbrOfDaysSelector = By.id("ndaysprofile");
    By expertiseSelector = By.name("Other_Expertise_required");
    Data obj = new Data();
    By sentCustomerSelector = By.name("YNToCustomer");
    By submittedCustomerSelector = By.name("dtProposal");
    By acceptanceDateSelector = By.name("dtAcceptance");
    By foSubmittedCustomerSelector = By.name("dtFO");
    By workOrderSelector = By.id("step2");
    By editProfilButtonSelector = By.xpath("(//a[@id='editWorkOrder'])[1]");
    By saveEditWordOrderSelector = By.id("SaveWOProfile");
    By totalpriceSelector = By.id("Total_PriceId");
    By otherInformationButtonSelector = By.id("step44");
    By profileLevelConsultantButtonSelector = By.id("tab1Step3");
    By editButtonConsultantSelector = By.id("editConsultantName");
    By addNewConsultantButtonSelector = By.id("AddNewConsultantId");
    By firstNameConsultantSelector = By.id("ConFirstName");
    By lastNameConsultantSelector = By.id("ConLastNameId");
    By saveConsultantSelector = By.id("disableAssignConsultantId");
    By profileConsultantSelector = By.id("ProfileConsultantId");
    By linkedBrSelector = By.name("LinkedBR");
    By loadLinkedBrSelector = By.id("LoadLinkedBR");
    By editProfileButtonSelector = By.id("editPenalty");
    By placeOfDeliverySelector = By.name("placedelivery");
    By companyDeleverySelector = By.name("Company");
    By refreshButtonSelector = By.name("refreshReqNbr");
    By newProfileButtonSelector = By.id("btnNewProfile");
    By totalManDaysSelector = By.id("TOTAL_man_daysStep3");
    By specificContractButtonSelector =By.xpath("//a[@id='step5']");
    By contractNumberSelector = By.id("ContracNbrStep5");
    By ScReceivedSelector =By.id("dtSCRStep5");
    By ScSignedSelector = By.id("dtSCStep5");
    By endDateSelector = By.id("dtMaxStep5");
    By sweetAlertSelector = By.xpath("//div[@id='swal2-content']");
    By okButtonSelector = By.xpath("//button[contains(text(),'OK')]");


    @Given("User is in login page")
    public void user_is_in_login_page() {
        //  System.out.println("Welcome");
        driver.initiatDriver();
    }
    @When("^User enter username as (.*) and password as (.*)$")
    public void user_enter_username_as_username_and_password_as_password(String uname, String passw) {
        commonHelper.waitElementToBeClickable(unameSelector).sendKeys(uname);
        commonHelper.waitElementToBeClickable(passwSelector).sendKeys(passw);
    }
    @When("user click on the login button")
    public void user_click_on_the_login_button() {
        commonHelper.waitElementToBeClickable(loginButtonSelector).click();
    }

    @Then("User is redirected to the home page")
    public void userIsRedirectedToTheHomePage() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue("User and/Or password are not correct ", commonHelper.getTitle().equalsIgnoreCase("Staff Augmentation | Index"));
    }
    @When("User click on Business Request field")
    public void user_click_on_business_request_field() {
        commonHelper.waitElementToBeClickable(businessRequestButtonSelector).click();
    }
    @And("User click on button New business request")
    public void user_click_on_button_new_business_request() {
        commonHelper.waitElementToBeClickable(newBusinessRequestButtonSelector).click();
    }
    @When("User click on Basic characteristics")
    public void user_click_on_basic_characteristics() {
        commonHelper.clickElementByJs(basicCaracteristicSelector, 2000);
    }
    @And("User click on save of BR")
    public void user_click_on_save_of_br() {
        commonHelper.waitElementToBeClickable(saveBrButtonSelector).submit();
    }
    @And("^User add a Request number, Framework contract as (.*),Department as (.*),Status as (.*),Service type as (.*) and Source as (.*) and linked BR as (.*)$")
    public Data user_add_a_request_number_framework_contract_as_framework_contract_department_as_department_status_as_status_service_type_as_service_type_and_source_as_source_and_linked_BR_as_linked_BR(String frameworkContract, String departement, String status, String serviceType, String source, String linkedBR) {
        commonHelper.waitElementToBeClickable(requestNameSelector).sendKeys(businessRequestName);
        commonHelper.selectText(frameworkContract, frameworkContractSelector);
        commonHelper.selectText(status, statusSelector);
        commonHelper.waitElementToBeClickable(departmentSelector).sendKeys(departement);
        commonHelper.selectText(serviceType, serviceTypeSelector);
        commonHelper.selectText(source, sourceSelector);
        obj.FWC = frameworkContract;
        obj.departement = departement;
        obj.serviceType = serviceType;
        obj.source = source;
        obj.status =status;
        switch (source) {
            case "Initial":
                break;
            case "Extension":
                commonHelper.waitElementToBeVisible(linkedBrSelector).sendKeys(linkedBR);
                commonHelper.waitElementToBeClickable(refreshButtonSelector).click();
                commonHelper.waitElementToBeClickable(loadLinkedBrSelector).click();
                commonHelper.waitElementToBeClickable(yesAndProceedSelector).click();
                break;
        }
        return obj;
    }
    @When("User click on offer information button")
    public void user_click_on_offer_information_button() {
        switch (obj.source) {
            case "Extension":
                switch (obj.serviceType) {
                    case "Provision of services":
                    case "PTM":
                    case "TM":
                    case "QTM":
                        break;
                    case "FP":
                        commonHelper.clickElementByJs(otherInformationButtonSelector,2000);
                        break;
                }
                break;
            case "Initial":
                switch (obj.serviceType) {
                    case "Provision of services":
                        break;
                    case "TM":
                    case "FP":
                    case "QTM":
                    case "PTM":
                        commonHelper.waitElementToBeClickable(otherInformationButtonSelector).click();
                        break;
                }
                break;
        }
    }
    @And("^User add total price as (.*)$")
    public void user_add_total_price_as_total_price(String totalprice) {
        switch (obj.source) {
            case "Extension":
                switch (obj.serviceType) {
                    case "Provision of services":
                    case "PTM":
                    case "TM":
                    case "QTM":
                        break;
                    case "FP":
                        commonHelper.waitElementToBeVisible(totalpriceSelector).sendKeys(totalprice);
                        break;
                }
                break;
            case "Initial":
                switch (obj.serviceType) {
                    case "Provision of services":
                        break;
                    case "TM":
                    case "FP":
                    case "QTM":
                    case "PTM":
                        switch (obj.FWC) {
                            case "Axa":
                                break;
                            case "CASIS Lot 1":
                                switch (obj.serviceType) {
                                    case "FP":
                                        commonHelper.waitElementToBeVisible(totalpriceSelector).sendKeys(totalprice);
                                        break;
                                    case "TM":
                                    case "QTM":
                                        break;
                                }
                        }
                        break;
                }
                break;
        }
    }
    @And("^User add Place of delivery as (.*)and company as (.*)$")
    public void user_add_place_of_delivery_as_place_of_delivery_and_company_as_company(String placeOfDelivery, String company) {
        switch (obj.source) {
            case "Extension":
                break;
            case "Initial":
                commonHelper.selectText(placeOfDelivery, placeOfDeliverySelector);
                commonHelper.selectText(company, companyDeleverySelector);
                break;
        }
    }
    @When("User click on New profile button")
    public void user_click_on_new_profile_button() {
        switch (obj.source) {
            case "Extension":
                break;
            case "Initial":
                commonHelper.waitElementToBeClickable(newProfileButtonSelector).click();
                break;
        }
    }
    @And("^User add Profile as (.*),level as (.*),on site as (.*),sales price as (.*), nbr of days as (.*) and other expertise as (.*)$")
    public Data user_add_profile_as_profile_level_as_level_on_site_as_on_site_sales_price_as_sales_price_nbr_of_days_as_nbr_of_days_and_other_expertise_as_expertise(String profile, String level, String onSite, String salesPrice, String nbrOfDays, String expertise) {
        switch (obj.source) {
            case "Extension":
                switch (obj.serviceType) {
                    case "TM":
                    case "PTM":
                    case "FP":
                        break;
                    case "QTM":
                        commonHelper.waitElementToBeVisible(By.xpath("(//div[@class='ui-grid-row ng-scope'])[2]"));
                        commonHelper.waitElementToBeClickable(editProfileButtonSelector).click();
                        commonHelper.waitElementToBeClickable(nbrOfDaysSelector).sendKeys(nbrOfDays);
                        break;
                }
                break;
            case "Initial":
                commonHelper.selectText(profile, profileSelector);
                commonHelper.selectText(level, levelSelector);
                commonHelper.selectText(onSite, onSiteSelector);
                commonHelper.waitElementToBeClickable(nbrOfDaysSelector).sendKeys(nbrOfDays);
                commonHelper.waitElementToBeClickable(salesPriceSelector).sendKeys(salesPrice);
                commonHelper.waitElementToBeClickable(expertiseSelector).sendKeys(expertise);
                obj.profile = profile;
                obj.level = level;
                obj.onSite = onSite;
                break;
        }
        return obj;
    }
    @And("User click on save of profile")
    public void user_click_on_save_of_profile() {
        switch (obj.source) {
            case "Extension":
                switch (obj.serviceType) {
                    case "TM":
                    case "PTM":
                    case "FP":
                        break;
                    case "QTM":
                        commonHelper.waitElementToBeClickable(saveProfileButtonSelector).click();
                        try {
                            commonHelper.waitElementToBeVisible(By.xpath("//*[@class='ui-grid-cell ng-scope ui-grid-coluiGrid-006X']")).isDisplayed();
                        } catch (NullPointerException e) {
                            String errorMessage = commonHelper.waitElementToBeVisible(errorMessageSelector0).getText();
                            Assert.assertTrue(errorMessage, commonHelper.waitElementToBeVisible(errorMessageSelector0).isDisplayed() == false);
                            driver.closeDriver();
                        }
                }
                break;
            case "Initial":
                commonHelper.waitElementToBeClickable(saveProfileButtonSelector).click();
                try {
                    commonHelper.waitElementToBeVisible(By.xpath("//*[@class='ui-grid-cell ng-scope ui-grid-coluiGrid-006X']")).isDisplayed();
                } catch (NullPointerException e) {
                    String errorMessage = commonHelper.waitElementToBeVisible(errorMessageSelector0).getText();
                    Assert.assertTrue(errorMessage, commonHelper.waitElementToBeVisible(errorMessageSelector0).isDisplayed() == false);
                    driver.closeDriver();
                }

        }
    }
    @And("^user add new consultant first name (.*) and last name (.*)$")
    public void userAddNewConsultantFirstNameConsultantFirstNameAndLastNameConsultantLastName(String consultantFirstNam, String consultantLastName) {
        switch (obj.status) {
            case "Order in Progress (OiP)":
                break;
            case "Pending signature Agreement (PSA)":
            case "Project in Progress (PiP)":
                switch (obj.source) {
                    case "Extension":
                        break;
                    case "Initial":
                        switch (obj.serviceType) {
                            case "Provision of services":
                                commonHelper.waitElementToBeClickable(addNewConsultantButtonSelector).click();
                                commonHelper.waitElementToBeVisible(firstNameConsultantSelector).sendKeys(consultantFirstNam);
                                commonHelper.waitElementToBeVisible(lastNameConsultantSelector).sendKeys(consultantLastName);
                                commonHelper.waitElementToBeClickable(saveConsultantSelector).click();
                                break;
                            case "TM":
                            case "FP":
                            case "QTM":
                            case "PTM":
                                break;
                        }
                        break;
                }
                break;
        }
    }
    @When("User click on Everis candidate")
    public void user_click_on_everis_candidate() {
        switch (obj.status) {
            case "Order in Progress (OiP)":
                break;
            case "Pending signature Agreement (PSA)":
            case "Project in Progress (PiP)":
                switch (obj.source) {
                    case "Extension":
                        break;
                    case "Initial":
                        switch (obj.serviceType) {
                            case "Provision of services":
                                break;
                            case "TM":
                            case "FP":
                            case "QTM":
                            case "PTM":
                                commonHelper.clickElementByJs(everisCanditateButtonSelector, 2000);
                                break;
                        }
                        break;
                }
                break;
        }
    }
    @And("User click on new candidate")
    public void user_click_on_new_candidate() {
        switch (obj.status) {
            case "Order in Progress (OiP)":
                break;
            case "Pending signature Agreement (PSA)":
            case "Project in Progress (PiP)":
                switch (obj.source) {
                    case "Extension":
                        break;
                    case "Initial":
                        switch (obj.serviceType) {
                            case "Provision of services":
                                break;
                            case "TM":
                            case "FP":
                            case "QTM":
                            case "PTM":
                                commonHelper.waitElementToBeClickable(newCandidateButtonSelector).click();
                                break;
                        }
                        break;
                }
                break;
        }
    }
    @And("^User add First name as (.*), Last name as (.*), Company as (.*), Recruitement as (.*), Resource type as (.*) and Detail interview as (.*)$")
    public void user_add_first_name_as_first_name_last_name_as_last_name_company_as_company_recruitement_as_recuitement_resource_type_as_resource_type_and_detail_interview_as_detail_interview(String firstName, String lastName, String company, String recruitement, String resourceType, String detailInterview) {
        switch (obj.status) {
            case "Order in Progress (OiP)":
                break;
            case "Pending signature Agreement (PSA)":
            case "Project in Progress (PiP)":
                switch (obj.source) {
                    case "Extension":
                        break;
                    case "Initial":
                        switch (obj.serviceType) {
                            case "Provision of services":
                                break;
                            case "TM":
                            case "FP":
                            case "QTM":
                            case "PTM":
                                commonHelper.waitElementToBeClickable(firstNameSelector).sendKeys(firstName + Util.timeStamp());
                                commonHelper.waitElementToBeClickable(lastNameSelector).sendKeys(lastName);
                                commonHelper.selectText(company, companySelector);
                                commonHelper.selectText(recruitement, recruitementSelector);
                                commonHelper.selectText(resourceType, resourceTypeSelector);
                                commonHelper.waitElementToBeClickable(detailInterviewSelector).sendKeys(detailInterview);
                                break;
                        }
                        break;
                }
                break;
        }
    }
    @And("User click on add button")
    public void user_click_on_add_button() {
        switch (obj.status) {
            case "Order in Progress (OiP)":
                break;
            case "Pending signature Agreement (PSA)":
            case "Project in Progress (PiP)":
                switch (obj.source) {
                    case "Extension":
                        break;
                    case "Initial":
                        switch (obj.serviceType) {
                            case "Provision of services":
                                break;
                            case "TM":
                            case "FP":
                            case "QTM":
                            case "PTM":
                                commonHelper.waitElementToBeClickable(saveCandidateButtonSelector).click();
                                commonHelper.waitElementToBeClickable(yesAndProceedSelector).click();
                                String toastrTextCandidate = commonHelper.waitElementToBeVisible(toasterSelector).getText();
                                Assert.assertTrue("Candidate is not created because " + toastrTextCandidate, toastrTextCandidate.equalsIgnoreCase("Candidate is created"));
                                break;
                        }
                        break;
                }
                break;
        }
    }
    @When("User click on check button")
    public void user_click_on_check_button() {
        switch (obj.status) {
            case "Order in Progress (OiP)":
                break;
            case "Pending signature Agreement (PSA)":
            case "Project in Progress (PiP)":
                switch (obj.source) {
                    case "Extension":
                        break;
                    case "Initial":
                        switch (obj.serviceType) {
                            case "Provision of services":
                                break;
                            case "TM":
                            case "FP":
                            case "QTM":
                            case "PTM":
                                commonHelper.waitElementToBeClickable(By.xpath(checkButtonXpath)).click();
                                break;
                        }
                        break;
                }
                break;
        }
    }
    @And("click on Select as consultant button")
    public void click_on_select_as_consultant_button() {
        switch (obj.status) {
            case "Order in Progress (OiP)":
                break;
            case "Pending signature Agreement (PSA)":
            case "Project in Progress (PiP)":
                switch (obj.source) {
                    case "Extension":
                        break;
                    case "Initial":
                        switch (obj.serviceType) {
                            case "Provision of services":
                                break;
                            case "TM":
                            case "FP":
                            case "QTM":
                            case "PTM":
                                commonHelper.waitElementToBeClickable(candidateSelector).click();
                                commonHelper.waitElementToBeClickable(yesAndProceedButtonSelector2).click();
                                break;
                        }
                        break;
                }
                break;
        }
    }
    @And("^User add Type of contract as (.*) and its required field as (.*)$")
    public void user_add_type_of_contract_as_type_of_contract_and_its_required_field_as_required_field(String typeOfContract, String requiredField) {
        switch (obj.status) {
            case "Order in Progress (OiP)":
                break;
            case "Pending signature Agreement (PSA)":
            case "Project in Progress (PiP)":
                switch (obj.source) {
                    case "Extension":
                        break;
                    case "Initial":
                        switch (obj.serviceType) {
                            case "Provision of services":
                                break;
                            case "TM":
                            case "FP":
                            case "QTM":
                            case "PTM":
                                commonHelper.waitElementToBeVisible(frmConsultantInfoSelector);
                                switch (typeOfContract) {
                                    case "Employee":
                                        commonHelper.clickElementByJs(gridtypeOfEmployeeSelector, 2000);
                                        commonHelper.doubleClick(gridtypeOfEmployeeSelector);
                                        commonHelper.selectText(typeOfContract, selecttypeOfmployeeSelector);
                                        commonHelper.clickElementByJs(gridemployeeNumberSelector, 2000);
                                        commonHelper.doubleClick(gridemployeeNumberSelector);
                                        commonHelper.waitElementToBeClickable(textemployeeNumberSelector).sendKeys(requiredField);
                                        break;
                                    case "Subcontractor":
                                        commonHelper.clickElementByJs(gridtypeOfEmployeeSelector, 2000);
                                        commonHelper.doubleClick(gridtypeOfEmployeeSelector);
                                        commonHelper.selectText(typeOfContract, selecttypeOfmployeeSelector);
                                        commonHelper.clickElementByJs(gridsubcontractorSelector, 3000);
                                        commonHelper.doubleClick(gridsubcontractorSelector);
                                        commonHelper.selectText(requiredField, selectSubcontractorSelect);
                                        break;
                                    case "Freelance":
                                        commonHelper.clickElementByJs(gridtypeOfEmployeeSelector, 2000);
                                        commonHelper.doubleClick(gridtypeOfEmployeeSelector);
                                        commonHelper.selectText(typeOfContract, selecttypeOfmployeeSelector);
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
    }
    @And("User click on save button")
    public void user_click_on_save_button() {
        switch (obj.status) {
            case "Order in Progress (OiP)":
                break;
            case "Pending signature Agreement (PSA)":
            case "Project in Progress (PiP)":
                switch (obj.source) {
                    case "Extension":
                        break;
                    case "Initial":
                        switch (obj.serviceType) {
                            case "Provision of services":
                                break;
                            case "TM":
                            case "FP":
                            case "QTM":
                            case "PTM":
                                commonHelper.clickElementByJs(saveConsultantButtonSelector, 2000);
                                try {
                                    commonHelper.waitElementToBeVisible(toasterSelector).isDisplayed();
                                } catch (NullPointerException e) {
                                    String errorMessage = commonHelper.waitElementToBeVisible(errorMessageSelector1).getText();
                                    Assert.assertTrue(errorMessage, commonHelper.waitElementToBeVisible(errorMessageSelector1).isDisplayed() == false);
                                    driver.closeDriver();
                                }
                                break;
                        }
                        break;
                }
                break;
        }
    }
    @And("user click on Profile level consultant button")
    public void user_click_on_Profile_level_consultant_button() {
        switch (obj.status) {
            case "Order in Progress (OiP)":
                break;
            case "Pending signature Agreement (PSA)":
            case "Project in Progress (PiP)":
                switch (obj.source) {
                    case "Extension":
                        break;
                    case "Initial":
                        switch (obj.serviceType) {
                            case "Provision of services":
                                break;
                            case "TM":
                            case "FP":
                            case "QTM":
                            case "PTM":
                                commonHelper.waitElementToBeClickable(profileLevelConsultantButtonSelector).click();
                                break;
                        }
                        break;
                }
                break;
        }
    }
    @And("User click on edit button consultant")
    public void user_click_on_edit_button_consultant() {
        switch (obj.status) {
            case "Order in Progress (OiP)":
                break;
            case "Pending signature Agreement (PSA)":
            case "Project in Progress (PiP)":
                switch (obj.source) {
                    case "Extension":
                        switch (obj.serviceType) {
                            case "TM":
                            case "PTM":
                                break;
                            case "FP":
                            case "QTM":
                                commonHelper.waitElementToBeClickable(editButtonConsultantSelector).click();
                                break;
                        }
                        break;
                    case "Initial":
                        commonHelper.waitElementToBeClickable(editButtonConsultantSelector).click();
                        break;
                }
                break;
        }
    }
    @And("^User add consultant cost as (.*),type of involvement as (.*), required field as (.*) and click on save button$")
    public void user_add_consultant_cost_as_consultant_cost_type_of_involvement_as_type_involvement_required_field_as_required_field_involvement_and_click_on_save_button(String consultantCost, String typeInvolvement, String requiredFieldInvolvement) {
        switch (obj.status) {
            case "Order in Progress (OiP)":
                break;
            case "Pending signature Agreement (PSA)":
            case "Project in Progress (PiP)":
                switch (obj.source) {
                    case "Extension":
                        switch (obj.serviceType) {
                            case "TM":
                            case "PTM":
                                break;
                            case "FP":
                            case "QTM":
                                switch (obj.FWC) {
                                    case "Axa":
                                        commonHelper.waitElementToBeClickable(consultantCostSelector).sendKeys(consultantCost);
                                        commonHelper.waitElementToBeClickable(saveEditConsultantSelector).click();
                                        break;
                                    case "CASIS Lot 1":
                                        commonHelper.waitElementToBeClickable(consultantCostSelector).clear();
                                        commonHelper.waitElementToBeClickable(consultantCostSelector).sendKeys(consultantCost);
                                        commonHelper.selectText(typeInvolvement, typeInvolvementSelector);
                                        switch (typeInvolvement) {
                                            case "By amount":
                                                commonHelper.waitElementToBeClickable(requiredFieldInvolvementSelector).sendKeys(requiredFieldInvolvement);
                                                commonHelper.selectText("€", typeCurrencySelector);
                                                commonHelper.waitElementToBeClickable(saveEditConsultantSelector).click();
                                                break;
                                            case "By number of days":
                                                commonHelper.waitElementToBeClickable(numberDaysSelector).sendKeys(requiredFieldInvolvement);
                                                commonHelper.waitElementToBeClickable(saveEditConsultantSelector).click();
                                                break;
                                            case "By percentage":
                                                commonHelper.waitElementToBeClickable(marginSelector).sendKeys(requiredFieldInvolvement);
                                                commonHelper.selectText("€", typeCurrencySelector);
                                                commonHelper.waitElementToBeClickable(saveEditConsultantSelector).click();
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                    case "Initial":
                        switch (obj.serviceType) {
                            case "Provision of services":
                                commonHelper.selectText("    " + obj.profile + ";" + obj.level + ";" + obj.onSite, profileConsultantSelector);
                                commonHelper.waitElementToBeClickable(saveEditConsultantSelector).click();
                                break;
                            case "TM":
                            case "FP":
                            case "QTM":
                            case "PTM":
                                switch (obj.FWC) {
                                    case "Axa":
                                        commonHelper.waitElementToBeClickable(consultantCostSelector).sendKeys(consultantCost);
                                        commonHelper.waitElementToBeClickable(saveEditConsultantSelector).click();
                                        break;
                                    case "CASIS Lot 1":
                                        commonHelper.waitElementToBeClickable(consultantCostSelector).clear();
                                        commonHelper.waitElementToBeClickable(consultantCostSelector).sendKeys(consultantCost);
                                        commonHelper.selectText(typeInvolvement, typeInvolvementSelector);
                                        switch (typeInvolvement) {
                                            case "By amount":
                                                commonHelper.waitElementToBeClickable(requiredFieldInvolvementSelector).sendKeys(requiredFieldInvolvement);
                                                commonHelper.selectText("€", typeCurrencySelector);
                                                commonHelper.waitElementToBeClickable(saveEditConsultantSelector).click();
                                                break;
                                            case "By number of days":
                                                commonHelper.waitElementToBeClickable(numberDaysSelector).sendKeys(requiredFieldInvolvement);
                                                commonHelper.waitElementToBeClickable(saveEditConsultantSelector).click();
                                                break;
                                            case "By percentage":
                                                commonHelper.waitElementToBeClickable(marginSelector).sendKeys(requiredFieldInvolvement);
                                                commonHelper.selectText("€", typeCurrencySelector);
                                                commonHelper.waitElementToBeClickable(saveEditConsultantSelector).click();
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
    }
    @When("User click on work order")
    public void user_click_on_work_order() {
        switch (obj.status) {
            case "Order in Progress (OiP)":
                break;
            case "Pending signature Agreement (PSA)":
            case "Project in Progress (PiP)":
                switch (obj.source) {
                    case "Extension":
                        break;
                    case "Initial":
                        switch (obj.serviceType) {
                            case "Provision of services":
                                break;
                            case "TM":
                            case "FP":
                            case "QTM":
                            case "PTM":
                                commonHelper.waitElementToBeClickable(workOrderSelector).click();
                                break;
                        }
                        break;
                }
                break;
        }
    }
    @And("User click on edit profile button")
    public void user_click_on_edit_profile_button() {
        switch (obj.status) {
            case "Order in Progress (OiP)":
                break;
            case "Pending signature Agreement (PSA)":
            case "Project in Progress (PiP)":
                switch (obj.source) {
                    case "Extension":
                        break;
                    case "Initial":
                        switch (obj.serviceType) {
                            case "Provision of services":
                                break;
                            case "TM":
                            case "FP":
                            case "QTM":
                            case "PTM":
                                commonHelper.waitElementToBeClickable(editProfilButtonSelector).click();
                                break;
                        }
                }
        }
    }
    @And("^User add sent to customer as (.*), Date proposal is submitted to customer as (.*) , Acceptance date as (.*) , Date FO is submitted to customer as (.*)$")
    public void user_add_sent_to_customer_as_sent_to_customer_date_proposal_is_submitted_to_customer_as_submitted_to_customer_acceptance_date_as_acceptance_date_date_fo_is_submitted_to_customer_as_fo_submitted_to_customer
            (String sentCustomer, String submittedCustomer, String acceptanceDate, String foSubmittedCustomer) {
        switch (obj.status) {
            case "Order in Progress (OiP)":
                break;
            case "Pending signature Agreement (PSA)":
            case "Project in Progress (PiP)":
                switch (obj.source) {
                    case "Extension":
                        break;
                    case "Initial":
                        switch (obj.serviceType) {
                            case "Provision of services":
                                break;
                            case "TM":
                            case "FP":
                            case "QTM":
                            case "PTM":
                                switch (obj.FWC) {
                                    case "Axa":
                                        break;
                                    case "CASIS Lot 1":
                                        commonHelper.waitElementToBeClickable(sentCustomerSelector).sendKeys(sentCustomer);
                                        commonHelper.waitElementToBeClickable(submittedCustomerSelector).sendKeys(submittedCustomer);
                                        commonHelper.waitElementToBeClickable(acceptanceDateSelector).sendKeys(acceptanceDate);
                                        commonHelper.waitElementToBeClickable(foSubmittedCustomerSelector).sendKeys(foSubmittedCustomer);
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
    }
    @And("User click on save edit work order button")
    public void user_click_on_save_edit_work_order_button() {
        switch (obj.status) {
            case "Order in Progress (OiP)":
                break;
            case "Pending signature Agreement (PSA)":
            case "Project in Progress (PiP)":
                switch (obj.source) {
                    case "Extension":
                        break;
                    case "Initial":
                        switch (obj.serviceType) {
                            case "Provision of services":
                                break;
                            case "TM":
                            case "FP":
                            case "QTM":
                            case "PTM":
                                commonHelper.waitElementToBeClickable(saveEditWordOrderSelector).click();
                                break;
                        }
                        break;
                }
                break;
        }
    }
    @And("^User add total man days as (.*)$")
    public void user_add_total_man_days_as_total_man_days(String totalManDays) {
        switch (obj.status) {
            case "Order in Progress (OiP)":
            case "Pending signature Agreement (PSA)":
                break;
            case "Project in Progress (PiP)":
                commonHelper.waitElementToBeClickable(totalManDaysSelector).sendKeys(totalManDays);
                break;
        }
    }
    @When("User click on Specific contract button")
    public void user_click_on_specific_contract_button() {
        switch (obj.status) {
            case "Order in Progress (OiP)":
            case "Pending signature Agreement (PSA)":
                break;
            case "Project in Progress (PiP)":
            commonHelper.waitElementToBeClickable(specificContractButtonSelector).click();
            break;
        }
    }
    @And("^User add Specific contract number as (.*), Date SC is received as (.*), Date SC is signed as (.*),and Maximum end date as (.*)$")
    public void user_add_specific_contract_number_as_contract_number_date_sc_is_received_as_sc_received_date_sc_is_signed_as_sc_is_signed_and_maximum_end_date_as_end_date(String contractNumber,String ScReceived,String ScSigned,String endDate) {
        switch (obj.status) {
            case "Order in Progress (OiP)":
            case "Pending signature Agreement (PSA)":
                break;
            case "Project in Progress (PiP)":
                commonHelper.waitElementToBeClickable(contractNumberSelector).sendKeys(contractNumber);
                commonHelper.waitElementToBeClickable(ScReceivedSelector).sendKeys(ScReceived);
                commonHelper.waitElementToBeClickable(ScSignedSelector).sendKeys(ScSigned);
                commonHelper.waitElementToBeClickable(endDateSelector).sendKeys(endDate);
                break;
        }
    }
    @Then("Business Request  is added")
    public void business_request__is_added() {
        String sweetAlert = commonHelper.waitElementToBeVisible(sweetAlertSelector).getText();
        Assert.assertTrue( "Request is not saved because "+sweetAlert,sweetAlert.equalsIgnoreCase("Request is saved"));
        commonHelper.waitElementToBeClickable(okButtonSelector).click();
    }


}
