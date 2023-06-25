package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class MainPage extends AbstractPageObject {
    private final By title = By.cssSelector("#registration-form-modal");
    private final String titleElem = "You have done a dynamic click";

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public String getTitleText() {
        return getElement(title).getText();
    }
    public String getTitleElemText() {
        return getElement(By.id(titleElem)).getText();
    }

    public void clickButton(By buttonsButton, By clickMeButton) {
    }
}
