package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IndexPage extends BasePage {

    public IndexPage(WebDriver driver) {
        super(driver);
    }

    public IndexPage openIndexPage() {
        driver.get("http://parabank.parasoft.com");
        waitForJStoLoad();
        return this;
    }

    public void setUsername(String username) {
        driver.findElement(By.cssSelector("[name=username]")).sendKeys(username);
    }

    public void setPassword(String password) {
        driver.findElement(By.cssSelector("[name=password]")).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(By.cssSelector(".login .button")).click();
    }

}
