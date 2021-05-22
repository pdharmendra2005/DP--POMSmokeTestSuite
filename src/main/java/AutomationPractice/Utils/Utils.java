package AutomationPractice.Utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Utils extends BasePage{

    //All static methods ( generic ) methods those useful to all Testcases

    public static boolean isElementDisplayed(WebElement element){

        return element.isDisplayed();
    }
    public static void type(WebElement element,String text){
        element.sendKeys(text);
    }
    public static void selectFromListWithText(WebElement element, String text){

        Select select = new Select(element);
        select.selectByVisibleText(text);
    }
    public static void selectFromListWithIndex(WebElement element, int index){

        Select select = new Select(element);
        select.selectByIndex(index);
    }
    public static void selectFromListWithValue(WebElement element, String value){

        Select select = new Select(element);
        select.selectByValue(value);
    }
    public boolean isTextPresent(WebElement element,String text){

        return element.getText().contains(text);
    }
    public boolean isElementPresent(WebElement element){

        return element.isDisplayed();
    }
    public static String getPageTitle(){

        return driver.getTitle();
    }

    public static void pageLoadTimeOut(Long seconds){

        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);

    }


}
