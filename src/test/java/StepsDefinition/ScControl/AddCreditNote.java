package StepsDefinition.ScControl;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

public class AddCreditNote {
    CommonHelper commonHelper = new CommonHelper();
    DriverHandler driver = new DriverHandler();
    By gridFirstLine = By.xpath("(//div[@class='ui-grid-cell  ng-scope ui-grid-cell-selected ui-grid-disable-selection ui-grid-coluiGrid-0082'])[1]");
    String oerpInvoiceCode = new String("aze");
    String nbrOfDaysInitial = new String("9");
    String nbrOfDayToCredit = new String("2");
    By nbrOfDaysToCheck = By.xpath("(//div[@class='ui-grid-cell ng-scope ui-grid-coluiGrid-006V'])[2]/div");
    @When("User click on invoicing button")
    public void user_click_on_invoicing_button() {
        commonHelper.clickElementByJs(By.id("tab4Id"),2000);
    }
    @And("User double click on month to generate credit note")
    public void user_double_click_on_month_to_generate_credit_note() {
        commonHelper.waitElementToBeVisible(gridFirstLine);
        commonHelper.doubleClick(gridFirstLine);
    }
    @And("User click on generate credit note button")
    public void user_click_on_generate_credit_note_button() {
        commonHelper.clickElementByJs(By.id("generateCreditNoteId"),2000);
    }
    @And("User choose Apply concesion")
    public void user_choose_apply_concesion() {
        commonHelper.selectText("Apply concesion",By.xpath("//select[@class='swal2-select']"));
        commonHelper.waitElementToBeClickable(By.xpath("//button[@class='swal2-confirm btn btn-success stylebutton swal2-styled']")).click();
    }
    @And("User add OERP invoice code for credit note")
    public void user_add_oerp_invoice_code_for_credit_note() {
        commonHelper.waitElementToBeVisible(By.xpath("//form[@id='frmInvoice']"));
        commonHelper.waitElementToBeClickable(By.id("OERPInvoiceCodeId")).sendKeys(oerpInvoiceCode);
    }
    @And("User click on details")
    public void user_click_on_details() {
        commonHelper.waitElementToBeClickable(By.xpath("//li[@id='tab2Invoice']")).click();
    }
    @And("User add Nbr of days to credit")
    public void user_add_nbr_of_days_to_credit() {
        commonHelper.waitElementToBeVisible(By.id("tabInvoice2"));
        commonHelper.doubleClick(By.xpath("//div[@class='ui-grid-cell ng-scope ui-grid-coluiGrid-00BQ']"));
        commonHelper.waitElementToBeClickable(By.id("nOFDaysID")).sendKeys(nbrOfDayToCredit);
}
    @And("User click on save credit note")
    public void user_click_on_save_credit_note() {
        commonHelper.waitElementToBeClickable(By.id("SaveFormInvoiceId")).click();
    }
    @And("User click on yes button to change day")
    public void user_click_on_yes_button_to_change_day() {
        commonHelper.waitElementToBeClickable(By.xpath("//button[@class='swal2-confirm btn btn-success stylebutton swal2-styled']")).click();
    }
    @Then("User check if number of days is changed in performance")
    public void  user_check_if_number_of_days_is_changed_in_performance(){
        commonHelper.waitElementToBeClickable(By.id("tab3Id")).click();
        String nbrOfDaysInPerformance = commonHelper.waitElementToBeClickable(nbrOfDaysToCheck).getText();
        int nbrOfDaysToExpect = Integer.parseInt(nbrOfDaysInitial) -Integer.parseInt(nbrOfDayToCredit);
        System.out.println("Number of days initial is "+nbrOfDaysInitial+" and number to credit is "+nbrOfDayToCredit+" ,so number to found in performance is "+nbrOfDaysToExpect+" and number of days founded in performance is "+nbrOfDaysInPerformance);
    }

}
