package AutomationPractice.Pages;

import AutomationPractice.Utils.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {
    //List out the web element of homepage/homepage tabs  ...Simple POM

      By homePageTabs = By.cssSelector("#header_logo");
  //  By homePageTabs = By.xpath("//ul[@id='home-page-tabs']");

    public boolean isUserOnHomePage(){

        return driver.findElement(homePageTabs).isDisplayed();
    }
    public boolean verifythatUserIsOnHomePage(){
        String urlString = driver.getCurrentUrl();
        return urlString.contains("http://automationpractice.com/index.php");
    }
}
