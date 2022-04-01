package StepsDefinition.BussnissRequest;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

public class CreateScFromBrWith2Oerp {
    int i ;
    CommonHelper commonHelper = new CommonHelper();
    DriverHandler driver= new DriverHandler();
    String oerpCode2 = new String("159");
    String oerpCode1 = new String("2759");
    By selectId = By.id("OERPprojetCodeId");
    By gridButton = By.xpath("(//div[@class='ui-grid-cell ng-scope ui-grid-coluiGrid-004K'])["+i+"]");
    @And("User add second OERP project code")
    public void user_add_second_oerp_project_code() {
        commonHelper.waitElementToBeClickable(By.name("OERPProjectCode")).sendKeys(oerpCode2);
    }
    @And("User select OERP for each month")
    public void user_select_oerp_for_each_month() {
        i =2;
        commonHelper.DoubleClick(gridButton);
        commonHelper.selectText(oerpCode1,selectId);
        i=3;
        commonHelper.DoubleClick(gridButton);
        commonHelper.selectText(oerpCode2,selectId);
        i=4;
        commonHelper.DoubleClick(gridButton);
        commonHelper.selectText(oerpCode2,selectId);
        i=6;
        commonHelper.DoubleClick(gridButton);
        commonHelper.selectText(oerpCode2,selectId);
        i=7;
        commonHelper.DoubleClick(gridButton);
        commonHelper.selectText(oerpCode1,selectId);
        i=8;
        commonHelper.DoubleClick(gridButton);
        commonHelper.selectText(oerpCode1,selectId);
    }
    @And("User click on save asign Oerp")
    public void user_click_on_save_asign_oerp() {
        commonHelper.waitElementToBeClickable(By.id("SaveConsultantDWId")).click();
    }

}
