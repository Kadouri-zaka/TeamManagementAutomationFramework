package StepsDefinition.BussnissRequest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

public class AddNewBrProvisionOfServices {
    CommonHelper commonHelper = new CommonHelper();
    DriverHandler driver= new DriverHandler();
    String consultantInfo[] ={"Xavier","Folquet","    AA;Junior;On site"};
    @When("User click on new consultant button")
    public void user_click_on_new_consultant_button() {
       commonHelper.waitElementToBeClickable(By.id("AddNewConsultantId")).click();
    }
    @And("User add first name and last name")
    public void user_add_first_name_and_last_name() {
        commonHelper.waitElementToBeVisible(By.id("ConFirstName")).sendKeys(consultantInfo[0]);
        commonHelper.waitElementToBeVisible(By.id("ConLastNameId")).sendKeys(consultantInfo[1]);
    }
    @And("User click on save consultant button")
    public void user_click_on_save_consultant_button() {
        commonHelper.waitElementToBeClickable(By.id("disableAssignConsultantId")).click();
    }
    @And("User click on edit consultant button")
    public void user_click_on_edit_consultant_button() {
        commonHelper.waitElementToBeClickable(By.xpath("//button[@id='editConsultantName' and @class='edit'])")).click();
    }
    @And("User select profile")
    public void user_select_profile()  {
        commonHelper.selectText(consultantInfo[2],By.id("ProfileConsultantId"));
    }
    @And("User click on save edit consultant button")
    public void user_click_on_save_edit_consultant_button() {
        commonHelper.waitElementToBeClickable(By.id("SaveEdteConsultant")).click();
    }

}
