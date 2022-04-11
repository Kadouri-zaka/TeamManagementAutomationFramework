package StepsDefinition.BussnissRequest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

public class AddNewBR {
    DriverHandler driver= new DriverHandler();
    CommonHelper commonHelper = new CommonHelper();
   // String bussnissRequestInformaation[] = {"ZakaTest04/04/22_3","CASIS Lot 1","AGRI","Project in Progress (PiP)","TM","Initial"};
    String bussnissRequestInformaationAxa[]= {"ZakaTest04/04/22_4","Axa","Axa","Pending signature Agreement (PSA)","TM","Initial"};
    String basicCharacteristicsInformation [] = {"LUX","everis EBEL"};
 //   String profileInformation[] = {"AA","Junior","On site","100","250","java selenium"};
    String profileInformationAxa[] = {"Consultant","Unique","On site","100","250","java selenium"};
    @When("User click on Business Request field")
    public void user_click_on_business_request_field()  {
        commonHelper.waitElementToBeClickable(By.id("IdBusinessRequest")).click();
    }
    @And("User click on button New business request")
    public void user_click_on_button_new_business_request()  {
        commonHelper.waitElementToBeClickable(By.cssSelector("#add")).click();
    }
    @And("User add a Request number, Framework contract, Department, Status, Service type,Source")
    public void user_add_a_request_number_framework_contract_department_status_service_type_source()  {
        commonHelper.waitElementToBeClickable(By.name("ReqNumber")).sendKeys(bussnissRequestInformaationAxa[0]);
        commonHelper.selectText(bussnissRequestInformaationAxa[1],By.name("typeofct"));
        commonHelper.waitElementToBeClickable(By.name("DGdepartment")).sendKeys(bussnissRequestInformaationAxa[2]);
        commonHelper.selectText(bussnissRequestInformaationAxa[3],By.name("status"));
        commonHelper.selectText(bussnissRequestInformaationAxa[4],By.name("typebr"));
        commonHelper.selectText(bussnissRequestInformaationAxa[5],By.id("SourceBusinessRq"));
    }
    @When("User click on Basic characteristics")
    public void user_click_on_basic_characteristics() {
        commonHelper.waitElementToBeClickable(By.id("step3")).click();
    }
    @And("User add Place of delivery , company")
    public void user_add_place_of_delivery_company()  {
        commonHelper.selectText(basicCharacteristicsInformation[0],By.name("placedelivery"));
        commonHelper.selectText(basicCharacteristicsInformation[1],By.name("Company"));
    }
    @When("User click on New profile button")
    public void user_click_on_new_profile_button()  {
        commonHelper.waitElementToBeClickable(By.id("btnNewProfile")).click();
    }
    @And("User add Profile , level , on site , sales price, nbr of days other expertise")
    public void user_add_profile_level_on_site_sales_price_nbr_of_days_other_expertise() {
        commonHelper.selectText(profileInformationAxa[0],By.name("Profile"));
        commonHelper.selectText(profileInformationAxa[1],By.name("Level"));
        commonHelper.selectText(profileInformationAxa[2],By.name("OnSite"));
        commonHelper.waitElementToBeClickable(By.id("ndaysprofile")).sendKeys(profileInformationAxa[3]);
        commonHelper.waitElementToBeClickable(By.id("SalespriceProfile")).sendKeys(profileInformationAxa[4]);
        commonHelper.waitElementToBeClickable(By.name("Other_Expertise_required")).sendKeys(profileInformationAxa[5]);
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
