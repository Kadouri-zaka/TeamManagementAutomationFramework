package StepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

public class access_SC_fromBR_SMod {
    CommonHelper commonHelper = new CommonHelper();
    DriverHandler driver= new DriverHandler();

    @When("User click on button SC Control")
    public void user_click_on_button_sc_control() throws InterruptedException {

        WebElement BtnYesC1 = driver.getDriver().findElement(By.id("ControlSCId"));
        ((JavascriptExecutor) driver.getDriver()).executeScript("arguments[0].click();", BtnYesC1);
        Thread.sleep(1000);
    }


    @And("Click on yes and proceed button")
    public void click_on_yes_and_proceed_button() throws InterruptedException {
        WebElement BtnYes = driver.getDriver().findElement(By.xpath("//button[@class='swal2-confirm btn btn-success swal2-styled' and contains(text(),'Yes, and proceed!')]"));
        ((JavascriptExecutor) driver.getDriver()).executeScript("arguments[0].click();", BtnYes);
        Thread.sleep(1000);
    }


}
