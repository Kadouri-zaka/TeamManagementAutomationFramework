package StepsDefinition.BussnissRequest.EditBr;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

public class EditNbrOfDaysSc {
    DriverHandler driver= new DriverHandler();
    CommonHelper commonHelper = new CommonHelper();
    String nbrOfDays = new String("130");

    @And("user click on edit profile button")
    public void user_click_on_edit_profile_button() {
        commonHelper.waitElementToBeClickable(By.id("editPenalty")).click();
    }

    @And("User edit Nbr of days")
    public void user_edit_nbr_of_days() {
        commonHelper.waitElementToBeClickable(By.id("ndaysprofile")).clear();
        commonHelper.waitElementToBeClickable(By.id("ndaysprofile")).sendKeys(nbrOfDays);
    }

    @And("user click on save edit profile button")
    public void user_click_on_save_edit_profile_button()  {
        commonHelper.waitElementToBeClickable(By.id("SaveBRProfile")).click();
    }

    @And("User click on save comment button")
    public void user_click_on_save_comment_button() {
        //SC yes
        commonHelper.waitElementToBeClickable(By.xpath("//button[@class='swal2-confirm btn btn-success stylebutton swal2-styled' and contains(text(),'Yes')]")).click();
        commonHelper.waitElementToBeClickable(By.name("SaveForm")).click();
    }
    @Then("Nbr of days is changed successfully")
    public void Nbr_of_days_is_changed_successfully() {
        System.out.println("Nbr of days is changed");
    }
}
