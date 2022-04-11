package StepsDefinition.Login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

public class LoginPage {

    DriverHandler driver = new DriverHandler();
    CommonHelper commonHelper = new CommonHelper();
    String username = new String("Admin");
    String password = new String("ALKmioksfghQesNmlIompfn");
    @Given("User is already in login page")
    public void user_launch_chrome_browser() {
        System.out.println("Welcome");
    }

@When("User enter valid username and password")
   public void user_enter_valid_username_and_password()  {
        commonHelper.waitElementToBeClickable(By.id("username")).sendKeys(username);
        commonHelper.waitElementToBeClickable(By.id("password")).sendKeys(password);
    }

    @And("user click on login button")
    public void user_click_on_login_button()  {
        commonHelper.waitElementToBeClickable(By.xpath("//button[@id='loginButton']")).click();
    }

    @Then("User connect successfully")
    public void user_connect_successfully()  {
        System.out.println("user is connected successfully");
    }
}


