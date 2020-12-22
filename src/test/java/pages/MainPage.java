package pages;

import models.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class MainPage {

    private WebDriver driver;

    @FindAll({@FindBy(xpath = "//span[text()='Simbirsoft theme']")})
    private List<WebElement> mailTheme;

    @FindBy(xpath = "//div[text()='Написать']")
    private WebElement createMailButton;

    @FindBy(name = "to")
    private WebElement receiverMailField;

    @FindBy(name = "subjectbox")
    private WebElement subjectMailField;

    @FindBy(xpath = "//div[@aria-label='Тело письма']")
    private WebElement bodyMailField;

    @FindBy(xpath = "//div[text()='Отправить']")
    private WebElement sendMailButton;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public MainPage sendMail(User user) {
        int count = mailTheme.size();
        createMailButton.click();
        receiverMailField.sendKeys(user.getLogin());
        subjectMailField.sendKeys("Simbirsoft theme");
        bodyMailField.sendKeys(String.format("Найдено %s писем\\ьма ", count));
        sendMailButton.click();
        return this;
    }
}
