package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {

    static By mailTheme = By.xpath("//span[text()='Simbirsoft theme']");
    static By createMailButton = By.xpath("//div[text()='Написать']");
    static By receiverMailField = By.name("to");
    static By subjectMailField = By.name("subjectbox");
    static By bodyMailField = By.xpath("//div[@aria-label='Тело письма']");
    static By sendMailButton = By.xpath("//div[text()='Отправить']");

    public static int countMailsByTheme(WebDriver driver) {

        return checkCount(driver, mailTheme)/2;
    }

    public static void clickCreateMailButton(WebDriver driver) {

        click(driver, createMailButton);
    }

    public static void editReceiverMailField(WebDriver driver, String value) {

        edit(driver, receiverMailField, value);
    }

    public static void editSubjectMailField(WebDriver driver, String value) {

        edit(driver, subjectMailField, value);
    }

    public static void editBodyMailField(WebDriver driver, String value) {

        edit(driver, bodyMailField, value);
    }

    public static void clickSendMailButton(WebDriver driver) {

        click(driver, sendMailButton);
    }
}
