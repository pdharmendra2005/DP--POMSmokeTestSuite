package AutomationPractice.Pages;

import AutomationPractice.Utils.BasePage;
import org.openqa.selenium.By;

public class  CommonPage extends BasePage {

    //List out the webElement   simple POM

    By signInLink = By.cssSelector(".login");

    public void goToAuthenticationPage(){

        driver.findElement(signInLink).click();
    }


}
