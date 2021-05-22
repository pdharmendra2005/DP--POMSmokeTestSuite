package AutomationPractice.Pages;

import AutomationPractice.Utils.BasePage;
import AutomationPractice.Utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class AuthenticationPage extends BasePage {


    By signUpForm = By.cssSelector("#create-account_form");
    By signUpEmail = By.cssSelector("#email_create");
    By signUpButton = By.cssSelector("#SubmitCreate");


    //Verify that User is on the AuthenticationPage

    public boolean isUserOnAuthenticationPage(){

        WebElement createAccountForm = driver.findElement(signUpForm);
        return Utils.isElementDisplayed(createAccountForm);
    }
    //Navigate to SignUpPage
    public void enterEmailAndContinue(String userEmail){
        //Enter the Email address and select Create Account button
        Utils.type(driver.findElement(signUpEmail),userEmail);

    }

    public void clickSignUpButton(){

        driver.findElement(signUpButton).click();
    }
    //Wait for page to load
    public void waitForPageToLoad(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


}
