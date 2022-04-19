package StepsDefinition.Login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

public class AuthentificationScenarioOutline {
    DriverHandler driver = new DriverHandler();
    CommonHelper commonHelper = new CommonHelper();
    @Given("User is in login page")
    public void user_is_in_login_page() {
        driver.initiatDriver();
    }
    @When("^User enter username as (.*) and password as (.*)$")
    public void user_enter_username_as_username_and_password_as_password(String uname, String passw) {
        commonHelper.waitElementToBeClickable(By.id("username")).sendKeys(uname);
        commonHelper.waitElementToBeClickable(By.id("password")).sendKeys(passw);
    }
    @When("user click on the login button")
    public void user_click_on_the_login_button() {
        commonHelper.waitElementToBeClickable(By.xpath("//button[@id='loginButton']")).click();
    }
}
