package StepsDefinition;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

public class add_new_BR_QTM {
    DriverHandler driver= new DriverHandler();
    CommonHelper commonHelper = new CommonHelper();

    @And("User choose type of involement and field required")
    public void user_choose_type_of_involement_and_field_required() throws InterruptedException {

                        //By amount
   /*  WebElement BtntyprInv = driver.getDriver().findElement(By.id("TypeInvolvementID"));
       Select s0 = new Select(BtntyprInv);
        s0.selectByVisibleText("By amount");
       Thread.sleep(1000);
        commonHelper.waitElementToBeClickable(By.id("TotalCostSubcoId")).sendKeys("500");
        WebElement BtnCurency = driver.getDriver().findElement(By.id("TotalCostID_Currency"));
       Select s1 = new Select(BtnCurency);
        s1.selectByVisibleText("€");
        Thread.sleep(1000);*/

                        //By number of days
     /*   commonHelper.waitElementToBeClickable(By.id("ConsultantCostEtit")).clear();
        commonHelper.waitElementToBeClickable(By.id("ConsultantCostEtit")).sendKeys("100");
        WebElement BtntyprInv = driver.getDriver().findElement(By.id("TypeInvolvementID"));
        Select s0 = new Select(BtntyprInv);
       s0.selectByVisibleText("By number of days");
       Thread.sleep(1000);
       commonHelper.waitElementToBeClickable(By.id("IdNbr_Days")).sendKeys("50");*/

                        //By percentage
        WebElement BtntyprInv = driver.getDriver().findElement(By.id("TypeInvolvementID"));
        Select s0 = new Select(BtntyprInv);
       s0.selectByVisibleText("By percentage");
        Thread.sleep(1000);
       commonHelper.waitElementToBeClickable(By.id("MarginconsId")).sendKeys("40");
        WebElement BtnCurency = driver.getDriver().findElement(By.id("TotalCostID_Currency"));
       Select s1 = new Select(BtnCurency);
        s1.selectByVisibleText("€");
        Thread.sleep(1000);




    }
    @And("User click on edit consultant save button")
    public void user_click_on_edit_consultant_save_button() {
     commonHelper.waitElementToBeClickable(By.id("SaveEdteConsultant")).click();
    }
}
