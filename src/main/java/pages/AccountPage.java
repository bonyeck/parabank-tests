package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage extends BasePage {

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public boolean isUserLoggedIn() {
        waitForJStoLoad();
        return driver.findElement(By.cssSelector("[href$='logout.htm']")).isDisplayed();
    }

    public void logout() {
        driver.findElement(By.cssSelector("[href$='logout.htm']")).click();
    }
}
