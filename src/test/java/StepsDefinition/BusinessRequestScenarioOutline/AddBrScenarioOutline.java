package StepsDefinition.BusinessRequestScenarioOutline;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;
import test.impl.pages.Util;

public class AddBrScenarioOutline {
    DriverHandler driver = new DriverHandler();
    CommonHelper commonHelper = new CommonHelper();
    String businessRequestName = new String("BR_"+ Util.timeStamp());
    By requestNameSelector = By.name("ReqNumber");
    By frameworkContractSelector =By.name("typeofct");
    By departmentSelector =By.name("DGdepartment") ;
    By statusSelector =By.name("status");
    By serviceTypeSelector = By.name("typebr");
    By sourceSelector = By.id("SourceBusinessRq");
    By placeOfDeliverySelector =By.name("placedelivery");
    By companySelector =By.name("Company");
    By profileSelector = By.name("Profile");
    By levelSelector = By.name("Level");
    By onSiteSelector = By.name("OnSite");
    By salesPriceSelector = By.id("SalespriceProfile");
    By nbrOfDaysSelector = By.id("ndaysprofile");
     By expertiseSelector = By.name("Other_Expertise_required");
    @And("^User add a Request number, Framework contract as (.*),Department as (.*),Status as (.*),Service type as (.*) and Source as (.*)$")
    public void user_add_a_request_number_framework_contract_as_framework_contract_department_as_department_status_as_status_service_type_as_service_type_and_source_as_source(String frameworkContract,String departement,String status,String serviceType,String source) {
        commonHelper.waitElementToBeClickable(requestNameSelector).sendKeys(businessRequestName);
        commonHelper.selectText(frameworkContract,frameworkContractSelector);
        commonHelper.selectText(status,statusSelector);
        commonHelper.waitElementToBeClickable(departmentSelector).sendKeys(departement);
        commonHelper.selectText(serviceType,serviceTypeSelector);
        commonHelper.selectText(source,sourceSelector);
    }
    @And("^User add Place of delivery as (.*)and company as (.*)$")
    public void user_add_place_of_delivery_as_place_of_delivery_and_company_as_company(String placeOfDelivery, String company) {
        commonHelper.selectText(placeOfDelivery,placeOfDeliverySelector);
        commonHelper.selectText(company,companySelector);
    }
    @And("^User add Profile as (.*),level as (.*),on site as (.*),sales price as (.*), nbr of days as (.*) and other expertise as (.*)$")
    public void user_add_profile_as_profile_level_as_level_on_site_as_on_site_sales_price_as_sales_price_nbr_of_days_as_nbr_of_days_and_other_expertise_as_expertise(String profile, String level, String onSite, String salesPrice, String nbrOfDays,String expertise) {
        commonHelper.selectText(profile,profileSelector);
        commonHelper.selectText(level,levelSelector);
        commonHelper.selectText(onSite,onSiteSelector);
        commonHelper.waitElementToBeClickable(nbrOfDaysSelector).sendKeys(nbrOfDays);
        commonHelper.waitElementToBeClickable(salesPriceSelector).sendKeys(salesPrice);
        commonHelper.waitElementToBeClickable(expertiseSelector).sendKeys(expertise);
    }
}
