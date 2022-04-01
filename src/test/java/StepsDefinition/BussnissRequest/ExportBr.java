package StepsDefinition.BussnissRequest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

public class ExportBr {
    CommonHelper commonHelper = new CommonHelper();
    DriverHandler driver= new DriverHandler();

    @And("user click on Export all button")
    public void user_click_on_export_all_button() {
        commonHelper.waitElementToBeClickable(By.id("exportexcelID")).click();
    }

    @Then("All BR are exported")
    public void all_br_are_exported() {
            System.out.println("All BR are exported");
    }

}
