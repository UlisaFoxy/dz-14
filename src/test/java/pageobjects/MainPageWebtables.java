package pageobjects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPageWebtables extends AbstractPageObject {
    private final By addButton = By.xpath("//*[@id=\"addNewRecordButton\"]");
    private final By firstNameField = By.xpath("//*[@id=\"firstName\"]");
    private final By lastNameField = By.xpath("//*[@id=\"lastName\"]");
    private final By emailField = By.xpath("//*[@id=\"userEmail\"]");
    private final By ageField = By.xpath("//*[@id=\"age\"]");
    private final By salaryField = By.xpath("//*[@id=\"salary\"]");
    private final By departmentField = By.xpath("//*[@id=\"department\"]");
    private final By submitButton = By.xpath("//*[@id=\"submit\"]");
    private final By editButton = By.xpath("//*[@id=\"edit-record-4\"]/svg/path");

    public MainPageWebtables(WebDriver driver) {
        super(driver);
        driver.get("https://demoqa.com/webtables/");
    }

   @Step("The user fills in the form")
    public MainPageWebtables fillForm(String firstName, String lastName, String email, String age,
                                      String salary, String department ){
       clickOnElementWithJS(addButton);
       getElement(firstNameField).sendKeys(firstName);
       getElement(lastNameField).sendKeys(lastName);
       getElement(emailField).sendKeys(email);
       getElement(ageField).sendKeys(age);
       getElement(salaryField).sendKeys(salary);
       getElement(departmentField).sendKeys(department);
       // clickOnElementWithJS(submitButton);
//       return new MainPage(driver);
       return this;

    }

    @Step("Submit the form")
    public MainPageWebtables submitForm(String firstName, String lastName, String email, String age,
                                        String salary, String department) {
        clickOnElementWithJS(submitButton);
        return this;
    }

    @Step("Edit record")
    public MainPageWebtables editRecord (String firstName, String lastName, String email, String age,
                                        String salary, String department) {
        clickOnElementWithJS(editButton);
        return this;
    }
}
