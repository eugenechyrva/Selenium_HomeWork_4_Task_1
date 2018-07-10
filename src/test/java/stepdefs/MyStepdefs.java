package stepdefs;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

public class MyStepdefs {

    HomePage homePage;
    WebDriver driver;

    @Before
    public void init() {
        System.setProperty("webdriver.chrome.driver", "/Users/ievgenchyrva/chromedriver");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
    }

    @Given("^user navigates to the app url$")
    public void someTestInfo() {
        driver.get("http://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
    }

    @When("^user fills first name with value \"([^\"]*)\"$")
    public void userFillsFirstNameWithValue(String FirstName) {
        homePage.setFirstName(FirstName);
    }

    @When("^user fills last name with value \"([^\"]*)\"$")
    public void userFillsFirstNameForValue(String LastName) {
        homePage.setLastName(LastName);
    }

    @When("^user fills date of birth with value \"([^\"]*)\"$")
    public void userFillsDateOfBirthWithValue(String Date) {
        homePage.setDate(Date);
    }

    @When("^user fills gender$")
    public void userFillsGender() {
        homePage.clickGender();

    }

    @When("^user fills email with value \"([^\"]*)\"$")
    public void userFillsEmailWithValue(String Email) {
        homePage.setEmail(Email);
    }

    @When("^user fills company with value \"([^\"]*)\"$")
    public void userFillsCompanyWithValue(String Company) {
        homePage.setCompany(Company);
    }

    @When("^user fills password with value \"([^\"]*)\"$")
    public void userFillsPasswordWithValue(String Password) {
        homePage.setPassword(Password);
    }

    @When("^user fills address with value \"([^\"]*)\"$")
    public void userFillsAddressWithValue(String Address) {
        homePage.setAddress(Address);
    }

    @When("^user fills role$")
    public void userFillsRole() {
        homePage.setRole();
    }

    @When("^user fills expectation$")
    public void userFillsExpectation() {
        homePage.setExpectation();
    }

    @When("^user submit form$")
    public void userSubmitForm() {
        homePage.clickSubmit();
    }
    @When("^user fills ways of development$")
    public void userFillsWaysOfDevelopment() {
        homePage.setWaysSelect1();
        homePage.setWaysSelect2();
    }
    @When("^user fills comment with value \"([^\"]*)\"$")
    public void userFillsCommentWithValue(String Comment) {
        homePage.setComment(Comment);
    }

    @Then("^form is submitted$")
    public void formIsSubmitted() {
        homePage.getConfirmText();
    }
    @After
    public void close() {
        driver.close();
        driver.quit();
    }


}











