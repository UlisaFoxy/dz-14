package tests;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.MainPageWebtables;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class OpenLinkWebtablesTest extends GeneralPageTest {
    private final static String NAME = "Alice";
    private final static String LAST_NAME = "Liddel";
    private final static String EMAIL = "bunny@wonderland.se";
    private final static String AGE = "7";
    private final static String SALARY = "10000";
    private final static String DEPARTMENT = "wonder_land";

    @Test(priority = 1)
    @Description("This test check positive scenario go to the link")
    public void fillFormPositive (){
        //new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#firstName-label")));
        new MainPageWebtables(driver)
        .fillForm (NAME,LAST_NAME,EMAIL,AGE,SALARY,DEPARTMENT)
        .submitForm(NAME,LAST_NAME,EMAIL,AGE,SALARY,DEPARTMENT);

    }
    @Test(priority = 2)
    @Description("This test check if the new data was added")
    public void checkNewDataPositive (){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By rowDataLocator = By.xpath("//div[contains('Alice')]");
        wait.until(ExpectedConditions.presenceOfElementLocated(rowDataLocator));

    }
    @Test(priority = 3)
    @Description("This test check if the new data was added")
    public void editRecordPositive (){

        new MainPageWebtables(driver)
                .editRecord(NAME,LAST_NAME,EMAIL,AGE,SALARY,DEPARTMENT);

    }
}
