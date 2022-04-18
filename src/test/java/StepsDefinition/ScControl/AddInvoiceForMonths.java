package StepsDefinition.ScControl;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

public class AddInvoiceForMonths {
    CommonHelper commonHelper = new CommonHelper();
    DriverHandler driver = new DriverHandler();
    String oerpInvoiceCode = new String("75");
    By selectButton1 = By.xpath("(//div[@class='ui-grid-selection-row-header-buttons ui-grid-icon-ok ng-scope'])[8]");
    By selectButton2 = By.xpath("(//div[@class='ui-grid-selection-row-header-buttons ui-grid-icon-ok ng-scope'])[5]");
    @And("User select month required")
    public void user_select_month_required() throws InterruptedException {
        commonHelper.waitElementToBeVisible(By.id("tab3"));
        Thread.sleep(2000);
        commonHelper.waitElementToBeVisible(selectButton1).click();

    }
    @And("User click on generate invoice")
    public void user_click_on_generate_invoice() {
        commonHelper.waitElementToBeClickable(By.xpath("(//button[@name='generateInvoice'])[1]")).click();
    }
    @And("User click on client invoice")
    public void user_click_on_client_invoice() {
        commonHelper.waitElementToBeClickable(By.id("getInvoiceId")).click();
    }
    @And("User add OERP invoice code")
    public void user_add_oerp_invoice_code() {
        commonHelper.waitElementToBeVisible(By.id("InvoiceTMPTMModal"));
        commonHelper.waitElementToBeVisible(By.xpath("//input[@name='OERPInvoiceCode']")).sendKeys(oerpInvoiceCode);
    }
    @And("click on save client invoice")
    public void click_on_save_client_invoice() {
        commonHelper.waitElementToBeVisible(By.xpath("(//button[@name='SaveFormInvoice'])[1]")).click();
    }
    @Then("Invoice is added successfully")
    public void invoice_is_added_successfully() {
        System.out.println("Invoice is added successfully");
    }
}
