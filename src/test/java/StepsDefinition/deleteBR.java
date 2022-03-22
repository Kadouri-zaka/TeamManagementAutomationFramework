package StepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import test.impl.pages.DriverHandler;

import javax.swing.*;

public class deleteBR {
    DriverHandler driver= new DriverHandler();

    @And("User click on Search Button")
    public void user_click_on_search_button() throws InterruptedException {
        WebElement BtnSearch = driver.getDriver().findElement(By.id("btnSearch"));
        BtnSearch.click();
        Thread.sleep(1000);

    }

    @And("User enter the request number in the filter")
    public void user_enter_the_request_number_in_the_filter() throws InterruptedException {

        WebElement TxtFilter = driver.getDriver().findElement(By.id("filter"));
        TxtFilter.sendKeys("Zaka21/03/22_2");
        Thread.sleep(1000);

    }

    @And("User click on the request")
    public void user_click_on_the_request() throws InterruptedException {

        WebElement TxtRequest = driver.getDriver().findElement(By.xpath("//div[contains(text(),'Zaka21/03/22_2')]"));
        TxtRequest.click();
        Thread.sleep(1000);

    }

    @When("User click on remove button")
    public void user_click_on_remove_button() throws InterruptedException {

        WebElement BtnRemove = driver.getDriver().findElement(By.id("DeleteRq"));
        BtnRemove.click();
        Thread.sleep(1000);

    }

    @And("User Click on yes button")
    public void user_click_on_yes_button() throws InterruptedException {

        WebElement BtnYes = driver.getDriver().findElement(By.xpath("//button[contains(text(),'Yes, delete it!')]"));
        BtnYes.click();
        Thread.sleep(1000);

    }

    @Then("BR is deleted")
    public void br_is_deleted() throws InterruptedException {

        WebElement BtnOK = driver.getDriver().findElement(By.xpath(" //button[contains(text(),'OK')]"));
       // BtnOK.click();
        //Thread.sleep(1000);*
        Actions actions = new Actions(driver.getDriver());
        actions.doubleClick(BtnOK).build().perform();



    }

}
