package StepsDefinition.ScControl;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

public class DeleteInvoice {
    CommonHelper commonHelper = new CommonHelper();
    DriverHandler driver = new DriverHandler();
    @And("User click on delete invoice buton")
    public void user_click_on_delete_invoice_buton() {
        commonHelper.waitElementToBeVisible(By.id("InvoicingPeriodId")).click();
        commonHelper.waitElementToBeClickable(By.xpath("//button[@class='swal2-confirm btn btn-success swal2-styled' and contains(text(),'Yes, delete it!')]")).click();
        commonHelper.waitElementToBeClickable(By.xpath("//button[@class='swal2-confirm swal2-styled' and contains(text(),'OK')]")).click();
    }
    @Then("Invoice is deleted successfully")
    public void invoice_is_deleted_successfully() {
       System.out.println("Invoice deleted successfully");
    }
}
