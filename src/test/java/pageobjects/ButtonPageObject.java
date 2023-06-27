package pageobjects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ButtonPageObject extends AbstractPageObject {
    private final By buttonsButton = By.xpath("//*[@id=\"item-4\"]/span");

    public ButtonPageObject(WebDriver driver) {
        super(driver);
        driver.get("https://demoqa.com/elements");
    }

    @Step("Scroll to buttons button")
    public ButtonPageObject scrollToButtonsButton() {
        WebElement element = driver.findElement(buttonsButton);
        scrollToElement(element);
        return this;
    }

    @Step("Click on buttons button")
    public ButtonPageObject clickButton() {
        scrollToButtonsButton();
        clickOnElementWithJS(buttonsButton);
        return this;
    }
}

