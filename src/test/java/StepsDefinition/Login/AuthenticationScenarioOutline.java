package StepsDefinition.Login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

public class AuthenticationScenarioOutline {
    DriverHandler driver = new DriverHandler();
    CommonHelper commonHelper = new CommonHelper();
    By authenticationFailurePath = By.xpath("//label[@class='loginError']");
    By unameSelector = By.id("username");
    By passwSelector = By.id("password");
    By loginButtonSelector = By.xpath("//button[@id='loginButton']");

    @Given("User is in login page")
    public void user_is_in_login_page() {
        //  System.out.println("Welcome");
        driver.initiatDriver();
    }

    @When("^User enter username as (.*) and password as (.*)$")
    public void user_enter_username_as_username_and_password_as_password(String uname, String passw) {
        commonHelper.waitElementToBeClickable(unameSelector).sendKeys(uname);
        commonHelper.waitElementToBeClickable(passwSelector).sendKeys(passw);
    }

    @When("user click on the login button")
    public void user_click_on_the_login_button() {
        commonHelper.waitElementToBeClickable(loginButtonSelector).click();
    }

    @Then("User is redirected to the home page")
    public void userIsRedirectedToTheHomePage() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue("User and/Or password are not correct ", commonHelper.getTitle().equalsIgnoreCase("Staff Augmentation | Index"));

    }
}
