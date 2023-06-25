package pageobjects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.time.Instant;

public class MainPageElements extends AbstractPageObject {
    private final By buttonsButton = By.xpath("//*[@id=\"item-4\"]/span");
    private final By clickMeButton = By.xpath("//button[text()='Click Me']");

    public MainPageElements(WebDriver driver) {
        super(driver);
        driver.get("https://demoqa.com/elements/");
    }

    @Step("The user go to the link")
    public MainPageElements clickButton (By buttonsButton, By clickMeButton) {
        clickOnElementWithJS(buttonsButton);
        clickOnElementWithJS(clickMeButton);
        return new MainPageElements(driver);
    }
}

