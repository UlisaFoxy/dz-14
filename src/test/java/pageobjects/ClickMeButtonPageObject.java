package pageobjects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClickMeButtonPageObject extends AbstractPageObject {
    private final By clickMeButton = By.xpath("//button[text()='Click Me']");
    private final By message = By.xpath("//*[@id='dynamicClickMessage']");

    public ClickMeButtonPageObject(WebDriver driver) {
        super(driver);
        driver.get("https://demoqa.com/buttons");
    }

    @Step("Scroll to clickMeButton")
    public ClickMeButtonPageObject scrollToClickMeButton() {
        WebElement element = driver.findElement(clickMeButton);
        scrollToElement(element);
        return this;
    }

    @Step("The user click the button clickMeButton")
    public ClickMeButtonPageObject clickMeButton() {
        scrollToClickMeButton();
        clickOnElementWithJS(clickMeButton);
        return this;
    }

    @Step("Check the message after click the button clickMeButton")
    public String getMessage() {
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='dynamicClickMessage']")));
        return getElement(message).getText();
    }
}

