package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IndexPage {
    private WebDriver driver;

    public IndexPage(WebDriver driver) {
        this.driver=driver;
    }
    public void openIndexPage(){
        driver.get("http://parabank.parasoft.com");
    }
    public void setLogin(String login) {
        driver.findElement(By.cssSelector("[name=username]")).sendKeys(login);
    }
    public void setPassword(String password) {
        driver.findElement(By.cssSelector("[name=password]")).sendKeys(password);
    }
    public void clickLoginButton() {
        driver.findElement(By.cssSelector(".login .button")).click();
    }
}
