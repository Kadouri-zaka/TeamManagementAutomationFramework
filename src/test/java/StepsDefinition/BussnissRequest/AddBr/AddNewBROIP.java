package StepsDefinition.BussnissRequest.AddBr;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

public class AddNewBROIP {
    DriverHandler driver= new DriverHandler();
    CommonHelper commonHelper = new CommonHelper();
    String bussnissRequestName = new String("ZakaTest19/04/22_1");
    String framworkContract[] ={"Axa","CASIS Lot 1"};
    String departement[]={"Axa","AGRI"};
    String statusType[]={"Order in Progress (OiP)","Pending signature Agreement (PSA)","Project in Progress (PiP)"};
    String serviceType[]={"TM","FP","Provision of services","QTM","PTM"};
    String source[] = {"Initial"};
    String basicCharacteristicsInformation [] = {"LUX","everis EBEL"};
    String profileInformation[] = {"AA","Junior","On site","100","250","java selenium"};
   // String profileInformationAxa[] = {"Consultant","Unique","On site","100","250","java selenium"};
    @When("User click on Business Request field")
    public void user_click_on_business_request_field()  {
        commonHelper.waitElementToBeClickable(By.id("IdBusinessRequest")).click();
    }
    @And("User click on button New business request")
    public void user_click_on_button_new_business_request()  {
        commonHelper.waitElementToBeClickable(By.cssSelector("#add")).click();
    }
    @And("User add a Request number,Framework contract,Department,Status,Service type and Source")
    public void user_add_a_request_number_framework_contract_department_status_service_and_type_source()  {
        commonHelper.waitElementToBeClickable(By.name("ReqNumber")).sendKeys(bussnissRequestName);
        commonHelper.selectText(framworkContract[1],By.name("typeofct"));
        commonHelper.selectText(statusType[2],By.name("status"));
        commonHelper.waitElementToBeClickable(By.name("DGdepartment")).sendKeys(departement[1]);
        commonHelper.selectText(serviceType[0],By.name("typebr"));
        commonHelper.selectText(source[0],By.id("SourceBusinessRq"));
    }
    @When("User click on Basic characteristics")
    public void user_click_on_basic_characteristics() {
        commonHelper.clickElementByJs(By.id("step3"),2000);
    }
    @And("User add Place of delivery and company")
    public void user_add_place_of_delivery_and_company()  {
        commonHelper.selectText(basicCharacteristicsInformation[0],By.name("placedelivery"));
        commonHelper.selectText(basicCharacteristicsInformation[1],By.name("Company"));
    }
    @When("User click on New profile button")
    public void user_click_on_new_profile_button()  {
        commonHelper.waitElementToBeClickable(By.id("btnNewProfile")).click();
    }
    @And("User add Profile,level,on site,sales price, nbr of days and other expertise")
    public void user_add_profile_level_on_site_sales_price_nbr_of_days_and_other_expertise() {
        commonHelper.selectText(profileInformation[0],By.name("Profile"));
        commonHelper.selectText(profileInformation[1],By.name("Level"));
        commonHelper.selectText(profileInformation[2],By.name("OnSite"));
        commonHelper.waitElementToBeClickable(By.id("ndaysprofile")).sendKeys(profileInformation[3]);
        commonHelper.waitElementToBeClickable(By.id("SalespriceProfile")).sendKeys(profileInformation[4]);
        commonHelper.waitElementToBeClickable(By.name("Other_Expertise_required")).sendKeys(profileInformation[5]);
    }
    @And("User click on save of profile")
    public void user_click_on_save_of_profile()  {
        commonHelper.waitElementToBeClickable(By.id("SaveBRProfile")).click();
    }
    @And("User click on save of BR")
    public void user_click_on_save_of_br()  {
        commonHelper.waitElementToBeClickable(By.xpath("//button[@name='SaveBusinessRequest']")).submit();
    }
    @Then("the request is saved")
    public void the_request_is_saved()  {
        commonHelper.waitElementToBeClickable(By.xpath("//button[contains(text(),'OK')]")).click();
        System.out.println("BR is created successfully");
    }
}
