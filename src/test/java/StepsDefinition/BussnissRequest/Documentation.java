package StepsDefinition.BussnissRequest;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

import java.awt.*;

public class Documentation {
    DriverHandler driver= new DriverHandler();
    CommonHelper commonHelper = new CommonHelper();
    String filePath = new String("C:\\Users\\zkadouri\\Desktop\\task15_03_22.xlsx");
    String documentTypeDoubleClick = new String("//div[@class='ui-grid-cell ng-scope ui-grid-coluiGrid-007E']");
    String documentType = new String("Answer");
   // String DocumentTypeDoubleClick = new String("//body/div[@id='myModal']/div[@id='relative-large-modal']/div[1]/div[3]/form[1]/div[2]/div[7]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]");

    @And("User click on Documentation button")
    public void user_click_on_documentation_button() {
        commonHelper.waitElementToBeClickable(By.id("step66")).click();
    }
    @And("user click on button to upload file")
    public void user_click_on_button_to_upload_file() throws InterruptedException, AWTException {
        commonHelper.waitElementToBeClickable(By.id("attachmentUpload")).click();
        commonHelper.AddFilePath(filePath);
    }

    @And("User choose document type")
    public void user_choose_document_type() throws InterruptedException {
        commonHelper.doubleClick(By.xpath(documentTypeDoubleClick));
        commonHelper.selectText(documentType,By.id("DocumentId"));
    }
}
