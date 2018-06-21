package pages;

import assertions.LoginAssertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage extends BasePage {

    public LoginAssertions loginAssertion;

    public AccountPage(WebDriver driver) {
        super(driver);
        loginAssertion = new LoginAssertions(driver);
    }

    public boolean isUserLoggedIn() {
        waitForJStoLoad();
        return driver.findElement(By.cssSelector("[href$='logout.htm']")).isDisplayed();
    }

    public void logout() {
        driver.findElement(By.cssSelector("[href$='logout.htm']")).click();
    }
}
