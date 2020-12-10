package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected static void open(WebDriver driver, String url) {

        driver.get(url);
    }

    protected static void click(WebDriver driver, By locator) {

        driver.findElement(locator).click();
    }

    protected static void edit(WebDriver driver, By locator, String value) {

        driver.findElement(locator).sendKeys(value);
    }

    protected static int checkCount(WebDriver driver, By locator) {

        return driver.findElements(locator).size();
    }
}
