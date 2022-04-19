package StepsDefinition.BussnissRequest.EditBr;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

public class CreateScFromBrWith2Oerp {
    int i ;
    CommonHelper commonHelper = new CommonHelper();
    DriverHandler driver= new DriverHandler();
    String oerpCode2 = new String("369");
    String oerpCode1 = new String("4751");
    By selectId = By.id("OERPprojectCodeId");
    @And("User add first OERP project code")
    public void user_add_first_oerp_project_code() {
        commonHelper.waitElementToBeClickable(By.name("OERPProjectCode")).sendKeys(oerpCode1);
    }
    @And("User add second OERP project code")
    public void user_add_second_oerp_project_code() {
        commonHelper.waitElementToBeClickable(By.name("OERPProjectCode")).sendKeys(oerpCode2);
    }
    @And("User select OERP for each month")
    public void user_select_oerp_for_each_month() {
        commonHelper.doubleClick(By.xpath("(//div[@class='ui-grid-cell ng-scope ui-grid-coluiGrid-004K'])[2]"));
        commonHelper.selectText(oerpCode1,selectId);
        commonHelper.doubleClick(By.xpath("(//div[@class='ui-grid-cell ng-scope ui-grid-coluiGrid-004K'])[3]/div"));
        commonHelper.selectText(oerpCode2,selectId);
        commonHelper.doubleClick(By.xpath("(//div[@class='ui-grid-cell ng-scope ui-grid-coluiGrid-004K'])[4]/div"));
        commonHelper.selectText(oerpCode2,selectId);
        commonHelper.doubleClick(By.xpath("(//div[@class='ui-grid-cell ng-scope ui-grid-coluiGrid-004K'])[5]/div"));
        commonHelper.selectText(oerpCode2,selectId);
    }
    @And("User click on save asign Oerp")
    public void user_click_on_save_asign_oerp() {
        commonHelper.waitElementToBeClickable(By.id("SaveConsultantDWId")).click();
    }

}
