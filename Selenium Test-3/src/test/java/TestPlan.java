import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestPlan {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        // ChromeDriver location set up in Utils class
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "Submit a WebForm")
    public static void submitForm(){
        driver.get(Utils.BASE_URL);
        WebForm webForm = new WebForm(driver);
        webForm.enterFName();;
        webForm.enterMNAME();
        webForm.enterLNAME();
        webForm.enterMAIL();
        webForm.enterPHONE();
        webForm.enterUName();
        webForm.enterPassword();
        webForm.enterCPassword();
        webForm.pressSubmitButton();
        driver.manage().timeouts().implicitlyWait(100 ,TimeUnit.MINUTES);
        webForm.verifyAlertSuccess();
    }

    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }

}