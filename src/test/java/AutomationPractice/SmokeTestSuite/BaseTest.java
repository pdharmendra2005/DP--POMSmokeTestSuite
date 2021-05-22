package AutomationPractice.SmokeTestSuite;

import AutomationPractice.Utils.BasePage;
import AutomationPractice.Utils.Utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest extends BasePage {

   @BeforeClass
    public static void openBrowser(){

        WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        driver = new ChromeDriver(chromeOptions);
       driver.get(BasePage.baseURL);
        Utils.pageLoadTimeOut(3L);

    }
    @AfterClass
    public static void closeBrowser(){
       driver.close();
    }

}
