package tests;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.MainPage;
import pageobjects.MainPageElements;

public class OpenLinkElementsTest extends GeneralPageTest {
    private final By buttonsButton = By.xpath("//span[text()='Buttons']");
    private final By clickMeButton = By.xpath("//button[text()='Click Me']");
    @Test
    @Description("This test check positive scenario go to the link")
    public void testOpenLinkPositive (){
        new MainPageElements(driver)
                .clickButton(buttonsButton,clickMeButton);

        Assert.assertEquals(driver.getCurrentUrl(),"https://demoqa.com/buttons",
                "You click the wrong button, please check the button");

    }
}
