package Pages;

import util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    WebDriver driver;
    ElementHelper elementHelper;
    WebDriverWait wait;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        this.elementHelper = new ElementHelper(driver);     }

    By loginButton = By.cssSelector("#login-button");
    By errorMessage = By.cssSelector("h3[data-test='error']");
    By usernameBox = By.cssSelector("#user-name");
    By passwordBox = By.cssSelector("#password");
    By productTitle = By.cssSelector(".title");


    public void userAtHomePage() {

        driver.get("https://www.saucedemo.com/");
    }

    public void clickLoginBtn() {

        driver.findElement(loginButton).click();
    }

    public void checkMessage(String username) {

        elementHelper.checkVisible(errorMessage);
    }

    public void writeUsernameForUsernameField(String username) {
        driver.findElement(usernameBox).click();
        elementHelper.sendKey(usernameBox, "abcd");
    }

    public void writePasswordForPasswordField(String password) {
        driver.findElement(passwordBox).click();
        elementHelper.sendKey(passwordBox, "123456");
    }

    public void correctUsernameForUsernameField(String correctUsername) {
        driver.findElement(usernameBox).click();
        elementHelper.sendKey(usernameBox, "standard_user");
    }

    public void falsePasswordForPasswordField(String falsePassword) {
        driver.findElement(passwordBox).click();
        elementHelper.sendKey(passwordBox, "abc1234");
    }

    public void dontMatchErrorMessage(String dontMatch) {
        elementHelper.checkVisible(errorMessage);
    }

    public void falseUsernameForUsernameField(String falseUsername) {
        driver.findElement(usernameBox).click();
        elementHelper.sendKey(usernameBox,"abds");
    }

    public void correctPasswordForPasswordField(String correctPassword) {
        driver.findElement(passwordBox).click();
        elementHelper.sendKey(passwordBox, "secret_sauce");
    }

    public void checkSuccessfull() {
        elementHelper.checkVisible(productTitle);
    }
}
