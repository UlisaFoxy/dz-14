package tests;

import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.ClickMeButtonPageObject;

public class ClickMeButtonTest extends OpenCloseBrowserTest {
    @Test
    @Description("The user click the clickMeButton and gets a message")
    public void clickMeButtonPositive() {
        ClickMeButtonPageObject clickMeButtonPage = new ClickMeButtonPageObject(driver);
        clickMeButtonPage.scrollToClickMeButton()
                .clickMeButton()
                .getMessage();

        Assert.assertEquals(clickMeButtonPage.getMessage(), "You have done a dynamic click", "Wrong action message");
    }
}

