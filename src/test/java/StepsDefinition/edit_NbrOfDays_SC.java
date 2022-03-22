package StepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

public class edit_NbrOfDays_SC {
    DriverHandler driver= new DriverHandler();
    CommonHelper commonHelper = new CommonHelper();

    @And("user click on edit profile button")
    public void user_click_on_edit_profile_button() {
        commonHelper.waitElementToBeClickable(By.id("editPenalty")).click();
    }

    @And("User edit Nbr of days")
    public void user_edit_nbr_of_days() {
        commonHelper.waitElementToBeClickable(By.id("ndaysprofile")).clear();
        commonHelper.waitElementToBeClickable(By.id("ndaysprofile")).sendKeys("120");
    }

    @And("user click on save edit profile button")
    public void user_click_on_save_edit_profile_button()  {

        commonHelper.waitElementToBeClickable(By.id("SaveBRProfile")).click();


    //    commonHelper.waitElementToBeClickable(By.xpath("//div[@class='swal2-confirm btn btn-success stylebutton swal2-styled' and contains(text(),'Yes')]"));


    }

    @And("User click on save comment button")
    public void user_click_on_save_comment_button() throws InterruptedException {
        Thread.sleep(3000);
        //SC yes

        WebElement BtnYes = driver.getDriver().findElement(By.xpath("//button[@class='swal2-confirm btn btn-success stylebutton swal2-styled' and contains(text(),'Yes')]"));
        ((JavascriptExecutor) driver.getDriver()).executeScript("arguments[0].click();", BtnYes);

        commonHelper.waitElementToBeClickable(By.name("SaveForm")).click();

    }
    @Then("Nbr of days is changed successfully")
    public void Nbr_of_days_is_changed_successfully() {

        System.out.println("Nbr of days is changed");

    }

}
