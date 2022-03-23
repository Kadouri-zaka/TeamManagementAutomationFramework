package StepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import test.impl.pages.DriverHandler;

public class addNewBRPSA {
    DriverHandler driver= new DriverHandler();
    @When("User click on Everis condidate")
    public void user_click_on_everis_condidate() throws InterruptedException {
        WebElement BtnEC = driver.getDriver().findElement(By.name("tab2"));
        BtnEC.click();
        Thread.sleep(1000);
    }

    @And("User click on new condidate")
    public void user_click_on_new_condidate() throws InterruptedException {
       WebElement BtnNC = driver.getDriver().findElement(By.id("AddnewCand"));
        BtnNC.click();
        Thread.sleep(1000);
    }


    @And("User add Fisrt name, Last name, Company, Recruitement, Resource type, Detail interview")
    public void user_add_fisrt_name_last_name_company_recruitement_resource_type_detail_interview() throws InterruptedException {

        WebElement BtnFN = driver.getDriver().findElement(By.id("CandidateFirstName"));
      //  Select p0 = new Select(BtnFN);
       // p0.selectByVisibleText("1429 Liviu Florin");
        BtnFN.sendKeys("text");
        Thread.sleep(1000);

        WebElement BtnNC = driver.getDriver().findElement(By.name("CandidateLastName"));
        BtnNC.sendKeys("tetsto");
        Thread.sleep(1000);

        WebElement BtnCompany = driver.getDriver().findElement(By.id("cdcompany"));
        Select p1 = new Select(BtnCompany);
        p1.selectByVisibleText("everis EBEL");
        Thread.sleep(1000);

        WebElement BtnRecrutement = driver.getDriver().findElement(By.id("reccandidate"));
        Select p2 = new Select(BtnRecrutement);
        p2.selectByVisibleText("Belen Ruiz");
        Thread.sleep(1000);



        WebElement BtnRT = driver.getDriver().findElement(By.id("idResourceType"));
        Select p3 = new Select(BtnRT);
        p3.selectByVisibleText("Recruitment");
        Thread.sleep(1000);

        WebElement BtnDI = driver.getDriver().findElement(By.name("InterviewDetail"));
        BtnDI.sendKeys("good");
        Thread.sleep(1000);


    }

    @And("User click on add button")
    public void user_click_on_add_button() throws InterruptedException {

       WebElement BtnAddBTN = driver.getDriver().findElement(By.id("SaveCand"));
        BtnAddBTN.click();
        Thread.sleep(1000);

   //     ((JavascriptExecutor) driver.getDriver()).executeScript("arguments[0].click();", BtnAddBTN);
    //    Alert alert = driver.getDriver().switchTo().alert();
    //    alert.accept();

        WebElement BtnYesC = driver.getDriver().findElement(By.xpath("//button[contains(text(),'Yes, and proceed!')]"));
        BtnYesC.click();
        Thread.sleep(1000);

    }

    @When("User click on check button")
    public void user_click_on_check_button() throws InterruptedException {

       WebElement BtnChekBTN = driver.getDriver().findElement(By.xpath("//body/div[@id='myModal']/div[@id='relative-large-modal']/div[1]/div[3]/form[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
       BtnChekBTN.click();
        Thread.sleep(1000);

    }

    @And("click on Select as consultant button")
    public void click_on_select_as_consultant_button() throws InterruptedException {

      WebElement BtnConsultantBTN = driver.getDriver().findElement(By.id("SelectasCons"));
       BtnConsultantBTN.click();
        Thread.sleep(1000);

     //   ((JavascriptExecutor) driver.getDriver()).executeScript("arguments[0].click();", BtnConsultantBTN);

     //   Alert alert = driver.getDriver().switchTo().alert();
     //   String ALERTMESSAGE = driver.getDriver().switchTo().alert().getText();
     //   System.out.println(ALERTMESSAGE);
      //  Thread.sleep(1000);
      //  alert.accept();
      WebElement BtnYesC2 = driver.getDriver().findElement(By.xpath("//button[contains(text(),'Yes, and proceed')]"));
      ((JavascriptExecutor) driver.getDriver()).executeScript("arguments[0].click();", BtnYesC2);
       Thread.sleep(1000);

    }



    @And("User add Type of contract and Employee number")
    public void user_add_type_of_contract_and_employee_number() throws InterruptedException {

                            //Employee
    //    Actions actions = new Actions(driver.getDriver());
//   WebElement btnElement = driver.getDriver().findElement(By.xpath("//div[@class='ui-grid-cell-contents ng-binding ng-scope' and contains(text(),'--Choose item--')]"));
    //  actions.doubleClick(btnElement).perform();
    //    WebElement BtnSel = driver.getDriver().findElement(By.id("TOCCand"));
    //    Select p4 = new Select(BtnSel);
    //    p4.selectByVisibleText("Employee");
    //    Thread.sleep(1000);
     //   WebElement btnEN = driver.getDriver().findElement(By.id("OERPEmployeeId"));
    //  actions.doubleClick(btnEN).perform();
   //   WebElement BtnEnumber = driver.getDriver().findElement(By.id("OERPCand"));
    //  BtnEnumber.sendKeys("14789");
   //   Thread.sleep(1000);

                            //subcontactor
       Actions actions = new Actions(driver.getDriver());
       WebElement btnElement = driver.getDriver().findElement(By.xpath("//div[@class='ui-grid-cell-contents ng-binding ng-scope' and contains(text(),'--Choose item--')]"));
        actions.doubleClick(btnElement).perform();
       WebElement BtnSel = driver.getDriver().findElement(By.id("TOCCand"));
       Select p4 = new Select(BtnSel);
       p4.selectByVisibleText("Subcontractor");
        Thread.sleep(1000);
        WebElement btnEN = driver.getDriver().findElement(By.xpath("//div[@class='ui-grid-cell-contents ng-binding ng-scope' and contains(text(),'--Choose item--')]"));
        actions.doubleClick(btnEN).perform();
        WebElement BtnEnumber = driver.getDriver().findElement(By.id("SubmitNameSubcontractor"));
        Select p5 = new Select(BtnEnumber);
        p5.selectByVisibleText("Atos");
        Thread.sleep(1000);







    }

    @Then("User click on save button")
    public void user_click_on_save_button() throws InterruptedException {
        WebElement BtnSave = driver.getDriver().findElement(By.id("SaveConsultantinfo"));
        BtnSave.click();
        Thread.sleep(1000);

    }
}
