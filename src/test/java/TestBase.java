import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestBase {

    WebDriver driver;

    @BeforeTest
    public void setUp() {

        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setBrowserName("chrome");
        caps.setPlatform(Platform.WINDOWS);

        try {
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), caps);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @AfterTest
    public void tearDown() {

        driver.quit();
    }

    @Test
    public void firstMessagesCount() {

        LoginPage.open(driver);
        LoginPage.editLoginField(driver, "eugenetest80@gmail.com");
        LoginPage.clickLoginNextButton(driver);
        LoginPage.editPasswordField(driver, "solopovPass");
        LoginPage.clickPasswordNextButton(driver);
        int mailCount = MainPage.countMailsByTheme(driver);
        MainPage.clickCreateMailButton(driver);
        MainPage.editReceiverMailField(driver, "eugenetest80@gmail.com");
        MainPage.editSubjectMailField(driver, "Simbirsoft theme");
        MainPage.editBodyMailField(driver, String.format("Найдено %s писем\\ьма ", mailCount));
        MainPage.clickSendMailButton(driver);
    }
}
