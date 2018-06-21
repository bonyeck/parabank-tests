package pages;

import assertions.LoginAssertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {

    public LoginAssertions loginAssertion;

    @FindBy(css = "[href$='logout.htm']")
    private WebElement logoutLink;

    public AccountPage(WebDriver driver) {
        super(driver);
        loginAssertion = new LoginAssertions(driver);
    }

    public boolean isUserLoggedIn() {
        waitForJStoLoad();
        return logoutLink.isDisplayed();
    }

    public IndexPage clickLogout() {
        logoutLink.click();
        return new IndexPage(driver);
    }
}
