package test.impl.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class CommonHelper {
    int timeOut = 40;

    DriverHandler driverHandler = new DriverHandler();

    public void addFilePath(String text) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        StringSelection filepath = new StringSelection(text);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath,null);
        robot.keyPress(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_V);
        Thread.sleep(1000);
        robot.keyRelease(KeyEvent.VK_V);
        Thread.sleep(1000);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
    }

    public  String getTitle()
    {
        driverHandler.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
        return driverHandler.getDriver().getTitle();
    }

    public void doubleClick(By by){
        WebElement webElement = null;
        Actions actions = new Actions(driverHandler.getDriver());
        try {
            WebDriverWait wait = new WebDriverWait(driverHandler.getDriver(), timeOut);
            webElement = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        } catch (Exception e) {
            System.out.println(" ==> The element " + webElement + " is not Visible after " + timeOut);
        }
        actions.doubleClick(webElement).perform();
    }

    public void clickElementByJs(By by, int timeOut) {

        WebElement element = driverHandler.getDriver().findElement(by);
        ((JavascriptExecutor) driverHandler.getDriver()).executeScript("arguments[0].click();", element);
        wait(timeOut);
    }

    public void doubleClickElementByJs(By by, int timeOut) {

        WebElement element = driverHandler.getDriver().findElement(by);
        ((JavascriptExecutor) driverHandler.getDriver()).executeScript("arguments[0].click();", element);
        ((JavascriptExecutor) driverHandler.getDriver()).executeScript("arguments[0].click();", element);
        wait(timeOut);
    }
    public WebElement waitElementToBeVisible(By by) {
        WebElement webElement = null;
        try {
            WebDriverWait wait = new WebDriverWait(driverHandler.getDriver(), timeOut);
            webElement = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        } catch (Exception e) {
            System.out.println(" ==> The element " + webElement + " is not Visible after " + timeOut);
        }
        return webElement;
    }


    public WebElement waitElementToBeClickable(By by) {
        WebElement webElement = null;
        try {
            WebDriverWait wait = new WebDriverWait(driverHandler.getDriver(), timeOut);
            webElement = (WebElement) wait.until(ExpectedConditions.elementToBeClickable(by));
        } catch (Exception e) {
            System.out.println(" ==> The element " + webElement + " is not Visible after " + timeOut);
        }

        return webElement;
    }




	public void selectText(String text,By by) {
		WebElement webElement = null;
		try {
			WebDriverWait wait = new WebDriverWait(driverHandler.getDriver(), timeOut);
			webElement = (WebElement) wait.until(ExpectedConditions.elementToBeClickable(by));
		} catch (Exception e) {
			System.out.println(" ==> The element " + webElement + " is not Visible after " + timeOut);
		}
		Select select = new Select(webElement);
		select.selectByVisibleText(text);
	}


    public void wait(int timeOut) {
        try {
            Thread.sleep(timeOut);
        } catch (InterruptedException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
