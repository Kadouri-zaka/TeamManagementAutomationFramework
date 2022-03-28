package StepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

public class add_new_BR_POF {
        CommonHelper commonHelper = new CommonHelper();
    DriverHandler driver= new DriverHandler();
    @When("User click on new consultant button")
    public void user_click_on_new_consultant_button() {
       commonHelper.waitElementToBeClickable(By.id("AddNewConsultantId")).click();
    }

    @And("User add first name and last name")
    public void user_add_first_name_and_last_name() throws InterruptedException {
        commonHelper.waitElementToBeVisible(By.id("ConFirstName")).sendKeys("Xavier");
        commonHelper.waitElementToBeVisible(By.id("ConLastNameId")).sendKeys("Folquet");


    }

    @And("User click on save consultant button")
    public void user_click_on_save_consultant_button() {
        commonHelper.waitElementToBeClickable(By.id("disableAssignConsultantId")).click();
    }

    @And("User click on edit consultant button")
    public void user_click_on_edit_consultant_button() {
        commonHelper.waitElementToBeClickable(By.xpath("//button[@id='editConsultantName' and @class='edit'])[1]")).click();

    }

    @And("User select profile")
    public void user_select_profile() throws InterruptedException {
        WebElement BtnProfile = driver.getDriver().findElement(By.id("ProfileConsultantId"));
        Select s1 = new Select(BtnProfile);
        s1.selectByVisibleText("    AA;Junior;On site");
        Thread.sleep(1000);


    }

    @And("User click on save edit consultant button")
    public void user_click_on_save_edit_consultant_button() {
        commonHelper.waitElementToBeClickable(By.id("SaveEdteConsultant")).click();

    }

}
