package AutomationPractice.Pages;

import AutomationPractice.Utils.BasePage;
import AutomationPractice.Utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SignUpPage extends BasePage {

    //List out all WebElements

    By newSignUpForm = By.cssSelector("#create-account_form");
    By titleMr = By.cssSelector("#id_gender1");
    By titleMrs = By.cssSelector("#id_gender2");
    By fName = By.cssSelector("#customer_firstname");
    By lName = By.cssSelector("#customer_lastname");

    By dobDay = By.cssSelector("#days");
    By dobMonths = By.cssSelector("#months");
    By dobYears = By.cssSelector("#years");

    By selectStateName = By.cssSelector("#id_state");

    By submitAccountButton = By.cssSelector("#submitAccount");
    By selectForNewsLetter = By.cssSelector("#newsletter");
    //Verify that user is on the SignUpPage
    public boolean isUserOnSignUpPage() {

        WebElement newSignUpUserForm = driver.findElement(newSignUpForm);
        return Utils.isElementDisplayed(newSignUpUserForm);
    }

    public void selectTitle(String title) {
        if (title == "Mr") {
            driver.findElement(titleMr).click();
        }else if(title =="Mrs"){
            driver.findElement(titleMrs).click();
        }
    }

    public void enterFirstName(String firstName){
        //Enter your First Name
        Utils.type(driver.findElement(fName),firstName);
    }
    public void enterLastName(String lastName){
        Utils.type(driver.findElement(lName),lastName);
    }
    public void enterDOB(String day, String month,String year){
        //select DOB all three values
        Utils.pageLoadTimeOut(3L);
        Utils.selectFromListWithText(driver.findElement(dobDay),day);
        Utils.pageLoadTimeOut(3L);
        Utils.selectFromListWithText(driver.findElement(dobMonths),month);
        Utils.pageLoadTimeOut(3L);
        Utils.selectFromListWithText(driver.findElement(dobYears),year);
    }
    public void selectState(String stateName){

        Utils.selectFromListWithText(driver.findElement(selectStateName),stateName);
    }
    public void submitRegistrationForm(){
        driver.findElement(submitAccountButton).click();
    }


    public void selectForNewsLetter() {
        driver.findElement(selectForNewsLetter).click();
    }
}