package tests;

import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.WebtablesPage;

public class FillInFormTest extends OpenCloseBrowserTest {
    private final static String NAME = "Alice";
    private final static String LAST_NAME = "Liddel";
    private final static String EMAIL = "bunny@wonderland.se";
    private final static String AGE = "7";
    private final static String SALARY = "10000";
    private final static String DEPARTMENT = "wonder_land";

    @Test
    @Description("The user fills the form, find new record and edit")
    public void fillFormPositive() {
        WebtablesPage webtablesPage = new WebtablesPage(driver);
        webtablesPage.fillForm(NAME, LAST_NAME, EMAIL, AGE, SALARY, DEPARTMENT)
                .submitForm();

        boolean isRecordAdded = driver.findElement(webtablesPage.getAddedRow()).isDisplayed();
        Assert.assertTrue(isRecordAdded, "The record was not added successfully");

        webtablesPage.scrollToEditButton()
                .editRecord();
    }
}
