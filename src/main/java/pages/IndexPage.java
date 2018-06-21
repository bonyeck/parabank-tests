package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {
    private WebDriver driver;

    @FindBy(css = "[name=username]")
    private WebElement userNameInput;

    @FindBy(css = "[name=password]")
    private WebElement passwordInput;

    @FindBy(css = "[value='Log In']")
    private WebElement loginButton;


    public IndexPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
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
