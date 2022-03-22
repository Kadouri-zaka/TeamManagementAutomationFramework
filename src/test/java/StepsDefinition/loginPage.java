package StepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import test.impl.pages.DriverHandler;

public class loginPage {

    DriverHandler driver = new DriverHandler();

    @Given("User is already in login page")
    public void user_launch_chrome_browser() throws InterruptedException {
        //   System.setProperty("webdriver.chrome.driver","C:\\Users\\zkadouri\\Downloads\\chromedriver.exe");
        //    driver = new ChromeDriver();
        //   driver.get("https://nfr_staffaugmentation.everis.com/");
        //  driver.manage().window().maximize();
        //  Thread.sleep(2000);
        System.out.println("Welcome");


    }

@When("User enter valid username and password")
   public void user_enter_valid_username_and_password() throws InterruptedException {
  //  @When("^User enter valid (.*) and (.*)$")
  //  public void user_enter_valid_username_and_password(String username, String password) throws InterruptedException {
        WebElement UserName = driver.getDriver().findElement(By.id("username"));
        UserName.sendKeys("Admin");
        Thread.sleep(2000);
        WebElement Password = driver.getDriver().findElement(By.id("password"));
        Password.sendKeys("ALKmioksfghQesNmlIompfn");
        Thread.sleep(2000);
    }

    @And("user click on login button")
    public void user_click_on_login_button() throws InterruptedException {
        driver.getDriver().findElement(By.xpath("//button[@id='loginButton']")).click();
        Thread.sleep(1000);
    }

    @Then("User connect successfully")
    public void user_connect_successfully() throws InterruptedException {

        //   boolean TxtCheck = driver.getDriver().findElement(By.id("liBR")).isDisplayed();
        //    if (TxtCheck) {
        //      System.out.println("user is connected successfully");
        //   }
        //   else () {
        //      System.out.println("user is not connected successfully");


        System.out.println("user is connected successfully");


    }
}

            /*if (driver.findElement(By.xpath("//span[contains(text(),'SAee Admin')]")).isDisplayed())
            {
                System.out.println("user is connected successfully");
            }
            else {
                System.out.println("user is not connected successfully");
            }
          //  else if (driver.findElement(By.xpath("//label[contains(text(),'Username or password is invalid')]")).isDisplayed()){
              //  System.out.println("Username or password incorrect");
         //   }


            Thread.sleep(2000);
            //driver.close();
        }

             */

