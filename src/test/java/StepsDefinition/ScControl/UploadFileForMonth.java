package StepsDefinition.ScControl;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

import java.awt.*;

public class UploadFileForMonth {
    CommonHelper commonHelper = new CommonHelper();
    DriverHandler driver= new DriverHandler();
    String fimepath = new String("C:\\Users\\zkadouri\\Desktop\\newFunction.txt");
    @And("User click on button upload")
    public void user_click_on_button_upload() throws InterruptedException, AWTException {
        commonHelper.waitElementToBeVisible(By.id("largeModelTMPTM"));
        commonHelper.waitElementToBeClickable(By.id("UploadID")).click();
        commonHelper.addFilePath(fimepath);
        Thread.sleep(5000);
    }
}
