package StepsDefinition.BusinessRequest.EditBr;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

import java.awt.*;

public class Documentation {
    DriverHandler driver= new DriverHandler();
    CommonHelper commonHelper = new CommonHelper();
    String filePath = new String("C:\\Users\\zkad\\Desktop\\task15_03_22.xlsx");
    String documentTypeDoubleClick = new String("//div[@class='ui-grid-cell ng-scope ui-grid-coluiGrid-007E']");
    String documentType = new String("Answer");


    @And("User click on documentation button")
    public void user_click_on_documentation_button() {
        commonHelper.clickElementByJs(By.id("step66"),2000);
    }
    @And("user click on button to upload file")
    public void user_click_on_button_to_upload_file() throws InterruptedException, AWTException {
     //   commonHelper.waitElementToBeClickable(By.xpath("//button[@id='attachmentUpload']/input")).sendKeys(filePath);
        commonHelper.clickElementByJs(By.id("attachmentUpload"),2000);
        commonHelper.addFilePath(filePath);
    }

    @And("User choose document type")
    public void user_choose_document_type() throws InterruptedException {
        commonHelper.doubleClick(By.xpath(documentTypeDoubleClick));
        commonHelper.selectText(documentType,By.id("DocumentId"));
        Thread.sleep(5000);
    }
    @And("User click on document save comment button")
    public void user_click_on_document_save_comment_button() {
      commonHelper.waitElementToBeClickable(By.xpath("//button[@name='SaveForm']")).click();
    }
    @Then("Document is added successfully")
    public void document_is_added_successfully() {
       System.out.println("Document is added successfully");
    }
}
