package StepsDefinition;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class documentation {
    DriverHandler driver= new DriverHandler();
    CommonHelper commonHelper = new CommonHelper();
    @And("User click on documentation button")
    public void user_click_on_documentation_button() {
        commonHelper.waitElementToBeClickable(By.id("step66")).click();
    }

    @And("user click on button to upload file")
    public void user_click_on_button_to_upload_file() throws InterruptedException, AWTException {



        WebElement BtnUpload=driver.getDriver().findElement(By.id("attachmentUpload"));
        ((JavascriptExecutor) driver.getDriver()).executeScript("arguments[0].click();",BtnUpload);
      //  ((JavascriptExecutor) driver.getDriver()).executeScript("arguments[0].value='C:\\Users\\zkadouri\\Desktop\\task15_03_22.xlsx';",BtnUpload);
        Thread.sleep(1000);

        Robot robot = new Robot();
        StringSelection filepath = new StringSelection("C:\\Users\\zkadouri\\Desktop\\task15_03_22.xlsx");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath,null);
        robot.keyPress(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);



    }

    @And("User choose document type")
    public void user_choose_document_type() throws InterruptedException {
        Actions actions = new Actions(driver.getDriver());
        WebElement btnDocType = driver.getDriver().findElement(By.xpath("//body/div[@id='myModal']/div[@id='relative-large-modal']/div[1]/div[3]/form[1]/div[2]/div[7]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]"));
        actions.doubleClick(btnDocType).perform();


        WebElement Btntype = driver.getDriver().findElement(By.id("DocumentId"));
        Select p4 = new Select(Btntype);
        p4.selectByVisibleText("Answer");
        Thread.sleep(1000);
    }
}
