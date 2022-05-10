package StepsDefinition.BusinessRequestScenarioOutline;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;
import test.impl.pages.Util;
public class AddNewBrOIPScenarioOutline {
    DriverHandler driver = new DriverHandler();
    CommonHelper commonHelper = new CommonHelper();
    By businessRequestButtonSelector = By.id("IdBusinessRequest");
    By newBusinessRequestButtonSelector = By.cssSelector("#add");
    By newProfileButtonSelector = By.id("btnNewProfile");
    By basicCaracteristicSelector = By.id("step3");
    By placeOfDeliverySelector = By.name("placedelivery");
    By companySelector = By.name("Company");
    By profileSelector = By.name("Profile");
    By levelSelector = By.name("Level");
    By onSiteSelector = By.name("OnSite");
    By salesPriceSelector = By.id("SalespriceProfile");
    By nbrOfDaysSelector = By.id("ndaysprofile");
    By expertiseSelector = By.name("Other_Expertise_required");
    By saveProfileButtonSelector = By.id("SaveBRProfile");
    By saveBrButtonSelector = By.xpath("//button[@name='SaveBusinessRequest']");
    By sweetAlertSelector = By.xpath("//div[@id='swal2-content']");
    By okButtonSelector = By.xpath("//button[contains(text(),'OK')]");
    By errorMessageSelector =By.xpath("//div[@class='col-lg-12  pull-left text-left paddingrow ']/div");
    By toasterSelector =By.xpath("//div[@class='toast-message']");
    @When("User click on Business Request field")
    public void user_click_on_business_request_field() {
        commonHelper.waitElementToBeClickable(businessRequestButtonSelector).click();
    }
    @And("User click on button New business request")
    public void user_click_on_button_new_business_request() {
        commonHelper.waitElementToBeClickable(newBusinessRequestButtonSelector).click();
    }
    @When("User click on Basic characteristics")
    public void user_click_on_basic_characteristics() {
        commonHelper.clickElementByJs(basicCaracteristicSelector, 2000);
    }
    @And("^User add Place of delivery as (.*)and company as (.*)$")
    public void user_add_place_of_delivery_as_place_of_delivery_and_company_as_company(String placeOfDelivery, String company) {
        commonHelper.selectText(placeOfDelivery, placeOfDeliverySelector);
        commonHelper.selectText(company, companySelector);
    }
    @When("User click on New profile button")
    public void user_click_on_new_profile_button() {
        commonHelper.waitElementToBeClickable(newProfileButtonSelector).click();
    }
    @And("^User add Profile as (.*),level as (.*),on site as (.*),sales price as (.*), nbr of days as (.*) and other expertise as (.*)$")
    public void user_add_profile_as_profile_level_as_level_on_site_as_on_site_sales_price_as_sales_price_nbr_of_days_as_nbr_of_days_and_other_expertise_as_expertise(String profile, String level, String onSite, String salesPrice, String nbrOfDays, String expertise) {
        commonHelper.selectText(profile, profileSelector);
        commonHelper.selectText(level, levelSelector);
        commonHelper.selectText(onSite, onSiteSelector);
        commonHelper.waitElementToBeClickable(nbrOfDaysSelector).sendKeys(nbrOfDays);
        commonHelper.waitElementToBeClickable(salesPriceSelector).sendKeys(salesPrice);
        commonHelper.waitElementToBeClickable(expertiseSelector).sendKeys(expertise);
    }
    @And("User click on save of profile")
    public void user_click_on_save_of_profile() {
        commonHelper.waitElementToBeClickable(saveProfileButtonSelector).click();
        try {
            commonHelper.waitElementToBeVisible(By.xpath("//*[@class='ui-grid-cell ng-scope ui-grid-coluiGrid-006X']")).isDisplayed();
        }
        catch (NullPointerException e) {
            String errorMessage =commonHelper.waitElementToBeVisible(errorMessageSelector).getText();
            Assert.assertTrue(errorMessage,commonHelper.waitElementToBeVisible(errorMessageSelector).isDisplayed()==false);
            driver.closeDriver();}
    }
    @And("User click on save of BR")
    public void user_click_on_save_of_br() {
        commonHelper.waitElementToBeClickable(saveBrButtonSelector).submit();
    }
    @Then("Pop up of validation the add request is shown")
    public void pop_up_of_validation_the_add_request_is_shown() {
        String sweetAlert = commonHelper.waitElementToBeVisible(sweetAlertSelector).getText();
        Assert.assertTrue("Request is not saved because " + sweetAlert, sweetAlert.equalsIgnoreCase("Request is saved"));
        commonHelper.waitElementToBeClickable(okButtonSelector).click();
    }
}
