package StepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.impl.pages.DriverHandler;

public class createSC_BR {
    DriverHandler driver= new DriverHandler();
    @When("User click on edit button")
    public void user_click_on_edit_button() throws InterruptedException {

        WebElement BtnEdit = driver.getDriver().findElement(By.id("EditBR"));
        BtnEdit.click();
        Thread.sleep(1000);

    }

    @And("User click on Specific contract button")
    public void user_click_on_specific_contract_button() throws InterruptedException {

        WebElement BtnSC = driver.getDriver().findElement(By.id("step5"));
        BtnSC.click();
        Thread.sleep(1000);

    }

    @And("User click on Create SC button")
    public void user_click_on_create_sc_button() throws InterruptedException {

        WebElement BtnSC = driver.getDriver().findElement(By.id("CreateSC"));
        BtnSC.click();
        Thread.sleep(1000);

        WebElement BtnYesC = driver.getDriver().findElement(By.xpath("//button[contains(text(),'Yes, and proceed!')]"));
        BtnYesC.click();
        Thread.sleep(1000);

    }

    @And("User add OERP project code")
    public void user_add_oerp_project_code() throws InterruptedException {

        WebElement TxtOERP = driver.getDriver().findElement(By.name("OERPProjectCode"));
        TxtOERP.sendKeys("456");
        Thread.sleep(1000);

    }

    @And("User click on add OERP button")
    public void user_click_on_add_oerp_button() throws InterruptedException {
        WebElement BtnAdd = driver.getDriver().findElement(By.id("ButtonAddOERP"));
        BtnAdd.click();
        Thread.sleep(1000);


    }
    @And("User click on save OERP button")
    public void user_click_on_save_oerp_button() throws InterruptedException {
        WebElement BtnSv = driver.getDriver().findElement(By.id("SaveOERPcode"));
        BtnSv.click();
        Thread.sleep(1000);

    }

    @Then("Sc is created")

    public void sc_is_created() {
        System.out.println("SC created");
    }
}
