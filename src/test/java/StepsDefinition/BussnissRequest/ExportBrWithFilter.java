package StepsDefinition.BussnissRequest;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import test.impl.pages.CommonHelper;
import test.impl.pages.DriverHandler;

public class ExportBrWithFilter {
    CommonHelper commonHelper = new CommonHelper();
    DriverHandler driver= new DriverHandler();
    String filterRequest = new String("zaka");
    @And("User add filter required in filter field")
    public void user_add_filter_required_in_filter_field() {
        commonHelper.waitElementToBeClickable(By.id("btnSearch")).click();
        commonHelper.waitElementToBeClickable(By.id("filter")).sendKeys(filterRequest);
    }
    @And("User Click on grid menu")
    public void user_click_on_grid_menu()  {
        commonHelper.waitElementToBeClickable(By.xpath("(//div[@role='button' and @ui-grid-one-bind-id-grid=\"'grid-menu'\" and contains(@id,'grid-menu')])[1]")).click();
    }
    @And("User click on Export all data with filter")
    public void user_click_on_export_all_data_with_filter() throws InterruptedException {
        commonHelper.waitElementToBeVisible(By.xpath("(//div[@class='ui-grid-cell-contents ng-binding ng-scope'])[1]"));
        commonHelper.waitElementToBeClickable(By.xpath("//button[@class='ui-grid-menu-item ng-binding' and contains(text(),' Export all data with filter')]")).click();
    }
}
