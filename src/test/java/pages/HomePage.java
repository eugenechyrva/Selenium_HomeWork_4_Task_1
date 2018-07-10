package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class HomePage {

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "first-name")
    WebElement firstNameInput;

    @FindBy(id = "last-name")
    WebElement lastNameInput;

    @FindBy(xpath = "//label[1]/input[1]")
    WebElement gender;

    @FindBy(xpath = "//input[@id='dob']")
    WebElement dateInput;

    @FindBy(xpath = "//input[@id='address']")
    WebElement addressInput;

    @FindBy(xpath = "//input[@id='email']")
    WebElement emailInput;

    @FindBy(xpath = "//input[@id='password']")
    WebElement passwordInput;

    @FindBy(xpath = "//input[@id='company']")
    WebElement companyInput;

    @FindBy(xpath = "//select[@id='role']")
    WebElement roleSelect;

    @FindBy(xpath = "//select[@id='expectation']")
    WebElement expectation;

    @FindBy(xpath = "//div[2]/label[1]/input[1]")
    WebElement waysSelect1;
    @FindBy(xpath = "//div[6]/label[1]/input[1]")
    WebElement waysSelect2;

    @FindBy(xpath = "//textarea[@id='comment']")
    WebElement commentInput;

    @FindBy(xpath = "//button[@id='submit']")
    WebElement submit;

    @FindBy(id = "submit-msg")
    WebElement confirmationText;


    public void setFirstName(String FirstName) {
        this.firstNameInput.sendKeys(FirstName);
    }

    public void setLastName(String LastName) {
        this.lastNameInput.sendKeys(LastName);
    }

    public void clickGender() {
        gender.click();
    }

    public void setDate(String Date) {
        dateInput.sendKeys(Date);
    }

    public void setAddress(String Address) {
        addressInput.sendKeys(Address);
    }

    public void setEmail(String Email) {
        emailInput.sendKeys(Email);
    }

    public void setPassword(String Password) {
        passwordInput.sendKeys(Password);
    }

    public void setCompany(String Company) {
        companyInput.sendKeys(Company);
    }

    public void setRole() {
        Select roleSelects = new Select(roleSelect);
        roleSelects.selectByVisibleText("QA");
    }

    public void setExpectation() {
        Select expectationSelects = new Select(expectation);
        expectationSelects.selectByVisibleText("Good teamwork");
        expectationSelects.selectByVisibleText("High salary");
        expectationSelects.selectByVisibleText("Challenging");
    }

    public void setWaysSelect1() {
        waysSelect1.click();
    }

    public void setWaysSelect2() {
        waysSelect2.click();
    }

    public void setComment(String Comment) {
        commentInput.sendKeys(Comment);
    }

    public void clickSubmit() {
        submit.click();
    }

    public void getConfirmText() {
        Assert.assertEquals(confirmationText.getText(), "Successfully submitted!");

    }

}

