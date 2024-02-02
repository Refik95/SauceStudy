package StepDefinitions;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

public class LoginPageStepDefinitions {
    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);


    @Given("User is at login page")
    public void userIsAtLoginPage() {
        loginPage.userAtHomePage();
    }

    @When("Click login button")
    public void clickLoginButton() {
        loginPage.clickLoginBtn();
    }

    @Then("Check {string} message about username")
    public void checkMessageAboutUsername(String username) {
        loginPage.checkMessage(username);
    }


    @When("Type {string} for Username field")
    public void typeForUsernameField(String Username) {
        loginPage.writeUsernameForUsernameField(Username);
    }

    @Then("Check {string} message about password")
    public void checkMessegaAboutPassword(String error) {
        loginPage.checkMessage(error);
    }

    @When("Type {string} for Password field")
    public void typeForPasswordField(String Password) {
        loginPage.writePasswordForPasswordField(Password);
    }

    @When("Type Correct {string} for Username field")
    public void typeCorrectForUsernameField(String correctUsername) {
        loginPage.correctUsernameForUsernameField(correctUsername);
    }

    @When("Type False {string} for Password field")
    public void typeFalseForPasswordField(String falsePassword) {
        loginPage.falsePasswordForPasswordField(falsePassword);
    }

    @Then("Check {string} message about don't match")
    public void checkMessageAboutDonTMatch(String dontMatch) {
        loginPage.dontMatchErrorMessage(dontMatch);
    }

    @When("Type False {string} for Username field")
    public void typeFalseForUsernameField(String falseUsername) {
        loginPage.falseUsernameForUsernameField(falseUsername);
    }

    @When("Type Correct {string} for Password field")
    public void typeCorrectForPasswordField(String correctPassword) {
        loginPage.correctPasswordForPasswordField(correctPassword);
    }

    @Then("Check Succesfull Login")
    public void checkSuccesfullLogin() {
        loginPage.checkSuccessfull();
    }
}

