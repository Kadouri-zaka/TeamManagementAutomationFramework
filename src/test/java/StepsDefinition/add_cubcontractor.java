package StepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

public class add_cubcontractor {
    DriverHandler driver= new DriverHandler();
    CommonHelper commonHelper = new CommonHelper();

    @And("User click on subcontractor button")
    public void user_click_on_subcontractor_button() {

        commonHelper.waitElementToBeClickable(By.name("tab4")).click();
    }

    @And("User click on new subcontractor button")
    public void user_click_on_new_subcontractor_button() throws InterruptedException {
    commonHelper.waitElementToBeClickable(By.id("subcontractorId")).click();
    Thread.sleep(1000);
    }

    @And("User choose subcontractor and type of involevement")
    public void user_choose_subcontractor_and_type_of_involevement() throws InterruptedException {

        WebElement BtnSubcontractor = driver.getDriver().findElement(By.name("Subcontractor"));
        Select p0 = new Select(BtnSubcontractor);
        p0.selectByVisibleText("Atos");
        Thread.sleep(1000);

                     //By amount

    WebElement BtntyprInv = driver.getDriver().findElement(By.id("TypeInvolvementId"));
       Select s0 = new Select(BtntyprInv);
        s0.selectByVisibleText("By amount");
        Thread.sleep(1000);
        WebElement BtnCT = driver.getDriver().findElement(By.name("TotalCostSubco"));
        BtnCT.sendKeys("5000");
        Thread.sleep(1000);


        //By number of days


      /*  WebElement BtntyprInv = driver.getDriver().findElement(By.id("TypeInvolvementId"));
        Select s0 = new Select(BtntyprInv);
       s0.selectByVisibleText("By number of days");
       Thread.sleep(1000);
       commonHelper.waitElementToBeClickable(By.id("CostSubcoId")).sendKeys("100");
       commonHelper.waitElementToBeClickable(By.id("Nbr_DaysId")).sendKeys("50");*/

                 //By percentage

      /*  WebElement BtntyprInv = driver.getDriver().findElement(By.id("TypeInvolvementId"));
        Select s0 = new Select(BtntyprInv);
        s0.selectByVisibleText("By percentage");
        Thread.sleep(1000);
        commonHelper.waitElementToBeClickable(By.id("MarginSubcoId")).sendKeys("40");
        Thread.sleep(1000);*/

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
