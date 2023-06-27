package pageobjects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebtablesPage extends AbstractPageObject {
    private final By addButton = By.xpath("//*[@id=\"addNewRecordButton\"]");
    private final By firstNameField = By.xpath("//*[@id=\"firstName\"]");
    private final By lastNameField = By.xpath("//*[@id=\"lastName\"]");
    private final By emailField = By.xpath("//*[@id=\"userEmail\"]");
    private final By ageField = By.xpath("//*[@id=\"age\"]");
    private final By salaryField = By.xpath("//*[@id=\"salary\"]");
    private final By departmentField = By.xpath("//*[@id=\"department\"]");
    private final By submitButton = By.xpath("//*[@id=\"submit\"]");
    private final By editButton = By.xpath("//*[@id=\"edit-record-4\"]");
    private final By addedRow = By.xpath("//*[contains(text(), 'Alice')]");

    public WebtablesPage(WebDriver driver) {
        super(driver);
        driver.get("https://demoqa.com/webtables/");
    }

    @Step("The user fills in the form")
    public WebtablesPage fillForm(String firstName, String lastName, String email, String age,
                                  String salary, String department) {
        clickOnElementWithJS(addButton);
        getElement(firstNameField).sendKeys(firstName);
        getElement(lastNameField).sendKeys(lastName);
        getElement(emailField).sendKeys(email);
        getElement(ageField).sendKeys(age);
        getElement(salaryField).sendKeys(salary);
        getElement(departmentField).sendKeys(department);
        return this;

    }

    @Step("Submit the form")
    public WebtablesPage submitForm() {
        clickOnElementWithJS(submitButton);
        return this;
    }

    public By getAddedRow() {
        return addedRow;
    }

    @Step("Scroll to edit button")
    public WebtablesPage scrollToEditButton() {
        WebElement element = driver.findElement(editButton);
        scrollToElement(element);
        return this;
    }

    @Step("Click on edit button")
    public WebtablesPage editRecord() {
        scrollToEditButton();
        clickOnElementWithJS(editButton);
        return this;
    }
}
