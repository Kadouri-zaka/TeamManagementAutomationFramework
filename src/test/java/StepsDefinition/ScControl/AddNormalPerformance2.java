package StepsDefinition.ScControl;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

public class AddNormalPerformance2 {
    CommonHelper commonHelper = new CommonHelper();
    DriverHandler driver = new DriverHandler();
    String consultant[] = {"Rodrigo Coelho"};
    String oerpCode[] ={"159"};
    @And("user select consultant and OERP project code")
    public void user_select_consultant_and_oerp_project_code() {
        commonHelper.selectText(consultant[0], By.id("ConsultantDWId"));
        commonHelper.selectText(oerpCode[0],By.id("OERPDWId"));
    }
}
