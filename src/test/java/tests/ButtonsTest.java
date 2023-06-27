package tests;

import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.ButtonPageObject;

public class ButtonsTest extends OpenCloseBrowserTest {
    @Test
    @Description("The user click on the buttons button")
    public void testOpenLinkPositive() {
        ButtonPageObject buttonPage = new ButtonPageObject(driver);
        buttonPage.scrollToButtonsButton()
                .clickButton();

        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/buttons",
                "You clicked the wrong button, please check the button");
    }
}
