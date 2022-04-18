package StepsDefinition.ScControl;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

public class AddPaymentForMonths {
    CommonHelper commonHelper = new CommonHelper();
    DriverHandler driver = new DriverHandler();
    String invoiceReference = new String("azed");
    By calendarButtonXpath = By.xpath("(//button[@class='btn btn-default' and @ng-click='open20()'])[1]");
    By numberOfDayCalendrier = By.xpath("(//button[@class='btn btn-default btn-sm'])[28]");
    String approverName = new String("Jean Brice Malinger");
    @And("User click on process for payment button")
    public void user_click_on_process_for_payment_button() {
        commonHelper.waitElementToBeClickable(By.id("generatePayment")).click();
    }

    @And("User click on consultant payment process")
    public void user_click_on_consultant_payment_process() {
        commonHelper.waitElementToBeClickable(By.id("PayMonthId")).click();
    }

    @And("User add add all required field in consultant payment process pop-up")
    public void user_add_add_all_required_field_in_consultant_payment_process_pop_up() {
        commonHelper.waitElementToBeClickable(By.id("InvoiceReference")).sendKeys(invoiceReference);
        commonHelper.waitElementToBeClickable(By.id("BtnPayInvoiceDate")).click();
        commonHelper.waitElementToBeClickable(calendarButtonXpath).click();
        commonHelper.waitElementToBeVisible(numberOfDayCalendrier).click();
        commonHelper.selectText(approverName,By.name("Approver"));
    }

    @And("User click on save consultant payment process button")
    public void user_click_on_save_consultant_payment_process_button() {
        commonHelper.waitElementToBeClickable(By.xpath("(//button[@class='btn btn-primary text-right' and @type='submit'])[1]")).click();
    }
    @Then("Payment is added successfully")
    public void payment_is_added_successfully() {
       System.out.println("Payment is added successfully");
    }
}
