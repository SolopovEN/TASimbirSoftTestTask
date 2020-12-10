package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    static String mainUrl = "https://mail.google.com";
    static By loginField = By.id("identifierId");
    static By loginNextButton = By.cssSelector("#identifierNext > div > button");
    static By passwordField = By.name("password");
    static By passwordNextButton = By.cssSelector("#passwordNext > div > button");

    public static void open(WebDriver driver) {

        open(driver, mainUrl);
    }

    public static void editLoginField(WebDriver driver, String value) {

        edit(driver, loginField, value);
    }

    public static void clickLoginNextButton(WebDriver driver) {

        click(driver, loginNextButton);
    }

    public static void editPasswordField(WebDriver driver, String value) {

        edit(driver, passwordField, value);
    }

    public static void clickPasswordNextButton(WebDriver driver) {

        click(driver, passwordNextButton);
    }
}
