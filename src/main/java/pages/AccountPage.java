package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage  {

    private WebDriver driver;

    public AccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isUserLoggedIn() {
        return driver.findElement(By.cssSelector("[href$='logout.htm']")).isDisplayed();
    }

    public void logout() {
        driver.findElement(By.cssSelector("[href$='logout.htm']")).click();
    }
}
