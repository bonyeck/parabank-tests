package pages;

import assertions.LoginAssertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage extends BasePage {

    public LoginAssertions loginAssertion;

    @FindBy(css = "[name=username]")
    private WebElement userNameInput;

    @FindBy(css = "[name=password]")
    private WebElement passwordInput;

    @FindBy(css = "[value='Log In']")
    private WebElement loginButton;

    public IndexPage(WebDriver driver) {
        super(driver);
        loginAssertion = new LoginAssertions(driver);
    }

    public IndexPage openIndexPage() {
        driver.get("http://parabank.parasoft.com");
        return this;
    }

    public IndexPage setLogin(String login) {
        userNameInput.sendKeys(login);
        return this;
    }

    public IndexPage setPassword(String password) {
        passwordInput.sendKeys(password);
        return this;
    }

    public AccountPage clickLoginButton() {
        loginButton.click();
        return new AccountPage(driver);
    }

}
