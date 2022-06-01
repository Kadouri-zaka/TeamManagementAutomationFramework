package StepsDefinition.BusinessRequest.AddBr;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;
import test.impl.pages.Util;

public class AddNewBROIP {
    DriverHandler driver= new DriverHandler();
    CommonHelper commonHelper = new CommonHelper();
    String bussnissRequestName = new String("BR_")+ Util.timeStamp();
    String framworkContract[] ={"Axxa","CAxSIS Lot 1"};
    String departement[]={"Axxa","AGRI"};
    String statusType[]={"Order in Progress (OiP)","Pending signature Agreement (PSA)","Project in Progress (PiP)"};
    String serviceType[]={"TM","FP","Provision of services","QTM","PTM"};
    String source[] = {"Initial"};
    String basicCharacteristicsInformation [] = {"LUX","EBEL"};
    String profileInformation[] = {"AA","Junior","On site","100","250","java selenium"};
    //String profileInformationAxa[] = {"Consultant","Unique","On site","100","250","java selenium"};

    @And("User add a Request number,Framework contract,Department,Status,Service type and Source")
    public void user_add_a_request_number_framework_contract_department_status_service_and_type_source()  {
        commonHelper.waitElementToBeClickable(By.name("ReqNumber")).sendKeys(bussnissRequestName);
        commonHelper.selectText(framworkContract[1],By.name("typeofct"));
        commonHelper.selectText(statusType[2],By.name("status"));
        commonHelper.waitElementToBeClickable(By.name("DGdepartment")).sendKeys(departement[1]);
        commonHelper.selectText(serviceType[0],By.name("typebr"));
        commonHelper.selectText(source[0],By.id("SourceBusinessRq"));
    }

    public void user_add_place_of_delivery_and_company()  {
        commonHelper.selectText(basicCharacteristicsInformation[0],By.name("placedelivery"));
        commonHelper.selectText(basicCharacteristicsInformation[1],By.name("Company"));
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

}
