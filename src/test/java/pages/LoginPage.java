package pages;

import models.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    @FindBy(id = "identifierId")
    private WebElement login;

    @FindBy(name = "password")
    private  WebElement password;

    @FindBy(css = "#identifierNext > div > button")
    private WebElement loginNextButton;

    @FindBy(css = "#passwordNext > div > button")
    private WebElement passwordNextButton;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void login(User user) {
        login.sendKeys(user.getLogin());
        loginNextButton.click();
        password.sendKeys(user.getPassword());
        passwordNextButton.click();
    }

    public MainPage loginSuccess(User user) {
        login(user);
        return new MainPage(driver);
    }
}
