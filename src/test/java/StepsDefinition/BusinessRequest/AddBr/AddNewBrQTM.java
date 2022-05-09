package StepsDefinition.BusinessRequest.AddBr;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

public class AddNewBrQTM {
    DriverHandler driver= new DriverHandler();
    CommonHelper commonHelper = new CommonHelper();
    String typeOfInvolvementList[]={"By amount","By number of days","By percentage"};
    String margin = new String("40");
    String typeOfCurrency = new String("€");
    String consultantCostByNumberOfDays = new String("100");
    String numberOfDays = new String("50");
    String totalConsultantCost = new String("500");
    @And("User choose type of involement and field required")
    public void user_choose_type_of_involement_and_field_required() {
    }
    @And("User click on edit consultant save button")
    public void user_click_on_edit_consultant_save_button() {
     commonHelper.waitElementToBeClickable(By.id("SaveEdteConsultant")).click();
    }
}
