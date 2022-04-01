package StepsDefinition.BussnissRequest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

public class AddSubcontractor {
    DriverHandler driver= new DriverHandler();
    CommonHelper commonHelper = new CommonHelper();
    String subcontractorList[]={"Atos","By amount","By number of days","By percentage"};
    String totalCostSubcontractor = new String("5000");
    String costSubcontractorByNumberOfDays = new String("100");
    String numberOfDays = new String("50");
    String margin = new String("40");
    @And("User click on subcontractor button")
    public void user_click_on_subcontractor_button() {
        commonHelper.waitElementToBeClickable(By.name("tab4")).click();
    }

    @And("User click on new subcontractor button")
    public void user_click_on_new_subcontractor_button() {
    commonHelper.waitElementToBeClickable(By.id("subcontractorId")).click();
    }

    @And("User choose subcontractor and type of involevement")
    public void user_choose_subcontractor_and_type_of_involevement()  {
        commonHelper.selectText(subcontractorList[0],By.name("Subcontractor"));
                     //By amount
    /*    commonHelper.selectText(SubcontractorList[1],By.id("TypeInvolvementId"));
        commonHelper.waitElementToBeClickable(By.name("TotalCostSubco")).sendKeys(totalCostSubcontractor);*/
                    //By number of days
        commonHelper.selectText(subcontractorList[2],By.id("TypeInvolvementId"));
        commonHelper.waitElementToBeClickable(By.id("CostSubcoId")).sendKeys(costSubcontractorByNumberOfDays);
        commonHelper.waitElementToBeClickable(By.id("Nbr_DaysId")).sendKeys(numberOfDays);
                    //By percentage
      /*   commonHelper.selectText(subcontractorList[3],By.id("TypeInvolvementId"));
        commonHelper.waitElementToBeClickable(By.id("MarginSubcoId")).sendKeys(margin);
       */
    }

    @And("User click on add Subcontractor button")
    public void user_click_on_add_subcontractor_button() {
        commonHelper.waitElementToBeClickable(By.id("submitAddId")).click();
    }
    @And("User click on comment save button")
    public void user_click_on_comment_save_button() {
        commonHelper.waitElementToBeClickable(By.name("SaveForm")).click();
    }
    @Then("Sbcontractor is added successfully")
    public void sbcontractor_is_added_successfully() {
        System.out.println("Subcontractor is added successfully");
    }

}
