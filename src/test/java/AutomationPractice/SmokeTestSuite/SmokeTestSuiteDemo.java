package AutomationPractice.SmokeTestSuite;

import AutomationPractice.Pages.AuthenticationPage;
import AutomationPractice.Pages.CommonPage;
import AutomationPractice.Pages.HomePage;
import AutomationPractice.Pages.SignUpPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class SmokeTestSuiteDemo extends BaseTest{

    static String eMail = "pdharmendra@gmail.com";
    static String title1 = "Mr";
    static String firstName = "Dee";
    static String lastName = "Patel";
    static String date1 = "6  ";
    static String month1 = "June ";
    static String year1 = "1976  ";
    static String signUpForNewsLetter = "Yes";
    static String state = "Alaska";

    AuthenticationPage authenticationPage = new AuthenticationPage();
    CommonPage commonPage = new CommonPage();
    HomePage homePage = new HomePage();
    SignUpPage signUpPage = new SignUpPage();

@Test
public void verifyUserCannotRegisterWithInvalidData(){

    //Go to HomePage
    //homePage.isUserOnHomePage();
    //Verify that user is on the HomePage
    Assert.assertTrue(homePage.verifythatUserIsOnHomePage());

    //Select SignInLink or Navigate to Authentication Page
    commonPage.goToAuthenticationPage();
    //Verify that user is on Authentication Page
    Assert.assertTrue(authenticationPage.isUserOnAuthenticationPage());
    authenticationPage.enterEmailAndContinue(eMail);
    //Click on SignIn Button
    authenticationPage.clickSignUpButton();

    //Verify that user is on Registration Page
    Assert.assertTrue(signUpPage.isUserOnSignUpPage());
    signUpPage.selectTitle(title1);
    signUpPage.enterFirstName(firstName);
    signUpPage.enterFirstName(firstName);
    signUpPage.enterLastName(lastName);
    signUpPage.enterDOB(date1,month1,year1);
    signUpPage.selectState(state);
    signUpPage.selectForNewsLetter();
    signUpPage.submitRegistrationForm();

}








/*
    //Goto sign in page enter valid email and click create member
    @Test
    public void createMember () {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".login")).click();
        //verify that user is on the Authotication page
        Assert.assertTrue(automationLibrary.isUserOnAuthenticationPage());
        driver.findElement(By.cssSelector("#email_create")).sendKeys(eMail);
        driver.findElement(By.cssSelector("#SubmitCreate")).click();

        //verify that user is on the Regestrationpage
        Assert.assertTrue(automationLibrary.isUserOnRegistrationPage());
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        // createMember();
        automationLibrary.selectTitle(MavenRegressionSuite.title1);
        automationLibrary.enterFName(firstName);
        automationLibrary.enterLName(lastName);

        automationLibrary.enterDOB(date1, month1, year1);
        automationLibrary.selectStateName(state);
        automationLibrary.clicktoRegister();
        //Verify mandatoryMessage
        Assert.assertEquals("Mandatory field message verification","There are 5 errors", AutomationLibrary.verifyMendatoryField());

    }

*/

}



