package StepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

public class addNewBR {
    DriverHandler driver= new DriverHandler();

    @When("User click on Business Request field")
    public void user_click_on_business_request_field() throws InterruptedException {
        Thread.sleep(2000);
        WebElement BtnBRAdd = driver.getDriver().findElement(By.id("IdBusinessRequest"));
        BtnBRAdd.click();

    }

    @And("User click on button New business request")
    public void user_click_on_button_new_business_request() throws InterruptedException {
        WebElement BtnNewBR = driver.getDriver().findElement(By.cssSelector("#add"));
        BtnNewBR.click();
        Thread.sleep(1000);
    }

    @And("User add a Request number, Framework contract, Department, Status, Service type,Source")
    public void user_add_a_request_number_framework_contract_department_status_service_type_source() throws InterruptedException {
        WebElement TxtRN = driver.getDriver().findElement(By.name("ReqNumber"));
        TxtRN.sendKeys("ZakaTest25/03/22_1");
        Thread.sleep(1000);

        WebElement TxtFC = driver.getDriver().findElement(By.name("typeofct"));
        Select s1 = new Select(TxtFC);
        s1.selectByVisibleText("CASIS Lot 1");
        Thread.sleep(1000);

        WebElement TxDep = driver.getDriver().findElement(By.name("DGdepartment"));

        TxDep.sendKeys("AGRI");
        Thread.sleep(1000);

        WebElement TxStatuts = driver.getDriver().findElement(By.name("status"));
        Select s3 = new Select(TxStatuts);
        s3.selectByVisibleText("Project in Progress (PiP)");
        Thread.sleep(1000);

        WebElement TxSt = driver.getDriver().findElement(By.name("typebr"));
        Select s4 = new Select(TxSt);
        s4.selectByVisibleText("TM");
        Thread.sleep(1000);

        WebElement TxSR = driver.getDriver().findElement(By.id("SourceBusinessRq"));
        Select s5 = new Select(TxSR);
        s5.selectByVisibleText("Initial");
        Thread.sleep(1000);

    }

    @When("User click on Basic characteristics")
    public void user_click_on_basic_characteristics() throws InterruptedException {
        WebElement BtnBC = driver.getDriver().findElement(By.id("step3"));
        BtnBC.click();
        Thread.sleep(2000);

    }

    @And("User add Place of delivery , company")
    public void user_add_place_of_delivery_company() throws InterruptedException {
        WebElement TxPD = driver.getDriver().findElement(By.name("placedelivery"));
        Select s6 = new Select(TxPD);
        s6.selectByVisibleText("LUX");
        Thread.sleep(1000);

        WebElement TxCompany = driver.getDriver().findElement(By.name("Company"));
        Select s7 = new Select(TxCompany);
        s7.selectByVisibleText("everis EBEL");
        Thread.sleep(1000);

    }

    @When("User click on New profile button")
    public void user_click_on_new_profile_button() throws InterruptedException {

        WebElement BtnNP = driver.getDriver().findElement(By.id("btnNewProfile"));
        BtnNP.click();
        Thread.sleep(1000);

    }

    @And("User add Profile , level , on site , sales price, nbr of days other expertise")
    public void user_add_profile_level_on_site_sales_price_nbr_of_days_other_expertise() throws InterruptedException {
       WebElement TxtProfile = driver.getDriver().findElement(By.name("Profile"));
        Select s8 = new Select(TxtProfile);
        s8.selectByVisibleText("AA");
        Thread.sleep(1000);

        WebElement TxtLevel = driver.getDriver().findElement(By.name("Level"));
        Select s9 = new Select(TxtLevel);
        s9.selectByVisibleText("Junior");
        Thread.sleep(1000);

        WebElement TxtOnOfSite = driver.getDriver().findElement(By.name("OnSite"));
        Select s10 = new Select(TxtOnOfSite);
        s10.selectByVisibleText("On site");
        Thread.sleep(1000);

        WebElement TxtNbrDays = driver.getDriver().findElement(By.id("ndaysprofile"));
        TxtNbrDays.sendKeys("100");
        Thread.sleep(1000);

        WebElement TxtSalesPrice = driver.getDriver().findElement(By.xpath("//input[@id='SalespriceProfile']"));
        TxtSalesPrice.clear();
        TxtSalesPrice.sendKeys("250");
        Thread.sleep(1000);

        WebElement TxtOtherExpertise = driver.getDriver().findElement(By.name("Other_Expertise_required"));
        TxtOtherExpertise.sendKeys("java selenium");
        Thread.sleep(1000);
    }

    @And("User click on save of profile")
    public void user_click_on_save_of_profile() throws InterruptedException {

        WebElement BtnSaveProfile = driver.getDriver().findElement(By.xpath("//button[@id='SaveBRProfile']"));
        BtnSaveProfile.click();
        Thread.sleep(1000);

    }

    @And("User click on save of BR")
    public void user_click_on_save_of_br() throws InterruptedException {

        WebElement BtnSaveBR = driver.getDriver().findElement(By.id("SaveBR"));
        BtnSaveBR.submit();
        Thread.sleep(1000);
    }

    @Then("the request is saved")
    public void the_request_is_saved() throws InterruptedException {




        WebElement BtnOK = driver.getDriver().findElement(By.xpath("//button[contains(text(),'OK')]"));
        BtnOK.click();
        Thread.sleep(1000);

        System.out.println("BR is created successfully");
        Thread.sleep(2000);
    }
}
