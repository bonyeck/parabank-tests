package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndexPage {
    private WebDriver driver;

    @FindBy(css = "[name=username]")
    private WebElement userNameInput;

    @FindBy(css = "[name=username]")
    private WebElement passwordInput;

    @FindBy(css = "[name=username]")
    private WebElement loginButton;


    public IndexPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openIndexPage() {
        driver.get("http://parabank.parasoft.com");
    }

    public void setLogin(String login) {
        userNameInput.sendKeys(login);
    }

    public void setPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}
